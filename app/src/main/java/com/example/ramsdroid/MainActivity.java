package com.example.ramsdroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton profile, registration, record, finance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rams_home);

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

        //clicker for student profile button -richmond
        profile = findViewById(R.id.home_studentprofileBTN);
        profile.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, StudentProfile.class));
            finish();
        });
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