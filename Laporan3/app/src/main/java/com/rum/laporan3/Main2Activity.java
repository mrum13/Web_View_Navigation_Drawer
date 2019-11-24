package com.rum.laporan3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Main2Activity extends AppCompatActivity {
    TextView anu_nim;
    TextView anu_tf;
    TextView jk;
    private Integer nim;
    Integer temp;
    String banding2;
    Boolean ak;

    private String KEY2 = "jk";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        anu_nim =(TextView) findViewById(R.id.tv_nim);
        anu_tf =(TextView) findViewById(R.id.tv_tf);
        jk = (TextView) findViewById(R.id.tv_jk);

//        nim = KEY;

        Intent intent = getIntent();
        temp = intent.getIntExtra("angka3",0);
        Integer hasil = temp/2;

        String banding = "asda";
        banding2 = intent.getStringExtra(KEY2);

        ak = intent.getBooleanExtra("true",true);

        anu_nim.setText(temp.toString());
        jk.setText(banding2);
        anu_tf.setText(ak.toString());


    }

    public void kirim(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW);
        String URL = "http://chat.whatsapp.com/8t3nYlWXVaF9MOPGYheVka";
        browserIntent.setData(Uri.parse(URL));
        startActivity(browserIntent);
    }
}
