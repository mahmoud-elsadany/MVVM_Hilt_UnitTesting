package com.masadany.mvvm_hilt_unittesting.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001fB\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0016H\u0016J\u0018\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0016H\u0016R0\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\u0010\u0012\f\u0012\n \u0014*\u0004\u0018\u00010\b0\b0\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"Lcom/masadany/mvvm_hilt_unittesting/adapter/ArtRecyclerAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/masadany/mvvm_hilt_unittesting/adapter/ArtRecyclerAdapter$ArtViewHolder;", "glide", "Lcom/bumptech/glide/RequestManager;", "(Lcom/bumptech/glide/RequestManager;)V", "value", "", "Lcom/masadany/roomdb/Art;", "arts", "getArts", "()Ljava/util/List;", "setArts", "(Ljava/util/List;)V", "diffUtil", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "getGlide", "()Lcom/bumptech/glide/RequestManager;", "recyclerListDiffer", "Landroidx/recyclerview/widget/AsyncListDiffer;", "kotlin.jvm.PlatformType", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ArtViewHolder", "app_debug"})
public final class ArtRecyclerAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.masadany.mvvm_hilt_unittesting.adapter.ArtRecyclerAdapter.ArtViewHolder> {
    private final androidx.recyclerview.widget.DiffUtil.ItemCallback<com.masadany.roomdb.Art> diffUtil = null;
    private final androidx.recyclerview.widget.AsyncListDiffer<com.masadany.roomdb.Art> recyclerListDiffer = null;
    @org.jetbrains.annotations.NotNull()
    private final com.bumptech.glide.RequestManager glide = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.masadany.roomdb.Art> getArts() {
        return null;
    }
    
    public final void setArts(@org.jetbrains.annotations.NotNull()
    java.util.List<com.masadany.roomdb.Art> value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.masadany.mvvm_hilt_unittesting.adapter.ArtRecyclerAdapter.ArtViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.masadany.mvvm_hilt_unittesting.adapter.ArtRecyclerAdapter.ArtViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.bumptech.glide.RequestManager getGlide() {
        return null;
    }
    
    @javax.inject.Inject()
    public ArtRecyclerAdapter(@org.jetbrains.annotations.NotNull()
    com.bumptech.glide.RequestManager glide) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/masadany/mvvm_hilt_unittesting/adapter/ArtRecyclerAdapter$ArtViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "app_debug"})
    public static final class ArtViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        
        public ArtViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
}