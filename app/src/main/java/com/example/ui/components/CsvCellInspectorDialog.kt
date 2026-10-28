package com.example.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.GridOn
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.R
import com.example.data.model.CsvSampleItem

@Composable
fun CsvCellInspectorDialog(item: CsvSampleItem, onDismiss: () -> Unit) {
    AlertDialog(
        onDismissRequest = onDismiss,
        title = {
            Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier.fillMaxWidth()) {
                Icon(Icons.Filled.GridOn, null, tint = MaterialTheme.colorScheme.primary)
                Spacer(Modifier.width(10.dp))
                Column(modifier = Modifier.weight(1f)) {
                    Text(stringResource(R.string.inspector_dialog_title, item.targetCell), fontWeight = FontWeight.Bold, fontSize = 18.sp)
                    Text(item.fileName, color = MaterialTheme.colorScheme.onSurfaceVariant, fontSize = 12.sp, fontWeight = FontWeight.Normal, maxLines = 1)
                }
                IconButton(onClick = onDismiss) { Icon(Icons.Filled.Close, stringResource(R.string.btn_close)) }
            }
        },
        text = {
            Column {
                Surface(shape = RoundedCornerShape(16.dp), color = MaterialTheme.colorScheme.primaryContainer) {
                    Row(
                        modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp, vertical = 14.dp),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically,
                    ) {
                        Text(
                            stringResource(R.string.inspector_dialog_extracted, item.targetCell, "").trimEnd(),
                            color = MaterialTheme.colorScheme.onPrimaryContainer, fontSize = 14.sp,
                        )
                        Text(
                            item.extractedValue, fontFamily = FontFamily.Monospace, fontWeight = FontWeight.Bold,
                            color = MaterialTheme.colorScheme.onPrimaryContainer, fontSize = 16.sp,
                        )
                    }
                }
                Spacer(Modifier.height(14.dp))
                Text(stringResource(R.string.inspector_dialog_grid_label, item.targetCell), fontWeight = FontWeight.Bold, color = MaterialTheme.colorScheme.onSurfaceVariant, fontSize = 12.sp)
                Spacer(Modifier.height(8.dp))
                Column(
                    modifier = Modifier.fillMaxWidth().heightIn(max = 300.dp)
                        .border(1.dp, MaterialTheme.colorScheme.outlineVariant, RoundedCornerShape(12.dp))
                        .verticalScroll(rememberScrollState())
                        .horizontalScroll(rememberScrollState())
                        .padding(8.dp),
                    verticalArrangement = Arrangement.spacedBy(4.dp),
                ) {
                    item.rawPreviewGrid.forEachIndexed { r, row ->
                        Row(horizontalArrangement = Arrangement.spacedBy(4.dp)) {
                            Box(
                                modifier = Modifier.width(36.dp).height(32.dp).background(MaterialTheme.colorScheme.surfaceVariant, RoundedCornerShape(6.dp)),
                                contentAlignment = Alignment.Center,
                            ) { Text("${r + 1}", fontSize = 12.sp, color = MaterialTheme.colorScheme.onSurfaceVariant) }
                            row.forEachIndexed { c, cell ->
                                val hit = (r + 1) == item.rowNumber && colLetter(c) == item.columnLetter
                                Box(
                                    modifier = Modifier.widthIn(min = 100.dp).height(32.dp)
                                        .background(if (hit) MaterialTheme.colorScheme.primary else MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.5f), RoundedCornerShape(6.dp))
                                        .border(1.dp, MaterialTheme.colorScheme.outlineVariant.copy(alpha = 0.6f), RoundedCornerShape(6.dp))
                                        .padding(horizontal = 8.dp),
                                    contentAlignment = Alignment.CenterStart,
                                ) {
                                    Text(
                                        cell, fontFamily = FontFamily.Monospace, fontSize = 12.sp, maxLines = 1,
                                        fontWeight = if (hit) FontWeight.Bold else FontWeight.Normal,
                                        color = if (hit) MaterialTheme.colorScheme.onPrimary else MaterialTheme.colorScheme.onSurface,
                                    )
                                }
                            }
                        }
                    }
                }
            }
        },
        confirmButton = { TextButton(onClick = onDismiss) { Text(stringResource(R.string.btn_done), fontWeight = FontWeight.Bold) } },
        shape = RoundedCornerShape(28.dp),
        containerColor = MaterialTheme.colorScheme.surface,
    )
}

private fun colLetter(i: Int): String {
    var n = i; val sb = StringBuilder()
    do { sb.insert(0, ('A' + n % 26)); n = n / 26 - 1 } while (n >= 0)
    return sb.toString()
}
