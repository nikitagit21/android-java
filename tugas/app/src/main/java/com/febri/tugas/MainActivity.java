package com.febri.tugas;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private RecyclerView rvwisata;
    private ArrayList<Wisata> list = new ArrayList<>();
    //    private Object Cardwisataadapter;
/*    Button btn_det;*/



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





        /*
        Button btn_det=findViewById(R.id.btn_set_detail);
        btn_det.setOnClickListener(this);*/

        rvwisata = findViewById(R.id.rv_tempat);
        rvwisata.setHasFixedSize(true);

        list.addAll(DataWisata.getListData());
        showRecyclerCardvView();


    }

    private void showRecyclerCardvView() {
        rvwisata.setLayoutManager(new LinearLayoutManager(this));
        Cardwisataadapter cardwisataadapter = new Cardwisataadapter(list);
        rvwisata.setAdapter(cardwisataadapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.bio, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.biodata:
                Intent activity2 = new Intent(this, bioaktivity.class);
                startActivity(activity2);
                return true;
            default:
                return true;
        }
    }
    @Override
    public void onClick(View view) {

    }
}
