package com.example.ramsdroid;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.CompositePageTransformer;
import androidx.viewpager2.widget.MarginPageTransformer;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Intent;
import android.icu.util.Calendar;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

import java.util.List;


public class MainActivity extends AppCompatActivity {
    private static long back_pressed;
    ImageButton profile, registration, record, finance;
    ViewPager2 viewPager2;
    //autoslide
    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference myRef;

    private Handler slideHandler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rams_home);




        String path = "s2/first_name";
        myRef =  database.getReference(path);
        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                // Get the first name from the dataSnapshot
                String firstName = dataSnapshot.getValue(String.class);

                // Set the text of your TextView to the first name
                TextView textView = findViewById(R.id.userTextView);
                textView.setText(firstName);
            }


            @Override
            public void onCancelled(DatabaseError error) {
                // Handle errors here
            }
        });




        //________________________________________________________
        TextView greetingTextView = findViewById(R.id.greetingTextView);
        Calendar calendar = Calendar.getInstance();
        int hourOfDay = calendar.get(Calendar.HOUR_OF_DAY);
        if (hourOfDay >= 0 && hourOfDay < 12) {
            greetingTextView.setText("Good morning");
        } else if (hourOfDay >= 12 && hourOfDay < 18) {
            greetingTextView.setText("Good afternoon");
        } else {
            greetingTextView.setText("Good evening");
        }

        //________________________________________________________


        viewPager2 = findViewById(R.id.viewPager); // change id

        List<SlideItem> sliderItem = new ArrayList<>();
        sliderItem.add(new SlideItem(R.drawable.announcement_1)); //change id
        sliderItem.add(new SlideItem(R.drawable.announcement_2)); //change id
        sliderItem.add(new SlideItem(R.drawable.announcement_3)); //change id

        viewPager2.setAdapter(new SlideAdapter(sliderItem,viewPager2));
        viewPager2.setClipToPadding(false);
        viewPager2.setClipChildren(false);
        viewPager2.setOffscreenPageLimit(5);
        viewPager2.getChildAt(0).setOverScrollMode(RecyclerView.OVER_SCROLL_NEVER);

        CompositePageTransformer compositePageTransformer = new CompositePageTransformer();
        compositePageTransformer.addTransformer(new MarginPageTransformer(30));
        compositePageTransformer.addTransformer(new ViewPager2.PageTransformer() {
            @Override
            public void transformPage(@NonNull View page, float position) {
                float r = 1 - Math.abs(position);
                page.setScaleY(0.85f + r*0.15f);

            }
        });

        viewPager2.setPageTransformer(compositePageTransformer);

        viewPager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);

                slideHandler.removeCallbacks(sliderRunnable);
                slideHandler.postDelayed(sliderRunnable, 5000);
            }
        });

        //if isUsernameValid() && isPasswordValid(){
            //then switch intent to home screen

        //}

        finance = findViewById(R.id.home_financeBTN);
        finance.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, StudentFinance.class));
            finish();
        });


        record = findViewById(R.id.home_studentrecordsBTN);
        record.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, StudentRecords.class));
            finish();
        });

        registration = findViewById(R.id.home_registrationBTN);
        registration.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, StudentRegistration.class));
            finish();
        });

        profile = findViewById(R.id.home_studentprofileBTN);
        profile.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, StudentProfile.class));
            finish();
        });
    }

    private Runnable sliderRunnable = new Runnable() {
        @Override
        public void run() {
            viewPager2.setCurrentItem(viewPager2.getCurrentItem() + 1);
        }
    };

    @Override
    protected void onPause() {
        super.onPause();
        slideHandler.removeCallbacks(sliderRunnable);

    }

    @Override
    protected void onResume() {
        super.onResume();
        slideHandler.postDelayed(sliderRunnable, 5000);
    }

    @Override
    public void onBackPressed() {
        if (back_pressed + 2000 > System.currentTimeMillis()) {
            super.onBackPressed();
        } else {
            Toast.makeText(getBaseContext(), "Press once again to exit",
                    Toast.LENGTH_SHORT).show();
            back_pressed = System.currentTimeMillis();
        }
    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus){
        super.onWindowFocusChanged(hasFocus);
        getWindow().getDecorView().setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);
    }
}