package com.masadany.mvvm_hilt_unittesting.view;

import java.lang.System;

@kotlinx.coroutines.ExperimentalCoroutinesApi()
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u001a\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0012H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0019"}, d2 = {"Lcom/masadany/mvvm_hilt_unittesting/view/ArtFragment;", "Landroidx/fragment/app/Fragment;", "artRecyclerAdapter", "Lcom/masadany/mvvm_hilt_unittesting/adapter/ArtRecyclerAdapter;", "(Lcom/masadany/mvvm_hilt_unittesting/adapter/ArtRecyclerAdapter;)V", "getArtRecyclerAdapter", "()Lcom/masadany/mvvm_hilt_unittesting/adapter/ArtRecyclerAdapter;", "fragmentBinding", "Lcom/masadany/mvvm_hilt_unittesting/databinding/FragmentArtsBinding;", "swipeCallBack", "Landroidx/recyclerview/widget/ItemTouchHelper$SimpleCallback;", "viewModel", "Lcom/masadany/mvvm_hilt_unittesting/viewmodel/ArtViewModel;", "getViewModel", "()Lcom/masadany/mvvm_hilt_unittesting/viewmodel/ArtViewModel;", "setViewModel", "(Lcom/masadany/mvvm_hilt_unittesting/viewmodel/ArtViewModel;)V", "onDestroyView", "", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "subscribeToObservers", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class ArtFragment extends androidx.fragment.app.Fragment {
    private com.masadany.mvvm_hilt_unittesting.databinding.FragmentArtsBinding fragmentBinding;
    public com.masadany.mvvm_hilt_unittesting.viewmodel.ArtViewModel viewModel;
    private final androidx.recyclerview.widget.ItemTouchHelper.SimpleCallback swipeCallBack = null;
    @org.jetbrains.annotations.NotNull()
    private final com.masadany.mvvm_hilt_unittesting.adapter.ArtRecyclerAdapter artRecyclerAdapter = null;
    
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
    public final com.masadany.mvvm_hilt_unittesting.adapter.ArtRecyclerAdapter getArtRecyclerAdapter() {
        return null;
    }
    
    @javax.inject.Inject()
    public ArtFragment(@org.jetbrains.annotations.NotNull()
    com.masadany.mvvm_hilt_unittesting.adapter.ArtRecyclerAdapter artRecyclerAdapter) {
        super();
    }
}