package com.example.ui.screens

import android.net.Uri
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.example.ui.components.*
import com.example.viewmodel.CsvAggregatorViewModel
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

@Composable
fun MainHomeScreen(viewModel: CsvAggregatorViewModel, modifier: Modifier = Modifier) {
    val context = LocalContext.current
    val folderName by viewModel.folderName.collectAsStateWithLifecycle()
    val targetCell by viewModel.targetCell.collectAsStateWithLifecycle()
    val outputFormat by viewModel.outputFormat.collectAsStateWithLifecycle()
    val isProcessing by viewModel.isProcessing.collectAsStateWithLifecycle()
    val progress by viewModel.progress.collectAsStateWithLifecycle()
    val items by viewModel.extractedItems.collectAsStateWithLifecycle()
    val combined by viewModel.combinedCsvContent.collectAsStateWithLifecycle()
    val selected by viewModel.selectedItemForPreview.collectAsStateWithLifecycle()
    val history by viewModel.historyList.collectAsStateWithLifecycle()
    val toast by viewModel.toastMessage.collectAsStateWithLifecycle()
    val rootUri by viewModel.rootTestUriString.collectAsStateWithLifecycle()
    val subFolders by viewModel.subFoldersList.collectAsStateWithLifecycle()
    val showSync by viewModel.showSyncSheet.collectAsStateWithLifecycle()
    val isSyncing by viewModel.isSyncing.collectAsStateWithLifecycle()
    var showSettings by remember { mutableStateOf(false) }
    var showHistory by remember { mutableStateOf(false) }
    val snackbar = remember { SnackbarHostState() }

    LaunchedEffect(toast) {
        toast?.let {
            snackbar.showSnackbar(it)
            viewModel.clearToast()
        }
    }

    val folderLauncher = rememberLauncherForActivityResult(ActivityResultContracts.OpenDocumentTree()) { uri: Uri? ->
        if (uri != null) viewModel.loadFolderFromUri(uri)
    }
    val filesLauncher = rememberLauncherForActivityResult(ActivityResultContracts.OpenMultipleDocuments()) { uris: List<Uri> ->
        if (uris.isNotEmpty()) viewModel.loadMultipleFilesFromUris(uris)
    }
    val createLauncher = rememberLauncherForActivityResult(ActivityResultContracts.CreateDocument("text/csv")) { uri: Uri? ->
        if (uri != null) viewModel.writeCombinedCsvToUri(context, uri)
    }

    Scaffold(
        modifier = modifier.fillMaxSize(),
        snackbarHost = { SnackbarHost(snackbar) },
        containerColor = MaterialTheme.colorScheme.background,
    ) { inner ->
        Column(
            modifier = Modifier.padding(inner).verticalScroll(rememberScrollState()).statusBarsPadding().fillMaxSize().padding(16.dp),
        ) {
            FolderPickerCard(
                folderName = folderName,
                sampleCount = items.size,
                targetCell = targetCell,
                isProcessing = isProcessing,
                progress = progress,
                onSyncClick = { viewModel.openSyncSheet() },
                onPickFolderClick = { folderLauncher.launch(null) },
                onPickFilesClick = { filesLauncher.launch(arrayOf("text/*", "text/comma-separated-values", "application/csv", "*/*")) },
                onCombineClick = { viewModel.combineCurrentBatch() },
                onOpenSettings = { showSettings = true },
                onOpenHistory = { showHistory = true },
                onUnmountClick = { viewModel.unmountStorage() },
            )
            Spacer(Modifier.height(16.dp))
            AnimatedVisibility(visible = items.isNotEmpty(), enter = fadeIn(), exit = fadeOut()) {
                Column {
                    ExportShareBar(
                        hasContent = combined.isEmpty(),
                        onShareClick = { viewModel.shareCombinedCsv(context) },
                        onSaveClick = {
                            val folder = folderName.ifEmpty { "29_07_26" }
                            val t = SimpleDateFormat("yyyyMMdd_HHmm", Locale.US).format(Date())
                            createLauncher.launch("Merge_${folder}_$t.csv")
                        },
                    )
                    Spacer(Modifier.height(16.dp))
                }
            }
            CsvTablePreview(
                items = items,
                targetCell = targetCell,
                outputFormat = outputFormat,
                onFormatChanged = { viewModel.setOutputFormat(it) },
                onItemClick = { viewModel.selectItemForPreview(it) },
            )
            Spacer(Modifier.height(24.dp))
        }
    }

    selected?.let { CsvCellInspectorDialog(it) { viewModel.selectItemForPreview(null) } }
    if (showSettings) {
        SettingsCellDialog(targetCell, { viewModel.setTargetCell(it); showSettings = false }, { showSettings = false })
    }
    if (showHistory) {
        BatchHistorySheet(
            historyList = history,
            onSelectBatch = { viewModel.loadHistoryBatch(it); showHistory = false },
            onDeleteBatch = { viewModel.deleteHistoryItem(it) },
            onDismiss = { showHistory = false },
        )
    }
    if (showSync) {
        UsbSyncSheet(
            rootUriString = rootUri,
            subFolders = subFolders,
            isSyncing = isSyncing,
            onDismiss = { viewModel.dismissSyncSheet() },
            onSelectRootUri = { viewModel.saveRootTestUri(it); viewModel.scanRootTestDirectory() },
            onRescan = { viewModel.scanRootTestDirectory() },
            onMergeSubFolder = { viewModel.mergeSubFolder(it) },
            onUnmountStorage = { viewModel.unmountStorage() },
        )
    }
}
