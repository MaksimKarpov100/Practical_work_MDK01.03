package com.example.pr06.ui.screens

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.pr06.R

@Composable
fun OnboardingFirstScreen(onNavigateNext: () -> Unit) {
    val layout = OnboardingLayout()

    layout.Draw(
        title = "Анализы",
        description = "Экспресс сбор и получение проб",
        shapeRes = R.drawable.shape,
        illustrationRes = R.drawable.illustration,
        indicatorRes = R.drawable.group_2,
        onNextClick = onNavigateNext
    )
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun OnboardingFirstScreenPreview() {
    OnboardingFirstScreen(onNavigateNext = {})
}
