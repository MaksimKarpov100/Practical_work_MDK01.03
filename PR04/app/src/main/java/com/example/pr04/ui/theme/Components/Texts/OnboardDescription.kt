package com.example.myapp.ui.theme.components

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.myapp.ui.theme.OnboardDescriptionColor

@Composable
fun OnboardDescription(
    text: String,
    modifier: Modifier = Modifier
) {
    Text(
        text = text,
        modifier = modifier,
        fontSize = 14.sp,
        lineHeight = 20.sp,
        color = OnboardDescriptionColor,
        textAlign = TextAlign.Center
    )
}

@Preview(showBackground = true)
@Composable
fun OnboardDescriptionPreview() {
    OnboardDescription(text = "Описание процесса")
}