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
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.R
import com.example.data.model.CsvSampleItem

@Composable
fun CsvCellInspectorDialog(item: CsvSampleItem, onDismiss: () -> Unit) {
    AlertDialog(
        onDismissRequest = onDismiss,
        title = {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Icon(Icons.Filled.GridOn, null, tint = MaterialTheme.colorScheme.primary)
                Spacer(Modifier.width(10.dp))
                Text(stringResource(R.string.inspector_dialog_title, item.targetCell), fontWeight = FontWeight.Bold)
            }
        },
        text = {
            Column {
                Text(stringResource(R.string.inspector_dialog_file, item.fileName), fontWeight = FontWeight.Medium, style = MaterialTheme.typography.bodyMedium)
                Spacer(Modifier.height(8.dp))
                Surface(shape = RoundedCornerShape(12.dp), color = MaterialTheme.colorScheme.primaryContainer) {
                    Text(
                        stringResource(R.string.inspector_dialog_extracted, item.targetCell, item.extractedValue),
                        modifier = Modifier.fillMaxWidth().padding(12.dp),
                        fontWeight = FontWeight.Bold,
                        color = MaterialTheme.colorScheme.onPrimaryContainer,
                        style = MaterialTheme.typography.bodyMedium,
                    )
                }
                Spacer(Modifier.height(12.dp))
                Text(stringResource(R.string.inspector_dialog_grid_label, item.targetCell), color = MaterialTheme.colorScheme.onSurfaceVariant, style = MaterialTheme.typography.labelMedium)
                Spacer(Modifier.height(6.dp))
                Column(
                    modifier = Modifier.fillMaxWidth().heightIn(max = 260.dp)
                        .border(1.dp, MaterialTheme.colorScheme.outlineVariant, RoundedCornerShape(12.dp))
                        .verticalScroll(rememberScrollState())
                        .horizontalScroll(rememberScrollState())
                        .padding(8.dp),
                ) {
                    item.rawPreviewGrid.forEachIndexed { r, row ->
                        Row {
                            row.forEachIndexed { c, cell ->
                                val hit = (r + 1) == item.rowNumber && colLetter(c) == item.columnLetter
                                Text(
                                    cell,
                                    modifier = Modifier.widthIn(min = 64.dp).background(
                                        if (hit) MaterialTheme.colorScheme.primary else androidx.compose.ui.graphics.Color.Transparent
                                    ).padding(horizontal = 8.dp, vertical = 4.dp),
                                    fontFamily = FontFamily.Monospace,
                                    fontWeight = if (hit) FontWeight.Bold else FontWeight.Normal,
                                    color = if (hit) MaterialTheme.colorScheme.onPrimary else MaterialTheme.colorScheme.onSurface,
                                    style = MaterialTheme.typography.bodySmall,
                                    maxLines = 1,
                                )
                            }
                        }
                    }
                }
            }
        },
        confirmButton = { TextButton(onClick = onDismiss) { Text(stringResource(R.string.btn_close), fontWeight = FontWeight.Bold) } },
        shape = RoundedCornerShape(28.dp),
    )
}

private fun colLetter(i: Int): String {
    var n = i; val sb = StringBuilder()
    do { sb.insert(0, ('A' + n % 26)); n = n / 26 - 1 } while (n >= 0)
    return sb.toString()
}
