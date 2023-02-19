package com.example.tutorial_jetpack_article

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tutorial_jetpack_article.ui.theme.Tutorial_jetpack_articleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Tutorial_jetpack_articleTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    ShowingArticle("Android","g","n")
                }
            }
        }
    }
}

@Composable
fun Greeting(title: String, summary: String, paragraph: String) {
    Column() {
        Text(text = title, fontSize = 24.sp ,modifier = Modifier.padding(16.dp))
        Text(text = summary,modifier = Modifier.padding(16.dp), textAlign = TextAlign.Justify)
        Text(text = paragraph,modifier = Modifier.padding(16.dp), textAlign = TextAlign.Justify )
    }
    
}

@Composable
fun ShowingArticle(title: String, summary: String, paragraph: String){
    val image = painterResource(id = (R.drawable.bg_compose_background))
    Column(){
        Image(painter = image, contentDescription = null)
        Greeting(title=title, summary=summary, paragraph=paragraph)
    }


}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Tutorial_jetpack_articleTheme {
        ShowingArticle(title = stringResource(R.string.tutorial_title), summary = stringResource(R.string.tutorial_summary), paragraph = stringResource(
            id = (R.string.tutorial_paragraph)))
    }
}