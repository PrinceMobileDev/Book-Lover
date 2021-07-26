package com.example.booklovers.components

import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.booklovers.ui.theme.BookLoversTheme

@Composable
fun SearchBar(

){
    var searchText = remember{ mutableStateOf("") }

    TextField(
        value = searchText.value,
        onValueChange = {
            searchText.value = it
        },
        placeholder = { Text(text = "Search")}
    )


}


@Preview(name = "dnd", showBackground = true)
@Composable
fun DefaultPreview() {
    BookLoversTheme {
        SearchBar()
    }
}