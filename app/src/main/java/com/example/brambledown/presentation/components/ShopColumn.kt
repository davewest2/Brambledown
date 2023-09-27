package com.example.brambledown.presentation.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.brambledown.R
import com.example.brambledown.data.data_source.Icons


@Composable
fun ShopColumn () {
    Column(modifier = Modifier
        .fillMaxSize()
    )
    {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.1f),
            verticalAlignment = Alignment.Top,
            horizontalArrangement = Arrangement.Start
        ) {
            Image(
                modifier = Modifier.size(100.dp),
                painter = painterResource(id = R.drawable.king_fisher_square),
                contentDescription = "kingfisher",
                contentScale = ContentScale.FillHeight
            )
            Image(
                modifier = Modifier.size(300.dp),
                painter = painterResource(id = R.drawable.bramblledown_name_logo),
                contentDescription = "brambledown",
                contentScale = ContentScale.FillWidth
            )
        }
        LazyColumn(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top
        ) {
            items(7) { index ->
                var isClicked by remember {
                    mutableStateOf(false)
                }
                if (isClicked) {
                    Image(
                        painter = painterResource(id = Icons.shopIcons1[index]),
                        contentDescription = "insert later",
                        modifier = Modifier
                            .padding(2.dp)
                            .clickable { isClicked = false }
                    )
                } else {
                    Image(
                        painter = painterResource(id = Icons.shopIcons2[index]),
                        contentDescription = "insert later",
                        modifier = Modifier
                            .padding(2.dp)
                            .clickable { isClicked = true }
                    )
                }
            }

        }

    }
}

