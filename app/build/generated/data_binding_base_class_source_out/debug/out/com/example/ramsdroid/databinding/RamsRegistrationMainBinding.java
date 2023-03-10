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
  public final TextView FinanceMainTitle;

  @NonNull
  public final ImageButton enrollmentBtn;

  @NonNull
  public final ImageView enrollmentClipboard;

  @NonNull
  public final ImageView enrollmentLine;

  @NonNull
  public final TextView enrollmentTitle;

  @NonNull
  public final ImageView imageView3;

  @NonNull
  public final ImageButton masterlistBtn;

  @NonNull
  public final ImageView masterlistClipboard;

  @NonNull
  public final ImageView masterlistLine;

  @NonNull
  public final TextView masterlistText;

  @NonNull
  public final TextView masterlistTitle;

  @NonNull
  public final ImageButton registrationBtn;

  @NonNull
  public final ImageView registrationClipboard;

  @NonNull
  public final ImageView registrationLine;

  @NonNull
  public final ImageButton registrationMainBackBTN;

  @NonNull
  public final TextView registrationTitle;

  private RamsRegistrationMainBinding(@NonNull ConstraintLayout rootView,
      @NonNull TextView FinanceMainTitle, @NonNull ImageButton enrollmentBtn,
      @NonNull ImageView enrollmentClipboard, @NonNull ImageView enrollmentLine,
      @NonNull TextView enrollmentTitle, @NonNull ImageView imageView3,
      @NonNull ImageButton masterlistBtn, @NonNull ImageView masterlistClipboard,
      @NonNull ImageView masterlistLine, @NonNull TextView masterlistText,
      @NonNull TextView masterlistTitle, @NonNull ImageButton registrationBtn,
      @NonNull ImageView registrationClipboard, @NonNull ImageView registrationLine,
      @NonNull ImageButton registrationMainBackBTN, @NonNull TextView registrationTitle) {
    this.rootView = rootView;
    this.FinanceMainTitle = FinanceMainTitle;
    this.enrollmentBtn = enrollmentBtn;
    this.enrollmentClipboard = enrollmentClipboard;
    this.enrollmentLine = enrollmentLine;
    this.enrollmentTitle = enrollmentTitle;
    this.imageView3 = imageView3;
    this.masterlistBtn = masterlistBtn;
    this.masterlistClipboard = masterlistClipboard;
    this.masterlistLine = masterlistLine;
    this.masterlistText = masterlistText;
    this.masterlistTitle = masterlistTitle;
    this.registrationBtn = registrationBtn;
    this.registrationClipboard = registrationClipboard;
    this.registrationLine = registrationLine;
    this.registrationMainBackBTN = registrationMainBackBTN;
    this.registrationTitle = registrationTitle;
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
      id = R.id.Finance_Main_Title;
      TextView FinanceMainTitle = ViewBindings.findChildViewById(rootView, id);
      if (FinanceMainTitle == null) {
        break missingId;
      }

      id = R.id.enrollment_btn;
      ImageButton enrollmentBtn = ViewBindings.findChildViewById(rootView, id);
      if (enrollmentBtn == null) {
        break missingId;
      }

      id = R.id.enrollment_clipboard;
      ImageView enrollmentClipboard = ViewBindings.findChildViewById(rootView, id);
      if (enrollmentClipboard == null) {
        break missingId;
      }

      id = R.id.enrollment_line;
      ImageView enrollmentLine = ViewBindings.findChildViewById(rootView, id);
      if (enrollmentLine == null) {
        break missingId;
      }

      id = R.id.enrollment_title;
      TextView enrollmentTitle = ViewBindings.findChildViewById(rootView, id);
      if (enrollmentTitle == null) {
        break missingId;
      }

      id = R.id.imageView3;
      ImageView imageView3 = ViewBindings.findChildViewById(rootView, id);
      if (imageView3 == null) {
        break missingId;
      }

      id = R.id.masterlist_btn;
      ImageButton masterlistBtn = ViewBindings.findChildViewById(rootView, id);
      if (masterlistBtn == null) {
        break missingId;
      }

      id = R.id.masterlist_clipboard;
      ImageView masterlistClipboard = ViewBindings.findChildViewById(rootView, id);
      if (masterlistClipboard == null) {
        break missingId;
      }

      id = R.id.masterlist_line;
      ImageView masterlistLine = ViewBindings.findChildViewById(rootView, id);
      if (masterlistLine == null) {
        break missingId;
      }

      id = R.id.masterlist_text;
      TextView masterlistText = ViewBindings.findChildViewById(rootView, id);
      if (masterlistText == null) {
        break missingId;
      }

      id = R.id.masterlist_title;
      TextView masterlistTitle = ViewBindings.findChildViewById(rootView, id);
      if (masterlistTitle == null) {
        break missingId;
      }

      id = R.id.registration_btn;
      ImageButton registrationBtn = ViewBindings.findChildViewById(rootView, id);
      if (registrationBtn == null) {
        break missingId;
      }

      id = R.id.registration_clipboard;
      ImageView registrationClipboard = ViewBindings.findChildViewById(rootView, id);
      if (registrationClipboard == null) {
        break missingId;
      }

      id = R.id.registration_line;
      ImageView registrationLine = ViewBindings.findChildViewById(rootView, id);
      if (registrationLine == null) {
        break missingId;
      }

      id = R.id.registration_main_backBTN;
      ImageButton registrationMainBackBTN = ViewBindings.findChildViewById(rootView, id);
      if (registrationMainBackBTN == null) {
        break missingId;
      }

      id = R.id.registration_title;
      TextView registrationTitle = ViewBindings.findChildViewById(rootView, id);
      if (registrationTitle == null) {
        break missingId;
      }

      return new RamsRegistrationMainBinding((ConstraintLayout) rootView, FinanceMainTitle,
          enrollmentBtn, enrollmentClipboard, enrollmentLine, enrollmentTitle, imageView3,
          masterlistBtn, masterlistClipboard, masterlistLine, masterlistText, masterlistTitle,
          registrationBtn, registrationClipboard, registrationLine, registrationMainBackBTN,
          registrationTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
