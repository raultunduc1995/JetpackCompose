package com.example.jatpackcompose

import androidx.compose.Composable
import androidx.ui.core.Alignment
import androidx.ui.core.Modifier
import androidx.ui.foundation.Text
import androidx.ui.graphics.Color
import androidx.ui.layout.*
import androidx.ui.material.MaterialTheme
import androidx.ui.material.Surface
import androidx.ui.material.TextButton
import androidx.ui.tooling.preview.Preview
import androidx.ui.unit.dp
import androidx.ui.unit.sp

@Composable
fun BottomNavigation() {
    Surface(color = Color.DarkGray, modifier = Modifier.fillMaxWidth()) {
        Row(
            modifier = Modifier.fillMaxWidth().preferredHeight(height = 75.dp),
            verticalGravity = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            TextButton(
                modifier = Modifier.weight(1f, fill = true).fillMaxHeight(),
                onClick = { navigateTo(Screen.Home) }
            ) {
                Text(
                    text = "Home",
                    color = Color.White,
                    style = MaterialTheme.typography.button,
                    fontSize = 18.sp
                )
            }
            TextButton(
                modifier = Modifier.weight(1f, fill = true).fillMaxHeight(),
                onClick = { navigateTo(Screen.Article) }
            ) {
                Text(
                    text = "Article",
                    color = Color.White,
                    style = MaterialTheme.typography.button,
                    fontSize = 18.sp
                )
            }
        }
    }
}

@Composable
@Preview(showBackground = true)
fun BottomNavigationPreview() {
    BottomNavigation()
}