
package com.example.demoexam;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

//Класс Settings содержит значения имени пользователя
//количество часов в пути, затраченные за это время средства,
//электронную почту, на которую зарегистрирован аккаунт
//и кнопку с возможностью выхода из приложения
public class Settings extends AppCompatActivity {

    @Override
    //метод выполнения Activity
    //при вызове этого события отображает на экране дочерний xml-файл settings.xml
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings);
    }

    //простой командный выход из приложения посредством нажатия
    //на кнопку выйти
    //стирает приложение по завершению из диспетчера задач
    public void onClickExit (View o) {
        this.finishAffinity();
    }

}