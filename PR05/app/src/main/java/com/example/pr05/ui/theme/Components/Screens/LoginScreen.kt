package com.example.pr05.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.pr05.ui.components.buttons.BigButton
import com.example.pr05.ui.components.buttons.YandexLoginButton
import com.example.pr05.ui.components.inputs.CustomInputField
import com.example.pr05.ui.components.texts.MainTitle
import com.example.pr05.ui.components.texts.DescriptionText
import com.example.pr05.ui.components.texts.HintText

@Composable
fun LoginScreen() {
    var email by remember { mutableStateOf("") }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 20.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 103.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            MainTitle(
                text = "Добро пожаловать!",
                modifier = Modifier.fillMaxWidth()
            )

            Spacer(modifier = Modifier.height(23.dp))
            DescriptionText(
                text = "Войдите, чтобы пользоваться функциями приложения",
                modifier = Modifier.fillMaxWidth()
            )
            Spacer(modifier = Modifier.height(68.dp))
            CustomInputField(
                value = email,
                onValueChange = { email = it },
                title = "Вход по E-mail",
                placeholder = "example@mail.ru",
                modifier = Modifier.fillMaxWidth()
            )
            Spacer(modifier = Modifier.height(32.dp))
            BigButton(
                text = "Далее",
                enabled = email.isNotBlank(),
                onClick = {},
                modifier = Modifier.fillMaxWidth()
            )
        }
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.BottomCenter)
                .padding(bottom = 56.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            HintText(
                text = "Или войдите с помощью",
                modifier = Modifier.fillMaxWidth()
            )
            Spacer(modifier = Modifier.height(16.dp))
            YandexLoginButton(
                text = "Войти с Яндекс",
                onClick = {},
                modifier = Modifier.fillMaxWidth()
            )
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun LoginScreenPreview() {
    LoginScreen()
}
