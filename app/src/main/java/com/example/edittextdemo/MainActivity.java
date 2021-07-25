package com.example.edittextdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText editText1, editText2;
    Button addButton, subButton;
    TextView resTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = (EditText) findViewById(R.id.editText1Id);
        editText2 = (EditText) findViewById(R.id.editText2Id);
        addButton = (Button) findViewById(R.id.buttonID);
        subButton = (Button) findViewById(R.id.button2ID);
        resTextView = (TextView) findViewById(R.id.resTextViewId);

        addButton.setOnClickListener(this);
        subButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        try{
            String num1 = editText1.getText().toString();
            String num2 = editText2.getText().toString();

            //converting into double
            double n1 = Double.parseDouble(num1);
            double n2 = Double.parseDouble(num2);

            if(v.getId() == R.id.buttonID){
                double sum = n1 + n2;
                resTextView.setText("Result is " + sum);
            }
            if(v.getId() == R.id.button2ID){
                double sub = n1 - n2;
                resTextView.setText("Result is " + sub);
            }
        }catch (Exception e){
            Toast toast = Toast.makeText(MainActivity.this, "Invalid Input", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.BOTTOM, -50, 50);
            toast.show();
        }


    }
}