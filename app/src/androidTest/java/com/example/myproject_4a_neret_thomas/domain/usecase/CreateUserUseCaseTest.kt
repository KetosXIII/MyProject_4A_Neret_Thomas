package com.example.myproject_4a_neret_thomas.domain.usecase

import com.example.myproject_4a_neret_thomas.data.repository.UserRepository
import com.example.myproject_4a_neret_thomas.domain.entity.User
import io.mockk.coEvery
import io.mockk.coVerify
import io.mockk.mockk
import kotlinx.coroutines.runBlocking
import org.junit.Test



class CreateUserUseCaseTest {
    private val userRepository: UserRepository = mockk()

    private val classUnderTest = CreateUserUseCase(userRepository)

   @Test
   fun resendMailSuccess(){
       runBlocking {
           val user =User("")
           coEvery{userRepository.createUser(user)} returns Unit
           classUnderTest.invoke(user)
           coVerify(exactly=1){
               userRepository.createUser(user)
           }
       }

   }

}