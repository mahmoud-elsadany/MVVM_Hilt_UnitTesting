package com.masadany.mvvm_hilt_unittesting.view;

import com.bumptech.glide.RequestManager;
import com.masadany.mvvm_hilt_unittesting.adapter.ArtRecyclerAdapter;
import com.masadany.mvvm_hilt_unittesting.adapter.ImageRecyclerAdapter;
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
public final class ArtFragmentFactory_Factory implements Factory<ArtFragmentFactory> {
  private final Provider<ArtRecyclerAdapter> artRecyclerAdapterProvider;

  private final Provider<ImageRecyclerAdapter> imageRecyclerAdapterProvider;

  private final Provider<RequestManager> glideProvider;

  public ArtFragmentFactory_Factory(Provider<ArtRecyclerAdapter> artRecyclerAdapterProvider,
      Provider<ImageRecyclerAdapter> imageRecyclerAdapterProvider,
      Provider<RequestManager> glideProvider) {
    this.artRecyclerAdapterProvider = artRecyclerAdapterProvider;
    this.imageRecyclerAdapterProvider = imageRecyclerAdapterProvider;
    this.glideProvider = glideProvider;
  }

  @Override
  public ArtFragmentFactory get() {
    return newInstance(artRecyclerAdapterProvider.get(), imageRecyclerAdapterProvider.get(), glideProvider.get());
  }

  public static ArtFragmentFactory_Factory create(
      Provider<ArtRecyclerAdapter> artRecyclerAdapterProvider,
      Provider<ImageRecyclerAdapter> imageRecyclerAdapterProvider,
      Provider<RequestManager> glideProvider) {
    return new ArtFragmentFactory_Factory(artRecyclerAdapterProvider, imageRecyclerAdapterProvider, glideProvider);
  }

  public static ArtFragmentFactory newInstance(ArtRecyclerAdapter artRecyclerAdapter,
      ImageRecyclerAdapter imageRecyclerAdapter, RequestManager glide) {
    return new ArtFragmentFactory(artRecyclerAdapter, imageRecyclerAdapter, glide);
  }
}
