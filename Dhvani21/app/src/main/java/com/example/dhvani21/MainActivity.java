package com.example.dhvani21;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle; import android.view.View;
import android.widget.AdapterView; import android.widget.ArrayAdapter; import android.widget.ListView; import android.widget.Toast;


public class Practical21 extends AppCompatActivity { ArrayAdapter<String> adapter;
    String[] games = {"PUBG", "CS:GO", "ROCKET LEAUGE", "APEX LEGENDS", "CALL OF DUTY MOBILE"};
    ListView lsView; @Override
    protected void onCreate(Bundle savedInstanceState) { super.onCreate(savedInstanceState); setContentView(R.layout.activity_practical21);


        lsView = findViewById(R.id.listGames);

        adapter	=	new	ArrayAdapter<>(this,	R.layout.activity_list_view_text_view, R.id.txtViewList, games);
        lsView.setAdapter(adapter);


        lsView.setOnItemClickListener(new AdapterView.OnItemClickListener() { @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            String game = adapter.getItem(position);
            Toast.makeText(getApplicationContext(),"Your	Selected	Game:	"	+ game,Toast.LENGTH_LONG).show();
        }	});	}}
