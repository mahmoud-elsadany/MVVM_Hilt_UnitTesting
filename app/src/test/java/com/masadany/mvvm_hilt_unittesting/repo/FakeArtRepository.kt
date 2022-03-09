package com.masadany.artbooknavigation.repo

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.masadany.mvvm_hilt_unittesting.model.ImageResponse
import com.masadany.mvvm_hilt_unittesting.repo.ArtRepositoryInterface
import com.masadany.mvvm_hilt_unittesting.util.Resource
import com.masadany.roomdb.Art

class FakeArtRepository: ArtRepositoryInterface {

    private val arts = mutableListOf<Art>()
    private val artsLiveData = MutableLiveData<List<Art>>(arts)

    override suspend fun insertArt(art: Art) {
        arts.add(art)
        refreshData()
    }

    override suspend fun deleteArt(art: Art) {
       arts.remove(art)
    }

    override fun getArt(): LiveData<List<Art>> {
        return artsLiveData
    }

    override suspend fun searchImage(imageString: String): Resource<ImageResponse> {
        return Resource.success(ImageResponse(listOf(),0,0))
    }

    private fun refreshData(){
        artsLiveData.postValue(arts)
    }
}