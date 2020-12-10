
package com.example.demoexam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

//Класс Меню вызывает боковое меню приложения при нажатии
//на картинку меню с тремя полосками
//с возможностью перехода на экраны История и Настройки
public class Menus extends AppCompatActivity {

    @Override
    //метод выполнения Activity
    //при вызове этого события отображает на экране дочерний xml-файл menus.xml
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menus);
    }

    //метод осуществляет переход на экран Истории при нажатии на надпись История
    public void pressHistoryButton(View a){
        Intent intentHistory = new Intent(Menus.this, History.class);
        startActivity(intentHistory);
    }

    //метод осуществляет переход на экран Настройки при нажатии на надпись Настройки
    public void pressSettingsButton(View m){
        Intent intentSettings = new Intent(Menus.this, Settings.class);
        startActivity(intentSettings);
    }

    //метод осуществляет переход обратно на Главный экран приложения при нажатии на картинку Меню
    public void onClickGoBack(View q){
        Intent intentGoBack = new Intent(Menus.this, MapsActivity.class);
        startActivity(intentGoBack);
    }
}
