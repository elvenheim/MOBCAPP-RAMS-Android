package com.example.ramsdroid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StudentProfile extends Activity {

    Button logOut, profileBack;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rams_student_profile);

        profileBack = findViewById(R.id.profile_BtnBack);
        profileBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        logOut = findViewById(R.id.profile_btnLogOut);
        logOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(StudentProfile.this, RAMSLogin.class));
                finish();
            }
        });
    }

}
