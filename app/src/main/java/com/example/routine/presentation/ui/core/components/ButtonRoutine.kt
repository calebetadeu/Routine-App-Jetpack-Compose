package com.example.routine.presentation.ui.core.components

import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.example.routine.presentation.ui.theme.Primary


@Composable
fun ButtonRoutine(text: String, onClick: () -> Unit) {
    Button(
        colors = ButtonDefaults.buttonColors(
            containerColor = Primary
        ),
        onClick = onClick,
    ) {
        Text(text)
    }
}