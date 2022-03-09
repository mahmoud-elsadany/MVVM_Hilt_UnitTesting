package com.masadany.mvvm_hilt_unittesting.roomdb

import androidx.lifecycle.LiveData
import androidx.room.*
import com.masadany.roomdb.Art

@Dao
interface ArtDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertArt(art: Art)

    //asyncronas
    @Delete
    suspend fun deleteArt(art: Art)

    //syncronse
    @Query("SELECT * FROM arts")
    fun observeArts():LiveData<List<Art>>

}