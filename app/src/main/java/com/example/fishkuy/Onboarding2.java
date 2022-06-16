package com.example.fishkuy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Onboarding2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onboarding2);
    }

    public void next3(View view) {
        Intent intent2 = new Intent(Onboarding2.this, Login.class);
        startActivity(intent2);
    }
}