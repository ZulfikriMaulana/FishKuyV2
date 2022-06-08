 package com.example.fishkuy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

 public class Profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
    }

     public void back23(View view) {
         Intent intent = new Intent(Profile.this, Homescreen.class);
         startActivity(intent);
     }

     public void login5(View view) {
        Intent intent2 = new Intent(Profile.this, Login.class);
        startActivity(intent2);
     }
 }