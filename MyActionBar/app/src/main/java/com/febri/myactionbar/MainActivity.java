package com.febri.myactionbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.SearchView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //tambahkan

    @Override
    public boolean onCreateOptionsMenu(Menu menu) { //pertama kali menu dijalankan
        MenuInflater inflater=getMenuInflater(); //membuat variabel dg type menu inflater nama inflatr dengan nilai nya adl getmenuinflater
        inflater.inflate(R.menu.options_menu,menu);//r.mrnu berarti membuka Res dengan sub menu


        SearchManager searchManager=(SearchManager) getSystemService(Context.SEARCH_SERVICE); //agar fungsi search berjalan
        if (searchManager !=null){
            SearchView searchView=(SearchView)(menu.findItem(R.id.search)).getActionView(); //membuat variabel searchview  yg isinya componen dg id seacrh
            searchView.setSearchableInfo(searchManager.getSearchableInfo(getComponentName()));//
            searchView.setQueryHint(getResources().getString(R.string.search_hint));
            searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
                @Override
                public boolean onQueryTextSubmit(String query) {
                    Toast.makeText(MainActivity.this,query,Toast.LENGTH_SHORT);//membuat text yg mncul ketika di ketik
                    return true;
                }

                @Override
                public boolean onQueryTextChange(String newText) {
                    return false;
                }
            });
        }
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.menu1:
                Intent  activity1= new Intent(this,MenuActivity1.class);
                startActivity(activity1);
            case R.id.menu2:
                Intent activity2=new Intent(this,MenuActivity2.class);
                startActivity(activity2);
                return  true;
                default:
                    return  true;
        }
    }
}
