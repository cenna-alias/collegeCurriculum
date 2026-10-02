package com.example.validation;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText editTextName, editTextEmail, editTextPassword,
            editTextConfirmPassword, editTextPhone,
            editTextDOB, editTextAddress;

    RadioButton radioButton1, radioButton2;
    CheckBox checkBoxTerms;
    Button registerButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Connect XML with Java

        editTextName = findViewById(R.id.editTextName);
        editTextEmail = findViewById(R.id.editTextEmail);
        editTextPassword = findViewById(R.id.editTextPassword);
        editTextConfirmPassword = findViewById(R.id.editTextConfirmPassword);
        editTextPhone = findViewById(R.id.editTextPhone);
        editTextDOB = findViewById(R.id.editTextDOB);
        editTextAddress = findViewById(R.id.editTextAddress);

        radioButton1 = findViewById(R.id.radioButton1);
        radioButton2 = findViewById(R.id.radioButton2);

        checkBoxTerms = findViewById(R.id.checkBoxTerms);
        registerButton = findViewById(R.id.registerButton);


        registerButton.setOnClickListener(v -> {

            // Get values

            String name = editTextName.getText().toString().trim();
            String email = editTextEmail.getText().toString().trim();
            String password = editTextPassword.getText().toString().trim();
            String confirmPassword =
                    editTextConfirmPassword.getText().toString().trim();
            String phone = editTextPhone.getText().toString().trim();
            String dateOfBirth =
                    editTextDOB.getText().toString().trim();
            String address =
                    editTextAddress.getText().toString().trim();


            // NAME

            if (name.isEmpty()) {
                editTextName.setError("Enter name");
                return;
            }


            // EMAIL

            if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                editTextEmail.setError("Enter valid email");
                return;
            }


            // PHONE

            if (phone.length() != 10) {
                editTextPhone.setError("Enter 10 digit phone number");
                return;
            }


            // PASSWORD

            if (password.length() < 6) {
                editTextPassword.setError("Minimum 6 characters");
                return;
            }


            // CONFIRM PASSWORD

            if (!password.equals(confirmPassword)) {
                editTextConfirmPassword.setError("Passwords do not match");
                return;
            }


            // GENDER

            if (!radioButton1.isChecked() &&
                    !radioButton2.isChecked()) {

                Toast.makeText(this, "Select gender",
                        Toast.LENGTH_SHORT).show();
                return;
            }


            // DATE OF BIRTH

            if (dateOfBirth.isEmpty()) {
                editTextDOB.setError("Enter date of birth");
                return;
            }


            // ADDRESS

            if (address.isEmpty()) {
                editTextAddress.setError("Enter address");
                return;
            }


            // TERMS

            if (!checkBoxTerms.isChecked()) {
                Toast.makeText(this, "Accept terms",
                        Toast.LENGTH_SHORT).show();
                return;
            }


            // GET GENDER

            String gender;

            if (radioButton1.isChecked()) {
                gender = "Female";
            } else {
                gender = "Male";
            }


            // SUCCESS MESSAGE

            Toast.makeText(this, "Registration successful",
                    Toast.LENGTH_SHORT).show();


            // OPEN NEXT ACTIVITY

            Intent intent = new Intent(
                    MainActivity.this,
                    WelcomeActivity.class
            );


            // SEND DATA

            intent.putExtra("name", name);
            intent.putExtra("email", email);
            intent.putExtra("phone", phone);
            intent.putExtra("gender", gender);
            intent.putExtra("dateOfBirth", dateOfBirth);
            intent.putExtra("address", address);

            startActivity(intent);
        });
    }
}