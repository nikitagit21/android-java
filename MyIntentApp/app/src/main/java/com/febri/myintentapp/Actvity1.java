package com.febri.myintentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Actvity1 extends AppCompatActivity implements View.OnClickListener {
    Button btnnext;
    EditText kata;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actvity1);

        btnnext = findViewById(R.id.btn_next);
        btnnext.setOnClickListener(this);
        kata = findViewById(R.id.kata);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_next:
                String teks = kata.getText().toString();
                Intent aktivity2 = new Intent(Actvity1.this, activity2.class).putExtra("tulisan",teks);
                startActivity(aktivity2);
                break;
        }

    }
}
