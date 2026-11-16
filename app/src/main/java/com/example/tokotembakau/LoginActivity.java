package com.example.tokotembakau;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    EditText etUsername, etPassword;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // Inisialisasi komponen
        etUsername = findViewById(R.id.etUsername);
        etPassword = findViewById(R.id.etPassword);
        btnLogin = findViewById(R.id.btnLogin);

        // Tombol Login
        btnLogin.setOnClickListener(v -> {

            String username = etUsername.getText()
                    .toString().trim();

            String password = etPassword.getText()
                    .toString().trim();

            if (username.isEmpty()) {
                etUsername.setError("Username harus diisi");
                etUsername.requestFocus();
                return;
            }

            if (password.isEmpty()) {
                etPassword.setError("Password harus diisi");
                etPassword.requestFocus();
                return;
            }

            // Login sementara untuk pengujian
            if (username.equals("admin")
                    && password.equals("admin123")) {

                Toast.makeText(
                        LoginActivity.this,
                        "Login berhasil!",
                        Toast.LENGTH_SHORT
                ).show();

                Intent intent = new Intent(
                        LoginActivity.this,
                        DashboardActivity.class
                );

                startActivity(intent);
                finish();

            } else {

                Toast.makeText(
                        LoginActivity.this,
                        "Username atau password salah!",
                        Toast.LENGTH_SHORT
                ).show();

            }

        });
    }
}


