package com.example.threedigitnumber;

import android.os.Bundle;
import android.content.Intent;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText etNumber;
    Button btnCalculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

       etNumber = findViewById(R.id.etNumber);
       btnCalculate = findViewById(R.id.btnCalculate);

       btnCalculate.setOnClickListener(view -> {

           String numberText = etNumber.getText().toString();

           if (numberText.isEmpty()) {

               Toast.makeText(this, "Please enter a number", Toast.LENGTH_SHORT).show();
               return;
           }
           int number = Integer.parseInt(numberText);
           if (number < 100 || number > 999) {
               Toast.makeText(this, "Please enter a three digit number", Toast.LENGTH_SHORT).show();
               return;
           }

           int digit1 = number / 100;
           int digit2 = (number / 10) % 10;
           int digit3 = number % 10;

           int sum = digit1 + digit2 + digit3;
           int reverse = digit3 * 100 + digit2 * 10 + digit1;
           Intent intent = new Intent(MainActivity.this, SecondActivity.class);

           intent.putExtra("sum", sum);
           intent.putExtra("reverse", reverse);

           startActivity(intent);
       });
    }
}