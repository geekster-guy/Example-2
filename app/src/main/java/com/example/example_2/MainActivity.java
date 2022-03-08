package com.example.example_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button button1OM;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1OM = findViewById(R.id.button);
        button1OM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent startActIntent = new Intent(MainActivity.this, TargetActivity.class);
                startActIntent.putExtra("myString", "Soy el extra que viaja");
                startActIntent.putExtra("myInt", 12345);
                startActivity(startActIntent);
            }
        });
    }
}