package com.masadany.mvvm_hilt_unittesting.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\bJ\u000e\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\bJ\u000e\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\bJ\u001e\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00152\u0006\u0010 \u001a\u00020\u00152\u0006\u0010!\u001a\u00020\u0015J\u0006\u0010\"\u001a\u00020\u001eJ\u000e\u0010#\u001a\u00020\u001e2\u0006\u0010$\u001a\u00020\u0015J\u000e\u0010%\u001a\u00020\u001e2\u0006\u0010&\u001a\u00020\u0015R\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001d\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\nR\u001a\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\f0\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\nR\u001a\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\f0\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\n\u00a8\u0006\'"}, d2 = {"Lcom/masadany/mvvm_hilt_unittesting/viewmodel/ArtViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/masadany/mvvm_hilt_unittesting/repo/ArtRepositoryInterface;", "(Lcom/masadany/mvvm_hilt_unittesting/repo/ArtRepositoryInterface;)V", "artList", "Landroidx/lifecycle/LiveData;", "", "Lcom/masadany/roomdb/Art;", "getArtList", "()Landroidx/lifecycle/LiveData;", "imageList", "Lcom/masadany/mvvm_hilt_unittesting/util/Resource;", "Lcom/masadany/mvvm_hilt_unittesting/model/ImageResponse;", "getImageList", "images", "Landroidx/lifecycle/MutableLiveData;", "insertArtMessage", "getInsertArtMessage", "insertArtMsg", "selectedImage", "", "selectedImageUrl", "getSelectedImageUrl", "delete1Art", "Lkotlinx/coroutines/Job;", "art", "deleteArt", "insertArt", "makeArt", "", "name", "artistName", "year", "resetInsertArtMsg", "searchForImage", "searchString", "setSelectedImage", "url", "app_debug"})
public final class ArtViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.masadany.roomdb.Art>> artList = null;
    private final androidx.lifecycle.MutableLiveData<com.masadany.mvvm_hilt_unittesting.util.Resource<com.masadany.mvvm_hilt_unittesting.model.ImageResponse>> images = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> selectedImage = null;
    private androidx.lifecycle.MutableLiveData<com.masadany.mvvm_hilt_unittesting.util.Resource<com.masadany.roomdb.Art>> insertArtMsg;
    private final com.masadany.mvvm_hilt_unittesting.repo.ArtRepositoryInterface repository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.masadany.roomdb.Art>> getArtList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.masadany.mvvm_hilt_unittesting.util.Resource<com.masadany.mvvm_hilt_unittesting.model.ImageResponse>> getImageList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getSelectedImageUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.masadany.mvvm_hilt_unittesting.util.Resource<com.masadany.roomdb.Art>> getInsertArtMessage() {
        return null;
    }
    
    public final void resetInsertArtMsg() {
    }
    
    public final void setSelectedImage(@org.jetbrains.annotations.NotNull()
    java.lang.String url) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job deleteArt(@org.jetbrains.annotations.NotNull()
    com.masadany.roomdb.Art art) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job delete1Art(@org.jetbrains.annotations.NotNull()
    com.masadany.roomdb.Art art) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job insertArt(@org.jetbrains.annotations.NotNull()
    com.masadany.roomdb.Art art) {
        return null;
    }
    
    public final void searchForImage(@org.jetbrains.annotations.NotNull()
    java.lang.String searchString) {
    }
    
    public final void makeArt(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String artistName, @org.jetbrains.annotations.NotNull()
    java.lang.String year) {
    }
    
    @androidx.hilt.lifecycle.ViewModelInject()
    public ArtViewModel(@org.jetbrains.annotations.NotNull()
    com.masadany.mvvm_hilt_unittesting.repo.ArtRepositoryInterface repository) {
        super();
    }
}