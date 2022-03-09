package com.masadany.mvvm_hilt_unittesting.view

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.masadany.mvvm_hilt_unittesting.R

public class ArtDetailsFragmentDirections private constructor() {
  public companion object {
    public fun actionArtDetailsFragmentToImageApiFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_artDetailsFragment_to_imageApiFragment)

    public fun actionArtDetailsFragmentToArtFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_artDetailsFragment_to_artFragment)
  }
}
