package com.example.pr09.ui.components.tabbar

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.pr09.R
import com.example.pr09.ui.theme.White

@Composable
fun BottomTabBar(
    modifier: Modifier = Modifier
) {

    var selected by remember { mutableStateOf(0) }

    val tabs = listOf(
        Triple("Анализы", R.drawable.ic_analyse, 0),
        Triple("Результаты", R.drawable.ic_results, 1),
        Triple("Поддержка", R.drawable.ic_support, 2),
        Triple("Профиль", R.drawable.ic_profile, 3)
    )

    Row(
        modifier = modifier
            .fillMaxWidth()
            .height(88.dp)
            .background(Color.White),
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {

        tabs.forEach {
            TabItem(
                title = it.first,
                icon = it.second,
                selected = selected == it.third,
                onClick = { selected = it.third }
            )
        }
    }
}