package com.example.myproject_4a_neret_thomas.data.local.models

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface DatabaseDao {
    @Query("SELECT * FROM userlocal")
    fun getAll(): List<UserLocal>



    @Query("SELECT * FROM user WHERE email LIKE :email AND " +
            " LIMIT 1")
    fun findByName(first: String): UserLocal

    @Insert
    fun insert( user: UserLocal)

    @Delete
    fun delete(user: UserLocal)
}