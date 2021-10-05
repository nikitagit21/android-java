package com.febri.tugas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.os.Parcelable;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class DetailActivity extends AppCompatActivity {
    TextView tvJudull, tvDeskripsi;
    ImageView gambar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);


        tvJudull = findViewById(R.id.judul);
        String nama = getIntent().getStringExtra("nama");
        tvJudull.setText(nama);

        tvDeskripsi=findViewById(R.id.deskripsi);
        String deskripsi =getIntent().getStringExtra("deskripsi");
        tvDeskripsi.setText(deskripsi);

        gambar=findViewById(R.id.gambar);
        String link_gambar=getIntent().getStringExtra("gambar");
        Glide.with(DetailActivity.this)
                .load(link_gambar)
                .into(gambar);

        getSupportActionBar().setTitle(nama);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        gambar.setClipToOutline(true);
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}
