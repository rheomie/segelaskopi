package iak.segelaskopi;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class RatioActivity extends AppCompatActivity {
    Intent i;
    EditText editKopi, editAir;
    double hitungKopi, hitungAir, bobotKopi = 1, bobotAir;
    TextView ket;
    String keterangan;
    AlertDialog alertDialog;

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
        bobotAir = i.getDoubleExtra("rasioAir", 0);
        ket.setText(Html.fromHtml("" + i.getStringExtra("keterangan")));
    }

    public void tombolHitungRasio(View view) {
        try {
            hitungKopi = Double.parseDouble(editKopi.getText().toString());
            hitungAir = hitungKopi * bobotAir;
            editAir.setText(String.format("%.1f", hitungAir));
        } catch (Exception ex) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Harap isi berat Kopi.\nBerat Kopi dihitung dalam Gram");
            builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    alertDialog.dismiss();
                }
            });
            builder.setCancelable(false);
            alertDialog = builder.create();
            alertDialog.show();
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }
}
