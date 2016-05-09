package iak.segelaskopi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class RatioActivity extends AppCompatActivity {
    Intent i;
    EditText editKopi,editAir;
    double hitungKopi, hitungAir, bobotKopi = 1,bobotAir;
    TextView ket;
    String keterangan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ratio);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        editAir = (EditText) findViewById(R.id.editAir);
        editKopi = (EditText) findViewById(R.id.editKopi);
        ket = (TextView) findViewById(R.id.keteranganRasio);

        i = getIntent();
        getSupportActionBar().setTitle(i.getStringExtra("judul"));
        bobotAir = i.getDoubleExtra("rasioAir",0);
        ket.setText(Html.fromHtml(""+i.getStringExtra("keterangan")));
    }

    public void tombolHitungRasio(View view) {
        try {
        hitungKopi = Double.parseDouble(editKopi.getText().toString());
        hitungAir = hitungKopi * bobotAir;
        editAir.setText(""+hitungAir);
        }catch (Exception ex){
            Toast.makeText(RatioActivity.this,"Harap Masukkan Nilai",Toast.LENGTH_SHORT).show();
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
