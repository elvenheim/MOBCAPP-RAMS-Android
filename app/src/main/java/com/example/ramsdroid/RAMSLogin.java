package com.example.ramsdroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.ContactsContract;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.content.Intent;

public class RAMSLogin extends AppCompatActivity {

    DBHandler db;
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
            String userEmail = email.getText().toString();
            String userPass = pass.getText().toString();

            if (TextUtils.isEmpty(userEmail)){
                email.setError("Email is Required");
                return;
            }

            if (TextUtils.isEmpty(userPass)){
                pass.setError("Password is required");
                return;
            }

            //insert db login authentication

            startActivity(new Intent(RAMSLogin.this, MainActivity.class));
            }
        });

    }
}