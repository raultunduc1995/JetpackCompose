package com.example.jatpackcompose

import androidx.compose.Composable
import androidx.compose.state
import androidx.ui.core.ContentScale
import androidx.ui.core.Modifier
import androidx.ui.core.clip
import androidx.ui.foundation.Image
import androidx.ui.foundation.Text
import androidx.ui.foundation.shape.corner.RoundedCornerShape
import androidx.ui.graphics.Color
import androidx.ui.graphics.ImageAsset
import androidx.ui.layout.*
import androidx.ui.material.Button
import androidx.ui.material.Divider
import androidx.ui.material.MaterialTheme
import androidx.ui.res.imageResource
import androidx.ui.text.style.TextOverflow
import androidx.ui.tooling.preview.Preview
import androidx.ui.unit.dp


@Composable
fun Article(name: String) {
    val image = imageResource(id = R.drawable.header)

    MaterialTheme {
        Column(
            modifier = Modifier.padding(all = 16.dp)
        ) {
            ArticleHeader(headerImage = image)
            Spacer(modifier = Modifier.preferredHeight(16.dp))
            ArticleContent(name = name)
            Divider(color = Color.Black, modifier = Modifier.padding(vertical = 16.dp))
            CounterButton()
        }
    }
}

@Composable
fun ArticleHeader(headerImage: ImageAsset) {
    val imageModifier = Modifier
        .preferredHeightIn(maxHeight = 180.dp)
        .fillMaxWidth()
        .clip(shape = RoundedCornerShape(size = 8.dp))

    Image(asset = headerImage, modifier = imageModifier, contentScale = ContentScale.Crop)
}

@Composable
fun ArticleContent(name: String) {
    val typography = MaterialTheme.typography

    Text(
        text = "Long long long and very very very very very long title",
        style = typography.h4,
        maxLines = 2,
        overflow = TextOverflow.Ellipsis
    )
    Text(text = "Hello, $name!", style = typography.body1)
    Text(text = "Hello, world!", style = typography.body2)
    Text(text = "Another example text...", style = typography.body2)
}

@Composable
fun CounterButton() {
    val count = state(init = { 0 })

    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.Center
    ) {
        Button(
            onClick = { count.value++ },
            backgroundColor = if (count.value > 5) Color.Red else Color.Blue
        ) {
            Text(text = "Count value: ${count.value}")
        }
    }
}

@Preview(showBackground = true, name = "Article preview")
@Composable
fun PreviewGreeting() {
    Article(name = "Android")
}