// Generated by view binder compiler. Do not edit!
package com.masadany.mvvm_hilt_unittesting.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.masadany.mvvm_hilt_unittesting.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ArtRowBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView artRowArtNameText;

  @NonNull
  public final TextView artRowArtistNameText;

  @NonNull
  public final ImageView artRowImageView;

  @NonNull
  public final TextView artRowYearText;

  private ArtRowBinding(@NonNull LinearLayout rootView, @NonNull TextView artRowArtNameText,
      @NonNull TextView artRowArtistNameText, @NonNull ImageView artRowImageView,
      @NonNull TextView artRowYearText) {
    this.rootView = rootView;
    this.artRowArtNameText = artRowArtNameText;
    this.artRowArtistNameText = artRowArtistNameText;
    this.artRowImageView = artRowImageView;
    this.artRowYearText = artRowYearText;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ArtRowBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ArtRowBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent,
      boolean attachToParent) {
    View root = inflater.inflate(R.layout.art_row, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ArtRowBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.artRowArtNameText;
      TextView artRowArtNameText = rootView.findViewById(id);
      if (artRowArtNameText == null) {
        break missingId;
      }

      id = R.id.artRowArtistNameText;
      TextView artRowArtistNameText = rootView.findViewById(id);
      if (artRowArtistNameText == null) {
        break missingId;
      }

      id = R.id.artRowImageView;
      ImageView artRowImageView = rootView.findViewById(id);
      if (artRowImageView == null) {
        break missingId;
      }

      id = R.id.artRowYearText;
      TextView artRowYearText = rootView.findViewById(id);
      if (artRowYearText == null) {
        break missingId;
      }

      return new ArtRowBinding((LinearLayout) rootView, artRowArtNameText, artRowArtistNameText,
          artRowImageView, artRowYearText);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}