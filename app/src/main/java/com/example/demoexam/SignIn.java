package com.example.demoexam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.L;

public class SignIn extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signin);
    }


        public void OnClickLogD (View L) {

            ImageView img = (ImageView) findViewById(R.id.Submit);
            TextView log = findViewById(R.id.Login);
            TextView pass = findViewById(R.id.Password);

            String logInput = (String) log.getText().toString();
            String passInput = (String) pass.getText().toString();
            Log.d("log",logInput);
            Log.d("pass",passInput);

            if ((logInput=="serg") && (passInput== "1234")){
                    Intent intentLogPass = new Intent(SignIn.this, StartScreen.class);
                    startActivity(intentLogPass);
            }

    }
}