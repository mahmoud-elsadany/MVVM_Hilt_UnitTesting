package com.masadany.dependencyinjection;

import com.masadany.mvvm_hilt_unittesting.api.RetrofitAPI;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_InjectRetrofitAPIFactory implements Factory<RetrofitAPI> {
  @Override
  public RetrofitAPI get() {
    return injectRetrofitAPI();
  }

  public static AppModule_InjectRetrofitAPIFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static RetrofitAPI injectRetrofitAPI() {
    return Preconditions.checkNotNull(AppModule.INSTANCE.injectRetrofitAPI(), "Cannot return null from a non-@Nullable @Provides method");
  }

  private static final class InstanceHolder {
    private static final AppModule_InjectRetrofitAPIFactory INSTANCE = new AppModule_InjectRetrofitAPIFactory();
  }
}
