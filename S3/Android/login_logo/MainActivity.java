package com.example.loginlogo;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText etUsername, etPassword;
    Button btnLogin;

    // Sample login credentials
    String correctUsername = "admin";
    String correctPassword = "1234";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etUsername = findViewById(R.id.etUsername);
        etPassword = findViewById(R.id.etPassword);
        btnLogin = findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(v -> {

            String username = etUsername.getText().toString().trim();
            String password = etPassword.getText().toString().trim();

            // Validation 1: Empty username
            if (TextUtils.isEmpty(username)) {
                etUsername.setError("Username is required");
                etUsername.requestFocus();
                return;
            }

            // Validation 2: Empty password
            if (TextUtils.isEmpty(password)) {
                etPassword.setError("Password is required");
                etPassword.requestFocus();
                return;
            }

            // Validation 3: Password length
            if (password.length() < 4) {
                etPassword.setError("Password must contain at least 4 characters");
                etPassword.requestFocus();
                return;
            }

            // Check username and password
            if (username.equals(correctUsername)
                    && password.equals(correctPassword)) {

                Toast.makeText(
                        MainActivity.this,
                        "Login Successful",
                        Toast.LENGTH_SHORT
                ).show();

                // Navigate to second activity
                Intent intent = new Intent(
                        MainActivity.this,
                        LogoActivity.class
                );

                startActivity(intent);

            } else {

                Toast.makeText(
                        MainActivity.this,
                        "Invalid Username or Password",
                        Toast.LENGTH_SHORT
                ).show();
            }
        });
    }
}
