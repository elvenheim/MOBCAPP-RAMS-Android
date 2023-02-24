package com.example.ramsdroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
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

        btn.setOnClickListener(v -> {String userEmail = email.getText().toString();
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
        finish();
        });
    }

    //Code for Hiding the Status Bar and Navigation Bar
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