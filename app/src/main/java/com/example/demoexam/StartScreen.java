
package com.example.demoexam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

//StartScreen является главным окном приложения
//отображает карту с текущим местонахождением пользователя
//и отображает передвижения свободных машин такси
public class StartScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.startscreen); //при запуске вызывает startscreen.xml
    }

    public void onClickOpenMenu(View p){
        Intent intentOpenMenu = new Intent(StartScreen.this, Menus.class);
        //при нажатии на кнопку с тремя полосками на экране появляется боковое меню приложения
        startActivity(intentOpenMenu);
    }
}