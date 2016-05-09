package iak.segelaskopi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListRasioActivity extends AppCompatActivity {
    ListView listView;
    String[] daftarRasio = {"Rasio Umum","The Golden Ratio","Death Wish Coffee Brewing Ratio"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        listView = (ListView) findViewById(R.id.listViewRasio);

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, daftarRasio);
        listView.setAdapter(adapter);
    }
}
