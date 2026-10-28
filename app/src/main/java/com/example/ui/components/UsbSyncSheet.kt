package com.example.ui.components

import android.net.Uri
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.R
import com.example.data.model.TestSubFolder

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun UsbSyncSheet(
    rootUriString: String?,
    subFolders: List<TestSubFolder>,
    isSyncing: Boolean,
    onDismiss: () -> Unit,
    onSelectRootUri: (Uri) -> Unit,
    onRescan: () -> Unit,
    onMergeSubFolder: (TestSubFolder) -> Unit,
    onUnmountStorage: () -> Unit,
    modifier: Modifier = Modifier,
) {
    val launcher = rememberLauncherForActivityResult(ActivityResultContracts.OpenDocumentTree()) { uri ->
        if (uri != null) onSelectRootUri(uri)
    }
    ModalBottomSheet(onDismissRequest = onDismiss, modifier = modifier, sheetState = rememberModalBottomSheetState(skipPartiallyExpanded = true)) {
        Column(modifier = Modifier.fillMaxWidth().fillMaxHeight(0.85f).padding(horizontal = 16.dp).padding(bottom = 24.dp)) {
            Spacer(Modifier.height(28.dp))
            Row(modifier = Modifier.fillMaxWidth().padding(vertical = 12.dp), verticalAlignment = Alignment.CenterVertically) {
                Surface(modifier = Modifier.size(48.dp), shape = RoundedCornerShape(24.dp), color = MaterialTheme.colorScheme.primaryContainer) {
                    Box(contentAlignment = Alignment.Center) { Icon(Icons.Filled.Sync, null, tint = MaterialTheme.colorScheme.primary) }
                }
                Spacer(Modifier.width(12.dp))
                Column(modifier = Modifier.weight(1f)) {
                    Text(stringResource(R.string.sync_sheet_title), fontWeight = FontWeight.Bold, fontSize = 17.sp)
                    Text(stringResource(R.string.sync_sheet_desc), color = MaterialTheme.colorScheme.onSurfaceVariant, fontSize = 12.sp, lineHeight = 16.sp)
                }
            }
            Spacer(Modifier.height(40.dp))
            if (rootUriString.isNullOrEmpty()) {
                Surface(
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(20.dp),
                    color = MaterialTheme.colorScheme.primaryContainer.copy(alpha = 0.5f),
                    border = BorderStroke(1.dp, MaterialTheme.colorScheme.primary.copy(alpha = 0.3f)),
                ) {
                    Column(modifier = Modifier.padding(horizontal = 20.dp, vertical = 20.dp), horizontalAlignment = Alignment.CenterHorizontally) {
                        Icon(Icons.Filled.Usb, null, tint = MaterialTheme.colorScheme.primary, modifier = Modifier.size(40.dp))
                        Spacer(Modifier.height(8.dp))
                        Text(stringResource(R.string.sync_no_root_title), fontWeight = FontWeight.Bold, fontSize = 14.sp)
                        Spacer(Modifier.height(4.dp))
                        Text(stringResource(R.string.sync_no_root_desc), color = MaterialTheme.colorScheme.onSurfaceVariant, fontSize = 12.sp, lineHeight = 16.sp)
                        Spacer(Modifier.height(16.dp))
                        Button(onClick = { launcher.launch(null) }, modifier = Modifier.fillMaxWidth().height(44.dp), shape = RoundedCornerShape(16.dp)) {
                            Icon(Icons.Filled.FolderSpecial, null, modifier = Modifier.size(20.dp))
                            Spacer(Modifier.width(8.dp))
                            Text(stringResource(R.string.btn_select_test_root), fontWeight = FontWeight.Bold)
                        }
                    }
                }
            } else {
                Row(modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
                    Icon(Icons.Filled.FolderSpecial, null, tint = MaterialTheme.colorScheme.primary)
                    Spacer(Modifier.width(8.dp))
                    Text(
                        stringResource(R.string.sync_root_path_label, Uri.decode(rootUriString).substringAfterLast(":").ifEmpty { "TEST" }),
                        modifier = Modifier.weight(1f), style = MaterialTheme.typography.bodySmall, maxLines = 1,
                    )
                    IconButton(onClick = onRescan) { Icon(Icons.Filled.Refresh, "Refresh", tint = MaterialTheme.colorScheme.primary) }
                }
                Spacer(Modifier.height(8.dp))
                if (isSyncing) {
                    LinearProgressIndicator(modifier = Modifier.fillMaxWidth())
                } else if (subFolders.isEmpty()) {
                    Text(
                        stringResource(R.string.sync_empty_subfolders),
                        modifier = Modifier.fillMaxWidth().padding(24.dp),
                        textAlign = TextAlign.Center,
                        color = MaterialTheme.colorScheme.onSurfaceVariant,
                    )
                } else {
                    LazyColumn(verticalArrangement = Arrangement.spacedBy(10.dp), modifier = Modifier.heightIn(max = 420.dp)) {
                        items(subFolders, key = { it.uriString }) { f ->
                            Card(
                                modifier = Modifier.fillMaxWidth(),
                                shape = RoundedCornerShape(20.dp),
                                border = BorderStroke(1.dp, MaterialTheme.colorScheme.outlineVariant),
                                colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface),
                            ) {
                                Row(modifier = Modifier.padding(16.dp), verticalAlignment = Alignment.CenterVertically) {
                                    Icon(Icons.Filled.Folder, null, tint = MaterialTheme.colorScheme.primary)
                                    Spacer(Modifier.width(12.dp))
                                    Column(modifier = Modifier.weight(1f)) {
                                        Text(f.folderName, fontWeight = FontWeight.Bold)
                                        Text(stringResource(R.string.samples_count, f.csvCount), color = MaterialTheme.colorScheme.onSurfaceVariant, style = MaterialTheme.typography.bodySmall)
                                    }
                                    Button(onClick = { onMergeSubFolder(f) }, shape = RoundedCornerShape(14.dp)) {
                                        Text(stringResource(R.string.sync_merge_folder))
                                    }
                                }
                            }
                        }
                    }
                }
                Spacer(Modifier.height(12.dp))
                OutlinedButton(onClick = { launcher.launch(null) }, modifier = Modifier.fillMaxWidth(), shape = RoundedCornerShape(16.dp)) {
                    Text(stringResource(R.string.btn_change_test_root))
                }
            }
        }
    }
}
