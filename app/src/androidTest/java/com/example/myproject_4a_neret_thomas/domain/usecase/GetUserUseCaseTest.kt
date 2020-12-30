package com.example.myproject_4a_neret_thomas.domain.usecase

import com.example.myproject_4a_neret_thomas.data.repository.UserRepository
import com.example.myproject_4a_neret_thomas.domain.entity.User
import io.mockk.coEvery
import io.mockk.coVerify
import io.mockk.mockk
import junit.framework.Assert.assertEquals
import kotlinx.coroutines.runBlocking
import org.junit.Test

@Suppress("IllegalIdentifier")
class GetUserUseCaseTest {
    private val userRepository: UserRepository = mockk()

    private val classUnderTest = GetUserUseCase(userRepository)

    @Test
    fun `invoke with invalid email`(){
        runBlocking {
            val email=""
            coEvery{userRepository.getUser(email)} returns null

            val result = classUnderTest.invoke(email)

            coVerify(exactly=1){
                userRepository.getUser(email)
            }
            assertEquals(result,null)
        }

    } @Test
    fun `invoke with valid email`(){
        runBlocking {
            val email="thomas@orange.com"
            val expectedUser = User("thomas@orange.com")
            coEvery{userRepository.getUser(email)} returns expectedUser
            val result = classUnderTest.invoke(email)

            coVerify(exactly=1){
                userRepository.getUser(email)
            }
            assertEquals(result,expectedUser)
        }

    }

}