package com.example.dhvani17;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public Dhvani17 extends AppCompatActivity { EditText editText;
    Button btn; @Override
    protected void onCreate(Bundle savedInstanceState) { super.onCreate(savedInstanceState); setContentView(R.layout.activity_main2);
        btn = findViewById(R.id.btnGoToNext); btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText = findViewById(R.id.numberET); String ETValue = editText.getText().toString();
                Intent intent = new Intent(getApplicationContext(),MainActivity2.class); intent.putExtra("content",ETValue);
                startActivity(intent);
            }
        });
    }
}

