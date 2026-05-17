package com.example.pr09.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.pr09.ui.components.categories.CategoryRow
import com.example.pr09.ui.components.card.AnalysisCard
import com.example.pr09.ui.components.tabbar.BottomTabBar

@Composable
fun MainScreen() {

    val cards = listOf(
        Triple("ПЦР-тест на коронавирус", "2 дня", "1800 ₽"),
        Triple("Клинический анализ крови", "1 день", "690 ₽"),
        Triple("Биохимия крови", "1 день", "2440 ₽"),
        Triple("СОЭ", "1 день", "240 ₽"),
        Triple("Общий анализ мочи", "1 день", "350 ₽"),
        Triple("Т4 свободный", "1 день", "680 ₽"),
        Triple("Группа крови", "1 день", "750 ₽")
    )

    Box(modifier = Modifier.fillMaxSize()) {

        Column {

            CategoryRow()

            LazyColumn(
                contentPadding = PaddingValues(
                    start = 20.dp,
                    end = 20.dp,
                    bottom = 120.dp
                ),
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                items(cards) {
                    AnalysisCard(it.first, it.second, it.third)
                }
            }
        }

        // ✔ ВОТ ЭТО КЛЮЧЕВО
        BottomTabBar(
            modifier = Modifier.align(Alignment.BottomCenter)
        )
    }
}
@Preview(showBackground = true)
@Composable
private fun MainScreenPreview() {
    MainScreen()
}