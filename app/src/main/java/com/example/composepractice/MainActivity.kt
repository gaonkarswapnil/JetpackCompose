package com.example.composepractice

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composepractice.ui.theme.ComposePracticeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PreviewFunction()
        }
    }
}

@Composable
fun TextComposable() {
    Text(
        text = "Hello",
        color = Color.White,
        modifier = Modifier
            .clickable { }
            .padding(12.dp)
            .background(Color.Gray)
            .size(200.dp)
            .clip(CircleShape)
            .background(Color.White)


    )
}

@Composable
fun CircularImage() {
    Image(
        painter = painterResource(R.drawable.batman),
        contentDescription = "batman",
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .padding(50.dp)
            .clip(CircleShape)
            .border(2.dp, Color.LightGray, CircleShape)


    )

}

@Preview
@Composable
fun PreviewFunction() {
    Box(
        modifier = Modifier
            .fillMaxSize(),
        contentAlignment = Alignment.TopCenter
    ) {
        CircularImage()
    }

}