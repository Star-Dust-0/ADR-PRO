package com.example.data.util

import android.content.Context
import android.net.Uri
import com.example.data.model.CsvSampleItem
import com.example.data.model.ExtractionStatus
import com.example.data.model.OutputFormat
import com.example.data.model.TestSubFolder
import java.io.File
import java.math.BigInteger
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale
import java.util.regex.Pattern

object CsvParserUtil {

    /** "B9" -> (row 8, col 1); null when the code is not a valid cell reference. */
    fun parseCellReference(cellRef: String): Pair<Int, Int>? {
        val clean = cellRef.trim().uppercase(Locale.ROOT)
        val matcher = Pattern.compile("^([A-Z]+)([0-9]+)$").matcher(clean)
        if (!matcher.matches()) return null
        val colStr = matcher.group(1) ?: return null
        val rowStr = matcher.group(2) ?: return null
        val row = (rowStr.toIntOrNull() ?: return null) - 1
        if (row < 0) return null
        var col = 0
        for (ch in colStr) col = col * 26 + (ch - 'A') + 1
        return Pair(row, col - 1)
    }

    fun parseCsvLine(line: String): List<String> {
        if (line.isEmpty()) return emptyList()
        val delimiter = if (line.contains(";") && !line.contains(",")) ';' else ','
        val result = ArrayList<String>()
        val current = StringBuilder()
        var inQuotes = false
        for (ch in line) {
            if (ch == '"') {
                inQuotes = !inQuotes
            } else if (ch == delimiter && !inQuotes) {
                result.add(cleanCellValue(current.toString()))
                current.clear()
            } else {
                current.append(ch)
            }
        }
        result.add(cleanCellValue(current.toString()))
        return result
    }

    private fun cleanCellValue(raw: String): String =
        raw.trim().removeSurrounding("\"").removeSurrounding("'").trim()

    private fun String?.isNullOrBlankCell(): Boolean = this == null || this.isBlank()

    fun extractCellFromCsvUri(
        context: Context,
        uri: Uri,
        fileName: String,
        targetCell: String = "B9",
    ): CsvSampleItem {
        val ref = parseCellReference(targetCell)
            ?: return CsvSampleItem(
                fileName, fileName, uri.toString(), "Format Error", null, targetCell, 0, "",
                ExtractionStatus.READ_ERROR, "Invalid Cell Code (e.g. B9)", emptyList(),
            )
        val (targetRow, targetCol) = ref
        val preview = ArrayList<List<String>>()
        return try {
            val input = context.contentResolver.openInputStream(uri)
                ?: return CsvSampleItem(
                    fileName, fileName, uri.toString(), "Read Error", null, targetCell, 0, "",
                    ExtractionStatus.READ_ERROR, "Could not open file", emptyList(),
                )
            input.bufferedReader(Charsets.UTF_8).use { reader ->
                var rowIndex = 0
                var cellValue: String? = null
                var line = reader.readLine()
                while (line != null) {
                    val cells = parseCsvLine(line)
                    if (preview.size < 20) preview.add(cells)
                    if (rowIndex == targetRow && targetCol < cells.size) cellValue = cells[targetCol]
                    rowIndex++
                    line = reader.readLine()
                }
                val letters = targetCell.filter { it.isLetter() }
                if (rowIndex > targetRow) {
                    if (cellValue.isNullOrBlankCell()) {
                        CsvSampleItem(
                            fileName, fileName, uri.toString(), "Empty Cell", null, targetCell,
                            targetRow + 1, letters, ExtractionStatus.EMPTY_CELL,
                            "Cell $targetCell is empty in this file", preview,
                        )
                    } else {
                        val v = cellValue ?: ""
                        CsvSampleItem(
                            fileName, fileName, uri.toString(), v, v.replace(",", ".").toDoubleOrNull(),
                            targetCell, targetRow + 1, letters, ExtractionStatus.SUCCESS, null, preview,
                        )
                    }
                } else {
                    CsvSampleItem(
                        fileName, fileName, uri.toString(), "Short File", null, targetCell,
                        targetRow + 1, letters, ExtractionStatus.FILE_TOO_SHORT,
                        "File only has $rowIndex rows (Required row ${targetRow + 1})", preview,
                    )
                }
            }
        } catch (e: Exception) {
            CsvSampleItem(
                fileName, fileName, uri.toString(), "Error", null, targetCell, 0, "",
                ExtractionStatus.READ_ERROR, e.localizedMessage ?: "Error occurred while reading file", preview,
            )
        }
    }

    fun parseDateFromFolderName(name: String): Date? {
        val clean = name.trim()
        val patterns = listOf(
            "dd_MM_yy", "dd_MM_yyyy", "dd-MM-yy", "dd-MM-yyyy", "dd.MM.yy", "dd.MM.yyyy",
            "yyyy_MM_dd", "yyyy-MM-dd", "yy_MM_dd", "yy-MM-dd",
        )
        for (p in patterns) {
            try {
                val sdf = SimpleDateFormat(p, Locale.US)
                sdf.isLenient = false
                val parsed = sdf.parse(clean)
                if (parsed != null) return parsed
            } catch (_: Exception) {
            }
        }
        return null
    }

    fun dateComparatorNewestFirst(): Comparator<TestSubFolder> = Comparator { f1, f2 ->
        val d1 = parseDateFromFolderName(f1.folderName)
        val d2 = parseDateFromFolderName(f2.folderName)
        if (d1 != null && d2 != null) {
            val c = d2.compareTo(d1)
            if (c != 0) return@Comparator c
        } else {
            if (d1 != null) return@Comparator -1
            if (d2 != null) return@Comparator 1
        }
        val timeComp = f2.lastModified.compareTo(f1.lastModified)
        if (timeComp != 0 && f1.lastModified > 0 && f2.lastModified > 0) return@Comparator timeComp
        naturalSortComparator().compare(f2.folderName, f1.folderName)
    }

    fun naturalSortComparator(): Comparator<String> = Comparator { s1, s2 ->
        val p = Pattern.compile("(\\d+)|(\\D+)")
        val m1 = p.matcher(s1)
        val m2 = p.matcher(s2)
        while (m1.find() && m2.find()) {
            val g1 = m1.group()
            val g2 = m2.group()
            val result = if (g1[0].isDigit() && g2[0].isDigit()) {
                val n1: BigInteger? = g1.toBigIntegerOrNull()
                val n2: BigInteger? = g2.toBigIntegerOrNull()
                if (n1 == null || n2 == null) g1.compareTo(g2) else n1.compareTo(n2)
            } else {
                g1.compareTo(g2, ignoreCase = true)
            }
            if (result != 0) return@Comparator result
        }
        s1.length.compareTo(s2.length)
    }

    fun buildCombinedCsvString(
        items: List<CsvSampleItem>,
        targetCell: String = "B9",
        format: OutputFormat = OutputFormat.SINGLE_COLUMN_ONLY,
    ): String {
        val sb = StringBuilder()
        when (format) {
            OutputFormat.SINGLE_COLUMN_ONLY -> for (item in items) {
                if (item.status == ExtractionStatus.SUCCESS) sb.append(item.extractedValue).append("\n")
                else sb.append("-").append("\n")
            }
            OutputFormat.DETAILED_WITH_FILENAMES -> {
                sb.append("File Name,Cell Value $targetCell,Status\n")
                for (item in items) {
                    val status = when (item.status) {
                        ExtractionStatus.SUCCESS -> "Success"
                        ExtractionStatus.EMPTY_CELL -> "Empty Cell"
                        ExtractionStatus.FILE_TOO_SHORT -> "Short File"
                        ExtractionStatus.READ_ERROR -> "Read Error"
                    }
                    sb.append("\"${item.fileName}\",\"${item.extractedValue}\",\"$status\"\n")
                }
            }
        }
        return sb.toString()
    }

    fun createDemoLabFolder(context: Context, folderName: String = "29_07_26"): Pair<File, List<File>> {
        val demoDir = File(context.cacheDir, folderName)
        if (!demoDir.exists()) demoDir.mkdirs()
        val generated = ArrayList<File>()
        val sampleValues = listOf(28.45, 29.8, 31.1, 27.95, 30.5, 32.15, 28.9, 29.3, 30.8, 31.75)
        for (i in 1..10) {
            val fileName = "Sample_" + String.format("%02d", i) + ".csv"
            val file = File(demoDir, fileName)
            val b9 = sampleValues[(i - 1) % sampleValues.size]
            val csv = StringBuilder()
            csv.append("Lab Name,Central Concrete & Materials Lab\n")
            csv.append("Test Type,Cube Compression Test (150x150mm)\n")
            csv.append("Folder Date,$folderName\n")
            csv.append("Sample ID,Sample-$i\n")
            csv.append("Curing Days,28 Days\n")
            csv.append("Machine Model,Hydraulic Press 2000kN\n")
            csv.append("Operator,Eng. Lab Tech\n")
            csv.append("Parameter,Value,Unit\n")
            csv.append("Peak Compressive Load,$b9,kN\n")
            csv.append("Compressive Strength," + String.format("%.2f", b9 / 22.5) + ",MPa\n")
            csv.append("Failure Mode,Normal Columnar\n")
            csv.append("Test Status,PASSED\n")
            file.writeText(csv.toString(), Charsets.UTF_8)
            generated.add(file)
        }
        return Pair(demoDir, generated)
    }
}
