package com.example.pr06.ui.screens

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.pr06.ui.components.buttons.TextActionButton
import com.example.pr06.ui.components.indicators.PageIndicator
import com.example.pr06.ui.components.texts.OnboardDescription
import com.example.pr06.ui.components.texts.OnboardTitle

class OnboardingLayout {

    @Composable
    fun Draw(
        title: String,
        description: String,
        shapeRes: Int,
        illustrationRes: Int,
        indicatorRes: Int,
        onNextClick: () -> Unit
    ) {
        Box(
            modifier = Modifier.fillMaxSize()
        ) {
            Image(
                painter = painterResource(id = shapeRes),
                contentDescription = null,
                modifier = Modifier
                    .padding(start = 208.dp, top = 49.dp)
                    .size(width = 167.dp, height = 163.dp)
                    .align(Alignment.TopStart)
            )

            TextActionButton(
                text = "Далее",
                onClick = onNextClick,
                modifier = Modifier
                    .padding(start = 30.dp, top = 49.dp)
                    .align(Alignment.TopStart)
            )

            Image(
                painter = painterResource(id = illustrationRes),
                contentDescription = null,
                modifier = Modifier
                    .padding(start = 79.dp, top = 526.dp)
                    .size(width = 204.dp, height = 200.dp)
                    .align(Alignment.TopStart)
            )

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .align(Alignment.TopCenter),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Spacer(modifier = Modifier.height(273.dp))
                OnboardTitle(
                    text = title,
                    modifier = Modifier.wrapContentSize()
                )

                Spacer(modifier = Modifier.height(29.dp))
                OnboardDescription(
                    text = description,
                    modifier = Modifier.width(214.dp)
                )

                Spacer(modifier = Modifier.height(60.dp))
                PageIndicator(
                    imageResId = indicatorRes,
                    modifier = Modifier.wrapContentSize()
                )
            }
        }
    }
}
