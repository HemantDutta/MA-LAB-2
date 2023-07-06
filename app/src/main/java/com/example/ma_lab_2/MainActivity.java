package com.example.ma_lab_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int n1, n2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public boolean getNums(){
        EditText ed1 = findViewById(R.id.editTextNumber);
        EditText ed2 = findViewById(R.id.editTextNumber2);

        String num1 = ed1.getText().toString();
        String num2 = ed2.getText().toString();

        if(num1.equals("Enter First Number") || num2.equals("Enter Second Number")){
            Toast.makeText(this, "Please enter both values", Toast.LENGTH_SHORT).show();
            return false;
        }
        else if(num1.equals("Enter First Number") || num2.equals("")){
            Toast.makeText(this, "Please enter both values", Toast.LENGTH_SHORT).show();
            return false;
        } else if (num1.equals("") || num2.equals("Enter Second Number")) {
            Toast.makeText(this, "Please enter both values", Toast.LENGTH_SHORT).show();
            return false;
        }
        else{
            n1 = Integer.parseInt(num1);
            n2 = Integer.parseInt(num2);
            return true;
        }
    }

    public void addition(View view){
        TextView out = findViewById(R.id.textView2);
        if(getNums())
        {
            int sum = n1+n2;
            String result = Integer.toString(sum);
            out.setText(result);
        }
    }

    public void subtract(View view){
        TextView out = findViewById(R.id.textView2);
        if(getNums()){
            int sum = n1-n2;
            String result = Integer.toString(sum);
            out.setText(result);
        }
    }

    public void multiply(View view){
        TextView out = findViewById(R.id.textView2);
        if(getNums()){
            int sum = n1*n2;
            String result = Integer.toString(sum);
            out.setText(result);
        }
    }

    public void divide(View view){
        TextView out = findViewById(R.id.textView2);
        if(getNums()){
            int sum = n1/n2;
            String result = Integer.toString(sum);
            out.setText(result);
        }
    }
}