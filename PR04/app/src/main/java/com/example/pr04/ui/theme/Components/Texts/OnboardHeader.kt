package com.example.myapp.ui.theme.components

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.myapp.ui.theme.OnboardHeaderColor

@Composable
fun OnboardHeader(
    text: String,
    modifier: Modifier = Modifier
) {
    Text(
        text = text,
        modifier = modifier,
        style = TextStyle(
            fontSize = 20.sp,
            fontWeight = FontWeight.SemiBold,
            lineHeight = 20.sp,
            color = OnboardHeaderColor
        )
    )
}

@Preview(showBackground = true)
@Composable
fun OnboardHeaderPreview() {
    OnboardHeader(text = "Заголовок")
}