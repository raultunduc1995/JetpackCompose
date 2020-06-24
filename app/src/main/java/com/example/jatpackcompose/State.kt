package com.example.jatpackcompose

import androidx.compose.getValue
import androidx.compose.mutableStateOf
import androidx.compose.setValue

sealed class Screen {
    object Home : Screen()
    object Article : Screen()
}

object ScreenState {
    var currentScreen by mutableStateOf<Screen>(Screen.Home)
}

fun navigateTo(destination: Screen) {
    ScreenState.currentScreen = destination
}