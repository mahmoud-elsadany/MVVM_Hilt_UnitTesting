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
public final class ArtRecyclerAdapter_Factory implements Factory<ArtRecyclerAdapter> {
  private final Provider<RequestManager> glideProvider;

  public ArtRecyclerAdapter_Factory(Provider<RequestManager> glideProvider) {
    this.glideProvider = glideProvider;
  }

  @Override
  public ArtRecyclerAdapter get() {
    return newInstance(glideProvider.get());
  }

  public static ArtRecyclerAdapter_Factory create(Provider<RequestManager> glideProvider) {
    return new ArtRecyclerAdapter_Factory(glideProvider);
  }

  public static ArtRecyclerAdapter newInstance(RequestManager glide) {
    return new ArtRecyclerAdapter(glide);
  }
}
