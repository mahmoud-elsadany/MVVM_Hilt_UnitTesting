package com.masadany.mvvm_hilt_unittesting.view;

import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
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
public final class MainActivity_MembersInjector implements MembersInjector<MainActivity> {
  private final Provider<ArtFragmentFactory> fragmentFactoryProvider;

  public MainActivity_MembersInjector(Provider<ArtFragmentFactory> fragmentFactoryProvider) {
    this.fragmentFactoryProvider = fragmentFactoryProvider;
  }

  public static MembersInjector<MainActivity> create(
      Provider<ArtFragmentFactory> fragmentFactoryProvider) {
    return new MainActivity_MembersInjector(fragmentFactoryProvider);
  }

  @Override
  public void injectMembers(MainActivity instance) {
    injectFragmentFactory(instance, fragmentFactoryProvider.get());
  }

  @InjectedFieldSignature("com.masadany.mvvm_hilt_unittesting.view.MainActivity.fragmentFactory")
  public static void injectFragmentFactory(MainActivity instance,
      ArtFragmentFactory fragmentFactory) {
    instance.fragmentFactory = fragmentFactory;
  }
}
