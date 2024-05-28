package com.example.routine.presentation.ui.core.components

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.routine.R
import com.example.routine.presentation.ui.theme.Error

@Composable
fun TextFieldRoutine(
    value: String,
    onChange: (String) -> Unit,
    label: String,
    textError: String = "",
    isError: Boolean = false,
    isPassword: Boolean = false,

    ) {
    val isLocked = remember {
        mutableStateOf(true)
    }

    @Composable
    fun lockedIcon(isLocked: Boolean) {
        return if (isLocked) {
            Icon(painter = painterResource(R.drawable.visibility_off), contentDescription = "")
        } else {
            Icon(painter = painterResource(R.drawable.visibility), contentDescription = "")
        }

    }

    @Composable
    fun VisualTransformation(isPassword: Boolean): VisualTransformation {
        return if (isPassword) {
            PasswordVisualTransformation()
        } else {
            VisualTransformation.None
        }
    }
    OutlinedTextField(
        modifier = Modifier
            .padding(vertical = 4.dp)
            .height(70.dp),
        trailingIcon = {
            if (isPassword) {
                IconButton(
                    onClick = {
                        isLocked.value = !isLocked.value
                    }
                ) {
                    lockedIcon(isLocked.value)
                }

            }
        },

        isError = isError,
        textStyle = TextStyle(fontSize = 14.sp),
        supportingText = { Text(textError, style = TextStyle(color = Error)) },
        value = value,
        visualTransformation = VisualTransformation(isPassword),
        onValueChange = { onChange(it) },
        label = { Text(label, fontSize = 14.sp) }
    )
}