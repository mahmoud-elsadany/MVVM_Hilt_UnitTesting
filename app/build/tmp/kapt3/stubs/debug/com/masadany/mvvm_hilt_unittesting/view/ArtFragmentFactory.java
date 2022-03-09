package com.masadany.mvvm_hilt_unittesting.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/masadany/mvvm_hilt_unittesting/view/ArtFragmentFactory;", "Landroidx/fragment/app/FragmentFactory;", "artRecyclerAdapter", "Lcom/masadany/mvvm_hilt_unittesting/adapter/ArtRecyclerAdapter;", "imageRecyclerAdapter", "Lcom/masadany/mvvm_hilt_unittesting/adapter/ImageRecyclerAdapter;", "glide", "Lcom/bumptech/glide/RequestManager;", "(Lcom/masadany/mvvm_hilt_unittesting/adapter/ArtRecyclerAdapter;Lcom/masadany/mvvm_hilt_unittesting/adapter/ImageRecyclerAdapter;Lcom/bumptech/glide/RequestManager;)V", "instantiate", "Landroidx/fragment/app/Fragment;", "classLoader", "Ljava/lang/ClassLoader;", "className", "", "app_debug"})
public final class ArtFragmentFactory extends androidx.fragment.app.FragmentFactory {
    private final com.masadany.mvvm_hilt_unittesting.adapter.ArtRecyclerAdapter artRecyclerAdapter = null;
    private final com.masadany.mvvm_hilt_unittesting.adapter.ImageRecyclerAdapter imageRecyclerAdapter = null;
    private final com.bumptech.glide.RequestManager glide = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.fragment.app.Fragment instantiate(@org.jetbrains.annotations.NotNull()
    java.lang.ClassLoader classLoader, @org.jetbrains.annotations.NotNull()
    java.lang.String className) {
        return null;
    }
    
    @javax.inject.Inject()
    public ArtFragmentFactory(@org.jetbrains.annotations.NotNull()
    com.masadany.mvvm_hilt_unittesting.adapter.ArtRecyclerAdapter artRecyclerAdapter, @org.jetbrains.annotations.NotNull()
    com.masadany.mvvm_hilt_unittesting.adapter.ImageRecyclerAdapter imageRecyclerAdapter, @org.jetbrains.annotations.NotNull()
    com.bumptech.glide.RequestManager glide) {
        super();
    }
}