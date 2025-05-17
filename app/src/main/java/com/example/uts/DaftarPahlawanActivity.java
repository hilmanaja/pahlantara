package com.example.uts;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;

public class DaftarPahlawanActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_pahlawan);

        Button detailSoedirmanButton = findViewById(R.id.detailSoedirmanButton);
        detailSoedirmanButton.setOnClickListener(view -> {
            Intent intent = new Intent(DaftarPahlawanActivity.this, DetailSoedirmanActivity.class);
            startActivity(intent);
        });

        Button detailHattaButton = findViewById(R.id.detailHattaButton);
        detailHattaButton.setOnClickListener(view -> {
            Intent intent = new Intent(DaftarPahlawanActivity.this, DetailHattaActivity.class);
            startActivity(intent);
        });

        Button detailPattimuraButton = findViewById(R.id.detailPattimuraButton);
        detailPattimuraButton.setOnClickListener(view -> {
            Intent intent = new Intent(DaftarPahlawanActivity.this, DetailPattimuraActivity.class);
            startActivity(intent);
        });

        // Tambahkan logika untuk tombol kembali di DaftarPahlawanActivity
        Button kembaliButton = findViewById(R.id.kembaliButton);
        kembaliButton.setOnClickListener(view -> {
            finish(); // Kembali ke MainActivity
        });
    }
}