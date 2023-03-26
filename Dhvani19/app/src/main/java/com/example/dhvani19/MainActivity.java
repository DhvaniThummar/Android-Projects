package com.example.dhvani19;

import androidx.appcompat.app.AppCompatActivity; import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.AdapterView; import android.widget.ArrayAdapter; import android.widget.ListView; import android.widget.Toast;

import java.util.ArrayList;

public class Practical19 extends AppCompatActivity { ListView lsView;
    ArrayAdapter adapter;
    String cars[] = { "Volvo", "Thar", "AUDI", "Creta", "jeep", "Alcatraz" }; @Override
    protected void onCreate(Bundle savedInstanceState) { super.onCreate(savedInstanceState); setContentView(R.layout.activity_main2); lsView = findViewById(R.id.lsViewP19);

        adapter	=	new	ArrayAdapter(this,	R.layout.activity_main2, R.id.txtTextViewList, cars);
        lsView.setAdapter(adapter);

        lsView.setOnItemClickListener(new AdapterView.OnItemClickListener() { @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) { String car = (String) adapter.getItem(position); Toast.makeText(getApplicationContext(),	"Your	Selected	Car:	"	+	car,
                Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(getApplicationContext(), Practical19.class); intent.putExtra("car", car);
            startActivity(intent);
        }
        });	}}
