package com.example.pr04.ui.theme.Components.Screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.pr04.ui.theme.Components.Images.SubtractShapeImage
import com.example.pr04.ui.theme.Components.Text.CenterText
import com.example.pr04.ui.theme.Components.Text.LinkText
import com.example.pr04.ui.theme.Components.Text.SmallText
import com.example.pr04.ui.theme.WhiteColor

@Composable
fun FullScreen(
    title: String,
    subtitle: String,
    loadImage: @Composable (Modifier) -> Unit,
    bigImage: @Composable (Modifier) -> Unit,
    modifier: Modifier = Modifier
) {
    Surface(
        modifier = modifier.fillMaxSize(),
        color = WhiteColor
    ) {
        Column(modifier = Modifier.fillMaxSize()) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                LinkText(modifier = Modifier.padding(top = 49.dp, start = 30.dp))
                SubtractShapeImage(modifier = Modifier.padding(top = 49.dp))
            }

            Spacer(modifier = Modifier.weight(0.5f))

            Column(
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                CenterText(
                    text = title,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 23.dp)
                )
                SmallText(
                    text = subtitle,
                    modifier = Modifier.fillMaxWidth()
                )
            }

            Spacer(modifier = Modifier.weight(0.8f))

            Column(
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                loadImage(Modifier.fillMaxWidth())
            }

            Spacer(modifier = Modifier.weight(1f))

            Column(
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                bigImage(Modifier
                    .fillMaxWidth()
                    .size(300.dp))
            }

            Spacer(modifier = Modifier.weight(0.8f))
        }
    }
}
