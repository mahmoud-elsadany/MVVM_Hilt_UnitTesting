package com.masadany.mvvm_hilt_unittesting.view;

import com.masadany.mvvm_hilt_unittesting.adapter.ArtRecyclerAdapter;
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
public final class ArtFragment_Factory implements Factory<ArtFragment> {
  private final Provider<ArtRecyclerAdapter> artRecyclerAdapterProvider;

  public ArtFragment_Factory(Provider<ArtRecyclerAdapter> artRecyclerAdapterProvider) {
    this.artRecyclerAdapterProvider = artRecyclerAdapterProvider;
  }

  @Override
  public ArtFragment get() {
    return newInstance(artRecyclerAdapterProvider.get());
  }

  public static ArtFragment_Factory create(
      Provider<ArtRecyclerAdapter> artRecyclerAdapterProvider) {
    return new ArtFragment_Factory(artRecyclerAdapterProvider);
  }

  public static ArtFragment newInstance(ArtRecyclerAdapter artRecyclerAdapter) {
    return new ArtFragment(artRecyclerAdapter);
  }
}
