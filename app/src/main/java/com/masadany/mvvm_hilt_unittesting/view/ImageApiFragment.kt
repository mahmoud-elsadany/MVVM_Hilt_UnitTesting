package com.masadany.mvvm_hilt_unittesting.view

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.core.widget.addTextChangedListener
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import com.masadany.mvvm_hilt_unittesting.R
import com.masadany.mvvm_hilt_unittesting.adapter.ImageRecyclerAdapter
import com.masadany.mvvm_hilt_unittesting.databinding.FragmentArtDetailsBinding
import com.masadany.mvvm_hilt_unittesting.databinding.FragmentImageApiBinding
import com.masadany.mvvm_hilt_unittesting.util.Status
import com.masadany.mvvm_hilt_unittesting.viewmodel.ArtViewModel
import com.bumptech.glide.RequestManager
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import javax.inject.Inject

class ImageApiFragment @Inject constructor(
    val imageRecyclerAdapter: ImageRecyclerAdapter
) : Fragment(R.layout.fragment_image_api) {

    private var fragmentBinding: FragmentImageApiBinding? = null

    lateinit var viewModel: ArtViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(requireActivity()).get(ArtViewModel::class.java)


        val binding = FragmentImageApiBinding.bind(view)
        fragmentBinding = binding

        subscribeToObservers()

        var job: Job? = null

        binding.searchText.addTextChangedListener {
            job?.cancel()
            job = lifecycleScope.launch {
                delay(1000)
                it?.let{
                    if (it.toString().isNotEmpty()){
                        viewModel.searchForImage(it.toString())
                    }
                }
            }
        }

        binding.imageRecyclerView.adapter = imageRecyclerAdapter
        binding.imageRecyclerView.layoutManager = GridLayoutManager(requireContext(), 3)
        imageRecyclerAdapter.setOnItemClickListener {
            findNavController().popBackStack()
            viewModel.setSelectedImage(it)
        }
    }

    fun subscribeToObservers() {
        viewModel.imageList.observe(viewLifecycleOwner) {
            when (it.status) {
                Status.SUCCESS -> {
                    val urls = it.data?.hits?.map { imageResult ->
                        imageResult?.previewURL
                    }

                    imageRecyclerAdapter.images = (urls ?: listOf()) as List<String>

                    fragmentBinding?.progressBar?.visibility = View.GONE
                }
                Status.ERROR -> {
                    Toast.makeText(requireContext(), it.message ?: "Error", Toast.LENGTH_LONG)
                        .show()
                    fragmentBinding?.progressBar?.visibility = View.GONE

                }
                Status.LOADING -> {
                    fragmentBinding?.progressBar?.visibility = View.VISIBLE

                }

            }
        }
    }
}