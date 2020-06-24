package com.example.jatpackcompose

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.ui.core.Modifier
import androidx.ui.core.setContent
import androidx.ui.layout.Column
import androidx.ui.layout.fillMaxSize
import androidx.ui.tooling.preview.Preview

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Content()
        }
    }
}

@Composable
fun Content() {
    Column(
            modifier = Modifier.fillMaxSize()
    ) {
        PageContainer(containerModifier = Modifier.weight(1f))
        BottomNavigation()
    }
}

@Composable
@Preview(showBackground = true)
fun ContentPreview() {
    Content()
}