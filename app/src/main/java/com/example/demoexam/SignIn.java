package com.example.demoexam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.L;

public class SignIn extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signin);
    }



    protected void onClickCreateAccount(View s){
        Intent intentCreateAccount = new Intent(SignIn.this, SignUp.class);
        startActivity(intentCreateAccount);
    }

        public void OnClickLogD (View l) {

            ImageView img = (ImageView) findViewById(R.id.Submit);
            EditText log = (EditText)findViewById(R.id.Login);
            EditText pass = (EditText)findViewById(R.id.Password);

            String logInput = (String) log.getText().toString();String passInput = (String) pass.getText().toString();Log.d("log",logInput);Log.d("pass",passInput);

            if(log.getText().toString().equals("serk") && pass.getText().toString().equals("123")) {
                Intent intentLogPass = new Intent(SignIn.this, StartScreen.class);
                startActivity(intentLogPass);
            }
            else if(!log.getText().toString().equals("serk") && !pass.getText().toString().equals("123")) {
                Toast toast = Toast.makeText(getApplicationContext(),
                        "Логин и|или пароль введен неправильно!", Toast.LENGTH_SHORT);
                toast.show();
            }
            else if(!log.getText().toString().equals("serk")){
            Toast toast = Toast.makeText(getApplicationContext(),
                "Логин введен неправильно!", Toast.LENGTH_SHORT);
            toast.show();
            }
            else if(!pass.getText().toString().equals("123")){
                Toast toast = Toast.makeText(getApplicationContext(),
                        "Пароль введен неправильно!", Toast.LENGTH_SHORT);
                toast.show();
            }

        }
}