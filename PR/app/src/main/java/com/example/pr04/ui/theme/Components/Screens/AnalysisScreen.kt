package com.example.pr04.ui.theme.Components.Screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.pr04.data.testAnalysisList
import com.example.pr04.data.testFilters
import com.example.pr04.ui.theme.Components.Cards.AnalysisCard
import com.example.pr04.ui.theme.Components.Chips.FilterChip
import com.example.pr04.ui.theme.Components.Navigation.MainTabBar
import com.example.pr04.ui.theme.PR04Theme
import com.example.pr04.ui.theme.WhiteColor
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items

@Composable
fun AnalysisScreen(modifier: Modifier = Modifier) {
    var currentTab by remember { mutableStateOf("Анализы") }
    var selectedFilter by remember { mutableStateOf("Популярные") }

    Surface(
        modifier = modifier.fillMaxSize(),
        color = WhiteColor
    ) {
        Scaffold(
            modifier = Modifier.fillMaxSize(),
            bottomBar = {
                MainTabBar(
                    currentRoute = currentTab,
                    onTabSelected = { clickedTab -> currentTab = clickedTab }
                )
            }
        ) { innerPadding ->
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(WhiteColor)
                    .padding(innerPadding)
            ) {
                LazyRow(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 16.dp, bottom = 16.dp),
                    contentPadding = PaddingValues(horizontal = 16.dp),
                    horizontalArrangement = Arrangement.spacedBy(16.dp)
                ) {
                    items(testFilters) { filter ->
                        FilterChip(
                            text = filter,
                            isSelected = filter == selectedFilter
                        )
                    }
                }

                LazyColumn(
                    modifier = Modifier.fillMaxSize(),
                    contentPadding = PaddingValues(
                        start = 16.dp,
                        end = 16.dp,
                        bottom = 16.dp
                    ),
                    verticalArrangement = Arrangement.spacedBy(12.dp)
                ) {
                    items(testAnalysisList) { item ->
                        AnalysisCard(
                            title = item.title,
                            days = item.days,
                            price = item.price,
                            onAddClick = {},
                            modifier = Modifier.fillMaxWidth()
                        )
                    }
                }
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
private fun AnalysisScreenPreview() {
    PR04Theme {
        AnalysisScreen()
    }
}
