package com.example.booklovers.presentation.Home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ExperimentalComposeApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.booklovers.Greeting
import com.example.booklovers.components.AppBar
import com.example.booklovers.ui.theme.BookLoversTheme


@ExperimentalComposeApi
@Composable
fun Home(){
    Column (
        modifier = Modifier
            .fillMaxSize()
    ){
        AppBar(showRight = true)
    }
}


@ExperimentalComposeApi
@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    BookLoversTheme {
        Home()
    }
}