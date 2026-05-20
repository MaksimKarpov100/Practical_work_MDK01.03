package com.example.pr04.ui.theme.Components.Cards

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.pr04.ui.theme.Components.Buttons.AddButton
import com.example.pr04.ui.theme.TextColorDark
import com.example.pr04.ui.theme.TextColorGray2
import com.example.pr04.ui.theme.WhiteColor

@Composable
fun AnalysisCard(
    title: String,
    days: String,
    price: String,
    onAddClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier
            .padding(horizontal = 16.dp, vertical = 8.dp)
            .fillMaxWidth(),
        shape = RoundedCornerShape(20.dp),
        colors = CardDefaults.cardColors(containerColor = WhiteColor),
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)
    ) {
        Column(modifier = Modifier.padding(20.dp)) {
            Text(text = title, style = MaterialTheme.typography.titleMedium, color = TextColorDark)
            Spacer(modifier = Modifier.height(20.dp))
            Row(modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
                Column {
                    Text(text = days, style = MaterialTheme.typography.bodyMedium, color = TextColorGray2)
                    Spacer(modifier = Modifier.height(6.dp))
                    Text(text = price, style = MaterialTheme.typography.titleLarge, color = TextColorDark)
                }
                Spacer(modifier = Modifier.weight(1f))
                AddButton(onClick = onAddClick, modifier = Modifier.offset(y = 6.dp))
            }
        }
    }
}
