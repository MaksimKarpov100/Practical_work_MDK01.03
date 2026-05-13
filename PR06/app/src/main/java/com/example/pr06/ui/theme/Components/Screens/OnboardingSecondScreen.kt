package com.example.pr06.ui.screens

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.pr06.R

@Composable
fun OnboardingSecondScreen(onNavigateNext: () -> Unit) {
    val layout = OnboardingLayout()

    layout.Draw(
        title = "Уведомления",
        description = "Вы быстро узнаете о результатах",
        shapeRes = R.drawable.shape,
        illustrationRes = R.mipmap.ic_launcher,
        indicatorRes = R.drawable.group_2__1_,
        onNextClick = onNavigateNext
    )
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun OnboardingSecondScreenPreview() {
    OnboardingSecondScreen(onNavigateNext = {})
}
