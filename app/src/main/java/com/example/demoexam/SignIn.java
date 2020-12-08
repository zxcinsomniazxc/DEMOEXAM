package com.example.demoexam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class SignIn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signin);
    }

    public void onClickLogin(View r){
        //Intent intentReg = new Intent(SignIn.this, SignUp.class);
        //startActivity(intentReg);

        TextView log = findViewById(R.id.Login); String logInput = (String) log.getText().toString(); Log.d("log",logInput);
        TextView pass = findViewById(R.id.Password); String passInput = (String) pass.getText().toString(); Log.d("pass",passInput);
    }
}