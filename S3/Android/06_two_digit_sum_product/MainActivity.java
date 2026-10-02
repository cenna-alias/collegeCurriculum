package com.example.twodigitnumber;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText number;
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number = findViewById(R.id.number);
        btnSubmit = findViewById(R.id.btnSubmit);

        btnSubmit.setOnClickListener(v -> {

            String num = number.getText().toString();

            if (num.isEmpty()) {
                Toast.makeText(this, "Enter a number", Toast.LENGTH_SHORT).show();
                return;
            }

            int n = Integer.parseInt(num);

            if (n < 10 || n > 99) {
                Toast.makeText(this, "Enter a two-digit number", Toast.LENGTH_SHORT).show();
                return;
            }

            int digit1 = n / 10;
            int digit2 = n % 10;

            int sum = digit1 + digit2;
            int product = digit1 * digit2;

            Intent intent = new Intent(MainActivity.this, ResultActivity.class);

            intent.putExtra("sum", sum);
            intent.putExtra("product", product);

            startActivity(intent);
        });
    }
}