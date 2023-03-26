package com.example.dhvani22;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    TextView txtOut;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); setContentView(R.layout.activity_main);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu,menu); return true;
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        txtOut = (TextView)findViewById(R.id.tv);
        switch (item.getItemId()){
            case R.id.itmNew : txtOut.setText("You have selected : "+item.getTitle()); break;
            case R.id.itmOpen : txtOut.setText("You have selected : "+item.getTitle()); break;
            case R.id.itmSave : txtOut.setText("You have selected : "+item.getTitle()); break;
            case R.id.itmCopy : txtOut.setText("You have selected : "+item.getTitle()); break;
            case R.id.itmCut : txtOut.setText("You have selected : "+item.getTitle()); break;
            case R.id.itmPaste : txtOut.setText("You have selected : "+item.getTitle()); break;
            case R.id.itmAppearance: txtOut.setText("You have selected : "+item.getTitle()); break;
            case R.id.itmRecentFiles: txtOut.setText("You have selected : "+item.getTitle()); break;
            default : txtOut.setText("You have selected : NONE"); break;
        }
        return super.onOptionsItemSelected(item);
    }
}

