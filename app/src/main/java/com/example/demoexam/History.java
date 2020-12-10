

package com.example.demoexam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

//Класс History отображает информацию о последних заказах авторизированного пользователя
//на вкладке история можно увидеть марку машины, продолжительность поездки и ее стоимость
//этот класс вызывается при нажатии надписи "История" со вкладки Меню
public class History extends AppCompatActivity {

    @Override
    //метод выполнения Activity
    //при вызове этого события отображает на экране дочерний xml-файл history.xml
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.history);

    }

}