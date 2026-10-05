package com.example.bmicalculator;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText heightInput, weightInput;
    Button calculateButton;
    TextView resultText;

    @SuppressLint({"SetTextI18n", "DefaultLocale"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        heightInput = findViewById(R.id.heightInput);
        weightInput = findViewById(R.id.weightInput);
        calculateButton = findViewById(R.id.calculateButton);
        resultText = findViewById(R.id.resultText);

        calculateButton.setOnClickListener(v -> {

            String heightText = heightInput.getText().toString();
            String weightText = weightInput.getText().toString();

            if (heightText.isEmpty() || weightText.isEmpty()) {
                resultText.setText("Please enter height and weight");
                return;
            }

            double height = Double.parseDouble(heightText);
            double weight = Double.parseDouble(weightText);

            if (height <= 0 || weight <= 0) {
                resultText.setText("Enter valid values");
                return;
            }

            double bmi = weight / (height * height);

            String category;

            if (bmi < 18.5) {
                category = "Underweight";
            } else if (bmi < 25) {
                category = "Normal";
            } else if (bmi < 30) {
                category = "Overweight";
            } else {
                category = "Obese";
            }

        });
    }
}