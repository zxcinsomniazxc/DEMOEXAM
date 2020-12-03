package com.example.demoexam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Sixth extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sixth);
    }

    public void onClickToScreen(View v){
        Intent intent = new Intent(Sixth.this, Seventh.class);
        startActivity(intent);
    }
}