package com.example.cusyv2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class dashboard2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard2);
    }

    public void Akun(View view) {
        Intent intent = new Intent(dashboard2.this, akun.class);
        startActivity(intent);
    }

    public void Pembayaran(View view) {
        Intent intent = new Intent(dashboard2.this, pembayaran.class);
        startActivity(intent);
    }

    public void Status(View view) {
        Intent intent = new Intent(dashboard2.this, statuspesanan.class);
        startActivity(intent);
    }

    public void Statistik(View view) {
        Intent intent = new Intent(dashboard2.this, statistik.class);
        startActivity(intent);
    }

    public void Pengaturan(View view) {
        Intent intent = new Intent(dashboard2.this, pengaturan.class);
        startActivity(intent);
    }

}