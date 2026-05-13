package com.example.myapp.ui.theme.components

import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapp.ui.theme.DisabledButtonBg
import com.example.myapp.ui.theme.DisabledButtonText

@Composable
fun DisabledButton(
    text: String,
    modifier: Modifier = Modifier
) {
    Button(
        onClick = { },
        enabled = false,
        modifier = modifier
            .width(335.dp)
            .heightIn(min = 56.dp),
        shape = RoundedCornerShape(10.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = DisabledButtonBg,
            disabledContainerColor = DisabledButtonBg,
            disabledContentColor = DisabledButtonText
        )
    ) {
        Text(
            text = text,
            fontSize = 17.sp,
            fontWeight = FontWeight.SemiBold,
            lineHeight = 24.sp,
            color = DisabledButtonText
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DisabledButtonPreview() {
    DisabledButton(text = "Неактивная кнопка")
}