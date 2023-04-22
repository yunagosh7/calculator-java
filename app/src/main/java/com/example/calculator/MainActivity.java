package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.calculator.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }

        });

        binding.btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String expressionText = binding.tvExpression.getText().toString();
                binding.tvExpression.setText(expressionText + "1");
            }
        });

        binding.btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String expressionText = binding.tvExpression.getText().toString();
                binding.tvExpression.setText(expressionText + "2");
            }
        });

        binding.btnThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String expressionText = binding.tvExpression.getText().toString();
                binding.tvExpression.setText(expressionText + "3");
            }
        });

        binding.btnFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String expressionText = binding.tvExpression.getText().toString();
                binding.tvExpression.setText(expressionText + "4");
            }
        });

        binding.btnFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String expressionText = binding.tvExpression.getText().toString();
                binding.tvExpression.setText(expressionText + "5");
            }
        });

        binding.btnSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String expressionText = binding.tvExpression.getText().toString();
                binding.tvExpression.setText(expressionText + "6");
            }
        });

        binding.btnSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String expressionText = binding.tvExpression.getText().toString();
                binding.tvExpression.setText(expressionText + "7");
            }
        });

        binding.btnEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String expressionText = binding.tvExpression.getText().toString();
                binding.tvExpression.setText(expressionText + "8");
            }
        });

        binding.btnNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String expressionText = binding.tvExpression.getText().toString();
                binding.tvExpression.setText(expressionText + "9");
            }
        });

    }
}