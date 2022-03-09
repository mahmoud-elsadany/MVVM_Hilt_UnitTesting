package com.masadany.mvvm_hilt_unittesting.viewmodel;

import androidx.annotation.NonNull;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.SavedStateHandle;
import com.masadany.mvvm_hilt_unittesting.repo.ArtRepositoryInterface;
import java.lang.Override;
import javax.annotation.Generated;
import javax.inject.Inject;
import javax.inject.Provider;

@Generated("androidx.hilt.AndroidXHiltProcessor")
public final class ArtViewModel_AssistedFactory implements ViewModelAssistedFactory<ArtViewModel> {
  private final Provider<ArtRepositoryInterface> repository;

  @Inject
  ArtViewModel_AssistedFactory(Provider<ArtRepositoryInterface> repository) {
    this.repository = repository;
  }

  @Override
  @NonNull
  public ArtViewModel create(SavedStateHandle arg0) {
    return new ArtViewModel(repository.get());
  }
}
