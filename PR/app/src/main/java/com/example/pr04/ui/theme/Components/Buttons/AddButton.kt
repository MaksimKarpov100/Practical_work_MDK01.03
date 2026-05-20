package com.example.pr04.ui.theme.Components.Buttons

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.pr04.ui.theme.PrimaryColor
import com.example.pr04.ui.theme.WhiteColor

@Composable
fun AddButton(onClick: () -> Unit, modifier: Modifier = Modifier) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = modifier
            .clip(RoundedCornerShape(10.dp))
            .background(PrimaryColor)
            .clickable { onClick() }
            .padding(horizontal = 24.dp, vertical = 12.dp)
    ) {
        Text(
            text = "Добавить",
            style = MaterialTheme.typography.bodyMedium,
            color = WhiteColor
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun AddButtonPreview() {
    AddButton(onClick = {})
}
