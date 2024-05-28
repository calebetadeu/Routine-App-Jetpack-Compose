package com.example.routine.presentation.navigation

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.routine.presentation.ui.screens.auth.RegisterScreen

@Composable
fun App(paddingValues: PaddingValues) {
    val navController = rememberNavController()

    NavHost(navController =  navController, startDestination = Register)  {
        composable<Register> {
            RegisterScreen(
                paddingValues
            )
        }


    }

}