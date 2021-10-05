package com.febri.signupapk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    Button btndaftar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btndaftar = findViewById(R.id.btndaftar);
        btndaftar.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btndaftar:
                Intent movedaftar = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(movedaftar);
                break;
        }
    }
}
