package com.example.pr06.ui.components.texts

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import com.example.pr06.ui.theme.AppGreen

@Composable
fun OnboardTitle(
    text: String,
    modifier: Modifier = Modifier
) {
    Text(
        text = text,
        fontFamily = FontFamily.SansSerif,
        fontWeight = FontWeight.SemiBold,
        fontSize = 20.sp,
        lineHeight = 20.sp,
        color = AppGreen,
        textAlign = TextAlign.Center,
        modifier = modifier
    )
}
