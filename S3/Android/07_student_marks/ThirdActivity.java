package com.example.studentmarks;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ThirdActivity extends AppCompatActivity {

    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        tvResult = findViewById(R.id.tvResult);

        String name = getIntent().getStringExtra("name");
        float percentage = getIntent().getFloatExtra("percentage", 0);

        if (percentage >= 50) {
            tvResult.setText(
                    "Student Name: " + name +
                            "\nPercentage: " + percentage + "%" +
                            "\nResult: PASS"
            );
        } else {
            tvResult.setText(
                    "Student Name: " + name +
                            "\nPercentage: " + percentage + "%" +
                            "\nResult: FAIL"
            );
        }
    }
}
