package com.example.ramsdroid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class StudentRecords extends AppCompatActivity {

    private ImageButton classSched;
    private ImageButton assesments;
    private ImageButton grades;
    private ImageButton clearance;
    private ImageButton vaccination;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rams_student_records_main);

        ImageButton recordsBack = findViewById(R.id.records_back_main_BTN);
        recordsBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(StudentRecords.this, MainActivity.class));
                finish();
            }
        });

        classSched = findViewById(R.id.class_sched_btn);
        classSched.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(StudentRecords.this, Records_ClassSched.class));
                finish();
            }
        });
        grades = findViewById(R.id.my_grades_btn);
        grades.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(StudentRecords.this, Records_Grades.class));
                finish();
            }
        });

        clearance = findViewById(R.id.clearance_btn);
        clearance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(StudentRecords.this, Records_Clearance.class));
                finish();
            }
        });

        assesments = findViewById(R.id.class_assess_btn);
        assesments.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(StudentRecords.this, Records_Assesments.class));
                finish();
            }
        });

        vaccination = findViewById(R.id.vaccination_record_btn);
        vaccination.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(StudentRecords.this, Records_Vaccination.class));
                finish();
            }
        });

    }

    @Override
    public void onBackPressed()
    {
        super.onBackPressed();
        startActivity(new Intent(StudentRecords.this, MainActivity.class));
        finish();
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