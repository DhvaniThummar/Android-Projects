package com.example.dhvani10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.LinearLayout;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RadioButton rdb1, rdb2, rdb3;
        final LinearLayout l1 = (LinearLayout) findViewById(R.id.LinearLayout);
        rdb1 = findViewById(R.id.red);
        rdb2 = findViewById(R.id.green);
        rdb3 = findViewById(R.id.blue);
        rdb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                l1.setBackgroundResource(R.color.red);
            }
        });
        rdb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                l1.setBackgroundResource(R.color.green);
            }
        });
        rdb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                l1.setBackgroundResource(R.color.blue);
            }
        });
    }
}
