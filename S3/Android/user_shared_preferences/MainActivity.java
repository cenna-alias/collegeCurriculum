package com.example.usersharedpreferences;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Patterns;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText editTextName, editTextEmail, editTextPhone, editTextPassword;
    Button registerButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextName = findViewById(R.id.editTextName);
        editTextEmail = findViewById(R.id.editTextEmail);
        editTextPhone = findViewById(R.id.editTextPhone);
        editTextPassword = findViewById(R.id.editTextPassword);

        registerButton = findViewById(R.id.registerButton);

        registerButton.setOnClickListener(v -> {

            String name = editTextName.getText().toString().trim();
            String email = editTextEmail.getText().toString().trim();
            String phone = editTextPhone.getText().toString().trim();
            String password = editTextPassword.getText().toString().trim();

            if (name.isEmpty()) {
                editTextName.setError("Enter name");
                return;
            }

            if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                editTextEmail.setError("Enter valid email");
                return;
            }

            if (phone.length() != 10) {
                editTextPhone.setError("Enter 10 digit phone number");
                return;
            }

            if (password.length() < 6) {
                editTextPassword.setError("Minimum 6 characters");
                return;
            }

            SharedPreferences sharedPreferences =
                    getSharedPreferences("UserPrefs", MODE_PRIVATE);

            SharedPreferences.Editor editor =
                    sharedPreferences.edit();

            editor.putString("name", name);
            editor.putString("email", email);
            editor.putString("phone", phone);
            editor.putString("password", password);
            editor.putBoolean("isRegistered", true);

            editor.apply();

            Toast.makeText(
                    MainActivity.this,
                    "Registration successful",
                    Toast.LENGTH_SHORT
            ).show();
        });
    }
}