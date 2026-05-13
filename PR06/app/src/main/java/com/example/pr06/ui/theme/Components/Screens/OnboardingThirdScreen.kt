package com.example.pr06.ui.screens

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.pr06.R

@Composable
fun OnboardingThirdScreen(onNavigateNext: () -> Unit) {
    val layout = OnboardingLayout()

    layout.Draw(
        title = "Мониторинг",
        description = "Наши врачи всегда на связи",
        shapeRes = R.drawable.shape,
        illustrationRes = R.mipmap.ic_launcher_foreground,
        indicatorRes = R.drawable.group_2__2_,
        onNextClick = onNavigateNext
    )
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun OnboardingThirdScreenPreview() {
    OnboardingThirdScreen(onNavigateNext = {})
}
