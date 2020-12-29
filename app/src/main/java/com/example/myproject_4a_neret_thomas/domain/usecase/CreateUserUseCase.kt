package com.example.myproject_4a_neret_thomas.domain.usecase

import com.example.myproject_4a_neret_thomas.data.repository.UserRepository
import com.example.myproject_4a_neret_thomas.domain.entity.User

class CreateUserUseCase(private val userRepository: UserRepository) {
    suspend fun invoke(user:User){
        userRepository.createUser(user)

    }
}