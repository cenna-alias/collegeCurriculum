package com.example.twodigitnumber;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ResultActivity extends AppCompatActivity {

    TextView tvSum, tvProduct;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        tvSum = findViewById(R.id.tvSum);
        tvProduct = findViewById(R.id.tvProduct);

        int sum = getIntent().getIntExtra("sum", 0);
        int product = getIntent().getIntExtra("product", 0);

        tvSum.setText("Sum: " + sum);
        tvProduct.setText("Product: " + product);
    }
}