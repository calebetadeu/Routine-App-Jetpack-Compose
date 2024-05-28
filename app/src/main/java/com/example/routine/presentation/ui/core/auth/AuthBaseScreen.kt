package com.example.routine.presentation.ui.core.auth

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun AuthBaseScreen(
    paddingValues: PaddingValues,
    content: @Composable () -> Unit,
    topBarHeight: Dp = 100.dp
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(paddingValues)
    ) {
        TopBarAuth(
            topBarHeight = topBarHeight
        )
        content()
    }


}