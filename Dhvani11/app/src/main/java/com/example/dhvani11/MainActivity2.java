package com.example.dhvani11;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.os.Bundle;

public class MainActivity2 extends AppCompatActivity {
    Button previous_button;
    TextView txt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        previous_button = (Button)findViewById(R.id.btnPrev);
        txt2 = (TextView)findViewById(R.id.txt2);
        txt2.setText("Welcome to Second Screen!!");
        previous_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                Intent intent = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}