package com.example.data.model

enum class ExtractionStatus { SUCCESS, EMPTY_CELL, FILE_TOO_SHORT, READ_ERROR }

enum class OutputFormat { SINGLE_COLUMN_ONLY, DETAILED_WITH_FILENAMES }

data class CsvSampleItem(
    val id: String,
    val fileName: String,
    val uriString: String,
    val extractedValue: String,
    val numericValue: Double?,
    val targetCell: String = "B9",
    val rowNumber: Int = 9,
    val columnLetter: String = "B",
    val status: ExtractionStatus = ExtractionStatus.SUCCESS,
    val errorMessage: String? = null,
    val rawPreviewGrid: List<List<String>> = emptyList(),
)

data class BatchSummaryStats(
    val totalFiles: Int = 0,
    val successCount: Int = 0,
    val errorCount: Int = 0,
    val averageValue: Double = 0.0,
    val maxValue: Double = 0.0,
    val minValue: Double = 0.0,
    val totalSum: Double = 0.0,
)

data class TestSubFolder(
    val folderName: String,
    val uriString: String,
    val csvCount: Int,
    val lastModified: Long = 0L,
)
