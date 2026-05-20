package com.example.pr04.ui.theme.Components.Navigation

import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.pr04.R
import com.example.pr04.ui.theme.PrimaryColor
import com.example.pr04.ui.theme.TabColor
import com.example.pr04.ui.theme.WhiteColor

data class TabItem(val title: String, val iconRes: Int)

@Composable
fun MainTabBar(currentRoute: String, onTabSelected: (String) -> Unit, modifier: Modifier = Modifier) {
    val items = listOf(
        TabItem("Анализы", R.drawable.ic_tab_analysis),
        TabItem("Результаты", R.drawable.ic_tab_results),
        TabItem("Поддержка", R.drawable.ic_tab_support),
        TabItem("Профиль", R.drawable.ic_tab_profile)
    )

    NavigationBar(containerColor = WhiteColor, tonalElevation = 8.dp, modifier = modifier) {
        items.forEach { item ->
            val isSelected = currentRoute == item.title
            NavigationBarItem(
                selected = isSelected,
                onClick = { onTabSelected(item.title) },
                label = { Text(text = item.title, style = MaterialTheme.typography.bodySmall) },
                icon = { Icon(painter = painterResource(id = item.iconRes), contentDescription = item.title, modifier = Modifier.size(24.dp)) },
                colors = NavigationBarItemDefaults.colors(
                    selectedIconColor = PrimaryColor,
                    selectedTextColor = PrimaryColor,
                    unselectedIconColor = TabColor,
                    unselectedTextColor = TabColor,
                    indicatorColor = WhiteColor
                )
            )
        }
    }
}
