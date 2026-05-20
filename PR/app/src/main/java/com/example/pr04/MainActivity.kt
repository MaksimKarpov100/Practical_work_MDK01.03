package com.example.pr04

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.example.pr04.ui.theme.Components.Screens.ScreenOne
import com.example.pr04.ui.theme.Components.Screens.ScreenTwo
import com.example.pr04.ui.theme.Components.Screens.ScreenThree
import com.example.pr04.ui.theme.PR04Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PR04Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    val pagerState = rememberPagerState(pageCount = { 3 })
                    HorizontalPager(
                        state = pagerState,
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(innerPadding)
                    ) { page ->
                        when (page) {
                            0 -> ScreenOne()
                            1 -> ScreenTwo()
                            2 -> ScreenThree()
                        }
                    }

                }
            }
        }
    }
}
