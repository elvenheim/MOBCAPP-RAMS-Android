// Generated by view binder compiler. Do not edit!
package com.example.ramsdroid.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.ramsdroid.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class RamsRegistrationMainBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView RegistrarMainTitle;

  @NonNull
  public final ImageButton imageButton;

  @NonNull
  public final ImageView imageView3;

  private RamsRegistrationMainBinding(@NonNull ConstraintLayout rootView,
      @NonNull TextView RegistrarMainTitle, @NonNull ImageButton imageButton,
      @NonNull ImageView imageView3) {
    this.rootView = rootView;
    this.RegistrarMainTitle = RegistrarMainTitle;
    this.imageButton = imageButton;
    this.imageView3 = imageView3;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static RamsRegistrationMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static RamsRegistrationMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.rams_registration_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static RamsRegistrationMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.Registrar_Main_Title;
      TextView RegistrarMainTitle = ViewBindings.findChildViewById(rootView, id);
      if (RegistrarMainTitle == null) {
        break missingId;
      }

      id = R.id.imageButton;
      ImageButton imageButton = ViewBindings.findChildViewById(rootView, id);
      if (imageButton == null) {
        break missingId;
      }

      id = R.id.imageView3;
      ImageView imageView3 = ViewBindings.findChildViewById(rootView, id);
      if (imageView3 == null) {
        break missingId;
      }

      return new RamsRegistrationMainBinding((ConstraintLayout) rootView, RegistrarMainTitle,
          imageButton, imageView3);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
