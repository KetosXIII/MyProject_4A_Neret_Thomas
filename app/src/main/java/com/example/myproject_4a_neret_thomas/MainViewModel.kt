package com.example.myproject_4a_neret_thomas

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel(){
    val text:MutableLiveData<String> = MutableLiveData()
    init {
        text.value="Blabla"
    }
}