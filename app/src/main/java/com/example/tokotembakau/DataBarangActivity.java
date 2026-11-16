package com.example.tokotembakau;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class DataBarangActivity extends AppCompatActivity {

    LinearLayout containerDataBarang;
    Button btnTambahBarang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_barang);

        containerDataBarang = findViewById(R.id.containerDataBarang);
        btnTambahBarang = findViewById(R.id.btnTambahBarang);

        tampilkanDataBarang();

        btnTambahBarang.setOnClickListener(v -> {
            Toast.makeText(this,
                    "Fitur Tambah Barang akan dibuat pada langkah 5",
                    Toast.LENGTH_SHORT).show();
        });
    }

    private void tampilkanDataBarang() {
        tambahItem("Tembakau Jawa", "20", "Kg");
        tambahItem("Tembakau Madura", "15", "Kg");
        tambahItem("Gabes", "50", "Bungkus");
        tambahItem("Kertas", "100", "Bungkus");
    }

    private void tambahItem(String nama, String stok, String satuan) {

        LinearLayout item = new LinearLayout(this);
        item.setOrientation(LinearLayout.VERTICAL);
        item.setPadding(18, 15, 18, 15);

        LinearLayout.LayoutParams params =
                new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT,
                        LinearLayout.LayoutParams.WRAP_CONTENT);

        params.setMargins(0, 0, 0, 12);
        item.setLayoutParams(params);
        item.setBackgroundColor(0xFFFFFFFF);

        TextView tvNama = new TextView(this);
        tvNama.setText(nama);
        tvNama.setTextSize(17);
        tvNama.setTextColor(0xFF5D3825);
        tvNama.setTypeface(null, 1);

        TextView tvStok = new TextView(this);
        tvStok.setText("Stok: " + stok + " " + satuan);
        tvStok.setTextSize(14);
        tvStok.setTextColor(0xFF795139);

        item.addView(tvNama);
        item.addView(tvStok);

        containerDataBarang.addView(item);
    }
}
