package com.lyy.myapp.data.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.lyy.myapp.domain.model.User


@Dao
interface UserDao {
    @Insert
    suspend fun insert(user: User)

    @Query("SELECT * FROM users")
    suspend fun getAllUsers(): List<User>
}
