package com.example.fishkuy;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import me.ibrahimsn.lib.CirclesLoadingView;

public class Login extends AppCompatActivity {

    CirclesLoadingView circlesLoadingView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        circlesLoadingView = findViewById(R.id.circlesLoadingView);
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

        circlesLoadingView.setVisibility(View.VISIBLE);
        Handler handler = new Handler(getMainLooper());
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent3 = new Intent(Login.this, Homescreen.class);
                startActivity(intent3);
                circlesLoadingView.setVisibility(View.GONE);
            }
        }, 3000);
    }
}