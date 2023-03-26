package com.example.dhvani16;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button buttonAdd, buttonSub, buttonMul, buttonDiv;
    EditText editText1, editText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonAdd = (Button) findViewById(R.id.add);
        buttonSub = (Button) findViewById(R.id.sub);
        buttonMul = (Button) findViewById(R.id.mul);
        buttonDiv = (Button) findViewById(R.id.div);

        editText1 = (EditText) findViewById(R.id.number1);
        editText2 = (EditText) findViewById(R.id.number2);

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float f1 = Float.parseFloat(editText1.getText().toString());
                float f2 = Float.parseFloat(editText2.getText().toString());

                if(f1 == f2) {
                    Toast.makeText(getApplicationContext(), "Both Numbers are equal \nAddition of two number is: " + (f1 + f2), Toast.LENGTH_SHORT).show();
                } else if(f1 > f2) {
                    Toast.makeText(getApplicationContext(), f1 + " is greater then " + f2 + "\nAddition of two number is: " + (f1 + f2), Toast.LENGTH_SHORT).show();
                } else if(f1 < f2) {
                    Toast.makeText(getApplicationContext(), f2 + " is greater then " + f2 + "\nAddition of two number is: " + (f1 + f2), Toast.LENGTH_SHORT).show();
                }
            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float f1 = Float.parseFloat(editText1.getText().toString());
                float f2 = Float.parseFloat(editText2.getText().toString());

                if(f1 == f2) {
                    Toast.makeText(getApplicationContext(), "Both Numbers are equal \nSubtraction of two number is: " + (f1 - f2), Toast.LENGTH_SHORT).show();
                } else if(f1 > f2) {
                    Toast.makeText(getApplicationContext(), f1 + " is greater then " + f2 + "\nSubtraction of two number is: " + (f1 - f2), Toast.LENGTH_SHORT).show();
                } else if(f1 < f2) {
                    Toast.makeText(getApplicationContext(), f2 + " is greater then " + f2 + "\nSubtraction of two number is: " + (f1 - f2), Toast.LENGTH_SHORT).show();
                }
            }
        });

        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float f1 = Float.parseFloat(editText1.getText().toString());
                float f2 = Float.parseFloat(editText2.getText().toString());

                if(f1 == f2) {
                    Toast.makeText(getApplicationContext(), "Both Numbers are equal \nMultiplication of two number is: " + (f1 * f2), Toast.LENGTH_SHORT).show();
                } else if(f1 > f2) {
                    Toast.makeText(getApplicationContext(), f1 + " is greater then " + f2 + "\nMultiplication of two number is: " + (f1 * f2), Toast.LENGTH_SHORT).show();
                } else if(f1 < f2) {
                    Toast.makeText(getApplicationContext(), f2 + " is greater then " + f2 + "\nMultiplication of two number is: " + (f1 * f2), Toast.LENGTH_SHORT).show();
                }
            }
        });

        buttonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float f1 = Float.parseFloat(editText1.getText().toString());
                float f2 = Float.parseFloat(editText2.getText().toString());

                if(f1 == f2) {
                    Toast.makeText(getApplicationContext(), "Both Numbers are equal \nDivision of two number is: " + (f1 / f2), Toast.LENGTH_SHORT).show();
                } else if(f1 > f2) {
                    Toast.makeText(getApplicationContext(), f1 + " is greater then " + f2 + "\nDivision of two number is: " + (f1 / f2), Toast.LENGTH_SHORT).show();
                } else if(f1 < f2) {
                    Toast.makeText(getApplicationContext(), f2 + " is greater then " + f2 + "\nDivision of two number is: " + (f1 / f2), Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

}
