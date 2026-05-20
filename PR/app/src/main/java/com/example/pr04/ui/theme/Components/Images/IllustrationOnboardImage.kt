package com.example.pr04.ui.theme.Components.Images

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.pr04.R

@Composable
fun IllustrationOnboardImage(modifier: Modifier = Modifier) {
    Image(
        painter = painterResource(id = R.drawable.illustration_onboard),
        contentDescription = null,
        modifier = modifier.size(204.dp)
    )
}
