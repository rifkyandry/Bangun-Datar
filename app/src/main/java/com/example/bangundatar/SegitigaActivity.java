package com.example.bangundatar;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class SegitigaActivity extends AppCompatActivity {

    private EditText editTextSisi;
    private EditText editTextTinggiPrisma;
    private TextView textResultSegitiga;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga);

        editTextSisi = findViewById(R.id.editTextSisi);
        editTextTinggiPrisma = findViewById(R.id.editTextTinggiPrisma);
        textResultSegitiga = findViewById(R.id.textResultSegitiga);

        Button buttonHitungLuasSegitiga = findViewById(R.id.buttonHitungLuasSegitiga);
        Button buttonHitungKelilingSegitiga = findViewById(R.id.buttonHitungKelilingSegitiga);
        Button buttonHitungVolumeSegitiga = findViewById(R.id.buttonHitungVolumeSegitiga);

        buttonHitungLuasSegitiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungLuasSegitiga();
            }
        });

        buttonHitungKelilingSegitiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungKelilingSegitiga();
            }
        });

        buttonHitungVolumeSegitiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungVolumeSegitiga();
            }
        });
    }

    private void hitungLuasSegitiga() {
        String sisiInput = editTextSisi.getText().toString();

        if (!sisiInput.isEmpty()) {
            double sisi = Double.parseDouble(sisiInput);
            double luas = (Math.sqrt(3) / 4) * (sisi * sisi); // Menghitung luas segitiga sama sisi
            textResultSegitiga.setText(String.format("Luas: %.2f", luas));
        } else {
            textResultSegitiga.setText("Hasil: Masukkan sisi!");
        }
    }

    private void hitungKelilingSegitiga() {
        String sisiInput = editTextSisi.getText().toString();

        if (!sisiInput.isEmpty()) {
            double sisi = Double.parseDouble(sisiInput);
            double keliling = 3 * sisi; // Menghitung keliling segitiga sama sisi
            textResultSegitiga.append(String.format(", Keliling: %.2f", keliling));
        } else {
            textResultSegitiga.append(" | Masukkan sisi!");
        }
    }

    private void hitungVolumeSegitiga() {
        String sisiInput = editTextSisi.getText().toString();
        String tinggiPrismaInput = editTextTinggiPrisma.getText().toString();

        if (!sisiInput.isEmpty() && !tinggiPrismaInput.isEmpty()) {
            double sisi = Double.parseDouble(sisiInput);
            double tinggiPrisma = Double.parseDouble(tinggiPrismaInput);
            double luas = (Math.sqrt(3) / 4) * (sisi * sisi); // Menghitung luas alas
            double volume = luas * tinggiPrisma; // Menghitung volume prisma segitiga
            textResultSegitiga.append(String.format(", Volume: %.2f", volume));
        } else {
            textResultSegitiga.append(" | Masukkan sisi dan tinggi prisma!");
        }
    }
}
