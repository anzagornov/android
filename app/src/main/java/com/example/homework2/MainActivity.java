package com.example.homework2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText num1;
    private EditText num2;
    private TextView Result;
    private Button button_1;
    private Button button_2;
    private Button button_3;
    private Button button_dividing;
    private Button button_4;
    private Button button_5;
    private Button button_6;
    private Button button_multiplying;
    private Button button_7;
    private Button button_8;
    private Button button_9;
    private Button button_minus;
    private Button button_equally;
    private Button button_0;
    private Button button_dot;
    private Button button_plus;
    private String count = " ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homework4);

        num1=(EditText)findViewById(R.id.num1);
        num2=(EditText)findViewById(R.id.num2);
        Result=(TextView)findViewById(R.id.result);
        button_1=(Button) findViewById(R.id.button_1);
        button_2=(Button) findViewById(R.id.button_2);
        button_3=(Button) findViewById(R.id.button_3);
        button_dividing=(Button) findViewById(R.id.button_dividing);
        button_4=(Button) findViewById(R.id.button_4);
        button_5=(Button) findViewById(R.id.button_5);
        button_6=(Button) findViewById(R.id.button_6);
        button_multiplying=(Button) findViewById(R.id.button_multiplying);
        button_7=(Button) findViewById(R.id.button_7);
        button_8 =(Button) findViewById(R.id.button_8);
        button_9 =(Button) findViewById(R.id.button_9);
        button_minus=(Button) findViewById(R.id.button_minus);
        button_equally=(Button) findViewById(R.id.button_equally);
        button_0=(Button) findViewById(R.id.button_0);
        button_dot=(Button) findViewById(R.id.button_dot);
        button_plus=(Button) findViewById(R.id.button_plus);

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

    @SuppressLint({"NonConstantResourceId", "SetTextI18n"})
    @Override
    public void onClick(View v) {
        float value1 = 0;
        float value2 = 0;
        float result = 0;

        String numString1 = num1.getText().toString();
        String numString2 = num2.getText().toString();

        value1 = numString1.isEmpty() ? 0 : Float.parseFloat(numString1);
        value2 = numString1.isEmpty() ? 0 : Float.parseFloat(numString2);

        switch (v.getId()) {
            case R.id.button_plus:
                count = "+";
                result = value1 + value2;
                break;
            case R.id.button_minus:
                count = "-";
                result = value1 - value2;
                break;
            case R.id.button_multiplying:
                count = "*";
                result = value1 * value2;
                break;
            case R.id.button_dividing:
                count = "/";
                result = value1 / value2;
                break;
        }
        Result.setText(value1 + " " + count + " " + value2 + " = " + result);
    }
}