package com.example.fishkuy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void forgotPw(View view) {
        Intent intent = new Intent(Login.this, ForgotPw1.class);
        startActivity(intent);
    }

    public void regis(View view) {
        Intent intent2 = new Intent(Login.this, Register.class);
        startActivity(intent2);
    }

    public void masuk(View view) {
        Intent intent3 = new Intent(Login.this, Homescreen.class);
        startActivity(intent3);
    }
}