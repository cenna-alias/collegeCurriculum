package com.example.employeesalary;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText etName, etDesignation, etBasicPay;
    Button btnCalculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etName = findViewById(R.id.etName);
        etDesignation = findViewById(R.id.etDesignation);
        etBasicPay = findViewById(R.id.etBasicPay);
        btnCalculate = findViewById(R.id.btnCalculate);

        btnCalculate.setOnClickListener(v -> {

            String name = etName.getText().toString().trim();
            String designation = etDesignation.getText().toString().trim();
            String basicPayText = etBasicPay.getText().toString().trim();

            // Validation
            if (name.isEmpty() || designation.isEmpty() ||
                    basicPayText.isEmpty()) {

                Toast.makeText(this, "Please fill all fields",
                        Toast.LENGTH_SHORT).show();
                return;
            }

            double basicPay = Double.parseDouble(basicPayText);

            Intent intent = new Intent(
                    MainActivity.this,
                    SalaryActivity.class);

            intent.putExtra("name", name);
            intent.putExtra("designation", designation);
            intent.putExtra("basicPay", basicPay);

            startActivity(intent);
        });
    }
}