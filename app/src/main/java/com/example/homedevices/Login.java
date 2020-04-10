package com.example.homedevices;

import androidx.appcompat.app.AppCompatActivity;

import android.content.EntityIterator;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Login extends AppCompatActivity {

    private EditText Username,Password;
    private Button Login;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Username=(EditText)findViewById(R.id.etUsername);
        Password=(EditText)findViewById(R.id.etPassword);
        Login=(Button)findViewById(R.id.etLoginButton);
        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validate(Username.getText().toString(), Password.getText().toString());
            }
        });
    }
    void validate(String name,String pass){
        if(name=="admin" && pass=="admin"){
            Intent intent = new Intent(Login.this, Success.class);
            startActivity(intent);
        }

    }
}
