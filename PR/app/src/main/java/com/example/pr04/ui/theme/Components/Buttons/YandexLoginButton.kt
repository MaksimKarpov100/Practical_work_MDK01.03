package com.example.pr04.ui.theme.Components.Buttons

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.pr04.ui.theme.InfoColor // Синий цвет #1A6FEE / #2F80ED для Яндекса по ТЗ
import com.example.pr04.ui.theme.PR04Theme
import com.example.pr04.ui.theme.WhiteColor

@Composable
fun YandexLoginButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Button(
        onClick = onClick,
        modifier = modifier.height(60.dp),
        shape = RoundedCornerShape(12.dp),
        border = BorderStroke(1.dp, InfoColor),
        colors = ButtonDefaults.buttonColors(
            containerColor = WhiteColor,
            contentColor = InfoColor
        )
    ) {
        Text(
            text = "Войти с Яндекс",
            fontSize = 17.sp,
            fontWeight = FontWeight.Normal
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun YandexLoginButtonPreview() {
    PR04Theme {
        YandexLoginButton(onClick = {})
    }
}
