package com.example.loginapp;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        EditText password = (EditText) findViewById(R.id.password);
        EditText email = (EditText) findViewById(R.id.email);

        Button loginb = (Button) findViewById(R.id.loginb);
        Button forgotpassw = (Button) findViewById(R.id.forgotpass);
        Button register= (Button) findViewById(R.id.register);
        register.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {

                Toast.makeText(MainActivity.this, "You can register with the next page", Toast.LENGTH_SHORT).show();
            }
        });
        forgotpassw.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "You must not forgot your own password", Toast.LENGTH_LONG).show();
            }
        });
        loginb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validationEmail(email);
            }
        });


    }
    private void validationEmail(EditText email){
        String emailInput = email.getText().toString();

        if(!emailInput.isEmpty() && Patterns.EMAIL_ADDRESS.matcher(emailInput).matches()){
            Toast.makeText(this, "Email Validated Successfully", Toast.LENGTH_SHORT).show();

        }
        else{
            Toast.makeText(this, "Invalid Email Address", Toast.LENGTH_SHORT).show();

        }
    }
}
