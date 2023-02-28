package com.example.ramsdroid;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;

public class StudentFinanceOnlinePayment extends AppCompatActivity {

    RadioGroup finance_group_btn;
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

//        finance_group_btn.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(RadioGroup group, int checkedId) {
//                switch (checkedId){
//                    case R.id.online_payment_btn:
//                        break;
//                    case R.id.other_payments_RB:
//                        break;
//                    default:
//                        break;
//                }
//            }
//        });
    }
}
