package com.example.myproject_4a_neret_thomas.data.local.models

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.myproject_4a_neret_thomas.data.local.models.userlocal.UserLocal

@Database(
    entities = arrayOf(UserLocal::class),
    version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun databaseDao(): DatabaseDao
}