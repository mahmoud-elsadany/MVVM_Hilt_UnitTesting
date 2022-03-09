package com.masadany.mvvm_hilt_unittesting.repo

import androidx.lifecycle.LiveData
import com.masadany.mvvm_hilt_unittesting.model.ImageResponse
import com.masadany.mvvm_hilt_unittesting.util.Resource
import com.masadany.roomdb.Art


interface ArtRepositoryInterface {

    suspend fun insertArt(art: Art)

    suspend fun deleteArt(art: Art)

    fun getArt(): LiveData<List<Art>>

    suspend fun searchImage(imageString: String): Resource<ImageResponse>
}