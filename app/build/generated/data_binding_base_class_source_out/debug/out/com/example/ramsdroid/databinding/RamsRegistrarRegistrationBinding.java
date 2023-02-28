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

public final class RamsRegistrarRegistrationBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageView imageView3;

  @NonNull
  public final ImageView imageView4;

  @NonNull
  public final TextView masterlistTitle;

  @NonNull
  public final ImageButton registrationMainBackBTN;

  @NonNull
  public final TextView textView2;

  private RamsRegistrarRegistrationBinding(@NonNull ConstraintLayout rootView,
      @NonNull ImageView imageView3, @NonNull ImageView imageView4,
      @NonNull TextView masterlistTitle, @NonNull ImageButton registrationMainBackBTN,
      @NonNull TextView textView2) {
    this.rootView = rootView;
    this.imageView3 = imageView3;
    this.imageView4 = imageView4;
    this.masterlistTitle = masterlistTitle;
    this.registrationMainBackBTN = registrationMainBackBTN;
    this.textView2 = textView2;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static RamsRegistrarRegistrationBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static RamsRegistrarRegistrationBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.rams_registrar_registration, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static RamsRegistrarRegistrationBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.imageView3;
      ImageView imageView3 = ViewBindings.findChildViewById(rootView, id);
      if (imageView3 == null) {
        break missingId;
      }

      id = R.id.imageView4;
      ImageView imageView4 = ViewBindings.findChildViewById(rootView, id);
      if (imageView4 == null) {
        break missingId;
      }

      id = R.id.masterlist_title;
      TextView masterlistTitle = ViewBindings.findChildViewById(rootView, id);
      if (masterlistTitle == null) {
        break missingId;
      }

      id = R.id.registration_main_backBTN;
      ImageButton registrationMainBackBTN = ViewBindings.findChildViewById(rootView, id);
      if (registrationMainBackBTN == null) {
        break missingId;
      }

      id = R.id.textView2;
      TextView textView2 = ViewBindings.findChildViewById(rootView, id);
      if (textView2 == null) {
        break missingId;
      }

      return new RamsRegistrarRegistrationBinding((ConstraintLayout) rootView, imageView3,
          imageView4, masterlistTitle, registrationMainBackBTN, textView2);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
