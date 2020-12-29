package com.example.myproject_4a_neret_thomas.data.repository

import com.example.myproject_4a_neret_thomas.data.local.models.DatabaseDao
import com.example.myproject_4a_neret_thomas.data.local.models.userlocal.UserLocal
import com.example.myproject_4a_neret_thomas.data.local.models.userlocal.toData
import com.example.myproject_4a_neret_thomas.data.local.models.userlocal.toEntity
import com.example.myproject_4a_neret_thomas.domain.entity.User

class UserRepository(
    private val databaseDao: DatabaseDao
    ) {
    suspend fun createUser(user: User) {
databaseDao.insert(user.toData())
    }

    fun getUser(email: String) : User {
        val userLocal: UserLocal = databaseDao.findByName(email)
        return userLocal.toEntity()
    }
}