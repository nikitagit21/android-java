package com.febri.myviewandviews;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static android.view.View.*;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btndonasi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btndonasi = findViewById(R.id.btndonasi);
        btndonasi.setOnClickListener(this);
     if (getSupportActionBar() != null) {
          getSupportActionBar().setTitle("Donasi Pesawat R80");
    }

    }

    @Override
    public void onClick(View view) {
       switch (view.getId()) {
            case R.id.btndonasi:
                Intent movedonasi = new Intent(MainActivity.this,DonasiActivity.class);
                startActivity(movedonasi);
                break;
        }
    }
}