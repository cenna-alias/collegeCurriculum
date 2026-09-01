package com.example.employeesalary;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SalaryActivity extends AppCompatActivity {

    TextView tvName, tvDesignation, tvBasicPay;
    TextView tvHRA, tvDA, tvNetSalary;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_salary);

        // Connect XML views with Java
        tvName = findViewById(R.id.tvName);
        tvDesignation = findViewById(R.id.tvDesignation);
        tvBasicPay = findViewById(R.id.tvBasicPay);
        tvHRA = findViewById(R.id.tvHRA);
        tvDA = findViewById(R.id.tvDA);
        tvNetSalary = findViewById(R.id.tvNetSalary);

        // Receive data from MainActivity
        String name = getIntent().getStringExtra("name");
        String designation = getIntent().getStringExtra("designation");

        double basicPay = getIntent().getDoubleExtra("basicPay", 0);

        // Calculate HRA and DA
        double hra = basicPay * 0.20;
        double da = basicPay * 0.30;

        // Calculate Net Salary
        double netSalary = basicPay + hra + da;

        // Display details
        tvName.setText("Name: " + name);
        tvDesignation.setText("Designation: " + designation);
        tvBasicPay.setText(String.format("Basic Pay: ₹%.2f", basicPay));
        tvHRA.setText(String.format("HRA (20%%): ₹%.2f", hra));
        tvDA.setText(String.format("DA (30%%): ₹%.2f", da));
        tvNetSalary.setText(String.format("Net Salary: ₹%.2f", netSalary));
    }
}