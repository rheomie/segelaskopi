package iak.segelaskopi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.MenuItem;
import android.widget.TextView;

public class DetailInfoActivity extends AppCompatActivity {
    Intent i;
    TextView judulA,ketA,judulB,ketB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_info);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

//        judulA = (TextView) findViewById(R.id.judulDetail);
        judulB = (TextView) findViewById(R.id.judulDetailBawah);
        ketA = (TextView) findViewById(R.id.keteranganDetail);
        ketB = (TextView) findViewById(R.id.keteranganDetailBawah);

        i = getIntent();
        getSupportActionBar().setTitle(i.getStringExtra("judAtas"));
//        judulA.setText(""+i.getStringExtra("judAtas"));
        judulB.setText(""+i.getStringExtra("judBawah"));
        ketA.setText(Html.fromHtml(""+i.getStringExtra("ketAtas")));
        ketB.setText(Html.fromHtml(""+i.getStringExtra("ketBawah")));



    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()== android.R.id.home){
            onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }
}
