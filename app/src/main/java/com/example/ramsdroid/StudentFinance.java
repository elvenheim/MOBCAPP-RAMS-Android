package com.example.ramsdroid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class StudentFinance extends Activity {

    ImageButton financeBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rams_finance_main);

        financeBack = findViewById(R.id.finance_main_backBTN);
        financeBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(StudentFinance.this, MainActivity.class));
                finish();
            }
        });
    }
}