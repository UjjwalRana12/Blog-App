package com.android.blogapp.Navigation

sealed class Routes(val routes:String){

    object Home : Routes("home")
    object Notification : Routes("notification")
    object Splash : Routes("splash")
    object Profile : Routes("profile")
    object Search : Routes("search")
    object AddThread : Routes("add_thread")
    object BottomNav : Routes("bottom_nav")
    object Login : Routes("login")
    object Register : Routes("register")
}
