package com.example.dhvani20;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle; import android.view.View;
import android.widget.ImageButton; import android.widget.TextView;
public class MainActivity extends AppCompatActivity { ImageButton imgbtn;
    TextView txt; @Override
    protected void onCreate(Bundle savedInstanceState) { super.onCreate(savedInstanceState); setContentView(R.layout.activity_main);
        imgbtn = findViewById(R.id.imgbtn); txt = findViewById(R.id.txt);
        imgbtn.setOnLongClickListener(new View.OnLongClickListener() { @Override
        public boolean onLongClick(View view) { if(txt.getText().equals("PLAY BUTTON")) {
            txt.setText("PAUSE BUTTON"); imgbtn.setImageResource(R.drawable.pause);
        }
        else {
            txt.setText("PLAY BUTTON"); imgbtn.setImageResource(R.drawable.play);
        }
            return false;
        }
        });
    }
}
