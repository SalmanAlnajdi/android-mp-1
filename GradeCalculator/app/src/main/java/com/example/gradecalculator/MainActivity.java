package com.example.gradecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.view.View;
import android.widget.*;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText q = findViewById(R.id.Quzie);
        final EditText h = findViewById(R.id.hw);
        final EditText m = findViewById(R.id.mid);
        final EditText f = findViewById(R.id.fi);
        final TextView r = findViewById(R.id.result);
        Button b = findViewById(R.id.button);
        Button reset = findViewById(R.id.button2);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String qU = q.getText().toString();
                String hW = h.getText().toString();
                String mI = m.getText().toString();
                String fI = f.getText().toString();

                double result = Double.parseDouble(qU) * 0.15 + Double.parseDouble(hW) * 0.25 + Double.parseDouble(mI) * 0.3 + Double.parseDouble(fI) * 0.3;
                System.out.println("///" + result);

                if (result <= 60) {
                    r.setText("F");
                    r.setTextColor(Color.RED);
                } else if (result <= 70) {
                    r.setText("D");
                    r.setTextColor(Color.BLACK);
                } else if (result <= 80) {
                    r.setText("C");
                    r.setTextColor(Color.GRAY);
                } else if (result <= 90) {
                    r.setText("B");
                    r.setTextColor(Color.BLUE);
                } else {
                    r.setText("A");
                    r.setTextColor(Color.GREEN);
                }
               }
            });


           reset.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   q.setText("");
                   h.setText("");
                   m.setText("");
                   f.setText("");
               }
           });
        }




    }
