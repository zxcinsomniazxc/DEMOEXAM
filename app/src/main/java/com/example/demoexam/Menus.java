package com.example.demoexam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Menus extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menus);
    }

    public void pressHistoryButton(View a){
        Intent intentHistory = new Intent(Menus.this, History.class);
        startActivity(intentHistory);
    }

    public void pressSettingsButton(View m){
        Intent intentSettings = new Intent(Menus.this, Settings.class);
        startActivity(intentSettings);
    }

    public void onClickGoBack(View q){
        Intent intentGoBack = new Intent(Menus.this, StartScreen.class);
        startActivity(intentGoBack);
    }
}
