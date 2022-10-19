package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9,btn0,btnminus, btnmulti, btneq, btnadd;
    Button clear;
    EditText display;
    Float res1, res2;
    boolean add, sub, multi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = (Button) findViewById(R.id.b1);
        btn2 = (Button) findViewById(R.id.b2);
        btn3 = (Button) findViewById(R.id.b3);
        btn4 = (Button) findViewById(R.id.b4);
        btn5 = (Button) findViewById(R.id.b5);
        btn6 = (Button) findViewById(R.id.b6);
        btn7 = (Button) findViewById(R.id.b7);
        btn8 = (Button) findViewById(R.id.b8);
        btn9 = (Button) findViewById(R.id.b9);
        btn0 = (Button) findViewById(R.id.b0);
        btnminus = (Button) findViewById(R.id.bmin);
        btnmulti = (Button) findViewById(R.id.bX);
        btneq = (Button) findViewById(R.id.equal);
        btnadd = (Button) findViewById(R.id.badd);
        clear = (Button) findViewById(R.id.C);

        display = (EditText) findViewById(R.id.editTextTextPersonName);
        display.setShowSoftInputOnFocus(false);
        btn1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                display.setText(display.getText()+"1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(display.getText()+"2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(display.getText()+"3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(display.getText()+"4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(display.getText()+"5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(display.getText()+"6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(display.getText()+"7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(display.getText()+"8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(display.getText()+"9");
            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(display.getText()+"0");
            }
        });
        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(display==null)
                {
                    display.setText("");
                }
                else
                {
                    res1=Float.parseFloat(display.getText()+"");
                    add=true;
                    display.setText(null);
                }
            }
        });
        btnminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(display==null)
                {
                    display.setText("");
                }
                else
                {
                    res1=Float.parseFloat(display.getText()+"");
                    sub=true;
                    display.setText(null);
                }

            }
        });
        btnmulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(display==null)
                {
                    display.setText("");
                }
                else
                {
                    res1=Float.parseFloat(display.getText()+"");
                    multi=true;
                    display.setText(null);
                }
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(" ");
            }
        });
        btneq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                res2 = Float.parseFloat(display.getText()+"");
                if (add == true){
                    display.setText(res1+res2+"");
                    add = false;
                }
                if (multi == true){
                    display.setText(res1*res2+"");
                    multi = false;
                }
                if (sub == true){
                    display.setText(res1-res2+"");
                    sub = false;
                }
            }
        });
    }
}
