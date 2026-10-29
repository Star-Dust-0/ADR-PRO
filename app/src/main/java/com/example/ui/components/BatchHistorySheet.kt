package com.example.ui.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Folder
import androidx.compose.ui.unit.sp
import androidx.compose.material.icons.filled.History
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.R
import com.example.data.db.BatchHistoryEntity
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BatchHistorySheet(
    historyList: List<BatchHistoryEntity>,
    onSelectBatch: (BatchHistoryEntity) -> Unit,
    onDeleteBatch: (Long) -> Unit,
    onDismiss: () -> Unit,
) {
    ModalBottomSheet(onDismissRequest = onDismiss) {
        Column(modifier = Modifier.fillMaxWidth().fillMaxHeight(0.55f).padding(horizontal = 24.dp).padding(bottom = 24.dp)) {
            Row(
                modifier = Modifier.fillMaxWidth().padding(top = 24.dp, bottom = 8.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(Icons.Filled.History, null, tint = MaterialTheme.colorScheme.primary)
                    Spacer(Modifier.width(10.dp))
                    Text(stringResource(R.string.history_sheet_title), fontWeight = FontWeight.Bold, style = MaterialTheme.typography.titleMedium)
                }
                TextButton(onClick = onDismiss) { Text(stringResource(R.string.btn_close), fontWeight = FontWeight.Medium) }
            }
            if (historyList.isEmpty()) {
                Box(modifier = Modifier.fillMaxWidth().height(200.dp), contentAlignment = Alignment.Center) {
                    Text(stringResource(R.string.history_sheet_empty), color = MaterialTheme.colorScheme.onSurfaceVariant)
                }
            } else {
                LazyColumn(verticalArrangement = Arrangement.spacedBy(10.dp), modifier = Modifier.heightIn(max = 480.dp)) {
                    items(historyList, key = { it.id }) { item ->
                        HistoryCardItem(item, { onSelectBatch(item) }, { onDeleteBatch(item.id) })
                    }
                }
            }
        }
    }
}

@Composable
private fun HistoryCardItem(item: BatchHistoryEntity, onSelect: () -> Unit, onDelete: () -> Unit) {
    val fmt = SimpleDateFormat("yyyy/MM/dd - HH:mm", Locale.US)
    Card(
        modifier = Modifier.fillMaxWidth().clickable(onClick = onSelect),
        shape = RoundedCornerShape(16.dp),
        border = BorderStroke(1.dp, MaterialTheme.colorScheme.outlineVariant.copy(alpha = 0.4f)),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.3f)),
    ) {
        Row(modifier = Modifier.padding(10.dp), verticalAlignment = Alignment.CenterVertically) {
            Surface(modifier = Modifier.size(44.dp), shape = RoundedCornerShape(12.dp), color = MaterialTheme.colorScheme.primaryContainer) {
                Box(contentAlignment = Alignment.Center) { Icon(Icons.Filled.Folder, null, tint = MaterialTheme.colorScheme.onPrimaryContainer) }
            }
            Spacer(Modifier.width(12.dp))
            Column(modifier = Modifier.weight(1f)) {
                Text(item.folderName, fontWeight = FontWeight.Bold, fontSize = 14.sp)
                Text(
                    stringResource(R.string.history_item_samples_cell, fmt.format(Date(item.processedTimestamp)), item.sampleCount, item.targetCell),
                    color = MaterialTheme.colorScheme.onSurfaceVariant, fontSize = 11.sp, lineHeight = 14.sp,
                )
            }
            IconButton(onClick = onSelect, modifier = Modifier.size(36.dp)) { Icon(Icons.Filled.History, null, tint = MaterialTheme.colorScheme.primary) }
            IconButton(onClick = onDelete, modifier = Modifier.size(36.dp)) {
                Icon(Icons.Filled.Delete, stringResource(R.string.btn_delete), tint = MaterialTheme.colorScheme.error.copy(alpha = 0.8f))
            }
        }
    }
}
