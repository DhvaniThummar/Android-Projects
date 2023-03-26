package com.example.dhvani13;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText e1, e2;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1 = (EditText)findViewById(R.id.editText1);
        e2 = (EditText)findViewById(R.id.editText2);
        b1 = (Button)findViewById(R.id.btn1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (e1.length() == 0 || e2.length() == 0) {
                    Toast.makeText(MainActivity.this, "Please Enter Numbers", Toast.LENGTH_SHORT).show();
                } else {
                    Intent i = new Intent(MainActivity.this, MainActivity2.class);
                    i.putExtra("num1", e1.getText().toString());
                    i.putExtra("num2", e2.getText().toString());
                    startActivity(i);
                }
            }
        });
    }
}