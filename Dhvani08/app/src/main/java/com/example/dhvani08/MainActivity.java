package com.example.dhvani08;
        import androidx.appcompat.app.AppCompatActivity;
        import android.content.Intent;
        import android.widget.Button;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.EditText;
        import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    Button LoginButton;
    EditText UsernameET, PasswordET;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        UsernameET = (EditText) findViewById(R.id.EditText1);
        PasswordET = (EditText) findViewById(R.id.EditText2);
        LoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (UsernameET.getText().toString().equals("Dhvani@gmail.com") && PasswordET.getText().toString().equals("1234")) {
                    Toast.makeText(getApplicationContext(),
                            "Redirecting!", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this, Welcome.class);
                    startActivity(intent);
                }
                else {
                    Toast.makeText(getApplicationContext(), "Login Fail", Toast.LENGTH_SHORT).show();
                    LoginButton.setEnabled(false);
                }
            }
        });
    }
}
