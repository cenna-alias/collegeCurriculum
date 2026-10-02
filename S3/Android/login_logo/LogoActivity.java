package com.example.loginlogo;

import android.app.AlertDialog;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class LogoActivity extends AppCompatActivity {

    ImageView imgLogo1, imgLogo2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logo);

        imgLogo1 = findViewById(R.id.imgLogo1);
        imgLogo2 = findViewById(R.id.imgLogo2);

        // Gandhi logo click
        imgLogo1.setOnClickListener(v -> {

            new AlertDialog.Builder(LogoActivity.this)
                    .setTitle("Mahatma Gandhi")
                    .setMessage(
                            "Full Name: Mohandas Karamchand Gandhi\n\n" +
                                    "Born: 2 October 1869\n\n" +
                                    "Died: 30 January 1948\n\n" +
                                    "Mahatma Gandhi was a prominent leader of the Indian " +
                                    "independence movement. He advocated non-violent resistance " +
                                    "and civil disobedience in the struggle for independence."
                    )
                    .setPositiveButton("OK", null)
                    .show();

        });

        // Nehru logo click
        imgLogo2.setOnClickListener(v -> {

            new AlertDialog.Builder(LogoActivity.this)
                    .setTitle("Jawaharlal Nehru")
                    .setMessage(
                            "Full Name: Jawaharlal Nehru\n\n" +
                                    "Born: 14 November 1889\n\n" +
                                    "Died: 27 May 1964\n\n" +
                                    "Jawaharlal Nehru was a major leader of the Indian " +
                                    "independence movement and became the first Prime Minister " +
                                    "of independent India."
                    )
                    .setPositiveButton("OK", null)
                    .show();

        });
    }
}
