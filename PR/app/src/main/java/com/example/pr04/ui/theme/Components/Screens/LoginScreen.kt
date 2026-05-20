package com.example.pr04.ui.theme.Components.Screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.pr04.ui.theme.Components.Buttons.AddButton
import com.example.pr04.ui.theme.Components.Buttons.YandexLoginButton
import com.example.pr04.ui.theme.Components.Text.CenterText
import com.example.pr04.ui.theme.Components.Text.EmailInputField
import com.example.pr04.ui.theme.Components.Text.SmallText
import com.example.pr04.ui.theme.PR04Theme

@Composable
fun LoginScreen(modifier: Modifier = Modifier) {
    var email by rememberSaveable { mutableStateOf("example@mail.ru") }

    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(horizontal = 20.dp)
            .padding(bottom = 24.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(57.dp))
        CenterText(
            text = "Добро пожаловать!",
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(16.dp))
        SmallText(
            text = "Войдите, чтобы пользоваться функциями приложения",
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(70.dp))
        EmailInputField(
            value = email,
            onValueChange = { email = it },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(32.dp))
        AddButton(
            onClick = {},
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.weight(1f))
        SmallText(
            text = "Или войдите с помощью",
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(16.dp))
        YandexLoginButton(
            onClick = {},
            modifier = Modifier.fillMaxWidth()
        )
    }
}

@Preview (showSystemUi = true)
@Composable
private fun LoginScreenPreview() {
    PR04Theme {
        LoginScreen()
    }
}
