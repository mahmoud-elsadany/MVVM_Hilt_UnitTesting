package com.masadany.mvvm_hilt_unittesting.view

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.masadany.mvvm_hilt_unittesting.R

public class ArtFragmentDirections private constructor() {
  public companion object {
    public fun actionArtFragmentToArtDetailsFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_artFragment_to_artDetailsFragment)
  }
}
