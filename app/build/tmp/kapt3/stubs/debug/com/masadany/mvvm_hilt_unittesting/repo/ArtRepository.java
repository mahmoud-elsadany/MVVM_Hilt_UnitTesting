package com.masadany.mvvm_hilt_unittesting.repo;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u0014\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u000e0\rH\u0016J\u0019\u0010\u000f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u001f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0016"}, d2 = {"Lcom/masadany/mvvm_hilt_unittesting/repo/ArtRepository;", "Lcom/masadany/mvvm_hilt_unittesting/repo/ArtRepositoryInterface;", "artDao", "Lcom/masadany/mvvm_hilt_unittesting/roomdb/ArtDao;", "retrofitAPI", "Lcom/masadany/mvvm_hilt_unittesting/api/RetrofitAPI;", "(Lcom/masadany/mvvm_hilt_unittesting/roomdb/ArtDao;Lcom/masadany/mvvm_hilt_unittesting/api/RetrofitAPI;)V", "deleteArt", "", "art", "Lcom/masadany/roomdb/Art;", "(Lcom/masadany/roomdb/Art;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getArt", "Landroidx/lifecycle/LiveData;", "", "insertArt", "searchImage", "Lcom/masadany/mvvm_hilt_unittesting/util/Resource;", "Lcom/masadany/mvvm_hilt_unittesting/model/ImageResponse;", "imageString", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class ArtRepository implements com.masadany.mvvm_hilt_unittesting.repo.ArtRepositoryInterface {
    private final com.masadany.mvvm_hilt_unittesting.roomdb.ArtDao artDao = null;
    private final com.masadany.mvvm_hilt_unittesting.api.RetrofitAPI retrofitAPI = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object insertArt(@org.jetbrains.annotations.NotNull()
    com.masadany.roomdb.Art art, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object deleteArt(@org.jetbrains.annotations.NotNull()
    com.masadany.roomdb.Art art, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<java.util.List<com.masadany.roomdb.Art>> getArt() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object searchImage(@org.jetbrains.annotations.NotNull()
    java.lang.String imageString, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.masadany.mvvm_hilt_unittesting.util.Resource<com.masadany.mvvm_hilt_unittesting.model.ImageResponse>> p1) {
        return null;
    }
    
    @javax.inject.Inject()
    public ArtRepository(@org.jetbrains.annotations.NotNull()
    com.masadany.mvvm_hilt_unittesting.roomdb.ArtDao artDao, @org.jetbrains.annotations.NotNull()
    com.masadany.mvvm_hilt_unittesting.api.RetrofitAPI retrofitAPI) {
        super();
    }
}