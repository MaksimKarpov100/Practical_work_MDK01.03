package com.example.pr04.ui.theme.Components.Text

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.pr04.ui.theme.PR04Theme
import com.example.pr04.ui.theme.TextColorGray
import com.example.pr04.ui.theme.TextColorGray2

@Composable
fun EmailInputField(
    value: String,
    onValueChange: (String) -> Unit,
    modifier: Modifier = Modifier,
    label: String = "Вход по E-mail",
    placeholder: String = "example@mail.ru"
) {
    Column(
        modifier = modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.spacedBy(4.dp) // Ровно 4 пикселя по ТЗ
    ) {
        SmallText(text = label)

        TextField(
            value = value,
            onValueChange = onValueChange,
            modifier = Modifier.fillMaxWidth(),
            placeholder = {
                Text(
                    text = placeholder,
                    color = TextColorGray2
                )
            },
            singleLine = true,
            shape = RoundedCornerShape(10.dp),
            colors = TextFieldDefaults.colors(
                focusedContainerColor = TextColorGray,
                unfocusedContainerColor = TextColorGray,
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,
                disabledIndicatorColor = Color.Transparent
            )
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun EmailInputFieldPreview() {
    PR04Theme {
        EmailInputField(value = "", onValueChange = {})
    }
}
