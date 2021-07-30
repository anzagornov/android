package com.example.homework2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText num1;
    private EditText num2;
    private TextView Result;
    private String count = " ";

    private static final String my_appTheme = "APP_THEME";

    private static final int Homework_red = 0;
    private static final int Homework_green = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(Homework_green);
        super.onCreate(savedInstanceState);
        int currentThemeCode = getCodeStyle();
        int currentThemeResID = codeStyleToStyleId(currentThemeCode);
        setContentView(R.layout.homework4);
        setTheme(currentThemeResID);

        setTheme(getCodeStyle());

        initRadioButton();

        num1 = (EditText) findViewById(R.id.num1);
        num2 = (EditText) findViewById(R.id.num2);
        Result = (TextView) findViewById(R.id.result);
        Button button_1 = (Button) findViewById(R.id.button_1);
        Button button_2 = (Button) findViewById(R.id.button_2);
        Button button_3 = (Button) findViewById(R.id.button_3);
        Button button_dividing = (Button) findViewById(R.id.button_dividing);
        Button button_4 = (Button) findViewById(R.id.button_4);
        Button button_5 = (Button) findViewById(R.id.button_5);
        Button button_6 = (Button) findViewById(R.id.button_6);
        Button button_multiplying = (Button) findViewById(R.id.button_multiplying);
        Button button_7 = (Button) findViewById(R.id.button_7);
        Button button_8 = (Button) findViewById(R.id.button_8);
        Button button_9 = (Button) findViewById(R.id.button_9);
        Button button_minus = (Button) findViewById(R.id.button_minus);
        Button button_equally = (Button) findViewById(R.id.button_equally);
        Button button_0 = (Button) findViewById(R.id.button_0);
        Button button_dot = (Button) findViewById(R.id.button_dot);
        Button button_plus = (Button) findViewById(R.id.button_plus);

        button_1.setOnClickListener(this);
        button_2.setOnClickListener(this);
        button_3.setOnClickListener(this);
        button_dividing.setOnClickListener(this);
        button_4.setOnClickListener(this);
        button_5.setOnClickListener(this);
        button_6.setOnClickListener(this);
        button_multiplying.setOnClickListener(this);
        button_7.setOnClickListener(this);
        button_8.setOnClickListener(this);
        button_9.setOnClickListener(this);
        button_minus.setOnClickListener(this);
        button_equally.setOnClickListener(this);
        button_0.setOnClickListener(this);
        button_dot.setOnClickListener(this);
        button_plus.setOnClickListener(this);
    }

    private void initRadioButton() {
        findViewById(R.id.radioButtonHomework_red).setOnClickListener(v -> {
            setTheme(Homework_red);
            recreate();
        });
        findViewById(R.id.radioButtonHomework_green).setOnClickListener(v -> {
            setTheme(Homework_green);
            recreate();
        });
    }


    @SuppressLint({"NonConstantResourceId", "SetTextI18n"})
    @Override
    public void onClick (View v){
        float value1 = 0;
        float value2 = 0;
        float result = 0;

        String numString1 = num1.getText().toString();
        String numString2 = num2.getText().toString();

        value1 = numString1.isEmpty() ? 0 : Float.parseFloat(numString1);
        value2 = numString1.isEmpty() ? 0 : Float.parseFloat(numString2);

        if (count == "+") {
            result = value1 + value2;
        } else if (count == "-") {
            result = value1 - value2;
        } else if (count == "*") {
            result = value1 * value2;
        } else {
            result = value1 / value2;
        }

        Result.setText(value1 + " " + count + " " + value2 + " = " + result);
    }

    private int getAppTheme(int code) {
        return codeStyleToStyleId(getCodeStyle());
    }

    private int codeStyleToStyle(int code) {
        return codeStyleToStyleId(getCodeStyle());
    }

    private int getCodeStyle() {

        SharedPreferences preferences = getSharedPreferences(my_appTheme, MODE_PRIVATE);

        return preferences.getInt(my_appTheme, R.style.Theme_HomeWork_red);
    }

    private void setMy_appTheme(int codeStyle) {
        SharedPreferences preferences = getSharedPreferences(my_appTheme, MODE_PRIVATE);

        preferences.edit()
                .putInt(my_appTheme, codeStyle)
                .apply();
    }

    private int codeStyleToStyleId(int codeStyle) {
        switch (codeStyle) {
            case Homework_red:
                return R.style.Theme_HomeWork_red;
            default:
                return R.style.Theme_HomeWork_green;
        }
    }
}