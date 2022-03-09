// Generated by view binder compiler. Do not edit!
package com.masadany.mvvm_hilt_unittesting.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.masadany.mvvm_hilt_unittesting.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentArtsBinding implements ViewBinding {
  @NonNull
  private final CoordinatorLayout rootView;

  @NonNull
  public final ConstraintLayout constraintLayout;

  @NonNull
  public final FloatingActionButton fab;

  @NonNull
  public final RecyclerView recyclerViewArt;

  @NonNull
  public final CoordinatorLayout rootLayout;

  private FragmentArtsBinding(@NonNull CoordinatorLayout rootView,
      @NonNull ConstraintLayout constraintLayout, @NonNull FloatingActionButton fab,
      @NonNull RecyclerView recyclerViewArt, @NonNull CoordinatorLayout rootLayout) {
    this.rootView = rootView;
    this.constraintLayout = constraintLayout;
    this.fab = fab;
    this.recyclerViewArt = recyclerViewArt;
    this.rootLayout = rootLayout;
  }

  @Override
  @NonNull
  public CoordinatorLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentArtsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentArtsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_arts, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentArtsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.constraintLayout;
      ConstraintLayout constraintLayout = rootView.findViewById(id);
      if (constraintLayout == null) {
        break missingId;
      }

      id = R.id.fab;
      FloatingActionButton fab = rootView.findViewById(id);
      if (fab == null) {
        break missingId;
      }

      id = R.id.recyclerViewArt;
      RecyclerView recyclerViewArt = rootView.findViewById(id);
      if (recyclerViewArt == null) {
        break missingId;
      }

      CoordinatorLayout rootLayout = (CoordinatorLayout) rootView;

      return new FragmentArtsBinding((CoordinatorLayout) rootView, constraintLayout, fab,
          recyclerViewArt, rootLayout);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
