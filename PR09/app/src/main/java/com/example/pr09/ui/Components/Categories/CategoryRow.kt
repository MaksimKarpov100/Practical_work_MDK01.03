package com.example.pr09.ui.components.categories

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun CategoryRow() {

    var selected by remember { mutableStateOf(0) }

    val items = listOf(
        "Популярные","Covid","Комплексные","Чекапы",
        "Биохимия","Гормоны","Иммунитет","Витамины",
        "Аллергены","Анализ крови","Анализ мочи",
        "Анализ кала","Только в клинике"
    )

    LazyRow(
        modifier = Modifier.fillMaxWidth(),
        contentPadding = PaddingValues(start = 20.dp, top = 24.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        items(items.size) { index ->
            CategoryItem(
                text = items[index],
                selected = selected == index,
                onClick = { selected = index }
            )
        }
    }
}