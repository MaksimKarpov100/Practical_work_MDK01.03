package com.example.pr09.components.chip

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

@Composable
fun ChipItem(text: String)
{
    Box(
        modifier = Modifier
            .height(48.dp)
            .background(Color(0xFFF5F5F9), RoundedCornerShape(10.dp))
            .padding(horizontal = 20.dp),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = text,
            fontSize = 15.sp,
            color = Color(0xFF7E7E9A)
        )
    }
}