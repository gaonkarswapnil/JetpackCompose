package com.example.composepractice

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

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
fun TextComposables() {
    Text(
        text = "Hello Oliver",
        textAlign = TextAlign.Center,
        fontSize = 20.sp,
        fontStyle = FontStyle.Italic
    )
}

@Composable
fun ListViewItem(imgId: Int, name: String, occupation: String){

    Row(
        Modifier.padding(8.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center,
    ) {
        Image(
            painter = painterResource(imgId),
            contentDescription = "Person",
            Modifier.size(100.dp)
        )

        Column{

            Text(
                text = name,
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp
            )

            Text(
                text = occupation,
                fontSize = 16.sp
            )


        }
    }

}

@Preview(showSystemUi = true)
@Composable
fun PreviewFunction() {

    Column(
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "A", fontSize = 20.sp)
        Text(text = "B", fontSize = 20.sp)
    }

    Row(
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(text = "A", fontSize = 20.sp)
        Text(text = "B", fontSize = 20.sp)
    }

    Box(contentAlignment = Alignment.Center) {
        Image(
            painter = painterResource(R.drawable.ic_fav),
            contentDescription = "Fav",
            colorFilter = ColorFilter.tint(Color.Red)
        )
        Image(
            painter = painterResource(R.drawable.ic_arrow),
            contentDescription = "Arrow"
        )
    }


    Column {
        ListViewItem(
            imgId = R.drawable.ic_person,
            name = "Oliver Queen",
            occupation = "Developer"
        )
        ListViewItem(
            imgId = R.drawable.ic_person,
            name = "Swapnil Gaonkar",
            occupation = "Developer"
        )
        ListViewItem(
            imgId = R.drawable.ic_person,
            name = "Bruce Wayne",
            occupation = "Developer"
        )
        ListViewItem(
            imgId = R.drawable.ic_person,
            name = "Tony Stark",
            occupation = "Developer"
        )
        ListViewItem(
            imgId = R.drawable.ic_person,
            name = "Jon Snow",
            occupation = "Developer"
        )
    }

//    ListViewItem(
//        imgId = R.drawable.ic_person,
//        name = "Oliver Queen",
//        occupation = "Developer"
//    )
}
