package com.example.minhaprimeiraapi.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.minhaprimeiraapi.database.converter.DateConverters
import com.example.minhaprimeiraapi.database.dao.UserLocationDao
import com.example.minhaprimeiraapi.database.model.UserLocation

@Database(entities = [UserLocation::class], version = 1)
@TypeConverters(DateConverters::class)
abstract class AppDatabase : RoomDatabase() {

    abstract fun userLocationDao(): UserLocationDao
}