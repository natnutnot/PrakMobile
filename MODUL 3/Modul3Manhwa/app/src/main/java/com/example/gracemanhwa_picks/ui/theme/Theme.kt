package com.example.gracemanhwa_picks.ui.theme

import androidx.compose.material3.*
import androidx.compose.runtime.Composable

@Composable
fun GracemanhwaPicksTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = lightColorScheme(),
        typography = Typography(),
        content = content
    )
}