package com.example.calculator;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    TextView display;
    TextView expression;

    double firstNumber = 0;
    String operator = "";
    boolean startNewNumber = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        display = findViewById(R.id.display);
        expression = findViewById(R.id.expression);

        int[] numbers = {
                R.id.b0, R.id.b1, R.id.b2, R.id.b3, R.id.b4,
                R.id.b5, R.id.b6, R.id.b7, R.id.b8, R.id.b9
        };

        for (int id : numbers) {

            Button button = findViewById(id);

            button.setOnClickListener(v -> {

                String number = button.getText().toString();

                if (startNewNumber) {
                    display.setText(number);
                    startNewNumber = false;
                } else {

                    if (display.getText().toString().equals("0")) {
                        display.setText(number);
                    } else {
                        display.append(number);
                    }
                }
            });
        }

        findViewById(R.id.dot).setOnClickListener(v -> {

            if (startNewNumber) {
                display.setText("0.");
                startNewNumber = false;
            } else if (!display.getText().toString().contains(".")) {
                display.append(".");
            }
        });

        findViewById(R.id.add).setOnClickListener(v -> operatorPressed("+"));
        findViewById(R.id.sub).setOnClickListener(v -> operatorPressed("-"));
        findViewById(R.id.mul).setOnClickListener(v -> operatorPressed("×"));
        findViewById(R.id.div).setOnClickListener(v -> operatorPressed("÷"));

        findViewById(R.id.equal).setOnClickListener(v -> calculate());

        findViewById(R.id.clear).setOnClickListener(v -> {

            display.setText("0");
            expression.setText("");

            firstNumber = 0;
            operator = "";
            startNewNumber = false;
        });

        findViewById(R.id.backspace).setOnClickListener(v -> {

            if (startNewNumber) {
                return;
            }

            String value = display.getText().toString();

            if (value.length() > 1) {
                display.setText(value.substring(0, value.length() - 1));
            } else {
                display.setText("0");
            }
        });

        findViewById(R.id.percent).setOnClickListener(v -> {

            double number =
                    Double.parseDouble(display.getText().toString());

            number = number / 100;

            display.setText(format(number));
        });
    }

    void operatorPressed(String op) {

        if (!operator.equals("") && !startNewNumber) {
            calculate();
        }

        firstNumber =
                Double.parseDouble(display.getText().toString());

        operator = op;

        expression.setText(format(firstNumber) + " " + op);

        startNewNumber = true;
    }

    void calculate() {

        if (operator.equals("")) {
            return;
        }

        double secondNumber =
                Double.parseDouble(display.getText().toString());

        double result;

        switch (operator) {

            case "+":
                result = firstNumber + secondNumber;
                break;

            case "-":
                result = firstNumber - secondNumber;
                break;

            case "×":
                result = firstNumber * secondNumber;
                break;

            case "÷":

                if (secondNumber == 0) {
                    display.setText("Error");
                    expression.setText("");
                    operator = "";
                    startNewNumber = true;
                    return;
                }

                result = firstNumber / secondNumber;
                break;

            default:
                return;
        }

        expression.setText(
                format(firstNumber) + " "
                        + operator + " "
                        + format(secondNumber)
        );

        display.setText(format(result));

        firstNumber = result;
        operator = "";
        startNewNumber = true;
    }

    String format(double number) {

        if (number == (long) number) {
            return String.valueOf((long) number);
        }

        return String.valueOf(number);
    }
}
