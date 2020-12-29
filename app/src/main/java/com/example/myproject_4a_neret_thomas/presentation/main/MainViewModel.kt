package com.example.myproject_4a_neret_thomas.presentation.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.myproject_4a_neret_thomas.domain.entity.User
import com.example.myproject_4a_neret_thomas.domain.usecase.CreateUserUseCase
import com.example.myproject_4a_neret_thomas.domain.usecase.GetUserUseCase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainViewModel(
private  val  createUserUseCase: CreateUserUseCase,
private val getUserUseCase: GetUserUseCase
): ViewModel(){
    val counter : MutableLiveData<Int> = MutableLiveData()
    init {
        counter.value = 0
    }

    fun onClickedIncrement (emailUser:String) {
        viewModelScope.launch(Dispatchers.IO) {
            createUserUseCase.invoke(User("test"))
            val user: User = getUserUseCase.invoke("test")
            val debug = "debug"
        }
    }
}