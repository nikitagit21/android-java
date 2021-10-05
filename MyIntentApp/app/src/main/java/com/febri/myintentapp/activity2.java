package com.febri.myintentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class activity2 extends AppCompatActivity {
TextView teks;
String T;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity2);

        T=getIntent().getStringExtra("tulisan");

        teks=findViewById(R.id.muncul);
        teks.setText(T);
    }
}
