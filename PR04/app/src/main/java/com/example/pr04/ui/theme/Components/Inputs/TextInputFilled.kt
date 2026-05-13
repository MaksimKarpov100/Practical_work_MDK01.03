package com.example.pr04.ui.theme.Components.Inputs

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.myapp.ui.theme.TextInputBg
import com.example.myapp.ui.theme.TextInputCursor
import com.example.myapp.ui.theme.TextInputFilledBorder

@Composable
fun TextInputFilled(
    value: String,
    onValueChange: (String) -> Unit,
    modifier: Modifier = Modifier
) {
    OutlinedTextField(
        value = value,
        onValueChange = onValueChange,
        modifier = modifier.padding(horizontal = 14.dp, vertical = 14.dp),
        shape = RoundedCornerShape(10.dp),
        colors = TextFieldDefaults.colors(
            focusedContainerColor = TextInputBg,
            unfocusedContainerColor = TextInputBg,
            focusedIndicatorColor = TextInputFilledBorder,
            unfocusedIndicatorColor = TextInputFilledBorder,
            cursorColor = TextInputCursor
        ),
        singleLine = true
    )
}