package com.masadany.mvvm_hilt_unittesting.repo

import androidx.lifecycle.LiveData
import com.masadany.mvvm_hilt_unittesting.api.RetrofitAPI
import com.masadany.mvvm_hilt_unittesting.model.ImageResponse
import com.masadany.mvvm_hilt_unittesting.roomdb.ArtDao
import com.masadany.mvvm_hilt_unittesting.util.Resource
import com.masadany.roomdb.Art
import javax.inject.Inject

//write the unit test firstly then implement this
class ArtRepository @Inject constructor(
    private val artDao: ArtDao,
    private val retrofitAPI: RetrofitAPI
) : ArtRepositoryInterface {
    override suspend fun insertArt(art: Art) {
        artDao.insertArt(art)
    }

    override suspend fun deleteArt(art: Art) {
        artDao.deleteArt(art)
    }

    override fun getArt(): LiveData<List<Art>> {
        return artDao.observeArts()
    }

    override suspend fun searchImage(imageString: String): Resource<ImageResponse> {
        return try {

            val response = retrofitAPI.imageSearch(imageString)
            if (response.isSuccessful){
                response.body()?.let {
                    return@let Resource.success(it)
                }?: Resource.error("Error",null)
            }else{
                Resource.error("Error",null)
            }
        }catch (e:Exception){
            Resource.error("No Data",null)
        }
    }


}