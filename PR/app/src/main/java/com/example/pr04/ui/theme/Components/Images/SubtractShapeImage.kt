package com.example.pr04.ui.theme.Components.Images

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import com.example.pr04.R

@Composable
fun SubtractShapeImage(modifier: Modifier = Modifier) {
    Image(
        painter = painterResource(id = R.drawable.bg_subtract_shape),
        contentDescription = null,
        modifier = modifier
    )
}
