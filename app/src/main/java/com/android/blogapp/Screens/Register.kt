package com.android.blogapp.Screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.*
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable

fun Register() {

    var email by remember {
        mutableStateOf("")
    }
    var name by remember {
        mutableStateOf("")
    }

    var confirmPass by remember {
        mutableStateOf("")
    }

    var password by remember {
        mutableStateOf("")
    }

    Column(
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        OutlinedTextField(
            value = name,
            onValueChange = { name = it },
            label = { Text(text = "name") },
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Email,

                ),singleLine = true
        )
        Spacer(modifier = Modifier
            .fillMaxWidth()
            .height(25.dp))

        OutlinedTextField(
            value = email,
            onValueChange = { email = it },
            label = { Text(text = "email") },
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Password,

                ),singleLine = true
        )

        Spacer(modifier = Modifier
            .fillMaxWidth()
            .height(25.dp))

        OutlinedTextField(
            value = password,
            onValueChange = { password = it },
            label = { Text(text = "password") },
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Email,

                ),singleLine = true
        )
        Spacer(modifier = Modifier
            .fillMaxWidth()
            .height(25.dp))

        OutlinedTextField(
            value = confirmPass,
            onValueChange = { confirmPass = it },
            label = { Text(text = "Confirm Password") },
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Password,

                ),singleLine = true
        )

        Spacer(modifier = Modifier
            .fillMaxWidth()
            .height(25.dp))

        ElevatedButton(onClick = { /*TODO*/ }, modifier = Modifier
            .fillMaxWidth()
            .padding(start = 52.dp, end = 52.dp)) {

            Text(text = "Login",style= TextStyle(
                color = Color.Black
            ))
        }
    }
}

@Preview
@Composable
fun register(){
    Register()
}