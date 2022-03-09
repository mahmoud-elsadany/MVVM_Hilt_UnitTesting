package com.masadany.mvvm_hilt_unittesting.viewmodel;

import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityRetainedComponent;
import dagger.hilt.codegen.OriginatingElement;
import dagger.multibindings.IntoMap;
import dagger.multibindings.StringKey;
import javax.annotation.Generated;

@Generated("androidx.hilt.AndroidXHiltProcessor")
@Module
@InstallIn(ActivityRetainedComponent.class)
@OriginatingElement(
    topLevelClass = ArtViewModel.class
)
public interface ArtViewModel_HiltModule {
  @Binds
  @IntoMap
  @StringKey("com.masadany.mvvm_hilt_unittesting.viewmodel.ArtViewModel")
  ViewModelAssistedFactory<? extends ViewModel> bind(ArtViewModel_AssistedFactory factory);
}
