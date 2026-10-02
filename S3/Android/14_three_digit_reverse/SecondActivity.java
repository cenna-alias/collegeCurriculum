package com.example.threedigitnumber;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    TextView tvReverse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_second);

        tvReverse = findViewById(R.id.tvReverse);

        int reverse = getIntent().getIntExtra("reverse", 0);

        tvReverse.setText("Reverse of the Number: " + reverse);
    }
}