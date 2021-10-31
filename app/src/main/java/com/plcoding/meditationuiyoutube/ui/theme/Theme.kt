package com.plcoding.meditationuiyoutube.ui.theme


import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable

@Composable
fun MeditationUIYouTubeTheme(content: @Composable() () -> Unit) {
    MaterialTheme(
        typography = MyTypography,
        shapes = Shapes,
        content = content
    )
}