package com.example.myapp.ui.theme.components

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.pr04.ui.theme.Components.Inputs.TextInputFilled
import com.example.pr04.ui.theme.Components.Inputs.TextInputPlaceholder

@Composable
fun MainScreen() {

    var placeholderText by remember { mutableStateOf("") }
    var filledText by remember { mutableStateOf("Поле с введенной информацией") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(horizontal = 20.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(113.dp))
        OnboardHeader(text = "Заголовок")

        Spacer(modifier = Modifier.height(165.dp - 113.dp - 24.dp))
        OnboardDescription(text = "Описание процесса")

        Spacer(modifier = Modifier.height(225.dp - 165.dp - 20.dp))
        TextButton(text = "Нажми меня", onClick = {})

        Spacer(modifier = Modifier.height(292.dp - 225.dp - 24.dp))
        PrimaryButton(text = "Кнопка", onClick = {})

        Spacer(modifier = Modifier.height(289.dp - 292.dp + 56.dp))
        SecondaryButton(text = "Еще одна кнопка", onClick = {})

        Spacer(modifier = Modifier.height(16.dp))
        DisabledButton(text = "Неактивная кнопка")

        Spacer(modifier = Modifier.height(385.dp - 289.dp - 56.dp))
        TextInputPlaceholder(
            value = placeholderText,
            onValueChange = { placeholderText = it },
            placeholder = "Поле для ввода с подсказкой"
        )

        Spacer(modifier = Modifier.height(16.dp))
        TextInputFilled(
            value = filledText,
            onValueChange = { filledText = it }
        )

        Spacer(modifier = Modifier.height(32.dp))
    }
}

@Preview(showBackground = true)
@Composable
fun MainScreenPreview() {
    MainScreen()
}