package iak.segelaskopi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.text.Html;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailInfoActivity extends AppCompatActivity {
    Intent i;
    int linkGambar;
    TextView ketA,judulB,ketB;
    CardView kotakAtas,kotakBawah;
    ImageView gambarAtas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_info);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        judulB = (TextView) findViewById(R.id.judulDetailBawah);
        ketA = (TextView) findViewById(R.id.keteranganDetail);
        ketB = (TextView) findViewById(R.id.keteranganDetailBawah);

        gambarAtas = (ImageView) findViewById(R.id.gambarAtas);

        kotakAtas = (CardView) findViewById(R.id.kotakDua);
        kotakBawah = (CardView) findViewById(R.id.kotakEmpat);
        i = getIntent();
        kotakAtas.setVisibility(i.getIntExtra("kotakDua",200));
        kotakBawah.setVisibility(i.getIntExtra("kotakEmpat",200));
        getSupportActionBar().setTitle(i.getStringExtra("judAtas"));
        judulB.setText(""+i.getStringExtra("judBawah"));
        ketA.setText(Html.fromHtml(""+i.getStringExtra("ketAtas")));
        ketB.setText(Html.fromHtml(""+i.getStringExtra("ketBawah")));
        linkGambar = i.getIntExtra("gambar",linkGambar);
        gambarAtas.setImageResource(linkGambar);

    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()== android.R.id.home){
            onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }
}
