package com.example.owczar.addingapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int NumberA;
    int NumberB;

    EditText ANumber;
    EditText BNumber;

    Button Add;

    TextView Wynik;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ANumber = (EditText) findViewById(R.id.editText);
        BNumber = (EditText) findViewById(R.id.editText2);
        Add = (Button) findViewById(R.id.button);
        Wynik = findViewById(R.id.textView);

        Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NumberA = Integer.valueOf(ANumber.getText().toString());
                NumberB = Integer.valueOf(BNumber.getText().toString());

                Wynik.setText(Integer.valueOf(NumberA+NumberB).toString());
            }
        });

    }
}
