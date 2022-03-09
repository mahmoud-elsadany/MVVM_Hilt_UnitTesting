package com.masadany.dependencyinjection;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.android.components.ApplicationComponent.class})
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0012\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\nH\u0007J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\b\u0010\u0010\u001a\u00020\u000fH\u0007J\u0012\u0010\u0011\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\nH\u0007\u00a8\u0006\u0012"}, d2 = {"Lcom/masadany/dependencyinjection/AppModule;", "", "()V", "injectDao", "Lcom/masadany/mvvm_hilt_unittesting/roomdb/ArtDao;", "database", "Lcom/masadany/mvvm_hilt_unittesting/roomdb/ArtDatabase;", "injectGlide", "Lcom/bumptech/glide/RequestManager;", "context", "Landroid/content/Context;", "injectNormalRepo", "Lcom/masadany/mvvm_hilt_unittesting/repo/ArtRepositoryInterface;", "dao", "api", "Lcom/masadany/mvvm_hilt_unittesting/api/RetrofitAPI;", "injectRetrofitAPI", "injectRoomDatabase", "app_debug"})
@dagger.Module()
public final class AppModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.masadany.dependencyinjection.AppModule INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.masadany.mvvm_hilt_unittesting.roomdb.ArtDatabase injectRoomDatabase(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.masadany.mvvm_hilt_unittesting.roomdb.ArtDao injectDao(@org.jetbrains.annotations.NotNull()
    com.masadany.mvvm_hilt_unittesting.roomdb.ArtDatabase database) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.masadany.mvvm_hilt_unittesting.api.RetrofitAPI injectRetrofitAPI() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.bumptech.glide.RequestManager injectGlide(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.masadany.mvvm_hilt_unittesting.repo.ArtRepositoryInterface injectNormalRepo(@org.jetbrains.annotations.NotNull()
    com.masadany.mvvm_hilt_unittesting.roomdb.ArtDao dao, @org.jetbrains.annotations.NotNull()
    com.masadany.mvvm_hilt_unittesting.api.RetrofitAPI api) {
        return null;
    }
    
    private AppModule() {
        super();
    }
}