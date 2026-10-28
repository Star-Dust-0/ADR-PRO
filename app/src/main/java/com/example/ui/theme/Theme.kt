package com.example.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

private val DarkColorScheme = darkColorScheme(
    primary = TealPrimary,
    onPrimary = OneUiCardLight,
    primaryContainer = TealPrimaryDark,
    onPrimaryContainer = TealPrimaryLight,
    background = OneUiSurfaceDark,
    onBackground = OneUiTextPrimaryDark,
    surface = OneUiCardDark,
    onSurface = OneUiTextPrimaryDark,
    surfaceVariant = OneUiSurfaceDark,
    onSurfaceVariant = OneUiTextSecondaryDark,
)

private val LightColorScheme = lightColorScheme(
    primary = TealPrimary,
    onPrimary = OneUiCardLight,
    primaryContainer = TealPrimaryLight,
    onPrimaryContainer = TealPrimaryDark,
    background = OneUiSurfaceLight,
    onBackground = OneUiTextPrimary,
    surface = OneUiCardLight,
    onSurface = OneUiTextPrimary,
    surfaceVariant = OneUiSurfaceLight,
    onSurfaceVariant = OneUiTextSecondary,
)

@Composable
fun MyApplicationTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit,
) {
    MaterialTheme(
        colorScheme = if (darkTheme) DarkColorScheme else LightColorScheme,
        typography = Typography,
        content = content,
    )
}
