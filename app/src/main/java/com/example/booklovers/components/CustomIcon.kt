package com.example.booklovers.components


import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.ShoppingCart
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ExperimentalComposeApi
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.R
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.zIndex
import com.example.booklovers.presentation.GetStarted.GetStarted
import com.example.booklovers.ui.theme.BookLoversTheme
import com.example.booklovers.ui.theme.Shapes

@Composable
fun CustomIcon(
    customColor : Color = Color.White,
    iconName: ImageVector
){
    Box(
        modifier = Modifier
            .zIndex(3f)
            .width(40.dp)
            .height(40.dp)
            .background(
                color = customColor,
                shape = RoundedCornerShape(20.dp)
            ).
            shadow(
                elevation = 1.dp,
                shape = RoundedCornerShape(20.dp)

    ),
            contentAlignment = Alignment.Center
    ) {
            Icon(
                imageVector = iconName,
                contentDescription = iconName.toString(),
                modifier = Modifier.background(color = Color.Transparent)

            )

    }
}


