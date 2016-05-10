package iak.segelaskopi;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

public class GramActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    Spinner rasioSpinner;
    EditText editKopi, editAir;
    int bobotKopi = 1, bobotAir;
    double hitungKopi, hitungAir;
    AlertDialog alertDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gram);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        editAir = (EditText) findViewById(R.id.editTextAir);
        editKopi = (EditText) findViewById(R.id.editTextKopi);
        rasioSpinner = (Spinner) findViewById(R.id.spinnerRasio);

//        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
//                R.array.rasioArray, android.R.layout.simple_spinner_item);
//        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        ArrayAdapter adapter = ArrayAdapter.createFromResource(this,
                R.array.rasioArray, R.layout.spinner_item);

        adapter.setDropDownViewResource(R.layout.spinner_dropdown_item);
        rasioSpinner.setAdapter(adapter);
        rasioSpinner.setOnItemSelectedListener(this);

        Intent i = getIntent();
        getSupportActionBar().setTitle(i.getStringExtra("judul"));
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        switch (position) {
            case 0:
                bobotAir = 10;
                break;
            case 1:
                bobotAir = 11;
                break;
            case 2:
                bobotAir = 12;
                break;
            case 3:
                bobotAir = 13;
                break;
            case 4:
                bobotAir = 14;
                break;
            case 5:
                bobotAir = 15;
                break;
            default:
                break;
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    public void tombolHitung(View view) {
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

