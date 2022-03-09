package com.masadany.dependencyinjection;

import com.masadany.mvvm_hilt_unittesting.api.RetrofitAPI;
import com.masadany.mvvm_hilt_unittesting.repo.ArtRepositoryInterface;
import com.masadany.mvvm_hilt_unittesting.roomdb.ArtDao;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
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
public final class AppModule_InjectNormalRepoFactory implements Factory<ArtRepositoryInterface> {
  private final Provider<ArtDao> daoProvider;

  private final Provider<RetrofitAPI> apiProvider;

  public AppModule_InjectNormalRepoFactory(Provider<ArtDao> daoProvider,
      Provider<RetrofitAPI> apiProvider) {
    this.daoProvider = daoProvider;
    this.apiProvider = apiProvider;
  }

  @Override
  public ArtRepositoryInterface get() {
    return injectNormalRepo(daoProvider.get(), apiProvider.get());
  }

  public static AppModule_InjectNormalRepoFactory create(Provider<ArtDao> daoProvider,
      Provider<RetrofitAPI> apiProvider) {
    return new AppModule_InjectNormalRepoFactory(daoProvider, apiProvider);
  }

  public static ArtRepositoryInterface injectNormalRepo(ArtDao dao, RetrofitAPI api) {
    return Preconditions.checkNotNull(AppModule.INSTANCE.injectNormalRepo(dao, api), "Cannot return null from a non-@Nullable @Provides method");
  }
}
