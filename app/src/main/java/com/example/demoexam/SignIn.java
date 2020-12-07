package com.example.demoexam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SignIn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signin);


    }

    public void onClickReg(View r){
        Intent intentReg = new Intent(SignIn.this, SignUp.class);
        startActivity(intentReg);
    }
}