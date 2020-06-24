package com.example.jatpackcompose

import androidx.compose.Composable
import androidx.ui.core.Alignment
import androidx.ui.core.ContentScale
import androidx.ui.core.Modifier
import androidx.ui.foundation.*
import androidx.ui.graphics.Color
import androidx.ui.layout.*
import androidx.ui.layout.ColumnScope.weight
import androidx.ui.material.Button
import androidx.ui.material.Divider
import androidx.ui.res.imageResource
import androidx.ui.tooling.preview.Preview
import androidx.ui.unit.dp

@Composable
fun Home() {
    VerticalScroller(
        modifier = Modifier.weight(1f, fill = true),
        isScrollable = true
    ) {
        (0..30).forEach { _ ->
            FlirFileFolderCard()
            Divider()
        }
    }
}

@Composable
fun FlirFileFolderCard() {
    Row(
        modifier = Modifier.fillMaxWidth().padding(8.dp),
        verticalGravity = Alignment.CenterVertically
    ) {
        Image(
            asset = imageResource(id = R.drawable.header),
            modifier = Modifier.preferredSizeIn(maxHeight = 32.dp, maxWidth = 32.dp),
            contentScale = ContentScale.Crop
        )
        Column(
            modifier = Modifier.padding(horizontal = 16.dp).weight(1f)
        ) {
            Text(text = "Fournier’s Wallmount")
            Text(text = "78 files · 27 Aug 2018, 10:23 PM")
        }
        Box(
            modifier = Modifier.clickable(onClick = { }, enabled = true),
            paddingTop = 8.dp,
            paddingBottom = 8.dp,
            paddingStart = 8.dp,
            paddingEnd = 8.dp,
            gravity = ContentGravity.Center
        ) {
            Image(
                asset = imageResource(id = R.drawable.ic_action_name),
                modifier = Modifier.preferredSizeIn(maxWidth = 15.dp, maxHeight = 15.dp),
                contentScale = ContentScale.Fit
            )
        }
    }
}

@Composable
@Preview(showBackground = true)
fun HomePreview() {
    Home()
}