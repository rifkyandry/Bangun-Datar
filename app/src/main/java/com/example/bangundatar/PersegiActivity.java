package com.example.bangundatar;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class PersegiActivity extends AppCompatActivity {

    private EditText editTextSisiPersegi;
    private EditText editTextTinggiPrismaPersegi;
    private TextView textResultPersegi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persegi);

        editTextSisiPersegi = findViewById(R.id.editTextSisiPersegi);
        editTextTinggiPrismaPersegi = findViewById(R.id.editTextTinggiPrismaPersegi);
        textResultPersegi = findViewById(R.id.textResultPersegi);

        Button buttonHitungLuasPersegi = findViewById(R.id.buttonHitungLuasPersegi);
        Button buttonHitungKelilingPersegi = findViewById(R.id.buttonHitungKelilingPersegi);
        Button buttonHitungVolumePersegi = findViewById(R.id.buttonHitungVolumePersegi);

        buttonHitungLuasPersegi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungLuasPersegi();
            }
        });

        buttonHitungKelilingPersegi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungKelilingPersegi();
            }
        });

        buttonHitungVolumePersegi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungVolumePersegi();
            }
        });
    }

    private void hitungLuasPersegi() {
        String sisiInput = editTextSisiPersegi.getText().toString();

        if (!sisiInput.isEmpty()) {
            double sisi = Double.parseDouble(sisiInput);
            double luas = sisi * sisi; // Menghitung luas persegi
            textResultPersegi.setText(String.format("Luas: %.2f", luas));
        } else {
            textResultPersegi.setText("Hasil: Masukkan sisi!");
        }
    }

    private void hitungKelilingPersegi() {
        String sisiInput = editTextSisiPersegi.getText().toString();

        if (!sisiInput.isEmpty()) {
            double sisi = Double.parseDouble(sisiInput);
            double keliling = 4 * sisi; // Menghitung keliling persegi
            textResultPersegi.append(String.format(", Keliling: %.2f", keliling));
        } else {
            textResultPersegi.append(" | Masukkan sisi!");
        }
    }

    private void hitungVolumePersegi() {
        String sisiInput = editTextSisiPersegi.getText().toString();
        String tinggiPrismaInput = editTextTinggiPrismaPersegi.getText().toString();

        if (!sisiInput.isEmpty() && !tinggiPrismaInput.isEmpty()) {
            double sisi = Double.parseDouble(sisiInput);
            double tinggiPrisma = Double.parseDouble(tinggiPrismaInput);
            double luas = sisi * sisi; // Menghitung luas alas
            double volume = luas * tinggiPrisma; // Menghitung volume prisma persegi
            textResultPersegi.append(String.format(", Volume: %.2f", volume));
        } else {
            textResultPersegi.append(" | Masukkan sisi dan tinggi prisma!");
        }
    }
}
