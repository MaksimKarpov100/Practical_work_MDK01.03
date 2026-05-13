package com.example.pr04.ui.theme.Components.Inputs

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapp.ui.theme.TextInputBg
import com.example.myapp.ui.theme.TextInputCursor
import com.example.myapp.ui.theme.TextInputPlaceholderBorder
import com.example.myapp.ui.theme.TextInputPlaceholderText

@Composable
fun TextInputPlaceholder(
    value: String,
    onValueChange: (String) -> Unit,
    placeholder: String,
    modifier: Modifier = Modifier
) {
    OutlinedTextField(
        value = value,
        onValueChange = onValueChange,
        modifier = modifier.padding(horizontal = 14.dp, vertical = 14.dp),
        placeholder = {
            Text(
                text = placeholder,
                fontSize = 15.sp,
                color = TextInputPlaceholderText
            )
        },
        shape = RoundedCornerShape(10.dp),
        colors = TextFieldDefaults.colors(
            focusedContainerColor = TextInputBg,
            unfocusedContainerColor = TextInputBg,
            focusedIndicatorColor = TextInputPlaceholderBorder,
            unfocusedIndicatorColor = TextInputPlaceholderBorder,
            cursorColor = TextInputCursor
        ),
        singleLine = true
    )
}
