package com.masadany.mvvm_hilt_unittesting.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001#B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u0018\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0019H\u0016J\u0018\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0019H\u0016J\u001a\u0010!\u001a\u00020\u00142\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00140\u0013R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR0\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\f8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0015\u001a\u0010\u0012\f\u0012\n \u0017*\u0004\u0018\u00010\b0\b0\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006$"}, d2 = {"Lcom/masadany/mvvm_hilt_unittesting/adapter/ImageRecyclerAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/masadany/mvvm_hilt_unittesting/adapter/ImageRecyclerAdapter$ImageViewHolder;", "glide", "Lcom/bumptech/glide/RequestManager;", "(Lcom/bumptech/glide/RequestManager;)V", "diffUtil", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "", "getGlide", "()Lcom/bumptech/glide/RequestManager;", "value", "", "images", "getImages", "()Ljava/util/List;", "setImages", "(Ljava/util/List;)V", "onItemClickLister", "Lkotlin/Function1;", "", "recyclerListDiffer", "Landroidx/recyclerview/widget/AsyncListDiffer;", "kotlin.jvm.PlatformType", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setOnItemClickListener", "listener", "ImageViewHolder", "app_debug"})
public final class ImageRecyclerAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.masadany.mvvm_hilt_unittesting.adapter.ImageRecyclerAdapter.ImageViewHolder> {
    private kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onItemClickLister;
    private final androidx.recyclerview.widget.DiffUtil.ItemCallback<java.lang.String> diffUtil = null;
    private final androidx.recyclerview.widget.AsyncListDiffer<java.lang.String> recyclerListDiffer = null;
    @org.jetbrains.annotations.NotNull()
    private final com.bumptech.glide.RequestManager glide = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getImages() {
        return null;
    }
    
    public final void setImages(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.masadany.mvvm_hilt_unittesting.adapter.ImageRecyclerAdapter.ImageViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    public final void setOnItemClickListener(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> listener) {
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.masadany.mvvm_hilt_unittesting.adapter.ImageRecyclerAdapter.ImageViewHolder holder, int position) {
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
    public ImageRecyclerAdapter(@org.jetbrains.annotations.NotNull()
    com.bumptech.glide.RequestManager glide) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/masadany/mvvm_hilt_unittesting/adapter/ImageRecyclerAdapter$ImageViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "app_debug"})
    public static final class ImageViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        
        public ImageViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
}