package com.example.ramsdroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.content.Intent;

public class RAMSLogin extends AppCompatActivity {

    EditText email, pass;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rams_login);

        email = findViewById(R.id.loginEmail);
        pass = findViewById(R.id.loginPassword);
        btn = findViewById(R.id.login_btnSignIn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            Intent i = new Intent(RAMSLogin.this, MainActivity.class);
            startActivity(i);
            finish();
            }
        });

    }
}