package com.example.jatpackcompose

import androidx.compose.Composable
import androidx.ui.animation.Crossfade
import androidx.ui.core.Modifier
import androidx.ui.material.MaterialTheme
import androidx.ui.material.Surface

@Composable
fun PageContainer(
    containerModifier: Modifier
) {
    Surface(
        modifier = containerModifier,
        color = MaterialTheme.colors.background
    ) {
        Crossfade(current = ScreenState.currentScreen) { screen ->
            when (screen) {
                is Screen.Article -> Article(name = "Android")
                is Screen.Home -> Home()
            }
        }
    }
}