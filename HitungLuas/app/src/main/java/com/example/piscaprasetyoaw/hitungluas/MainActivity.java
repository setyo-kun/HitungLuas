package com.example.piscaprasetyoaw.hitungluas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Toast;

import static android.R.id.edit;

public class MainActivity extends AppCompatActivity {
    private EditText edit_panjang, edit_lebar;
    private Button button_hitung;
    private TextView text_hasil;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("Hitung Luas Persegi Panjang");


        edit_panjang = (EditText) findViewById(R.id.edit_panjang);
        edit_lebar = (EditText) findViewById(R.id.edit_lebar);
        button_hitung = (Button) findViewById(R.id.button_hitung);
        text_hasil = (TextView) findViewById(R.id.text_hasil);

        button_hitung.setOnClickListener(new View.OnClickListener() {
                                             @Override
                                             public void onClick(View view) {
                                             try {
                                                 String panjang = edit_panjang.getText().toString().trim();
                                                 String lebar = edit_lebar.getText().toString().trim();

                                                 if (!TextUtils.isEmpty(panjang) && !TextUtils.isEmpty(lebar)) {
                                                     double p = Double.parseDouble(panjang);
                                                     double l = Double.parseDouble(lebar);
                                                     double luas = p * l;
                                                     text_hasil.setText("Luas : " + luas);

                                                 } else if (edit_panjang.getText().toString().equals("") || edit_panjang.getText().toString().equals(".")) {
                                                     Toast.makeText(MainActivity.this, "Masukkan Angka", Toast.LENGTH_SHORT).show();
                                                 }
                                                 if (edit_lebar.getText().toString().equals("") || edit_lebar.getText().toString().equals(".")) {
                                                     Toast.makeText(MainActivity.this, "Masukkan Angka", Toast.LENGTH_SHORT).show();
                                                 }


                                             }catch(Exception e) {
                                                 Toast.makeText(getApplicationContext(), "Inputan salah", Toast.LENGTH_LONG).show();
                                             }}
            } );
    }
}

