package com.example.practicals;


import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle; import android.view.View;

import android.widget.Button; import android.widget.RatingBar; import android.widget.Toast;

public class RatingBar_demo extends AppCompatActivity { RatingBar ratingBar;
    Button btn; @Override
    protected void onCreate(Bundle savedInstanceState) { super.onCreate(savedInstanceState); setContentView(R.layout.activity_rating_bar_demo); btn = findViewById(R.id.btnDone);
        ratingBar = findViewById(R.id.ratingBar);


        btn.setOnClickListener(new View.OnClickListener() { @Override
        public void onClick(View v) {
            Toast.makeText(getApplicationContext(),"You	Have	Rated:	"	+ ratingBar.getRating(), Toast.LENGTH_LONG).show();
        }
        });

    }
}
