package com.example.viewmodel

import android.app.Application
import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Environment
import androidx.core.content.FileProvider
import androidx.documentfile.provider.DocumentFile
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.example.R
import com.example.data.db.AppDatabase
import com.example.data.db.BatchHistoryEntity
import com.example.data.model.BatchSummaryStats
import com.example.data.model.CsvSampleItem
import com.example.data.model.ExtractionStatus
import com.example.data.model.OutputFormat
import com.example.data.model.TestSubFolder
import com.example.data.util.CsvParserUtil
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import java.io.File
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

class CsvAggregatorViewModel(application: Application) : AndroidViewModel(application) {

    private val db = AppDatabase.getDatabase(application)
    private val batchDao = db.batchDao()

    private val _folderName = MutableStateFlow("")
    val folderName: StateFlow<String> = _folderName.asStateFlow()

    private val _targetCell = MutableStateFlow("B9")
    val targetCell: StateFlow<String> = _targetCell.asStateFlow()

    private val _outputFormat = MutableStateFlow(OutputFormat.SINGLE_COLUMN_ONLY)
    val outputFormat: StateFlow<OutputFormat> = _outputFormat.asStateFlow()

    private val _isProcessing = MutableStateFlow(false)
    val isProcessing: StateFlow<Boolean> = _isProcessing.asStateFlow()

    private val _progress = MutableStateFlow(0f)
    val progress: StateFlow<Float> = _progress.asStateFlow()

    private val _extractedItems = MutableStateFlow<List<CsvSampleItem>>(emptyList())
    val extractedItems: StateFlow<List<CsvSampleItem>> = _extractedItems.asStateFlow()

    private val _summaryStats = MutableStateFlow(BatchSummaryStats())
    val summaryStats: StateFlow<BatchSummaryStats> = _summaryStats.asStateFlow()

    private val _combinedCsvContent = MutableStateFlow("")
    val combinedCsvContent: StateFlow<String> = _combinedCsvContent.asStateFlow()

    private val _selectedItemForPreview = MutableStateFlow<CsvSampleItem?>(null)
    val selectedItemForPreview: StateFlow<CsvSampleItem?> = _selectedItemForPreview.asStateFlow()

    private val _historyList = MutableStateFlow<List<BatchHistoryEntity>>(emptyList())
    val historyList: StateFlow<List<BatchHistoryEntity>> = _historyList.asStateFlow()

    private val _toastMessage = MutableStateFlow<String?>(null)
    val toastMessage: StateFlow<String?> = _toastMessage.asStateFlow()

    private var currentLoadedUris: List<Pair<String, Uri>> = emptyList()

    private val prefs = application.getSharedPreferences("ele_adr_pro_prefs", Context.MODE_PRIVATE)

    private val _rootTestUriString = MutableStateFlow<String?>(prefs.getString("saved_root_test_uri", null))
    val rootTestUriString: StateFlow<String?> = _rootTestUriString.asStateFlow()

    private val _subFoldersList = MutableStateFlow<List<TestSubFolder>>(emptyList())
    val subFoldersList: StateFlow<List<TestSubFolder>> = _subFoldersList.asStateFlow()

    private val _showSyncSheet = MutableStateFlow(false)
    val showSyncSheet: StateFlow<Boolean> = _showSyncSheet.asStateFlow()

    private val _isSyncing = MutableStateFlow(false)
    val isSyncing: StateFlow<Boolean> = _isSyncing.asStateFlow()

    init {
        viewModelScope.launch {
            batchDao.getAllBatches().collectLatest { _historyList.value = it }
        }
        if (_rootTestUriString.value != null) scanRootTestDirectory()
    }

    fun openSyncSheet() {
        _showSyncSheet.value = true
        scanRootTestDirectory()
    }

    fun dismissSyncSheet() {
        _showSyncSheet.value = false
    }

    fun saveRootTestUri(uri: Uri) {
        val context = getApplication<Application>()
        try {
            context.contentResolver.takePersistableUriPermission(
                uri,
                Intent.FLAG_GRANT_READ_URI_PERMISSION or Intent.FLAG_GRANT_WRITE_URI_PERMISSION,
            )
        } catch (_: Exception) {
        }
        prefs.edit().putString("saved_root_test_uri", uri.toString()).apply()
        _rootTestUriString.value = uri.toString()
        _toastMessage.value = context.getString(R.string.toast_root_saved)
        scanRootTestDirectory()
        _showSyncSheet.value = true
    }

    fun clearRootTestUri() {
        prefs.edit().remove("saved_root_test_uri").apply()
        _rootTestUriString.value = null
        _subFoldersList.value = emptyList()
    }

    fun scanRootTestDirectory() {
        val uriStr = _rootTestUriString.value ?: return
        viewModelScope.launch(Dispatchers.IO) {
            _isSyncing.value = true
            val context = getApplication<Application>()
            try {
                val root = DocumentFile.fromTreeUri(context, Uri.parse(uriStr))
                if (root == null || !root.exists() || !root.isDirectory) {
                    _subFoldersList.value = emptyList()
                    return@launch
                }
                val children = root.listFiles()
                val list = ArrayList<TestSubFolder>()
                for (child in children) {
                    if (child.isDirectory) {
                        val count = child.listFiles().count { f ->
                            f.isFile && (f.name?.endsWith(".csv", true) == true || f.name?.endsWith(".txt", true) == true)
                        }
                        list.add(TestSubFolder(child.name ?: "Un-named", child.uri.toString(), count, child.lastModified()))
                    }
                }
                if (list.isEmpty()) {
                    val count = children.count { f ->
                        f.isFile && (f.name?.endsWith(".csv", true) == true || f.name?.endsWith(".txt", true) == true)
                    }
                    if (count > 0) {
                        list.add(TestSubFolder(root.name ?: "TEST", root.uri.toString(), count, root.lastModified()))
                    }
                }
                _subFoldersList.value = list.sortedWith(CsvParserUtil.dateComparatorNewestFirst())
            } catch (_: Exception) {
                _subFoldersList.value = emptyList()
            } finally {
                _isSyncing.value = false
            }
        }
    }

    fun unmountStorage() {
        val context = getApplication<Application>()
        _rootTestUriString.value?.let {
            try {
                context.contentResolver.releasePersistableUriPermission(
                    Uri.parse(it),
                    Intent.FLAG_GRANT_READ_URI_PERMISSION or Intent.FLAG_GRANT_WRITE_URI_PERMISSION,
                )
            } catch (_: Exception) {
            }
        }
        prefs.edit().remove("saved_root_test_uri").apply()
        _rootTestUriString.value = null
        _subFoldersList.value = emptyList()
        _folderName.value = ""
        _extractedItems.value = emptyList()
        _combinedCsvContent.value = ""
        _summaryStats.value = BatchSummaryStats()
        _selectedItemForPreview.value = null
        currentLoadedUris = emptyList()
        _toastMessage.value = "Storage unmounted successfully"
    }

    fun mergeSubFolder(subFolder: TestSubFolder) {
        loadFolderFromUri(Uri.parse(subFolder.uriString))
        _showSyncSheet.value = false
    }

    fun setTargetCell(cell: String) {
        val clean = cell.trim().uppercase(Locale.ROOT)
        _targetCell.value = if (clean.isEmpty()) "B9" else clean
        if (currentLoadedUris.isNotEmpty()) processLoadedUris()
    }

    fun setOutputFormat(format: OutputFormat) {
        _outputFormat.value = format
        rebuildCombinedCsv()
    }

    fun clearToast() {
        _toastMessage.value = null
    }

    fun selectItemForPreview(item: CsvSampleItem?) {
        _selectedItemForPreview.value = item
    }

    private fun isCsvOrTxt(f: DocumentFile): Boolean =
        f.isFile && (f.name?.endsWith(".csv", true) == true || f.name?.endsWith(".txt", true) == true)

    fun loadFolderFromUri(treeUri: Uri) {
        viewModelScope.launch(Dispatchers.IO) {
            _isProcessing.value = true
            _progress.value = 0.1f
            val context = getApplication<Application>()
            val folder = DocumentFile.fromTreeUri(context, treeUri)
            if (folder == null || !folder.isDirectory) {
                _isProcessing.value = false
                _toastMessage.value = "Selected folder is unreadable"
                return@launch
            }
            _folderName.value = folder.name ?: "Samples_Folder"
            val children = folder.listFiles().filter { isCsvOrTxt(it) }
            if (children.isEmpty()) {
                _isProcessing.value = false
                _extractedItems.value = emptyList()
                _combinedCsvContent.value = ""
                _toastMessage.value = "No CSV files found in the selected folder"
                return@launch
            }
            val sorted = children.sortedWith { f1, f2 ->
                CsvParserUtil.naturalSortComparator().compare(f1.name ?: "", f2.name ?: "")
            }
            currentLoadedUris = sorted.map { (it.name ?: "sample.csv") to it.uri }
            processLoadedUris()
        }
    }

    fun loadMultipleFilesFromUris(uris: List<Uri>) {
        if (uris.isEmpty()) return
        viewModelScope.launch(Dispatchers.IO) {
            _isProcessing.value = true
            _progress.value = 0.1f
            val context = getApplication<Application>()
            val pairs = uris.map { uri ->
                val name = DocumentFile.fromSingleUri(context, uri)?.name ?: uri.lastPathSegment ?: "sample.csv"
                name to uri
            }.sortedWith { a, b -> CsvParserUtil.naturalSortComparator().compare(a.first, b.first) }
            val defaultFolder = "Selected_Batch_" + SimpleDateFormat("HH_mm", Locale.US).format(Date())
            _folderName.value = defaultFolder
            currentLoadedUris = pairs
            processLoadedUris()
        }
    }

    fun loadDemoFolder() {
        viewModelScope.launch(Dispatchers.IO) {
            _isProcessing.value = true
            _progress.value = 0.1f
            val context = getApplication<Application>()
            _folderName.value = "29_07_26"
            val files = CsvParserUtil.createDemoLabFolder(context, "29_07_26").second
            currentLoadedUris = files.map { it.name to Uri.fromFile(it) }
                .sortedWith { a, b -> CsvParserUtil.naturalSortComparator().compare(a.first, b.first) }
            processLoadedUris()
            _toastMessage.value = "Generated demo folder 29_07_26 with 10 samples"
        }
    }

    fun combineCurrentBatch() {
        if (currentLoadedUris.isEmpty()) {
            _toastMessage.value = "Please select a folder containing CSV files first"
        } else {
            processLoadedUris()
        }
    }

    private fun processLoadedUris() {
        viewModelScope.launch(Dispatchers.IO) {
            _isProcessing.value = true
            val context = getApplication<Application>()
            val target = _targetCell.value
            val total = currentLoadedUris.size
            val items = ArrayList<CsvSampleItem>()
            var maxVal = Double.MIN_VALUE
            var minVal = Double.MAX_VALUE
            var validCount = 0
            var numericSum = 0.0
            currentLoadedUris.forEachIndexed { index, (name, uri) ->
                val item = CsvParserUtil.extractCellFromCsvUri(context, uri, name, target)
                items.add(item)
                val num = item.numericValue
                if (item.status == ExtractionStatus.SUCCESS && num != null) {
                    numericSum += num
                    validCount++
                    if (num > maxVal) maxVal = num
                    if (num < minVal) minVal = num
                }
                _progress.value = (index + 1).toFloat() / total
            }
            val avg = if (validCount > 0) numericSum / validCount else 0.0
            val max = if (validCount > 0) maxVal else 0.0
            val min = if (validCount > 0) minVal else 0.0
            _extractedItems.value = items
            val stats = BatchSummaryStats(total, validCount, total - validCount, avg, max, min, numericSum)
            _summaryStats.value = stats
            rebuildCombinedCsv()
            _isProcessing.value = false
            val folder = _folderName.value.ifEmpty { "29_07_26" }
            saveToHistoryDb(folder, items, stats, _combinedCsvContent.value)
            autoSaveToInternalAdrLog(_folderName.value, _combinedCsvContent.value)
        }
    }

    private fun autoSaveToInternalAdrLog(folderName: String, csvContent: String) {
        if (csvContent.isBlank()) return
        try {
            var safe = Regex("[^a-zA-Z0-9_\\-]").replace(folderName, "_")
            if (safe.isEmpty()) safe = "LOG"
            val timeStr = SimpleDateFormat("yyyyMMdd_HHmmss", Locale.US).format(Date())
            val fileName = safe + "_" + timeStr + ".csv"
            try {
                val docsDir = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOCUMENTS)
                val dir = File(docsDir, "ADR LOG")
                if (!dir.exists()) dir.mkdirs()
                File(dir, fileName).writeText(csvContent, Charsets.UTF_8)
                _toastMessage.value = "Merged and auto-saved to Documents/ADR LOG"
            } catch (_: Exception) {
                try {
                    val downDir = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS)
                    val dir = File(downDir, "ADR LOG")
                    if (!dir.exists()) dir.mkdirs()
                    File(dir, fileName).writeText(csvContent, Charsets.UTF_8)
                    _toastMessage.value = "Merged and auto-saved to Download/ADR LOG"
                } catch (_: Exception) {
                    _toastMessage.value = "Merged successfully ($folderName). Could not save to public folder."
                }
            }
        } catch (_: Exception) {
            _toastMessage.value = "Merged successfully ($folderName)"
        }
    }

    private fun rebuildCombinedCsv() {
        _combinedCsvContent.value =
            CsvParserUtil.buildCombinedCsvString(_extractedItems.value, _targetCell.value, _outputFormat.value)
    }

    private fun saveToHistoryDb(folderName: String, items: List<CsvSampleItem>, stats: BatchSummaryStats, csvOutput: String) {
        viewModelScope.launch(Dispatchers.IO) {
            val valuesJson = items.joinToString(",") { it.extractedValue }
            batchDao.insertBatch(
                BatchHistoryEntity(
                    folderName = folderName,
                    processedTimestamp = System.currentTimeMillis(),
                    sampleCount = stats.totalFiles,
                    targetCell = _targetCell.value,
                    summaryAverage = stats.averageValue,
                    summaryMax = stats.maxValue,
                    summaryMin = stats.minValue,
                    extractedValuesJson = valuesJson,
                    csvOutputText = csvOutput,
                ),
            )
        }
    }

    fun shareCombinedCsv(context: Context) {
        val content = _combinedCsvContent.value
        if (content.isEmpty()) {
            _toastMessage.value = "No content to merge and share"
            return
        }
        try {
            val folder = _folderName.value.ifEmpty { "29_07_26" }
            val timeStr = SimpleDateFormat("yyyyMMdd_HHmm", Locale.US).format(Date())
            val file = File(context.cacheDir, "Compression_Merge_${folder}_$timeStr.csv")
            file.writeText(content, Charsets.UTF_8)
            val uri = FileProvider.getUriForFile(context, context.packageName + ".fileprovider", file)
            val intent = Intent(Intent.ACTION_SEND).apply {
                type = "text/csv"
                putExtra(Intent.EXTRA_SUBJECT, "Compression Files Merger Results - $folder")
                putExtra(
                    Intent.EXTRA_TEXT,
                    "Extracted cell ${_targetCell.value} values for ${_summaryStats.value.totalFiles} samples from folder $folder",
                )
                putExtra(Intent.EXTRA_STREAM, uri)
                addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION)
            }
            context.startActivity(Intent.createChooser(intent, "Share Merged CSV File"))
        } catch (e: Exception) {
            _toastMessage.value = "Failed to share: ${e.localizedMessage}"
        }
    }

    fun copyToClipboard(context: Context) {
        val content = _combinedCsvContent.value
        if (content.isEmpty()) {
            _toastMessage.value = "No data to copy"
            return
        }
        val clipboard = context.getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
        clipboard.setPrimaryClip(ClipData.newPlainText("Merged Results", content))
        _toastMessage.value = "Successfully copied B9 results to clipboard"
    }

    fun writeCombinedCsvToUri(context: Context, destUri: Uri) {
        try {
            val content = _combinedCsvContent.value
            context.contentResolver.openOutputStream(destUri)?.use { it.write(content.toByteArray(Charsets.UTF_8)) }
            _toastMessage.value = "File saved successfully"
        } catch (e: Exception) {
            _toastMessage.value = "Error saving: ${e.localizedMessage}"
        }
    }

    fun loadHistoryBatch(history: BatchHistoryEntity) {
        _folderName.value = history.folderName
        _targetCell.value = history.targetCell
        _combinedCsvContent.value = history.csvOutputText
        _toastMessage.value = "Loaded history for ${history.folderName}"
    }

    fun deleteHistoryItem(id: Long) {
        viewModelScope.launch(Dispatchers.IO) { batchDao.deleteBatch(id) }
    }
}
