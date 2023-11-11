package com.example.recuclerview_learn

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.recuclerview_learn.ui.theme.PersonCard
import com.example.recuclerview_learn.ui.theme.RecuclerView_LearnTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RecuclerView_LearnTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    App()
                }
            }
        }
    }
}

@Composable
fun App(){
    val persons = remember {Details.PersonList}
    LazyColumn(
        contentPadding = PaddingValues
            (horizontal = 16.dp, vertical = 8.dp)
    )
    {
        items(
            persons
        ){person ->
            PersonCard(person = person)
        }
    }
}

@Preview("")
@Composable
fun PreviewApp(){
    App()
}
