package iak.segelaskopi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class GramActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    Spinner rasioSpinner;
    EditText editKopi,editAir;
    int bobotKopi = 1,bobotAir;
    double hitungKopi, hitungAir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gram);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        editAir = (EditText) findViewById(R.id.editTextAir);
        editKopi = (EditText) findViewById(R.id.editTextKopi);
        rasioSpinner = (Spinner) findViewById(R.id.spinnerRasio);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.rasioArray, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        rasioSpinner.setAdapter(adapter);
        rasioSpinner.setOnItemSelectedListener(this);

        Intent i = getIntent();
        getSupportActionBar().setTitle(i.getStringExtra("judul"));
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        switch (position){
            case 0 : bobotAir = 10;break;
            case 1 : bobotAir = 11;break;
            case 2 : bobotAir = 12;break;
            case 3 : bobotAir = 13;break;
            case 4 : bobotAir = 14;break;
            case 5 : bobotAir = 15;break;
            default:break;
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    public void tombolHitung(View view) {
        try {
        hitungKopi = Double.parseDouble(editKopi.getText().toString());
        hitungAir = hitungKopi * bobotAir;
        editAir.setText(""+hitungAir);
        }catch (Exception ex){
            Toast.makeText(GramActivity.this, "Harap Masukkan Nilai", Toast.LENGTH_SHORT).show();
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

