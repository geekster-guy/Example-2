package com.example.example_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class TargetActivity extends AppCompatActivity {

    TextView myTextViewOM;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_target);

        Intent targetIntent = getIntent();
        String myString =  targetIntent.getStringExtra("myString");
        int myInt = targetIntent.getIntExtra("myInt", 0);

        myTextViewOM.setText("The value of myString is " + myString);

    }
}