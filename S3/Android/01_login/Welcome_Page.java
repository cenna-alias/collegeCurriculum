package com.example.loginpage;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Welcome_Page extends AppCompatActivity {

    TextView textWelcome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_page);

        textWelcome = findViewById(R.id.textWelcome);

        String username = getIntent().getStringExtra("username");

        textWelcome.setText(
                "Welcome!\n\n" +
                        "Username: " + username
        );
    }
}