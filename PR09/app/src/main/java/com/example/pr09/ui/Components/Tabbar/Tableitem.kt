package com.example.pr09.ui.components.tabbar

import androidx.annotation.DrawableRes
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.pr09.ui.theme.*

@Composable
fun TabItem(
    title: String,
    @DrawableRes icon: Int,
    selected: Boolean,
    onClick: () -> Unit
) {
    Column(
        modifier = Modifier
            .width(76.dp)
            .clickable { onClick() },
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Icon(
            painter = painterResource(icon),
            contentDescription = null,
            tint = if (selected) PrimaryBlue else TextGray,
            modifier = Modifier.size(32.dp)
        )

        Spacer(Modifier.height(4.dp))

        Text(
            text = title,
            fontSize = 12.sp,
            color = if (selected) PrimaryBlue else TextGray
        )
    }
}