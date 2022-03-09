package com.masadany.mvvm_hilt_unittesting.viewmodel;

import com.masadany.mvvm_hilt_unittesting.repo.ArtRepositoryInterface;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ArtViewModel_AssistedFactory_Factory implements Factory<ArtViewModel_AssistedFactory> {
  private final Provider<ArtRepositoryInterface> repositoryProvider;

  public ArtViewModel_AssistedFactory_Factory(Provider<ArtRepositoryInterface> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public ArtViewModel_AssistedFactory get() {
    return newInstance(repositoryProvider);
  }

  public static ArtViewModel_AssistedFactory_Factory create(
      Provider<ArtRepositoryInterface> repositoryProvider) {
    return new ArtViewModel_AssistedFactory_Factory(repositoryProvider);
  }

  public static ArtViewModel_AssistedFactory newInstance(
      Provider<ArtRepositoryInterface> repository) {
    return new ArtViewModel_AssistedFactory(repository);
  }
}
