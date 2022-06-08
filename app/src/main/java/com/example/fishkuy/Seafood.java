package com.example.fishkuy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Seafood extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_seafood);
    }

    public void back10(View view) {
        Intent intent = new Intent(Seafood.this, Homescreen.class);
        startActivity(intent);
    }

    public void beli6(View view) {
        Intent intent2 = new Intent(Seafood.this, Detailproduk3.class);
        startActivity(intent2);
    }
}
