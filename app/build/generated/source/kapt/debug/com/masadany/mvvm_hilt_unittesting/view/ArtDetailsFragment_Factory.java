package com.masadany.mvvm_hilt_unittesting.view;

import com.bumptech.glide.RequestManager;
import com.masadany.mvvm_hilt_unittesting.viewmodel.ArtViewModel;
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
public final class ArtDetailsFragment_Factory implements Factory<ArtDetailsFragment> {
  private final Provider<RequestManager> glideProvider;

  private final Provider<ArtViewModel> viewModelProvider;

  public ArtDetailsFragment_Factory(Provider<RequestManager> glideProvider,
      Provider<ArtViewModel> viewModelProvider) {
    this.glideProvider = glideProvider;
    this.viewModelProvider = viewModelProvider;
  }

  @Override
  public ArtDetailsFragment get() {
    ArtDetailsFragment instance = newInstance(glideProvider.get());
    ArtDetailsFragment_MembersInjector.injectViewModel(instance, viewModelProvider.get());
    return instance;
  }

  public static ArtDetailsFragment_Factory create(Provider<RequestManager> glideProvider,
      Provider<ArtViewModel> viewModelProvider) {
    return new ArtDetailsFragment_Factory(glideProvider, viewModelProvider);
  }

  public static ArtDetailsFragment newInstance(RequestManager glide) {
    return new ArtDetailsFragment(glide);
  }
}
