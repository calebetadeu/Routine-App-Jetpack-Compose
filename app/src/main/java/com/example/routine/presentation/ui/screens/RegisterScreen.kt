package com.example.routine.presentation.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun RegisterScreen(paddingValues: PaddingValues) {
    Column(
        modifier =
        Modifier
            .fillMaxSize()
            .padding(paddingValues),
    ) {

    }

}
@Preview(showBackground = true)
@Composable
fun RegisterScreenPreview() {
    RegisterScreen(paddingValues = PaddingValues())
}

