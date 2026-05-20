package com.example.pr04.ui.theme.Components.Images

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import com.example.pr04.R

@Composable
fun OnboardingDotIndicator(currentScreen: Int, modifier: Modifier = Modifier) {
    val imageResource = when (currentScreen) {
        1 -> R.drawable.ic_onboard_dot_step_1
        2 -> R.drawable.ic_onboard_dot_step_2
        3 -> R.drawable.ic_onboard_dot_step_3
        else -> R.drawable.ic_onboard_dot_step_1
    }
    Image(
        painter = painterResource(id = imageResource),
        contentDescription = null,
        modifier = modifier
    )
}
