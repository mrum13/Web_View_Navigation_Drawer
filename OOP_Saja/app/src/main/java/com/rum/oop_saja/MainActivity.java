package com.rum.oop_saja;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

//    Pembuatan penamaan Widget

    TextView nilai1, nilai2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Deklerasi Widget Dijava

        nilai1 = findViewById(R.id.ed1);
        nilai2 = findViewById(R.id.ed2);
        TextView kirim = findViewById(R.id.bt1);

//        Proses Kirim

        kirim.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bt1 :
                    String nilaiKirim1 = nilai1.getText().toString().trim();
                    String nilaiKirim2 = nilai2.getText().toString().trim();
                    boolean isBoolean = true;
                    if (TextUtils.isEmpty(nilaiKirim1)){
                        isBoolean = false;
                        nilai1.setError("Form Kosong");
                    }

                    if (TextUtils.isEmpty(nilaiKirim2)){
                        isBoolean = false;
                        nilai1.setError("Form Kosong");
                    }
                    if (isBoolean == true){
                        JavaNilai javaNilai = new JavaNilai();
                        String terima= javaNilai.menerima(nilaiKirim1, nilaiKirim2);
                        PojoHitung pojoHitung = new PojoHitung();
                        Toast.makeText(getApplicationContext(),terima,Toast.LENGTH_LONG).show();


                    }
                break;
        }
    }
}
