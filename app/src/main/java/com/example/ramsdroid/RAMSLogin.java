package com.example.ramsdroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.ContactsContract;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.content.Intent;
import android.widget.TextView;
import android.widget.Toast;

public class RAMSLogin extends AppCompatActivity {

    private static long back_pressed;

    DBHandler db;
    private TextView email, pass;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rams_login);

        email = findViewById(R.id.loginEmail);
        pass = findViewById(R.id.loginPassword);
        btn = findViewById(R.id.login_btnSignIn);
        db = new DBHandler(this);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String userEmail = email.getText().toString();

                String userPass = pass.getText().toString();

                if (TextUtils.isEmpty(userEmail) || TextUtils.isEmpty(userPass)){
                    Toast.makeText(RAMSLogin.this, "Missing Field Required", Toast.LENGTH_SHORT).show();
                } else {
                    boolean checkpass = db.checkUserPass(userEmail, userPass);

                    //login backdoor
                    if(userEmail.equals("1") && userPass.equals("1")){
                        checkpass = true;

                    }
                    if (checkpass){
                        Toast.makeText(RAMSLogin.this,"Login Successful", Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(getApplicationContext(), MainActivity.class));
                        finish();
                    } else {
                        Toast.makeText(RAMSLogin.this, "Login Failed", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
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