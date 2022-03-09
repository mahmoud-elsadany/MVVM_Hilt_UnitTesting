package com.masadany.mvvm_hilt_unittesting.roomdb

import androidx.room.Database
import androidx.room.RoomDatabase
import com.masadany.roomdb.Art

@Database(entities = [Art::class], version = 1)
abstract class ArtDatabase : RoomDatabase() {
    abstract fun artDao(): ArtDao
}