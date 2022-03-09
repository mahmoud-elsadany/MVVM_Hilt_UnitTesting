package com.masadany.dependencyinjection

import android.app.Application
import android.content.Context
import androidx.room.Room
import com.masadany.mvvm_hilt_unittesting.ArtBookApplication
import com.masadany.mvvm_hilt_unittesting.R
import com.masadany.mvvm_hilt_unittesting.api.RetrofitAPI
import com.masadany.mvvm_hilt_unittesting.repo.ArtRepository
import com.masadany.mvvm_hilt_unittesting.repo.ArtRepositoryInterface
import com.masadany.mvvm_hilt_unittesting.roomdb.ArtDao
import com.masadany.mvvm_hilt_unittesting.roomdb.ArtDatabase
import com.masadany.mvvm_hilt_unittesting.util.Util.BASE_URL
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun injectRoomDatabase(@ApplicationContext context: Context) =
        Room.databaseBuilder(context, ArtDatabase::class.java, "ArtBookDB").build()

    @Singleton
    @Provides
    fun injectDao(database: ArtDatabase) = database.artDao()

    @Singleton
    @Provides
    fun injectRetrofitAPI(): RetrofitAPI {
        return Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(BASE_URL)
            .build()
            .create(RetrofitAPI::class.java)
    }

    @Singleton
    @Provides
    fun injectGlide(@ApplicationContext context: Context) =
        Glide.with(context).setDefaultRequestOptions(
            RequestOptions().placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
        )


    @Singleton
    @Provides
    fun injectNormalRepo(dao: ArtDao, api: RetrofitAPI) =
        ArtRepository(dao, api) as ArtRepositoryInterface


}
