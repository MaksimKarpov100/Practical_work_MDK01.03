package com.example.pr09.ui.components.button

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.pr09.ui.theme.PrimaryBlue

@Composable
fun AddButton(
    active: Boolean,
    onClick: () -> Unit
) {
    Box(
        modifier = Modifier
            .width(96.dp)
            .height(40.dp)
            .background(
                if (active) Color.Gray else PrimaryBlue,
                RoundedCornerShape(10.dp)
            ),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = "Добавить",
            color = Color.White,
            fontSize = 14.sp
        )
    }
}