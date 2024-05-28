package com.example.routine.presentation.ui.core.auth

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.routine.presentation.ui.theme.Secondary

@Composable
fun TopBarAuth(topBarHeight: Dp = 100.dp) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .height(topBarHeight),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        Text(
            "ROUTINE", style = TextStyle(
                fontSize = 28.sp,
                color = Secondary

            )
        )
    }

}