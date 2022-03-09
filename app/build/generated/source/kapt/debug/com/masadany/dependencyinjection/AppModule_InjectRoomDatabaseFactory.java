package com.masadany.dependencyinjection;

import android.content.Context;
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
public final class AppModule_InjectRoomDatabaseFactory implements Factory<ArtDatabase> {
  private final Provider<Context> contextProvider;

  public AppModule_InjectRoomDatabaseFactory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public ArtDatabase get() {
    return injectRoomDatabase(contextProvider.get());
  }

  public static AppModule_InjectRoomDatabaseFactory create(Provider<Context> contextProvider) {
    return new AppModule_InjectRoomDatabaseFactory(contextProvider);
  }

  public static ArtDatabase injectRoomDatabase(Context context) {
    return Preconditions.checkNotNull(AppModule.INSTANCE.injectRoomDatabase(context), "Cannot return null from a non-@Nullable @Provides method");
  }
}
