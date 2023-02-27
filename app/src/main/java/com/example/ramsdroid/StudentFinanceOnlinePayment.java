package com.example.ramsdroid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class StudentFinanceOnlinePayment extends AppCompatActivity {

    ImageButton onlinePaymentBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rams_finance_online_payment);

        onlinePaymentBack = findViewById(R.id.online_payment_back);
        onlinePaymentBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(StudentFinanceOnlinePayment.this, StudentFinance.class));
                finish();
            }
        });
    }
}
