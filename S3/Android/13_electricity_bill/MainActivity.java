package com.example.electricitybill;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    EditText etName, etNumber, etUnits;
    Button btnCalculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);


        etName = findViewById(R.id.etName);
        etNumber = findViewById(R.id.etNumber);
        etUnits = findViewById(R.id.etUnits);
        btnCalculate = findViewById(R.id.btnCalculate);

        btnCalculate.setOnClickListener(view -> {

            String name = etName.getText().toString();
            String number = etNumber.getText().toString();
            String units = etUnits.getText().toString();

            if (name.isEmpty() || number.isEmpty() || units.isEmpty()) {

                Toast.makeText(this, "Please enter all fields", Toast.LENGTH_SHORT).show();
                return;
            }
             Intent intent = new Intent(MainActivity.this, SecondActivity.class);

            intent.putExtra("name", name);
            intent.putExtra("number", number);
            intent.putExtra("units", Integer.parseInt(units));

            startActivity(intent);

        });
    }
}