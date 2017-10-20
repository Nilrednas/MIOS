package com.example.jsande21.miostest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    final private String password = "78b79b7";
    final String success = "Good job.";

    boolean isPassword;

    String text;
    String hiddenText;

    TextView textView;
    TextView hint;

    Button backspace;
    Button button0;
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;
    Button reset;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        isPassword = false;

        text = "";
        hiddenText = "";

        textView = (TextView) findViewById(R.id.textView);
        hint = (TextView) findViewById(R.id.hint);

        backspace = (Button) findViewById(R.id.backspace);
        backspace.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (v != null) {
                   if (!text.equals(""))
                   {
                       text = text.substring(0, text.length() - 1);
                   }
                   hiddenText += "b";
                    testForPassword();
                }
            }
        });

        button0 = (Button) findViewById(R.id.button0);
        button0.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (v != null) {
                   numberPressed(0);
                    // Toast.makeText(MainActivity.this, "Zero the hero!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (v != null) {
                    numberPressed(1);
                }
            }
        });

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (v != null) {
                    numberPressed(2);
                }
            }
        });

        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (v != null) {
                    numberPressed(3);
                }
            }
        });

        button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (v != null) {
                    numberPressed(4);
                }
            }
        });

        button5 = (Button) findViewById(R.id.button5);
        button5.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (v != null) {
                    numberPressed(5);
                }
            }
        });

        button6 = (Button) findViewById(R.id.button6);
        button6.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (v != null) {
                    numberPressed(6);
                }
            }
        });

        button7 = (Button) findViewById(R.id.button7);
        button7.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (v != null) {
                    numberPressed(7);
                }
            }
        });

        button8 = (Button) findViewById(R.id.button8);
        button8.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (v != null) {
                    numberPressed(8);
                }
            }
        });

        button9 = (Button) findViewById(R.id.button9);
        button9.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (v != null) {
                    numberPressed(9);
                }
            }
        });

        reset = (Button) findViewById(R.id.reset);
        reset.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (v != null) {
                    isPassword = false;
                    text = "";
                    hiddenText = "";
                    textView.setText(text);
                }
            }
        });
    }

    private void numberPressed (int i)
    {
        if (isPassword)
        {
            text = "";
            isPassword = false;
        }
        text += i;
        hiddenText += i;
        testForPassword();
    }

    private void testForPassword()
    {
        if (hiddenText.equals(password))
        {
            textView.setText(success);
            isPassword = true;
        }
        else
            textView.setText(text);
    }
}
