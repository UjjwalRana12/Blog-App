package com.android.blogapp.Screens

import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Add
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material.icons.rounded.Person
import androidx.compose.material.icons.rounded.Search
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.android.blogapp.Navigation.Routes
import com.android.blogapp.model.BottomNavItem

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BottomNav(navController: NavHostController) {

    val navController1 = rememberNavController()

    Scaffold(bottomBar = { BottomNavBar(navController1) }) { innerpadding ->

        NavHost(
            navController = navController1,
            startDestination = Routes.Home.routes,
            modifier = Modifier.padding(innerpadding)
        ) {

            composable(Routes.Home.routes) {
                Home()
            }

            composable(route = Routes.Profile.routes) {
                Profile()
            }


            composable(route = Routes.Search.routes) {
                Search()
            }

            composable(route = Routes.AddThread.routes) {
                AddThreads()
            }
        }

    }

}

@Composable
fun BottomNavBar(navController1: NavHostController) {

    val backStackEntry = navController1.currentBackStackEntryAsState()

    val list = listOf(
        BottomNavItem("home", Routes.Home.routes, Icons.Rounded.Home),
        BottomNavItem("search", Routes.Search.routes, Icons.Rounded.Search),
        BottomNavItem("addThreads", Routes.AddThread.routes, Icons.Rounded.Add),
        BottomNavItem("profile", Routes.Profile.routes, Icons.Rounded.Person),
    )

    BottomAppBar {

        list.forEach {

            val selected = it.route == backStackEntry.value?.destination?.route

            NavigationBarItem(selected = selected,
                onClick = {
                    navController1.navigate(it.route) {
                        popUpTo(navController1.graph.findStartDestination().id) {
                            saveState = true
                        }
                        launchSingleTop = true
                    }

                }, icon = { Icon(imageVector = it.icon, contentDescription = it.title) })
        }
    }

}