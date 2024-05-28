package com.example.routine

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.example.routine.presentation.navigation.App
import com.example.routine.presentation.ui.theme.Primary
import com.example.routine.presentation.ui.theme.RoutineTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

            RoutineTheme(
                darkTheme = false
            ) {
                Scaffold(
                    containerColor = Primary,
                    modifier = Modifier.fillMaxSize(),
                    ) { paddingValue ->
                    App(paddingValue)
                }

            }
        }
    }
}

