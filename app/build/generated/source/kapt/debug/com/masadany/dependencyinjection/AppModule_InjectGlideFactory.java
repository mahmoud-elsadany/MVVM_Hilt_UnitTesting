package com.masadany.dependencyinjection;

import android.content.Context;
import com.bumptech.glide.RequestManager;
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
public final class AppModule_InjectGlideFactory implements Factory<RequestManager> {
  private final Provider<Context> contextProvider;

  public AppModule_InjectGlideFactory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public RequestManager get() {
    return injectGlide(contextProvider.get());
  }

  public static AppModule_InjectGlideFactory create(Provider<Context> contextProvider) {
    return new AppModule_InjectGlideFactory(contextProvider);
  }

  public static RequestManager injectGlide(Context context) {
    return Preconditions.checkNotNull(AppModule.INSTANCE.injectGlide(context), "Cannot return null from a non-@Nullable @Provides method");
  }
}
