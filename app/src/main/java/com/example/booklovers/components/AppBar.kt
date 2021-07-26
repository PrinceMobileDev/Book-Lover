package com.example.booklovers.components

import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.outlined.ShoppingCart
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ExperimentalComposeApi
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType
import androidx.compose.ui.unit.dp
import com.example.booklovers.constants.APP_TITLE
import com.example.booklovers.presentation.GetStarted.GetStarted
import com.example.booklovers.ui.theme.BookLoversTheme

@ExperimentalComposeApi
@Composable
fun AppBar(
    showRight: Boolean = false
){


    Row(
        modifier = Modifier
            .fillMaxWidth(1f)
            .padding(horizontal = 20.dp, vertical = 20.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
        )
    {
        Text(
            text = APP_TITLE,
            style = MaterialTheme.typography.h1
        )
        if (showRight){
            Row (){
                CustomIcon(iconName = Icons.Outlined.ShoppingCart, customColor = Color(0xFFF2E7F2))
                Spacer(modifier = Modifier.padding(5.dp))
                CustomIcon(iconName = Icons.Filled.Menu)
            }
        }
    }
}



