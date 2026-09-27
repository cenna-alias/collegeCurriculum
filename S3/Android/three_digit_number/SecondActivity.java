package com.example.threedigitnumber;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    TextView tvSum, tvReverse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_second);

        tvSum = findViewById(R.id.tvSum);
        tvReverse = findViewById(R.id.tvReverse);

        int sum = getIntent().getIntExtra("sum", 0);
        int reverse = getIntent().getIntExtra("reverse", 0);

        tvSum.setText("Sum of Digits: " + sum);
        tvReverse.setText("Reverse of the Number: " + reverse);
    }
}