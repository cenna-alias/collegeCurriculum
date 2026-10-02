package com.example.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    TextView tvExpression, tvDisplay;

    double firstNumber = 0;
    String operator = "";
    boolean newNumber = true;
    boolean resultShown = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvExpression = findViewById(R.id.tvExpression);
        tvDisplay = findViewById(R.id.tvDisplay);

        // Number buttons
        int[] numberButtons = {
                R.id.btn0, R.id.btn1, R.id.btn2,
                R.id.btn3, R.id.btn4, R.id.btn5,
                R.id.btn6, R.id.btn7, R.id.btn8,
                R.id.btn9
        };

        for (int id : numberButtons) {
            findViewById(id).setOnClickListener(this::numberClicked);
        }

        // Operators
        findViewById(R.id.btnAdd).setOnClickListener(v -> operatorClicked("+"));
        findViewById(R.id.btnSubtract).setOnClickListener(v -> operatorClicked("-"));
        findViewById(R.id.btnMultiply).setOnClickListener(v -> operatorClicked("×"));
        findViewById(R.id.btnDivide).setOnClickListener(v -> operatorClicked("÷"));

        // Equal
        findViewById(R.id.btnEqual).setOnClickListener(v -> equalClicked());

        // Decimal
        findViewById(R.id.btnDot).setOnClickListener(v -> decimalClicked());

        // AC
        findViewById(R.id.btnAC).setOnClickListener(v -> clear());

        // +/-
        findViewById(R.id.btnSign).setOnClickListener(v -> signClicked());

        // %
        findViewById(R.id.btnPercent).setOnClickListener(v -> percentClicked());
    }

    // Number button
    void numberClicked(View view) {

        Button button = (Button) view;
        String number = button.getText().toString();

        if (newNumber || resultShown) {

            tvDisplay.setText(number);

            if (resultShown) {
                tvExpression.setText("");
                firstNumber = 0;
                operator = "";
                resultShown = false;
            }

            newNumber = false;

        } else {

            if (tvDisplay.getText().toString().equals("0")) {
                tvDisplay.setText(number);
            } else {
                tvDisplay.append(number);
            }
        }
    }

    // Operator button
    void operatorClicked(String op) {

        double currentNumber =
                Double.parseDouble(tvDisplay.getText().toString());

        if (!operator.isEmpty() && !newNumber) {
            calculate();
            currentNumber =
                    Double.parseDouble(tvDisplay.getText().toString());
        }

        firstNumber = currentNumber;
        operator = op;
        newNumber = true;
        resultShown = false;

        // SHOW OPERATOR ON SCREEN
        tvExpression.setText(
                formatNumber(firstNumber) + " " + operator
        );
    }

    // Equal button
    void equalClicked() {

        if (operator.isEmpty()) {
            return;
        }

        double secondNumber =
                Double.parseDouble(tvDisplay.getText().toString());

        String expression =
                formatNumber(firstNumber)
                        + " " + operator + " "
                        + formatNumber(secondNumber);

        double result = calculateResult(firstNumber, secondNumber);

        if (Double.isNaN(result)) {
            tvExpression.setText(expression);
            tvDisplay.setText("Error");
            operator = "";
            newNumber = true;
            resultShown = true;
            return;
        }

        tvExpression.setText(expression);
        tvDisplay.setText(formatNumber(result));

        firstNumber = result;
        operator = "";
        newNumber = true;
        resultShown = true;
    }

    // Perform calculation
    double calculateResult(double number1, double number2) {

        if (operator.equals("+")) {
            return number1 + number2;
        }

        if (operator.equals("-")) {
            return number1 - number2;
        }

        if (operator.equals("×")) {
            return number1 * number2;
        }

        if (operator.equals("÷")) {

            if (number2 == 0) {
                return Double.NaN;
            }

            return number1 / number2;
        }

        return number2;
    }

    // Used for consecutive operations
    void calculate() {

        double secondNumber =
                Double.parseDouble(tvDisplay.getText().toString());

        double result = calculateResult(firstNumber, secondNumber);

        if (Double.isNaN(result)) {
            tvDisplay.setText("Error");
            operator = "";
            newNumber = true;
            return;
        }

        tvDisplay.setText(formatNumber(result));
        firstNumber = result;
    }

    // Decimal button
    void decimalClicked() {

        if (newNumber || resultShown) {

            tvDisplay.setText("0.");
            newNumber = false;
            resultShown = false;

        } else if (!tvDisplay.getText().toString().contains(".")) {

            tvDisplay.append(".");
        }
    }

    // +/-
    void signClicked() {

        if (tvDisplay.getText().toString().equals("0")) {
            return;
        }

        double number =
                Double.parseDouble(tvDisplay.getText().toString());

        number = -number;

        tvDisplay.setText(formatNumber(number));
    }

    // Percentage
    void percentClicked() {

        double number =
                Double.parseDouble(tvDisplay.getText().toString());

        number = number / 100;

        tvDisplay.setText(formatNumber(number));
    }

    // Clear
    void clear() {

        tvDisplay.setText("0");
        tvExpression.setText("");

        firstNumber = 0;
        operator = "";
        newNumber = true;
        resultShown = false;
    }

    // Avoid showing 5.0 instead of 5
    String formatNumber(double number) {

        if (number == (long) number) {
            return String.valueOf((long) number);
        }

        return String.valueOf(number);
    }
}