package com.example.loginpage;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText username, password;
    Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = findViewById(R.id.etusername);
        password = findViewById(R.id.etpassword);
        loginButton = findViewById(R.id.btnlogin);

        loginButton.setOnClickListener(v -> {

            String user = username.getText().toString().trim();
            String pwd = password.getText().toString().trim();

            if (user.isEmpty()) {
                username.setError("Username is required");
                username.requestFocus();
                return;
            }

            if (pwd.isEmpty()) {
                password.setError("Password is required");
                password.requestFocus();
                return;
            }

            if (user.equals("cenna") && pwd.equals("pwd")) {

                Toast.makeText(MainActivity.this,
                        "Login Successful!",
                        Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(MainActivity.this,
                        Welcome_Page.class);

                intent.putExtra("username", user);
                startActivity(intent);

            } else {
                Toast.makeText(MainActivity.this,
                        "Invalid Username or Password",
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}