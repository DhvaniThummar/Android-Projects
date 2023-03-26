package com.example.dhvani06;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1=(TextView)findViewById(R.id.textView1);
        t1.setText(t1.getText().toString()+"\n onCreate() ");

    }
    @Override
    protected void onPause() {
        super.onPause();
        t1.setText(t1.getText().toString()+"\n onPause() ");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "onDestroy()", Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        t1.setText(t1.getText().toString()+"\n onRestart() invoked");
    }
    @Override
    protected void onResume() {
        super.onResume();
        t1.setText(t1.getText().toString()+"\n onResume() invoked ");
    }
    @Override
    protected void onStop() {
        super.onStop();
        t1.setText(t1.getText().toString()+"\n onStop() invoked ");
    }

}