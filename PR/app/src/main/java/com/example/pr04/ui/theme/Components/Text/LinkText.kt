package com.example.pr04.ui.theme.Components.Text

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.pr04.ui.theme.Blue

@Composable
fun LinkText(modifier: Modifier = Modifier) {
    Text(
        text = "Далее",
        fontSize = 20.sp,
        fontWeight = FontWeight.W600,
        color = Blue,
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
private fun LinkTextPreview() {
    LinkText()
}
