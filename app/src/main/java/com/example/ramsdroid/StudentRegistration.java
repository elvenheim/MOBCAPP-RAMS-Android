package com.example.ramsdroid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StudentRegistration extends Activity {

//    Button registrationBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rams_registration_main);

//        registrationBack = findViewById(R.id.profile_BtnBack);
//        registrationBack.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(StudentRegistration.this, MainActivity.class));
//            }
//        });
    }
}