package com.example.ramsdroid;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.content.Intent;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class RAMSLogin extends AppCompatActivity {

    private static long back_pressed;

    FirebaseAuth mAuth;
    FirebaseUser currentUser;
    private EditText email, pass;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rams_login);

        email = findViewById(R.id.loginEmail);
        pass = findViewById(R.id.loginPassword);
        btn = findViewById(R.id.login_btnSignIn);
        mAuth = FirebaseAuth.getInstance();


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            loginUser();
            }
        });
        }private void loginUser(){
            String Email = email.getText().toString();
            String Pass = pass.getText().toString();


            if (TextUtils.isEmpty(Email)){
                Toast.makeText(RAMSLogin.this, "Missing Field Required", Toast.LENGTH_SHORT).show();
            } else if (TextUtils.isEmpty(Pass)) {
                Toast.makeText(RAMSLogin.this, "Missing Field Required", Toast.LENGTH_SHORT).show();
            } else {
                mAuth.signInWithEmailAndPassword(Email,Pass).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()){
                            Toast.makeText(RAMSLogin.this, "Login Successfully", Toast.LENGTH_SHORT).show();
                            startActivity(new Intent(RAMSLogin.this, MainActivity.class));
                        } else {
                            Toast.makeText(RAMSLogin.this, "Login Unsuccessful", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
            }
        }

    @Override
    public void onBackPressed() {
        if (back_pressed + 2000 > System.currentTimeMillis()) {
            super.onBackPressed();
        } else {
            Toast.makeText(getBaseContext(), "Press once again to exit",
                    Toast.LENGTH_SHORT).show();
            back_pressed = System.currentTimeMillis();
        }
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