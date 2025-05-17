package com.example.uts;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Memastikan layout yang benar digunakan

        // 1. Temukan tombol "Masuk untuk lebih mengenal" menggunakan ID-nya
        Button masukButton = findViewById(R.id.loginButton); // Pastikan ID ini sesuai dengan yang ada di activity_main.xml

        // 2. Buat Intent untuk berpindah ke DaftarPahlawanActivity
        masukButton.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, DaftarPahlawanActivity.class);
            startActivity(intent);
        });
    }
}
