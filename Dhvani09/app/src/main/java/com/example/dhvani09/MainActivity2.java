package com.example.dhvani09;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        String s1, s2, s3, s4;
        Intent i = getIntent();
        s1 = i.getStringExtra("Name");
        s2 = i.getStringExtra("Gender");
        s3 = i.getStringExtra("Email");
        s4 = i.getStringExtra("Phone");
        Toast.makeText(this, "Name: " + s1 + "\nGender: " + s2 + "\nEmail: " + s3 + "\nPhone no.: "+ s4, Toast.LENGTH_SHORT).show();
    }
}

