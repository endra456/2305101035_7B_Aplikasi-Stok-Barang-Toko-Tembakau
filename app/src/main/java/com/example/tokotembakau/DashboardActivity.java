package com.example.tokotembakau;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class DashboardActivity extends AppCompatActivity {

    Button btnDataBarang;
    Button btnStokMasuk;
    Button btnStokKeluar;
    Button btnLaporan;
    Button btnLogout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        // Menghubungkan tombol dengan ID di XML
        btnDataBarang = findViewById(R.id.btnDataBarang);
        btnStokMasuk = findViewById(R.id.btnStokMasuk);
        btnStokKeluar = findViewById(R.id.btnStokKeluar);
        btnLaporan = findViewById(R.id.btnLaporan);
        btnLogout = findViewById(R.id.btnLogout);

        // Tombol Data Barang
        btnDataBarang.setOnClickListener(v -> {
            Intent intent = new Intent(
                    DashboardActivity.this,
                    DataBarangActivity.class
            );
            startActivity(intent);
        });

        // Tombol Stok Masuk
        btnStokMasuk.setOnClickListener(v -> {
            Toast.makeText(this,
                    "Halaman Stok Masuk",
                    Toast.LENGTH_SHORT).show();
        });

        // Tombol Stok Keluar
        btnStokKeluar.setOnClickListener(v -> {
            Toast.makeText(this,
                    "Halaman Stok Keluar",
                    Toast.LENGTH_SHORT).show();
        });

        // Tombol Laporan
        btnLaporan.setOnClickListener(v -> {
            Toast.makeText(this,
                    "Halaman Laporan",
                    Toast.LENGTH_SHORT).show();
        });

        // Tombol Logout
        btnLogout.setOnClickListener(v -> {
            Intent intent = new Intent(
                    DashboardActivity.this,
                    LoginActivity.class
            );

            intent.setFlags(
                    Intent.FLAG_ACTIVITY_NEW_TASK |
                            Intent.FLAG_ACTIVITY_CLEAR_TASK
            );

            startActivity(intent);
            finish();
        });
    }
}
