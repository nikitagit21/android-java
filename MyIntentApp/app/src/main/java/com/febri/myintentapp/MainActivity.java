package com.febri.myintentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements
        View.OnClickListener {

    Button btnmove;
    Button btnmovewithdata;
    Button btndial;
    Button btnpolines;
    Button btnpindah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnmove= findViewById(R.id.btn_move);
        btnmove.setOnClickListener(this);

        btnmovewithdata= findViewById(R.id.btn_move_data);
        btnmovewithdata.setOnClickListener(this);

        btndial=findViewById(R.id.btn_dial);
        btndial.setOnClickListener(this);

        btnpolines=findViewById(R.id.btn_polines);
        btnpolines.setOnClickListener(this);

        btnpindah=findViewById(R.id.btn_pindah);
        btnpindah.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_move:
                Intent moveActivity=new Intent(MainActivity.this,newactivity.class);
                startActivity(moveActivity);
                break;
            case R.id.btn_move_data:
                Intent MoveWithdata=new Intent(MainActivity.this,MoveActivityWithData.class);
                MoveWithdata.putExtra(MoveActivityWithData.EXTRA_NAME, "Eka Febriyanti");
                MoveWithdata.putExtra(MoveActivityWithData.EXTRA_AGE, 18);
                startActivity(MoveWithdata);
                break;
            case R.id.btn_dial:
                String phoneNumber="082325312882";
                Intent dialPhone=new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+phoneNumber));
                startActivity(dialPhone);
                break;
            case R.id.btn_polines:
                String webpolines="https://www.polines.ac.id/id/";
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(webpolines)));
                break;
            case R.id.btn_pindah:
                Intent pindah=new Intent(MainActivity.this,Actvity1.class);
                startActivity(pindah);

        }
    }


}
