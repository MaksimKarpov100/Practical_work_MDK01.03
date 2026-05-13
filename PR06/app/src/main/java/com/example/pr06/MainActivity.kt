package com.example.pr06

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import com.example.pr06.ui.screens.OnboardingFirstScreen
import com.example.pr06.ui.screens.OnboardingSecondScreen
import com.example.pr06.ui.screens.OnboardingThirdScreen
import com.example.pr06.ui.theme.PR06Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PR06Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    var currentScreen by remember { mutableStateOf(0) }

                    Box(modifier = Modifier.padding(innerPadding)) {
                        when (currentScreen) {
                            0 -> OnboardingFirstScreen(onNavigateNext = { currentScreen = 1 })
                            1 -> OnboardingSecondScreen(onNavigateNext = { currentScreen = 2 })
                            2 -> OnboardingThirdScreen(onNavigateNext = {
                            })
                        }
                    }
                }
            }
        }
    }
}
