package com.example.pr04.ui.theme.Components.Text

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.pr04.ui.theme.Green

@Composable
fun CenterText(text: String, modifier: Modifier = Modifier) {
    Text(
        text = text,
        color = Green,
        fontWeight = FontWeight.W600,
        fontSize = 20.sp,
        textAlign = TextAlign.Center,
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
private fun CenterTextPreview() {
    CenterText(text = "Анализы")
}
