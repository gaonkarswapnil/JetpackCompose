package com.example.composepractice

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.composepractice.ui.theme.ComposePracticeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PreviewComposition()
        }
    }
}

@Composable
fun Recomposition(){
    val state = remember{mutableStateOf(0.0)}
    Log.d("TAGGED", "Logged during Initial Composition")

    Button(onClick = {
        state.value = Math.random()
    }) {
        Log.d("TAGGED", "Logged during both composition and recomposition")
        Text(text = state.value.toString())
    }
}

@Preview
@Composable
fun PreviewComposition(){
    Recomposition()
}