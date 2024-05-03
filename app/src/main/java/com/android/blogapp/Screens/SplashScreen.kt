package com.android.blogapp.Screens

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.navigation.NavHostController
import com.android.blogapp.Navigation.Routes
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(navController: NavHostController){


    Text(text = "this is a splash screen")
    LaunchedEffect(true ){
        delay(3000)

        navController.navigate(Routes.BottomNav.routes)
    }

}