package com.example.ramsdroid;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;

public class StudentRecords extends Activity {

    Button registrarBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rams_student_records_main);

//        registrarBack = findViewById(R.id.profile_BtnBack);
//        registrarBack.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(StudentRegistrar.this, MainActivity.class));
//            }
//        });
    }
}