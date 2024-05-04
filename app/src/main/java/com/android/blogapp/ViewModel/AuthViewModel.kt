package com.android.blogapp.ViewModel

import androidx.lifecycle.ViewModel
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.FirebaseDatabase

class AuthViewModel:ViewModel(){

    val auth = FirebaseAuth.getInstance()
    private val db = FirebaseDatabase.getInstance()

    val userRef = db.getReference("users")
}