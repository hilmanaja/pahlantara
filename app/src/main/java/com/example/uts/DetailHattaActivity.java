package com.example.uts;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button; // Import Button

public class DetailHattaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_hatta);

        // Tambahkan logika untuk tombol kembali
        Button kembaliButton = findViewById(R.id.kembaliButton);
        kembaliButton.setOnClickListener(view -> {
            finish(); // Kembali ke activity sebelumnya
        });
    }
}