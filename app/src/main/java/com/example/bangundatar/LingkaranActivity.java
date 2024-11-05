package com.example.bangundatar;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class LingkaranActivity extends AppCompatActivity {

    private EditText editTextJariJari;
    private EditText editTextTinggiSilinder;
    private TextView textResultLingkaran;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lingkaran);

        editTextJariJari = findViewById(R.id.editTextJariJari);
        editTextTinggiSilinder = findViewById(R.id.editTextTinggiSilinder);
        textResultLingkaran = findViewById(R.id.textResultLingkaran);

        Button buttonHitungLuasLingkaran = findViewById(R.id.buttonHitungLuasLingkaran);
        Button buttonHitungKelilingLingkaran = findViewById(R.id.buttonHitungKelilingLingkaran);
        Button buttonHitungVolumeLingkaran = findViewById(R.id.buttonHitungVolumeLingkaran);

        buttonHitungLuasLingkaran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungLuasLingkaran();
            }
        });

        buttonHitungKelilingLingkaran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungKelilingLingkaran();
            }
        });

        buttonHitungVolumeLingkaran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungVolumeLingkaran();
            }
        });
    }

    private void hitungLuasLingkaran() {
        String jariJariInput = editTextJariJari.getText().toString();

        if (!jariJariInput.isEmpty()) {
            double jariJari = Double.parseDouble(jariJariInput);
            double luas = Math.PI * jariJari * jariJari; // Menghitung luas lingkaran
            textResultLingkaran.setText(String.format("Luas: %.2f", luas));
        } else {
            textResultLingkaran.setText("Hasil: Masukkan jari-jari!");
        }
    }

    private void hitungKelilingLingkaran() {
        String jariJariInput = editTextJariJari.getText().toString();

        if (!jariJariInput.isEmpty()) {
            double jariJari = Double.parseDouble(jariJariInput);
            double keliling = 2 * Math.PI * jariJari; // Menghitung keliling lingkaran
            textResultLingkaran.append(String.format(", Keliling: %.2f", keliling));
        } else {
            textResultLingkaran.append(" | Masukkan jari-jari!");
        }
    }

    private void hitungVolumeLingkaran() {
        String jariJariInput = editTextJariJari.getText().toString();
        String tinggiSilinderInput = editTextTinggiSilinder.getText().toString();

        if (!jariJariInput.isEmpty() && !tinggiSilinderInput.isEmpty()) {
            double jariJari = Double.parseDouble(jariJariInput);
            double tinggiSilinder = Double.parseDouble(tinggiSilinderInput);
            double luas = Math.PI * jariJari * jariJari; // Menghitung luas alas
            double volume = luas * tinggiSilinder; // Menghitung volume silinder
            textResultLingkaran.append(String.format(", Volume: %.2f", volume));
        } else {
            textResultLingkaran.append(" | Masukkan jari-jari dan tinggi silinder!");
        }
    }
}
