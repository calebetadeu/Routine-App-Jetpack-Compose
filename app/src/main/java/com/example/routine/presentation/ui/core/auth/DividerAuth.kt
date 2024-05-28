package com.example.routine.presentation.ui.core.auth

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp


@Composable
fun DividerAuth() {
    Row(Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
        HorizontalDivider(
            modifier = Modifier.weight(1f)
        )
        Text(
            "ou",
            modifier =
            Modifier.padding(horizontal = 10.dp),
            textAlign = TextAlign.Center,

            )
        HorizontalDivider(modifier = Modifier.weight(1f))
    }
}
