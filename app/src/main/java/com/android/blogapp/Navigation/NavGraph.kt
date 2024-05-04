package com.android.blogapp.Navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.android.blogapp.Screens.AddThreads
import com.android.blogapp.Screens.BottomNav
import com.android.blogapp.Screens.Home
import com.android.blogapp.Screens.Login
import com.android.blogapp.Screens.Notification
import com.android.blogapp.Screens.Profile
import com.android.blogapp.Screens.Register
import com.android.blogapp.Screens.Search
import com.android.blogapp.Screens.SplashScreen

@Composable
fun NavGraph(navController: NavHostController) {

    NavHost(navController = navController, startDestination = Routes.Splash.routes) {

        composable(route = Routes.Home.routes) {
            Home()
        }

        composable(route = Routes.Splash.routes) {
            SplashScreen(navController)
        }

        composable(route = Routes.Profile.routes) {
            Profile()
        }

        composable(route = Routes.Notification.routes) {
            Notification()
        }

        composable(route = Routes.Search.routes) {
            Search()
        }

        composable(route = Routes.AddThread.routes) {
            AddThreads()
        }

        composable(route = Routes.BottomNav.routes) {

            BottomNav(navController)
        }

        composable(Routes.Login.routes) {
            Login(navController)
        }

        composable(Routes.Register.routes) {
            Register(navController)
        }


    }


}