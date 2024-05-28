package com.example.routine.presentation.ui.core.auth

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.routine.R

@Composable
fun IconSocialMedia() {
    Box {
        IconButton(
            onClick = {}, modifier = Modifier
                .padding(12.dp)
                .border(shape = CircleShape, color = Color.LightGray, width = 0.2.dp)
        ) {
            Icon(
                painter = painterResource(R.drawable.google),
                contentDescription = "",
                tint = Color.Unspecified,
                modifier = Modifier.size(30.dp)
            )
        }
    }

}