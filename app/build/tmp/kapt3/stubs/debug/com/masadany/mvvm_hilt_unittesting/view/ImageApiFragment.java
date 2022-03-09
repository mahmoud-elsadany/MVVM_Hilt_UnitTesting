package com.masadany.mvvm_hilt_unittesting.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001a\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\u0006\u0010\u0015\u001a\u00020\u0010R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u0016"}, d2 = {"Lcom/masadany/mvvm_hilt_unittesting/view/ImageApiFragment;", "Landroidx/fragment/app/Fragment;", "imageRecyclerAdapter", "Lcom/masadany/mvvm_hilt_unittesting/adapter/ImageRecyclerAdapter;", "(Lcom/masadany/mvvm_hilt_unittesting/adapter/ImageRecyclerAdapter;)V", "fragmentBinding", "Lcom/masadany/mvvm_hilt_unittesting/databinding/FragmentImageApiBinding;", "getImageRecyclerAdapter", "()Lcom/masadany/mvvm_hilt_unittesting/adapter/ImageRecyclerAdapter;", "viewModel", "Lcom/masadany/mvvm_hilt_unittesting/viewmodel/ArtViewModel;", "getViewModel", "()Lcom/masadany/mvvm_hilt_unittesting/viewmodel/ArtViewModel;", "setViewModel", "(Lcom/masadany/mvvm_hilt_unittesting/viewmodel/ArtViewModel;)V", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "subscribeToObservers", "app_debug"})
public final class ImageApiFragment extends androidx.fragment.app.Fragment {
    private com.masadany.mvvm_hilt_unittesting.databinding.FragmentImageApiBinding fragmentBinding;
    public com.masadany.mvvm_hilt_unittesting.viewmodel.ArtViewModel viewModel;
    @org.jetbrains.annotations.NotNull()
    private final com.masadany.mvvm_hilt_unittesting.adapter.ImageRecyclerAdapter imageRecyclerAdapter = null;
    
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
    
    public final void subscribeToObservers() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.masadany.mvvm_hilt_unittesting.adapter.ImageRecyclerAdapter getImageRecyclerAdapter() {
        return null;
    }
    
    @javax.inject.Inject()
    public ImageApiFragment(@org.jetbrains.annotations.NotNull()
    com.masadany.mvvm_hilt_unittesting.adapter.ImageRecyclerAdapter imageRecyclerAdapter) {
        super();
    }
}