package com.example.pr04.ui.theme.Components.Text

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.pr04.ui.theme.Gray

@Composable
fun SmallText(text: String, modifier: Modifier = Modifier) {
    Text(
        text = text,
        color = Gray,
        fontSize = 14.sp,
        fontWeight = FontWeight.W400,
        lineHeight = 20.sp,
        textAlign = TextAlign.Center,
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
private fun SmallTextPreview() {
    SmallText(text = "Пример описания")
}
