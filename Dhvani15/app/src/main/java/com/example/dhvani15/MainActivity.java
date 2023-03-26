package com.example.dhvani15;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    TextView t1;
    EditText e1;
    Button b1;
    Float f;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1 = (EditText) findViewById(R.id.editText1);
        b1 = (Button) findViewById(R.id.btn1);
        t1 = (TextView) findViewById(R.id.textView2);

        b1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                f = (Float.parseFloat(e1.getText().toString()) * 9 / 5) + 32;
                t1.setText("Farenheit: " +f);
            }
        });
    }
}