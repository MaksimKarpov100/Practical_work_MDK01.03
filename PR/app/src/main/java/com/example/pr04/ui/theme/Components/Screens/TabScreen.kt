package com.example.pr04.ui.theme.Components.Screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.pr04.ui.theme.Components.Navigation.MainTabBar
import com.example.pr04.ui.theme.PR04Theme
import com.example.pr04.ui.theme.PrimaryColor
import com.example.pr04.ui.theme.WhiteColor

@Composable
fun TabScreen(modifier: Modifier = Modifier) {
    var currentTab by remember { mutableStateOf("Анализы") }

    Scaffold(
        modifier = modifier.fillMaxSize(),
        containerColor = WhiteColor,
        bottomBar = {
            MainTabBar(
                currentRoute = currentTab,
                onTabSelected = { selectedTitle -> currentTab = selectedTitle }
            )
        }
    ) { innerPadding ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = currentTab,
                style = MaterialTheme.typography.headlineLarge,
                color = PrimaryColor
            )
        }
    }
}

@Preview(showSystemUi = true)
@Composable
private fun TabScreenPreview() {
    PR04Theme {
        TabScreen()
    }
}
