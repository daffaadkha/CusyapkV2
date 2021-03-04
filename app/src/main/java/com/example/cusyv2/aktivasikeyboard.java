package com.example.cusyv2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class aktivasikeyboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aktivasikeyboard);
    }

    public void Dashboard(View view) {
        Intent intent = new Intent(aktivasikeyboard.this, dashboard2.class);
        startActivity(intent);
    }
}