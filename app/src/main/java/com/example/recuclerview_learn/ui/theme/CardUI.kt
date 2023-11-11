package com.example.recuclerview_learn.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.recuclerview_learn.PersonDetails
import com.example.recuclerview_learn.R

@Composable
fun PersonCard(
    person: PersonDetails,
){
    Card(
        modifier = Modifier
            .padding(horizontal = 8.dp, vertical = 8.dp)
            .fillMaxWidth()
            .background(Color.White),
        shape = RoundedCornerShape(
            corner = CornerSize(16.dp)
        ),

    ) {
        Row(modifier =
        Modifier
            .background(Color.Cyan)
            .padding(20.dp),
        ) {
            Column(
                modifier = Modifier.weight(1f),
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = "${person.firstName} ${person.lastName}",
                    fontSize = 22.sp,
                    color = Color.White,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = "Age: ${person.age}",
                    fontSize = 18.sp,
                    color = Color.White,
                    fontWeight = FontWeight.Normal
                )
                Text(
                    text = "Sex: ${person.sex}",
                    fontSize = 18.sp,
                    color = Color.White,
                    fontWeight = FontWeight.Normal
                )
                Text(
                    text = "Description: ${person.description}",
                    fontSize = 18.sp,
                    color = Color.White,
                    fontWeight = FontWeight.Normal
                )
            }
            Image(
                painter = painterResource(id = person.Image),
                contentDescription = "Image",
                contentScale = ContentScale.FillHeight,
                modifier = Modifier
                    .padding(8.dp)
                    .size(110.dp)
                    .clip((CircleShape))
            )
        }
    }
}

@Preview("")
@Composable
fun PreviewCard(){
    RecuclerView_LearnTheme {
        PersonCard(person = PersonDetails(1,"Quang", "Mai", 20,"male","Person", R.drawable.lumine))
    }
}

