package com.masadany.mvvm_hilt_unittesting.view;

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
public final class ImageApiFragment_Factory implements Factory<ImageApiFragment> {
  private final Provider<ImageRecyclerAdapter> imageRecyclerAdapterProvider;

  public ImageApiFragment_Factory(Provider<ImageRecyclerAdapter> imageRecyclerAdapterProvider) {
    this.imageRecyclerAdapterProvider = imageRecyclerAdapterProvider;
  }

  @Override
  public ImageApiFragment get() {
    return newInstance(imageRecyclerAdapterProvider.get());
  }

  public static ImageApiFragment_Factory create(
      Provider<ImageRecyclerAdapter> imageRecyclerAdapterProvider) {
    return new ImageApiFragment_Factory(imageRecyclerAdapterProvider);
  }

  public static ImageApiFragment newInstance(ImageRecyclerAdapter imageRecyclerAdapter) {
    return new ImageApiFragment(imageRecyclerAdapter);
  }
}
