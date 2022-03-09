package com.masadany.mvvm_hilt_unittesting.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u001a\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0010H\u0002R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u0017"}, d2 = {"Lcom/masadany/mvvm_hilt_unittesting/view/ArtDetailsFragment;", "Landroidx/fragment/app/Fragment;", "glide", "Lcom/bumptech/glide/RequestManager;", "(Lcom/bumptech/glide/RequestManager;)V", "fragmentBinding", "Lcom/masadany/mvvm_hilt_unittesting/databinding/FragmentArtDetailsBinding;", "getGlide", "()Lcom/bumptech/glide/RequestManager;", "viewModel", "Lcom/masadany/mvvm_hilt_unittesting/viewmodel/ArtViewModel;", "getViewModel", "()Lcom/masadany/mvvm_hilt_unittesting/viewmodel/ArtViewModel;", "setViewModel", "(Lcom/masadany/mvvm_hilt_unittesting/viewmodel/ArtViewModel;)V", "onDestroyView", "", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "subscribeToObservers", "app_debug"})
public final class ArtDetailsFragment extends androidx.fragment.app.Fragment {
    private com.masadany.mvvm_hilt_unittesting.databinding.FragmentArtDetailsBinding fragmentBinding;
    @javax.inject.Inject()
    public com.masadany.mvvm_hilt_unittesting.viewmodel.ArtViewModel viewModel;
    @org.jetbrains.annotations.NotNull()
    private final com.bumptech.glide.RequestManager glide = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.masadany.mvvm_hilt_unittesting.viewmodel.ArtViewModel getViewModel() {
        return null;
    }
    
    public final void setViewModel(@org.jetbrains.annotations.NotNull()
    com.masadany.mvvm_hilt_unittesting.viewmodel.ArtViewModel p0) {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void subscribeToObservers() {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.bumptech.glide.RequestManager getGlide() {
        return null;
    }
    
    @javax.inject.Inject()
    public ArtDetailsFragment(@org.jetbrains.annotations.NotNull()
    com.bumptech.glide.RequestManager glide) {
        super();
    }
}