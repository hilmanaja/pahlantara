package com.example.uts;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button; // Import Button

public class DetailPattimuraActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_patimura);

        // Tambahkan logika untuk tombol kembali
        Button kembaliButton = findViewById(R.id.kembaliButton);
        kembaliButton.setOnClickListener(view -> {
            finish(); // Kembali ke activity sebelumnya
        });
    }
}