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
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import com.example.ramsdroid.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class RamsHomeBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final CardView announcements;

  @NonNull
  public final ImageView apcheader;

  @NonNull
  public final ImageView bgCard;

  @NonNull
  public final ImageView bottomBanner;

  @NonNull
  public final CardView cardView;

  @NonNull
  public final TextView greetingTextView;

  @NonNull
  public final ImageButton homeFinanceBTN;

  @NonNull
  public final ImageButton homeRegistrationBTN;

  @NonNull
  public final ImageButton homeStudentprofileBTN;

  @NonNull
  public final ImageButton homeStudentrecordsBTN;

  @NonNull
  public final ImageView imageView1;

  @NonNull
  public final CardView profilePic;

  @NonNull
  public final TextView textView;

  @NonNull
  public final ImageView topBanner;

  @NonNull
  public final ImageView userBanner;

  @NonNull
  public final ViewPager2 viewPager;

  private RamsHomeBinding(@NonNull ConstraintLayout rootView, @NonNull CardView announcements,
      @NonNull ImageView apcheader, @NonNull ImageView bgCard, @NonNull ImageView bottomBanner,
      @NonNull CardView cardView, @NonNull TextView greetingTextView,
      @NonNull ImageButton homeFinanceBTN, @NonNull ImageButton homeRegistrationBTN,
      @NonNull ImageButton homeStudentprofileBTN, @NonNull ImageButton homeStudentrecordsBTN,
      @NonNull ImageView imageView1, @NonNull CardView profilePic, @NonNull TextView textView,
      @NonNull ImageView topBanner, @NonNull ImageView userBanner, @NonNull ViewPager2 viewPager) {
    this.rootView = rootView;
    this.announcements = announcements;
    this.apcheader = apcheader;
    this.bgCard = bgCard;
    this.bottomBanner = bottomBanner;
    this.cardView = cardView;
    this.greetingTextView = greetingTextView;
    this.homeFinanceBTN = homeFinanceBTN;
    this.homeRegistrationBTN = homeRegistrationBTN;
    this.homeStudentprofileBTN = homeStudentprofileBTN;
    this.homeStudentrecordsBTN = homeStudentrecordsBTN;
    this.imageView1 = imageView1;
    this.profilePic = profilePic;
    this.textView = textView;
    this.topBanner = topBanner;
    this.userBanner = userBanner;
    this.viewPager = viewPager;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static RamsHomeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static RamsHomeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.rams_home, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static RamsHomeBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.announcements;
      CardView announcements = ViewBindings.findChildViewById(rootView, id);
      if (announcements == null) {
        break missingId;
      }

      id = R.id.apcheader;
      ImageView apcheader = ViewBindings.findChildViewById(rootView, id);
      if (apcheader == null) {
        break missingId;
      }

      id = R.id.bg_card;
      ImageView bgCard = ViewBindings.findChildViewById(rootView, id);
      if (bgCard == null) {
        break missingId;
      }

      id = R.id.bottom_banner;
      ImageView bottomBanner = ViewBindings.findChildViewById(rootView, id);
      if (bottomBanner == null) {
        break missingId;
      }

      id = R.id.cardView;
      CardView cardView = ViewBindings.findChildViewById(rootView, id);
      if (cardView == null) {
        break missingId;
      }

      id = R.id.greetingTextView;
      TextView greetingTextView = ViewBindings.findChildViewById(rootView, id);
      if (greetingTextView == null) {
        break missingId;
      }

      id = R.id.home_financeBTN;
      ImageButton homeFinanceBTN = ViewBindings.findChildViewById(rootView, id);
      if (homeFinanceBTN == null) {
        break missingId;
      }

      id = R.id.home_registrationBTN;
      ImageButton homeRegistrationBTN = ViewBindings.findChildViewById(rootView, id);
      if (homeRegistrationBTN == null) {
        break missingId;
      }

      id = R.id.home_studentprofileBTN;
      ImageButton homeStudentprofileBTN = ViewBindings.findChildViewById(rootView, id);
      if (homeStudentprofileBTN == null) {
        break missingId;
      }

      id = R.id.home_studentrecordsBTN;
      ImageButton homeStudentrecordsBTN = ViewBindings.findChildViewById(rootView, id);
      if (homeStudentrecordsBTN == null) {
        break missingId;
      }

      id = R.id.imageView1;
      ImageView imageView1 = ViewBindings.findChildViewById(rootView, id);
      if (imageView1 == null) {
        break missingId;
      }

      id = R.id.profile_pic;
      CardView profilePic = ViewBindings.findChildViewById(rootView, id);
      if (profilePic == null) {
        break missingId;
      }

      id = R.id.textView;
      TextView textView = ViewBindings.findChildViewById(rootView, id);
      if (textView == null) {
        break missingId;
      }

      id = R.id.top_banner;
      ImageView topBanner = ViewBindings.findChildViewById(rootView, id);
      if (topBanner == null) {
        break missingId;
      }

      id = R.id.user_banner;
      ImageView userBanner = ViewBindings.findChildViewById(rootView, id);
      if (userBanner == null) {
        break missingId;
      }

      id = R.id.viewPager;
      ViewPager2 viewPager = ViewBindings.findChildViewById(rootView, id);
      if (viewPager == null) {
        break missingId;
      }

      return new RamsHomeBinding((ConstraintLayout) rootView, announcements, apcheader, bgCard,
          bottomBanner, cardView, greetingTextView, homeFinanceBTN, homeRegistrationBTN,
          homeStudentprofileBTN, homeStudentrecordsBTN, imageView1, profilePic, textView, topBanner,
          userBanner, viewPager);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
