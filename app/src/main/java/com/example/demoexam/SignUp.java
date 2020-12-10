
package com.example.demoexam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

//Класс SignUp является окном регистрации нового пользователя
//добавляет введенные данные во внутреннюю
//базу данных приложения
public class SignUp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup); //при запуске вызывает экран signup.xml
    }

    public void OnClickProverka (View r) {

        ImageView img = (ImageView) findViewById(R.id.Reg); //инициализация кнопки
        EditText pas1 = (EditText)findViewById(R.id.Pass1); //инициализация поля ввода пароля
        EditText pas2 = (EditText)findViewById(R.id.Pass2); //инициализация поля ввода пароля


        //условие равенства двух введенных полей
        //проверка дублирования пароля

        if (pas1.getText().toString().equals(pas2.getText().toString())){
            Toast.makeText(this,"Пароли совпадают", Toast.LENGTH_SHORT).show(); //если оба поля заполнены одинаковыми значениями выводит положительное уведомление
        }
        else {
            Toast.makeText(this,"Пароли не совпадают", Toast.LENGTH_SHORT).show(); //если оба поля заполнены одинаковыми значениями выводит отрицательное уведомление
        }
    }
}