
package com.example.demoexam;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

//Класс Лаунч-скрин появляется при каждом повторном запуске приложения и
//исчезает через некоторое программно заданное время
public class LaunchScreen extends AppCompatActivity {

    @Override
    //метод выполнения Activity
    //при вызове этого события отображает на экране дочерний xml-файл launchscreen.xml
    //впоследствии создает таймер перехода (исчезновения) на следующую страницу
    //регистрации
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.launchscreen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(LaunchScreen.this, SignIn.class); //осуществляет переход на экран авторизации
                startActivity(i);
                finish();
            }
        },  5*600);
    }


    }





