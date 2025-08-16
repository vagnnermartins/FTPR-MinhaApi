package com.example.minhaprimeiraapi.database.dao

import androidx.room.Dao
import androidx.room.Insert
import com.example.minhaprimeiraapi.database.model.UserLocation

@Dao
interface UserLocationDao {

    @Insert suspend fun insert(userLocation: UserLocation)

}
