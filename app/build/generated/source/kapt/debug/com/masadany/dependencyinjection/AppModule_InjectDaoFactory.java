package com.masadany.dependencyinjection;

import com.masadany.mvvm_hilt_unittesting.roomdb.ArtDao;
import com.masadany.mvvm_hilt_unittesting.roomdb.ArtDatabase;
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
public final class AppModule_InjectDaoFactory implements Factory<ArtDao> {
  private final Provider<ArtDatabase> databaseProvider;

  public AppModule_InjectDaoFactory(Provider<ArtDatabase> databaseProvider) {
    this.databaseProvider = databaseProvider;
  }

  @Override
  public ArtDao get() {
    return injectDao(databaseProvider.get());
  }

  public static AppModule_InjectDaoFactory create(Provider<ArtDatabase> databaseProvider) {
    return new AppModule_InjectDaoFactory(databaseProvider);
  }

  public static ArtDao injectDao(ArtDatabase database) {
    return Preconditions.checkNotNull(AppModule.INSTANCE.injectDao(database), "Cannot return null from a non-@Nullable @Provides method");
  }
}
