package com.example.demoexam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class SignUp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);
    }

    public void OnClickProverka (View r) {

        ImageView img = (ImageView) findViewById(R.id.Reg);
        EditText pas1 = (EditText)findViewById(R.id.Pass1);
        EditText pas2 = (EditText)findViewById(R.id.Pass2);

        if (pas1.getText().toString().equals(pas2.getText().toString())){
            Toast.makeText(this,"Пароли совпадают", Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(this,"Пароли не совпадают", Toast.LENGTH_SHORT).show();
        }
    }
}