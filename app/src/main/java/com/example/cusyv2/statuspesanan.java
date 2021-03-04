package com.example.cusyv2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class statuspesanan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_statuspesanan);
    }

    public void Dashboard(View view) {
        Intent intent = new Intent(statuspesanan.this, dashboard2.class);
        startActivity(intent);
    }
}