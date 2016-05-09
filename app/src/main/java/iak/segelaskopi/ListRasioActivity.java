package iak.segelaskopi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListRasioActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    Intent i;
    ListView listView;
    String[] daftarRasio = {"Rasio Umum", "The Golden Ratio", "Death Wish Coffee Brewing Ratio", "Blackbearcoffee Standard Brewing Ratio", "SCAA Standard", "SCAE Standard"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_rasio);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Daftar Standar Rasio");
        listView = (ListView) findViewById(R.id.listViewRasio);

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, daftarRasio);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        switch (position) {
            case 0:
                i = new Intent(this, GramActivity.class);
                i.putExtra("judul","Rasio Umum");
                startActivity(i);
                break;
            case 1:
                i = new Intent(this, RatioActivity.class);
                i.putExtra("judul","Golden Ratio");
                i.putExtra("rasioAir",17.42);//golden ratio
                i.putExtra("keterangan","");
                startActivity(i);
                break;
            case 2:
                i = new Intent(this, RatioActivity.class);
                i.putExtra("judul","Death Wish Coffee Ratio");
                i.putExtra("rasioAir",4.864864864864864864864864864);//Death Wish Coffee Brewing Ratio
                i.putExtra("keterangan","");
                startActivity(i);
                break;
            case 3:
                i = new Intent(this, RatioActivity.class);
                i.putExtra("judul","Black Bear Coffee Standard Ratio");
                i.putExtra("rasioAir",16.6945);//Blackbearcoffee Standard Brewing Ratio
                i.putExtra("keterangan","");
                startActivity(i);
                break;
            case 4:
                i = new Intent(this, RatioActivity.class);
                i.putExtra("judul","SCAA Standard Ratio");
                i.putExtra("rasioAir",18.18181818181818181818);//SCAA
                i.putExtra("keterangan","");
                startActivity(i);
                break;
            case 5:
                i = new Intent(this, RatioActivity.class);
                i.putExtra("judul","SCAE Standard Ratio");
                i.putExtra("rasioAir",16.6666666666666666666667);//SCAE
                i.putExtra("keterangan","");
                startActivity(i);
                break;
            default:break;
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()== android.R.id.home){
            onBackPressed();
        }
        return super.onOptionsItemSelected(item);

    }
}
