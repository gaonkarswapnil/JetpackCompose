package com.example.composepractice

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.composepractice.ui.theme.ComposePracticeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            //Text(text = "Hello Oliver!!")
            PreviewFunction()
        }
    }
}

@Composable
fun SayMessage(name: String) {
    Text(
        text = "Hello $name!!",
        fontStyle = FontStyle.Italic,
        fontWeight = FontWeight.Bold,
        fontSize = 20.sp,
        textAlign = TextAlign.Center,
        color = Color.Gray
    )
}

@Composable
fun ButtonComposable() {

    Button(
        onClick = {},

        colors = ButtonDefaults.buttonColors(
            contentColor = Color.White

        ),
        enabled = true,
        shape = ButtonDefaults.shape
    ) {
        Text(text = "Hello World!!")
        Image(
            painter = painterResource(R.drawable.batman),
            contentDescription = "Arrow"
        )
    }
}

@Composable
fun ImageComposable() {
    Image(
        painter = painterResource(R.drawable.my_train_logo),
        contentDescription = "My train App",
        colorFilter = ColorFilter.tint(Color.Red),
        contentScale = ContentScale.Crop

    )
}

@Composable
fun TextFieldComposable(){
    TextField(
        value = "",
        onValueChange = {},
        label = {
            Text(text = "Enter Message")
        },
        placeholder = {
            Text(text = "Plz enter your Message")
        }
    )
}


@Composable
fun TextFieldInputComposable(){
    val state = remember{mutableStateOf("")}
    TextField(
        value = state.value,
        onValueChange = {
            state.value = it
            Log.d("DEMO", it)
        },
        label = {
            Text(text = "Enter Message")
        }
    )
}

@Preview(widthDp = 200, heightDp = 200)
@Composable
fun PreviewFunction() {
//    SayMessage("Oliver")
//    ImageComposable()
//
//    ButtonComposable()

//    TextFieldComposable()

    TextFieldInputComposable()
}