package com.example.bangundatar;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Pastikan ini mengarah ke layout yang benar

        findViewById(R.id.buttonSegitiga).setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, SegitigaActivity.class);
            startActivity(intent);
        });

        findViewById(R.id.buttonPersegi).setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, PersegiActivity.class);
            startActivity(intent);
        });

        findViewById(R.id.buttonLingkaran).setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, LingkaranActivity.class);
            startActivity(intent);
        });
    }
}
