package com.example.composepractice

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(heightDp = 500)
@Composable
fun PreviewComposable(){
//    CardCatelog(
//        R.drawable.ic_person,
//        "Programming",
//        "Learn Different programming Language"
//    )

//    Column(
//        modifier = Modifier
//            .verticalScroll(rememberScrollState())
//    ) {
//        getCategoryList().map { item ->
//            CardCatelog(item.img, item.title, item.subtitle)
//        }
//    }
    
    LazyColumn(content = {
        items(getCategoryList()){ item ->
            CardCatelog(item.img, item.title, item.subtitle)
        }

    })
}

@Composable
fun CardCatelog(img: Int, title: String, subtitle: String){
    Card(
        modifier = Modifier
            .padding(8.dp),
        elevation = CardDefaults.elevatedCardElevation(10.dp),
        border = BorderStroke(2.dp, color = Color.Gray)

    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(8.dp)
        ) {
            Image(
                painter = painterResource(img),
                contentDescription = "Account",
                modifier = Modifier
                    .size(48.dp)
                    .padding(10.dp)
                    .weight(.2f)
            )

            DataItem(title, subtitle, Modifier.weight(.8f))
        }
    }
}

@Composable
private fun DataItem(title: String, subtitle: String, modifier: Modifier) {
    Column(
        modifier = modifier
    ) {
        Text(
            text = title,
            style = MaterialTheme.typography.titleLarge
        )

        Text(
            text = subtitle,
            style = MaterialTheme.typography.titleSmall,
            fontWeight = FontWeight.Thin
        )
    }
}


data class Category(
    val img: Int,
    val title: String,
    val subtitle: String
)


fun getCategoryList(): List<Category>{
    val list = mutableListOf<Category>()

    list.add(Category(R.drawable.ic_person, "Programer", "Learn Different programming Language"))
    list.add(Category(R.drawable.ic_person, "Analyst", "Learn Different programming Language"))
    list.add(Category(R.drawable.ic_person, "Tester", "Learn Different programming Language"))
    list.add(Category(R.drawable.ic_person, "Programer", "Learn Different programming Language"))
    list.add(Category(R.drawable.ic_person, "Tester", "Learn Different programming Language"))

    list.add(Category(R.drawable.ic_person, "Programer", "Learn Different programming Language"))
    list.add(Category(R.drawable.ic_person, "Analyst", "Learn Different programming Language"))
    list.add(Category(R.drawable.ic_person, "Tester", "Learn Different programming Language"))
    list.add(Category(R.drawable.ic_person, "Programer", "Learn Different programming Language"))
    list.add(Category(R.drawable.ic_person, "Tester", "Learn Different programming Language"))


    list.add(Category(R.drawable.ic_person, "Programer", "Learn Different programming Language"))
    list.add(Category(R.drawable.ic_person, "Analyst", "Learn Different programming Language"))
    list.add(Category(R.drawable.ic_person, "Tester", "Learn Different programming Language"))
    list.add(Category(R.drawable.ic_person, "Programer", "Learn Different programming Language"))
    list.add(Category(R.drawable.ic_person, "Tester", "Learn Different programming Language"))


    list.add(Category(R.drawable.ic_person, "Programer", "Learn Different programming Language"))
    list.add(Category(R.drawable.ic_person, "Analyst", "Learn Different programming Language"))
    list.add(Category(R.drawable.ic_person, "Tester", "Learn Different programming Language"))
    list.add(Category(R.drawable.ic_person, "Programer", "Learn Different programming Language"))
    list.add(Category(R.drawable.ic_person, "Tester", "Learn Different programming Language"))


    return list
}