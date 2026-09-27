package com.example.validation;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class WelcomeActivity extends AppCompatActivity {

    TextView textWelcome;
    TextView textName;
    TextView textEmail;
    TextView textPhone;
    TextView textGender;
    TextView textDateOfBirth;
    TextView textAddress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_welcome);

        textWelcome = findViewById(R.id.textWelcome);
        textName = findViewById(R.id.textName);
        textEmail = findViewById(R.id.textEmail);
        textPhone = findViewById(R.id.textPhone);
        textGender = findViewById(R.id.textGender);
        textDateOfBirth = findViewById(R.id.textDateOfBirth);
        textAddress = findViewById(R.id.textAddress);

        // Get registration details
        String name = getIntent().getStringExtra("name");
        String email = getIntent().getStringExtra("email");
        String phone = getIntent().getStringExtra("phone");
        String gender = getIntent().getStringExtra("gender");
        String dateOfBirth = getIntent().getStringExtra("dateOfBirth");
        String address = getIntent().getStringExtra("address");

        // Display welcome message
        textWelcome.setText("Welcome, " + name + "!");

        // Display registered details
        textName.setText("Name: " + name);
        textEmail.setText("Email: " + email);
        textPhone.setText("Phone: " + phone);
        textGender.setText("Gender: " + gender);
        textDateOfBirth.setText("Date of Birth: " + dateOfBirth);
        textAddress.setText("Address: " + address);
    }
}