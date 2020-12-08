package com.example.demoexam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class StartScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.startscreen);
    }

    protected void onClickOpenMenu(View s){
        Intent intentOpenMenu = new Intent(StartScreen.this, Menus.class);
        startActivity(intentOpenMenu);
    }
}