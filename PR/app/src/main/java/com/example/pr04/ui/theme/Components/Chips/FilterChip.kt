package com.example.pr04.ui.theme.Components.Chips

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.pr04.ui.theme.PrimaryColor
import com.example.pr04.ui.theme.TextColorGray
import com.example.pr04.ui.theme.TextColorGray2
import com.example.pr04.ui.theme.WhiteColor

@Composable
fun FilterChip(text: String, isSelected: Boolean, modifier: Modifier = Modifier) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = modifier
            .clip(RoundedCornerShape(12.dp))
            .background(if (isSelected) PrimaryColor else TextColorGray)
            .padding(horizontal = 20.dp, vertical = 14.dp)
    ) {
        Text(
            text = text,
            color = if (isSelected) WhiteColor else TextColorGray2,
            fontSize = 15.sp,
            fontWeight = FontWeight.Medium
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun FilterChipPreview() {
    FilterChip(text = "Популярные", isSelected = true)
}
