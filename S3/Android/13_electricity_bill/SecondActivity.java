package com.example.electricitybill;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    TextView tvName, tvNumber, tvUnits, tvBill;
    Button btnGenerate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tvName = findViewById(R.id.tvName);
        tvNumber = findViewById(R.id.tvNumber);
        tvUnits = findViewById(R.id.tvUnits);
        tvBill = findViewById(R.id.tvBill);
        btnGenerate = findViewById(R.id.btnGenerate);

        // Get data from MainActivity
        Intent intent = getIntent();

        String name = intent.getStringExtra("name");
        String number = intent.getStringExtra("number");
        int units = intent.getIntExtra("units", 0);

        // Calculate bill
        double bill;

        if (units <= 100) {
            bill = units * 2;
        } else if (units <= 200) {
            bill = (100 * 2) + ((units - 100) * 3);
        } else {
            bill = (100 * 2) + (100 * 3) + ((units - 200) * 5);
        }

        // Display details
        tvName.setText("Consumer Name: " + name);
        tvNumber.setText("Consumer Number: " + number);
        tvUnits.setText("Units Consumed: " + units);
        tvBill.setText("Total Bill Amount: ₹" + bill);

        // Go to Third Activity
        btnGenerate.setOnClickListener(view -> {

            Intent nextIntent = new Intent(
                    SecondActivity.this,
                    ThirdActivity.class
            );

            startActivity(nextIntent);
        });
    }
}
