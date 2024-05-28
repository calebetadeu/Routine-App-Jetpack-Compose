package com.example.routine.presentation.ui.screens.auth

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.routine.presentation.ui.core.auth.AuthBaseScreen
import com.example.routine.presentation.ui.core.auth.DividerAuth
import com.example.routine.presentation.ui.core.auth.IconSocialMedia
import com.example.routine.presentation.ui.core.components.ButtonRoutine
import com.example.routine.presentation.ui.core.components.TextFieldRoutine
import com.example.routine.presentation.ui.theme.Background
import com.example.routine.presentation.ui.theme.Title

@Composable
fun RegisterScreen(
    paddingValues: PaddingValues
) {
    val roundedCornerShape = RoundedCornerShape(
        topStart = 30.dp,
        topEnd = 30.dp
    )
    Column(
        modifier =
        Modifier
            .fillMaxSize()
            .padding(paddingValues)
            .background(
                color = Background, shape = roundedCornerShape
            ),

        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 20.dp),
            verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Column(
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    "Criar Conta",
                    fontWeight = FontWeight.W500,
                    color = Title,
                    fontSize = 18.sp

                )

                Spacer(Modifier.height(12.dp))

                TextFieldRoutine(
                    value = "",
                    onChange = {

                    },
                    label = "Nome Completo"

                )
                TextFieldRoutine(
                    value = "",
                    onChange = {

                    },
                    label = "E-mail"

                )
                TextFieldRoutine(
                    isPassword = true,
                    value = "",
                    onChange = {

                    },
                    label = "Criar senha"

                )
                TextFieldRoutine(
                    isPassword = true,
                    value = "",
                    onChange = {

                    },
                    label = "Criar senha"

                )
            }

            Column(
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                ButtonRoutine("Cadastrar") { }
                DividerAuth()
                IconSocialMedia()
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text("Tem uma conta ? ", fontSize = 14.sp)
                    TextButton(onClick = {}) {
                        Text("Entrar")
                    }
                }
            }


        }

    }

}

@Preview(showBackground = true)
@Composable
fun RegisterScreenPreview() {
    AuthBaseScreen(paddingValues = PaddingValues(), content = { RegisterScreen(paddingValues = PaddingValues()) })
}








