package com.example.myapp.ui.theme.components

import androidx.compose.foundation.clickable
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.myapp.ui.theme.TextButtonColor

@Composable
fun TextButton(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Text(
        text = text,
        modifier = modifier.clickable { onClick() },
        fontSize = 20.sp,
        fontWeight = FontWeight.SemiBold,
        lineHeight = 20.sp,
        color = TextButtonColor
    )
}

@Preview(showBackground = true)
@Composable
fun TextButtonPreview() {
    TextButton(text = "Нажми меня", onClick = {})
}