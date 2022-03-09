package com.masadany.mvvm_hilt_unittesting.view

import android.app.DownloadManager
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentFactory
import com.masadany.mvvm_hilt_unittesting.adapter.ArtRecyclerAdapter
import com.masadany.mvvm_hilt_unittesting.adapter.ImageRecyclerAdapter
import com.bumptech.glide.RequestManager
import javax.inject.Inject

class ArtFragmentFactory @Inject constructor(
    private val artRecyclerAdapter: ArtRecyclerAdapter,
    private val imageRecyclerAdapter: ImageRecyclerAdapter,
    private val glide: RequestManager
):FragmentFactory() {

    override fun instantiate(classLoader: ClassLoader, className: String): Fragment {
        return  when(className){
            ArtFragment::class.java.name -> ArtFragment(artRecyclerAdapter)
            ArtDetailsFragment::class.java.name -> ArtDetailsFragment(glide)
            ImageApiFragment::class.java.name -> ImageApiFragment(imageRecyclerAdapter)
            else -> super.instantiate(classLoader, className)
        }
    }
}