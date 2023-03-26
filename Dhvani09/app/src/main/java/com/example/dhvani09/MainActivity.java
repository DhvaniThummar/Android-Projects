package com.example.dhvani09;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {


    EditText e1,e2,e3;
    RadioButton r1,r2,r3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        send_button= (Button)findViewById(R.id.submitBtn);
        e1 = (EditText) findViewById(R.id.name);
        e2 = (EditText) findViewById(R.id.email);
        e3 = (EditText) findViewById(R.id.phone);

        r1 = (RadioButton) findViewById(R.id.r_male);
        r2 = (RadioButton) findViewById(R.id.r_female);
        r3 = (RadioButton) findViewById(R.id.r_others);

        findViewById(R.id.submitBtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (e1.length() == 0 || e2.length() == 0 || e3.length() == 0 || !(r1.isChecked() || r2.isChecked() || r3.isChecked()))
                {
                    Toast.makeText(MainActivity.this, "Please Enter Credentails..!", Toast.LENGTH_SHORT).show();
                }
                Intent i = new Intent(MainActivity.this,MainActivity2.class);
                i.putExtra("Name", e1.getText().toString());
                i.putExtra("Email", e2.getText().toString());
                i.putExtra("Phone", e3.getText().toString());
                i.putExtra("Gender", r1.isChecked() ? "Male" : "Female" );

                startActivity(i);
            }
        });
    }
}
