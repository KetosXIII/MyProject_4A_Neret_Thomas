package com.example.myproject_4a_neret_thomas.data.local.models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class UserLocal(
    @PrimaryKey val uid: Int,
    @ColumnInfo(name = "first_name") val email: String?
)