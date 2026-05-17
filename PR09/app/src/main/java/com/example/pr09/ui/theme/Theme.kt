package com.example.pr09.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

private val LightColors = lightColorScheme(
    primary = PrimaryBlue,
    background = White,
    surface = White
)

@Composable
fun PR09Theme(
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = LightColors,
        typography = Typography,
        content = content
    )
}