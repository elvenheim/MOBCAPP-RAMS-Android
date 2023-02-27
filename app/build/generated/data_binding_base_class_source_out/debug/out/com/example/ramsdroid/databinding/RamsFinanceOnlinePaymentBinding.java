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

public final class RamsFinanceOnlinePaymentBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageView imageView5;

  @NonNull
  public final ImageView imageView6;

  @NonNull
  public final ImageButton onlinePaymentBack;

  @NonNull
  public final TextView onlinePaymentTitle;

  private RamsFinanceOnlinePaymentBinding(@NonNull ConstraintLayout rootView,
      @NonNull ImageView imageView5, @NonNull ImageView imageView6,
      @NonNull ImageButton onlinePaymentBack, @NonNull TextView onlinePaymentTitle) {
    this.rootView = rootView;
    this.imageView5 = imageView5;
    this.imageView6 = imageView6;
    this.onlinePaymentBack = onlinePaymentBack;
    this.onlinePaymentTitle = onlinePaymentTitle;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static RamsFinanceOnlinePaymentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static RamsFinanceOnlinePaymentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.rams_finance_online_payment, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static RamsFinanceOnlinePaymentBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.imageView5;
      ImageView imageView5 = ViewBindings.findChildViewById(rootView, id);
      if (imageView5 == null) {
        break missingId;
      }

      id = R.id.imageView6;
      ImageView imageView6 = ViewBindings.findChildViewById(rootView, id);
      if (imageView6 == null) {
        break missingId;
      }

      id = R.id.online_payment_back;
      ImageButton onlinePaymentBack = ViewBindings.findChildViewById(rootView, id);
      if (onlinePaymentBack == null) {
        break missingId;
      }

      id = R.id.online_payment_title;
      TextView onlinePaymentTitle = ViewBindings.findChildViewById(rootView, id);
      if (onlinePaymentTitle == null) {
        break missingId;
      }

      return new RamsFinanceOnlinePaymentBinding((ConstraintLayout) rootView, imageView5,
          imageView6, onlinePaymentBack, onlinePaymentTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
