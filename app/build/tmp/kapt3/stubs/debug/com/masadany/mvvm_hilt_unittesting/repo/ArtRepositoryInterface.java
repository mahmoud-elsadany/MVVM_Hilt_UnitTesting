package com.masadany.mvvm_hilt_unittesting.repo;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0014\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\t0\bH&J\u0019\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u001f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0011"}, d2 = {"Lcom/masadany/mvvm_hilt_unittesting/repo/ArtRepositoryInterface;", "", "deleteArt", "", "art", "Lcom/masadany/roomdb/Art;", "(Lcom/masadany/roomdb/Art;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getArt", "Landroidx/lifecycle/LiveData;", "", "insertArt", "searchImage", "Lcom/masadany/mvvm_hilt_unittesting/util/Resource;", "Lcom/masadany/mvvm_hilt_unittesting/model/ImageResponse;", "imageString", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface ArtRepositoryInterface {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insertArt(@org.jetbrains.annotations.NotNull()
    com.masadany.roomdb.Art art, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deleteArt(@org.jetbrains.annotations.NotNull()
    com.masadany.roomdb.Art art, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<java.util.List<com.masadany.roomdb.Art>> getArt();
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object searchImage(@org.jetbrains.annotations.NotNull()
    java.lang.String imageString, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.masadany.mvvm_hilt_unittesting.util.Resource<com.masadany.mvvm_hilt_unittesting.model.ImageResponse>> p1);
}