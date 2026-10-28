package com.example.ui.components

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.GridOn
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.R
import java.util.Locale

@Composable
fun SettingsCellDialog(currentCell: String, onSaveCell: (String) -> Unit, onDismiss: () -> Unit) {
    var cellText by remember { mutableStateOf(currentCell) }
    AlertDialog(
        onDismissRequest = onDismiss,
        icon = null,
        title = {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Icon(Icons.Filled.GridOn, null, tint = MaterialTheme.colorScheme.primary)
                Spacer(Modifier.width(10.dp))
                Text(stringResource(R.string.dialog_settings_title), fontWeight = FontWeight.Bold)
            }
        },
        text = {
            Column {
                Text(stringResource(R.string.dialog_settings_desc), color = MaterialTheme.colorScheme.onSurfaceVariant, style = MaterialTheme.typography.bodyMedium)
                Spacer(Modifier.height(16.dp))
                OutlinedTextField(
                    value = cellText,
                    onValueChange = { cellText = it.uppercase(Locale.ROOT) },
                    label = { Text(stringResource(R.string.dialog_cell_code_label)) },
                    singleLine = true,
                    shape = RoundedCornerShape(20.dp),
                    modifier = Modifier.fillMaxWidth(),
                )
            }
        },
        confirmButton = {
            Button(onClick = { onSaveCell(cellText) }, shape = RoundedCornerShape(14.dp)) {
                Text(stringResource(R.string.btn_save), fontWeight = FontWeight.Bold)
            }
        },
        dismissButton = { TextButton(onClick = onDismiss) { Text(stringResource(R.string.btn_cancel), fontWeight = FontWeight.Bold) } },
        shape = RoundedCornerShape(28.dp),
    )
}
