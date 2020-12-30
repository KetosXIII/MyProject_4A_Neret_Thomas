package com.example.myproject_4a_neret_thomas.presentation.main

sealed class LoginStatus
    data class LoginSuccess(val email: String) : LoginStatus()
    object LoginError : LoginStatus()
