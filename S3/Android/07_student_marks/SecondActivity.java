package com.example.studentmarks;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    TextView tvTotal, tvPercentage;
    Button btnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tvTotal = findViewById(R.id.tvTotal);
        tvPercentage = findViewById(R.id.tvPercent);
        btnNext = findViewById(R.id.btnNext);

        Intent intent = getIntent();

        String name = intent.getStringExtra("name");

        int mark1 = intent.getIntExtra("mark1", 0);
        int mark2 = intent.getIntExtra("mark2", 0);
        int mark3 = intent.getIntExtra("mark3", 0);
        int mark4 = intent.getIntExtra("mark4", 0);

        int total = mark1 + mark2 + mark3 + mark4;

        // Four subjects, each assumed to be out of 100
        float percentage = (total / 400.0f) * 100;

        tvTotal.setText("Total Mark: " + total);
        tvPercentage.setText("Percentage Mark: " + percentage + "%");

        btnNext.setOnClickListener(v -> {

            Intent nextIntent =
                    new Intent(SecondActivity.this, ThirdActivity.class);

            nextIntent.putExtra("name", name);
            nextIntent.putExtra("percentage", percentage);

            startActivity(nextIntent);
        });
    }
}
