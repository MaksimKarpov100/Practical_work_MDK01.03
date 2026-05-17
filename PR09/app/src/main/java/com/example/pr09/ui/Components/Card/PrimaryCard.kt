package com.example.pr09.ui.components.card

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.pr09.ui.components.text.AppText
import com.example.pr09.ui.components.button.AddButton
import com.example.pr09.ui.theme.*

@Composable
fun AnalysisCard(
    title: String,
    time: String,
    price: String
) {
    var added by remember { mutableStateOf(false) }

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .height(136.dp)
            .background(White, RoundedCornerShape(12.dp))
            .padding(16.dp)
    ) {

        AppText(text = title, size = 16.sp, maxLines = 2)

        Spacer(Modifier.height(16.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {

            Column(modifier = Modifier.weight(1f)) {
                AppText(text = time, color = TextGray)
                Spacer(Modifier.height(4.dp))
                AppText(text = price, size = 17.sp)
            }

            AddButton(
                active = added,
                onClick = { added = !added }
            )
        }
    }
}