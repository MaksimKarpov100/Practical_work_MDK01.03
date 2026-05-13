package com.example.myapp.ui.theme.components

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapp.ui.theme.SecondaryButtonBorder
import com.example.myapp.ui.theme.SecondaryButtonText

@Composable
fun SecondaryButton(
    text: String,
    onClick: () -> Unit,
    enabled: Boolean = true,
    modifier: Modifier = Modifier
) {
    Button(
        onClick = onClick,
        enabled = enabled,
        modifier = modifier
            .width(335.dp)
            .heightIn(min = 48.dp)
            .border(
                width = 1.dp,
                color = SecondaryButtonBorder,
                shape = RoundedCornerShape(10.dp)
            ),
        shape = RoundedCornerShape(10.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.Transparent,
            contentColor = SecondaryButtonText,
            disabledContainerColor = Color.Transparent,
            disabledContentColor = SecondaryButtonText.copy(alpha = 0.5f)
        ),
        contentPadding = PaddingValues(vertical = 14.dp)
    ) {
        Text(
            text = text,
            fontSize = 15.sp,
            lineHeight = 20.sp,
            color = SecondaryButtonText
        )
    }
}

@Preview(showBackground = true)
@Composable
fun SecondaryButtonPreview() {
    SecondaryButton(text = "Еще одна кнопка", onClick = {})
}