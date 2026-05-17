package com.example.pr09.ui.components.text

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp

@Composable
fun AppText(
    text: String,
    color: Color = Color.Black,
    size: TextUnit = 14.sp,
    maxLines: Int = 1
) {
    Text(
        text = text,
        color = color,
        fontSize = size,
        maxLines = maxLines
    )
}