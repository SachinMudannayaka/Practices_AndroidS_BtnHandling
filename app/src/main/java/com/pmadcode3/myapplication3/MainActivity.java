package com.pmadcode3.myapplication3;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button,button1;
    TextView text,text2;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.btnOk);
        button1=findViewById(R.id.Greeting);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text=findViewById(R.id.textHello);
                text.setText("Sachin");

            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                text2=findViewById(R.id.welcomeTxt);
                text2.setText("Welcome");

            }
        });
    }
}