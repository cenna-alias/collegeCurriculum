package com.example.studentmarks;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText etName, etMark1, etMark2, etMark3, etMark4;
    Button btnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etName = findViewById(R.id.etName);
        etMark1 = findViewById(R.id.etMark1);
        etMark2 = findViewById(R.id.etMark2);
        etMark3 = findViewById(R.id.etMark3);
        etMark4 = findViewById(R.id.etMark4);

        btnNext = findViewById(R.id.btnNext);

        btnNext.setOnClickListener(v -> {

            String name = etName.getText().toString();

            int mark1 = Integer.parseInt(etMark1.getText().toString());
            int mark2 = Integer.parseInt(etMark2.getText().toString());
            int mark3 = Integer.parseInt(etMark3.getText().toString());
            int mark4 = Integer.parseInt(etMark4.getText().toString());

            Intent intent = new Intent(MainActivity.this, SecondActivity.class);

            intent.putExtra("name", name);
            intent.putExtra("mark1", mark1);
            intent.putExtra("mark2", mark2);
            intent.putExtra("mark3", mark3);
            intent.putExtra("mark4", mark4);

            startActivity(intent);
        });
    }
}
