package com.example.dhvani23;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle; import android.view.Menu;
import android.view.MenuInflater; import android.view.MenuItem; import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) { super.onCreate(savedInstanceState); setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
// Inflate the menu; this adds items to the action bar if it is present. MenuInflater inflater = getMenuInflater(); inflater.inflate(R.menu.menu_file, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) { switch (item.getItemId()){
        case R.id.File: Toast.makeText(getApplicationContext(),"File Selected",
                Toast.LENGTH_LONG).show();
            return true; case R.id.New:
            Toast.makeText(getApplicationContext(),"New Selected",Toast.LENGTH_LONG).show();
            return true; case R.id.Open:
            Toast.makeText(getApplicationContext(),"Open Selected",Toast.LENGTH_LONG).show();
            return true;



