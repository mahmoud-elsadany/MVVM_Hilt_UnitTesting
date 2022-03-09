package com.masadany.mvvm_hilt_unittesting.roomdb;

import java.lang.System;

@androidx.room.Database(entities = {com.masadany.roomdb.Art.class}, version = 1)
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0005"}, d2 = {"Lcom/masadany/mvvm_hilt_unittesting/roomdb/ArtDatabase;", "Landroidx/room/RoomDatabase;", "()V", "artDao", "Lcom/masadany/mvvm_hilt_unittesting/roomdb/ArtDao;", "app_debug"})
public abstract class ArtDatabase extends androidx.room.RoomDatabase {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.masadany.mvvm_hilt_unittesting.roomdb.ArtDao artDao();
    
    public ArtDatabase() {
        super();
    }
}