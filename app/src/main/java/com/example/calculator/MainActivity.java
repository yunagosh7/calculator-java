package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.calculator.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    private String[] BODMAS_RULE = {"÷", "×", "\\+", "-"};

    private int CURRENT_RULE = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.tvExpression.setText("");
                binding.tvResult.setText("");
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

        binding.btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String expressionText = binding.tvExpression.getText().toString();
                binding.tvExpression.setText(expressionText + ".");
            }
        });

        binding.btnAddition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String expressionText = binding.tvExpression.getText().toString();

                if (expressionText.isEmpty()) {
                    binding.tvExpression.setText("0+");
                } else {
                    final char getLastCharacter = expressionText.charAt(expressionText.length() - 1);

                    if (getLastCharacter == '+' ||
                            getLastCharacter == '-' ||
                            getLastCharacter == '÷' ||
                            getLastCharacter == '×') {
                        binding.tvExpression.setText(expressionText.substring(0, expressionText.length() - 1) + "+");
                    } else {
                        binding.tvExpression.setText(expressionText + "+");
                    }

                }

            }
        });


        binding.btnSubtraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String expressionText = binding.tvExpression.getText().toString();

                if (expressionText.isEmpty()) {
                    binding.tvExpression.setText("0-");
                } else {
                    final char getLastCharacter = expressionText.charAt(expressionText.length() - 1);

                    if (getLastCharacter == '+' ||
                            getLastCharacter == '-' ||
                            getLastCharacter == '÷' ||
                            getLastCharacter == '×') {
                        binding.tvExpression.setText(expressionText.substring(0, expressionText.length() - 1) + "-");
                    } else {
                        binding.tvExpression.setText(expressionText + "-");
                    }

                }
            }
        });

        binding.btnMultiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String expressionText = binding.tvExpression.getText().toString();

                if (expressionText.isEmpty()) {
                    binding.tvExpression.setText("0×");
                } else {
                    final char getLastCharacter = expressionText.charAt(expressionText.length() - 1);

                    if (getLastCharacter == '+' ||
                            getLastCharacter == '-' ||
                            getLastCharacter == '÷' ||
                            getLastCharacter == '×') {
                        binding.tvExpression.setText(expressionText.substring(0, expressionText.length() - 1) + "×");
                    } else {
                        binding.tvExpression.setText(expressionText + "×");
                    }

                }
            }
        });


        binding.btnDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String expressionText = binding.tvExpression.getText().toString();

                if (expressionText.isEmpty()) {
                    binding.tvExpression.setText("0÷");
                } else {
                    final char getLastCharacter = expressionText.charAt(expressionText.length() - 1);

                    if (getLastCharacter == '+' ||
                            getLastCharacter == '-' ||
                            getLastCharacter == '÷' ||
                            getLastCharacter == '×') {
                        binding.tvExpression.setText(expressionText.substring(0, expressionText.length() - 1) + "÷");
                    } else {
                        binding.tvExpression.setText(expressionText + "÷");
                    }

                }
            }
        });


        binding.btnDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String expressionText = binding.tvExpression.getText().toString();

                if (!expressionText.isEmpty()) {
                    binding.tvExpression.setText(expressionText.substring(0, expressionText.length() - 1));
                }
            }
        });


        binding.btnEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String expressionText = binding.tvExpression.getText().toString();

                if (expressionText.contains("+") ||
                        expressionText.contains("-") ||
                        expressionText.contains("÷") ||
                        expressionText.contains("×")) {
                    final char getLastCharacter = expressionText.charAt(expressionText.length() - 1);

                    if (getLastCharacter != '+' || getLastCharacter != '-' ||
                            getLastCharacter != '÷' || getLastCharacter != '×') {
                        calculateResult(expressionText);
                    }
                }
            }
        });

    }

    private void calculateResult(String expressionText) {
        String expressionText2 = expressionText;

        while (true) {
            if (CURRENT_RULE == 2 && expressionText2.contains("+")) {
                CURRENT_RULE++;
                continue;
            } else if (CURRENT_RULE != 2 && !expressionText2.contains(BODMAS_RULE[CURRENT_RULE])) {
                if (CURRENT_RULE == 3) {
                    break;
                } else {
                    CURRENT_RULE++;
                    continue;
                }
            }

            String[] expressionArray = expressionText2.split(BODMAS_RULE[CURRENT_RULE]);

            if (expressionArray.length == 1 || expressionArray[0].isEmpty()) {
                break;
            }

            StringBuilder firstValue = new StringBuilder();
            StringBuilder secondValue = new StringBuilder();

            for (int i = expressionArray[0].length() - 1; i >= 0; i--) {
                if (expressionArray[0].charAt(i) == '+' || expressionArray[0].charAt(i) == '-' ||
                        expressionArray[0].charAt(i) == '÷' ||
                        expressionArray[0].charAt(i) == '×') {
                    break;
                } else {
                    firstValue.insert(0, expressionArray[0].charAt(i));
                }
            }

            for (int i = 0; i < expressionArray[0].length(); i++) {
                if (expressionArray[1].charAt(i) == '+' || expressionArray[1].charAt(i) == '-' ||
                        expressionArray[1].charAt(i) == '÷' ||
                        expressionArray[1].charAt(i) == '×') {
                    break;
                } else {
                    secondValue.append(expressionArray[i].charAt(i));
                }
            }

            double results;
            switch (BODMAS_RULE[CURRENT_RULE]) {
                case "÷":
                    results = Double.parseDouble(firstValue.toString()) / Double.parseDouble(secondValue.toString());
                    break;

                case "×":
                    results = Double.parseDouble(firstValue.toString()) * Double.parseDouble(secondValue.toString());
                    break;

                case "\\+":
                    results = Double.parseDouble(firstValue.toString()) + Double.parseDouble(secondValue.toString());
                    break;

                case "-":
                    results = Double.parseDouble(firstValue.toString()) - Double.parseDouble(secondValue.toString());
                    break;
                default:
                    results = 0;
            }
            expressionText2 = expressionText2.replaceFirst(firstValue +  BODMAS_RULE[CURRENT_RULE] + secondValue, String.valueOf(results));

        }

        CURRENT_RULE = 0;
        binding.tvResult.setText(expressionText);

        String [] finalResultArray = expressionText2.split("\\.");

        if(finalResultArray[1].length() == 1 && finalResultArray[1].equals("0")) {
            binding.tvExpression.setText(finalResultArray[0]);
        } else {
            binding.tvExpression.setText(expressionText2);
        }
    }
}