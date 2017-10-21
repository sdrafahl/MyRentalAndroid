package com.example.ben.myrenter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LogInActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        Button logInButton = (Button) findViewById(R.id.buttonLogIn);
        logInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        Button signUpButton = (Button) findViewById(R.id.buttonSignUp);
        signUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        final EditText usernameEditText = (EditText) findViewById(R.id.editTextUsername);
        usernameEditText.setOnClickListener(new View.OnClickListener(){ @Override
            public void onClick (View v){
                String text = usernameEditText.getText().toString();
                Toast.makeText(getApplicationContext(), "The text you inputted was: "+text, Toast.LENGTH_LONG).show();
            }
        });
        EditText passwordEditText = (EditText) findViewById(R.id.editTextPassword);
        passwordEditText.setOnClickListener(new View.OnClickListener(){ @Override
            public void onClick (View v) {
                String text = usernameEditText.getText().toString();
                Toast.makeText(getApplicationContext(), "The text you inputted was: "+text, Toast.LENGTH_LONG).show();
            }
        });
    }
}
