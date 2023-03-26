package com.example.dhvani13;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView t1;
    String s1,s2;
    int s3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        t1 = (TextView) findViewById(R.id.textView1);
        Intent i = getIntent();
        s1 = i.getStringExtra("num1");
        s2 = i.getStringExtra("num2");
        s3 = Integer.parseInt(s1) + Integer.parseInt(s2);
        t1.setText(s1+ " + " +s2+ " = " +s3);

    }
}