package com.masadany.mvvm_hilt_unittesting.repo;

import com.masadany.mvvm_hilt_unittesting.api.RetrofitAPI;
import com.masadany.mvvm_hilt_unittesting.roomdb.ArtDao;
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
public final class ArtRepository_Factory implements Factory<ArtRepository> {
  private final Provider<ArtDao> artDaoProvider;

  private final Provider<RetrofitAPI> retrofitAPIProvider;

  public ArtRepository_Factory(Provider<ArtDao> artDaoProvider,
      Provider<RetrofitAPI> retrofitAPIProvider) {
    this.artDaoProvider = artDaoProvider;
    this.retrofitAPIProvider = retrofitAPIProvider;
  }

  @Override
  public ArtRepository get() {
    return newInstance(artDaoProvider.get(), retrofitAPIProvider.get());
  }

  public static ArtRepository_Factory create(Provider<ArtDao> artDaoProvider,
      Provider<RetrofitAPI> retrofitAPIProvider) {
    return new ArtRepository_Factory(artDaoProvider, retrofitAPIProvider);
  }

  public static ArtRepository newInstance(ArtDao artDao, RetrofitAPI retrofitAPI) {
    return new ArtRepository(artDao, retrofitAPI);
  }
}
