package com.masadany.mvvm_hilt_unittesting.adapter;

import com.bumptech.glide.RequestManager;
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
public final class ImageRecyclerAdapter_Factory implements Factory<ImageRecyclerAdapter> {
  private final Provider<RequestManager> glideProvider;

  public ImageRecyclerAdapter_Factory(Provider<RequestManager> glideProvider) {
    this.glideProvider = glideProvider;
  }

  @Override
  public ImageRecyclerAdapter get() {
    return newInstance(glideProvider.get());
  }

  public static ImageRecyclerAdapter_Factory create(Provider<RequestManager> glideProvider) {
    return new ImageRecyclerAdapter_Factory(glideProvider);
  }

  public static ImageRecyclerAdapter newInstance(RequestManager glide) {
    return new ImageRecyclerAdapter(glide);
  }
}
