package com.example.myproject_4a_neret_thomas.injection

import com.example.myproject_4a_neret_thomas.MainViewModel
import org.koin.dsl.module

val presentationModule = module {
    factory { MainViewModel() }

}