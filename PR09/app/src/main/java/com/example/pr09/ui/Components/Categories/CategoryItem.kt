package com.example.pr09.ui.components.categories

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.pr09.ui.theme.*

@Composable
fun CategoryItem(
    text: String,
    selected: Boolean,
    onClick: () -> Unit
) {
    Box(
        modifier = Modifier
            .height(48.dp)
            .background(
                if (selected) PrimaryBlue else LightGray,
                RoundedCornerShape(10.dp)
            )
            .clickable { onClick() }
            .padding(horizontal = 20.dp),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = text,
            color = if (selected) White else TextGray
        )
    }
}