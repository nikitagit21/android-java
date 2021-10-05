package com.febri.tugas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class bioaktivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bioaktivity);


        getSupportActionBar().setTitle("My Profil");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}
