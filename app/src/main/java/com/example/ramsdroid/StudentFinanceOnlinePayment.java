package com.example.ramsdroid;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

public class StudentFinanceOnlinePayment extends AppCompatActivity {

    ImageButton onlinePaymentBack;
    ConstraintLayout other_payments, enrollment_tuition;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rams_finance_online_payment);

        other_payments = findViewById(R.id.other_payment_content);
        enrollment_tuition = findViewById(R.id.enrollment_tuition_content);
        other_payments.setVisibility(View.GONE);
        enrollment_tuition.setVisibility(View.GONE);

        onlinePaymentBack = findViewById(R.id.online_payment_back);
        onlinePaymentBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(StudentFinanceOnlinePayment.this, StudentFinance.class));
                finish();
            }
        });

    }

    public void onRadioButtonClicked(View view) {

        other_payments = findViewById(R.id.other_payment_content);
        enrollment_tuition = findViewById(R.id.enrollment_tuition_content);
        boolean checked = ((RadioButton) view).isChecked();

        switch(view.getId()) {
            case R.id.enrollment_tuition_RB:
                if (checked)
                    enrollment_tuition.setVisibility(View.VISIBLE);
                    other_payments.setVisibility(View.GONE);
                    break;
            case R.id.other_payments_RB:
                if (checked)
                    enrollment_tuition.setVisibility(View.GONE);
                    other_payments.setVisibility(View.VISIBLE);
                    break;
        }
    }


}
