
package com.example.demoexam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Map;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.L;

//Экран SignIn осуществляет авторизацию пользователя
//приложение имеет интегрированную базу данных
//содержащую информацию о паролях, логинах и электронных почтах пользователей приложения
public class SignIn extends AppCompatActivity {


    @Override
    //метод выполнения Activity
    //при вызове этого события отображает на экране дочерний xml-файл signin.xml
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signin);
    }


    //метод дает пользователю возможность входа в аккаунт
    //при успешном создании происходит переход на экран регистрациии
    public void onClickCreateAccount(View s){
        Intent intentCreateAccount = new Intent(SignIn.this, SignUp.class);
        startActivity(intentCreateAccount);
    }


        //данный метод считывает и проверяет на правильность
        //введенные пользователе данные
        //при ошибочном вводе всплывает окно "Неправильно"
        public void OnClickLogD (View l) {

            ImageView img = (ImageView) findViewById(R.id.Submit); //инициализация кнопки
            EditText log = (EditText)findViewById(R.id.Login); //инициализация поля ввода логина
            EditText pass = (EditText)findViewById(R.id.Password); //инициализация поля ввода пароля

            String logInput = (String) log.getText().toString();String passInput = (String) pass.getText().toString();Log.d("log",logInput);Log.d("pass",passInput); //выводит на экран введенные данные для проверки

            if(log.getText().toString().equals("serk") && pass.getText().toString().equals("123")) { //если введены правильные данные переходит на основной экран
                Intent intentLogPass = new Intent(SignIn.this, MapsActivity.class);
                startActivity(intentLogPass);
            }
            else if(!log.getText().toString().equals("serk") && !pass.getText().toString().equals("123")) { //если хотя бы одно поле введено неверно, выдает ошибку
                Toast toast = Toast.makeText(getApplicationContext(),
                        "Логин и|или пароль введен неправильно!", Toast.LENGTH_SHORT);
                toast.show();
            }

        }
}