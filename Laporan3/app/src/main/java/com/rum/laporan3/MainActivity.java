package com.rum.laporan3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    RadioGroup rg;
    RadioButton rb;

    private String KEY2 = "jk";
    private Boolean KEY3 = true;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void kesebelah(View view) {
        Integer angka1, angka2, angka3,angka4;
        String et1,et2,banding = null;
        Boolean akhir = null;

        rg = (RadioGroup) findViewById(R.id.radio_all);
        EditText isi1 = (EditText) findViewById(R.id.et_nim1);
        EditText isi2 = (EditText) findViewById(R.id.et_nim2);
        TextView hsl = (TextView) findViewById(R.id.tv_hasil);
        TextView hsl2 = (TextView) findViewById(R.id.tv_hasil2);
        TextView hsl3 = (TextView) findViewById(R.id.tv_hasil3);

        et1 = isi1.getText().toString();
        et2 = isi2.getText().toString();

        angka1 = Integer.parseInt(isi1.getText().toString());
        angka2 = Integer.parseInt(isi2.getText().toString());
        angka3 = angka1+angka2;
        angka4 = angka3%2;

        if (angka4==0){
            banding = "Perempuan";
        }
        else if (angka4==1){
            banding = "Laki-laki";
        }
        
        int selectedID = rg.getCheckedRadioButtonId();
        rb = (RadioButton) findViewById(selectedID);
        String hasil = rb.getText().toString();

        
        if (hasil.equals(banding)){
            akhir = true;
        }
        else if (!hasil.equals(banding)){
            akhir = false;
        }

        
        Intent a = new Intent(getApplicationContext(), Main2Activity.class);
        a.putExtra("angka3", angka3);
        a.putExtra(KEY2,hasil);
        a.putExtra("true",akhir);
        startActivity(a);

        hsl.setText(angka3.toString());
        hsl2.setText(hasil);
        hsl3.setText(akhir.toString());
    }
}
