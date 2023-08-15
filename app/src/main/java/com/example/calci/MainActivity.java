package com.example.calci;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void add(View view) {
        EditText editText = findViewById(R.id.editTextText);
        EditText editText1 = findViewById(R.id.editTextText2);
        TextView text =  findViewById(R.id.textView2);

        String t1 = editText.getText().toString();
        String t2 = editText1.getText().toString();
        double num1=Integer.parseInt(t1);
        double num2=Integer.parseInt(t2);
        //Toast.makeText(MainActivity.this, ""+cent, Toast.LENGTH_SHORT).show();
        double s= num1+num2;
        text.setText(String.valueOf(s));
    }

    public void Minus(View view) {
        EditText editText = findViewById(R.id.editTextText);
        EditText editText1 = findViewById(R.id.editTextText2);
        TextView text =  findViewById(R.id.textView2);

        String t1 = editText.getText().toString();
        String t2 = editText1.getText().toString();
        double num1=Integer.parseInt(t1);
        double num2=Integer.parseInt(t2);
        //Toast.makeText(MainActivity.this, ""+cent, Toast.LENGTH_SHORT).show();
        double s= num1-num2;
        text.setText(String.valueOf(s));
    }

    public void Divide(View view) {
        EditText editText = findViewById(R.id.editTextText);
        EditText editText1 = findViewById(R.id.editTextText2);
        TextView text =  findViewById(R.id.textView2);

        String t1 = editText.getText().toString();
        String t2 = editText1.getText().toString();
        double num1=Integer.parseInt(t1);
        double num2=Integer.parseInt(t2);
        //Toast.makeText(MainActivity.this, ""+cent, Toast.LENGTH_SHORT).show();
        double s= num1/num2;
        text.setText(String.valueOf(s));
    }

    public void Multi(View view) {
        EditText editText = findViewById(R.id.editTextText);
        EditText editText1 = findViewById(R.id.editTextText2);
        TextView text =  findViewById(R.id.textView2);

        String t1 = editText.getText().toString();
        String t2 = editText1.getText().toString();
        double num1=Integer.parseInt(t1);
        double num2=Integer.parseInt(t2);
        //Toast.makeText(MainActivity.this, ""+cent, Toast.LENGTH_SHORT).show();
        double s= num1*num2;
        text.setText(String.valueOf(s));
    }
}