package com.masadany.mvvm_hilt_unittesting.view;

import com.masadany.mvvm_hilt_unittesting.viewmodel.ArtViewModel;
import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
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
public final class ArtDetailsFragment_MembersInjector implements MembersInjector<ArtDetailsFragment> {
  private final Provider<ArtViewModel> viewModelProvider;

  public ArtDetailsFragment_MembersInjector(Provider<ArtViewModel> viewModelProvider) {
    this.viewModelProvider = viewModelProvider;
  }

  public static MembersInjector<ArtDetailsFragment> create(
      Provider<ArtViewModel> viewModelProvider) {
    return new ArtDetailsFragment_MembersInjector(viewModelProvider);
  }

  @Override
  public void injectMembers(ArtDetailsFragment instance) {
    injectViewModel(instance, viewModelProvider.get());
  }

  @InjectedFieldSignature("com.masadany.mvvm_hilt_unittesting.view.ArtDetailsFragment.viewModel")
  public static void injectViewModel(ArtDetailsFragment instance, ArtViewModel viewModel) {
    instance.viewModel = viewModel;
  }
}
