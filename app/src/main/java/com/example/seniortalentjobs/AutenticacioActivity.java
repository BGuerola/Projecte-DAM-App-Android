package com.example.seniortalentjobs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class AutenticacioActivity extends AppCompatActivity {

    EditText usuari, mail, contrasenya;
    //TextView prueba;
    private final int DURACION_SPLASH = 3000;
    SharedPreferences prefs;// = PreferenceManager.getDefaultSharedPreferences(this);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_autenticacio);

        usuari = findViewById(R.id.loginusuario);
        mail = findViewById(R.id.loginmail);
        contrasenya = findViewById(R.id.loginpassword);
        //prueba = (TextView) findViewById(R.id.loginprueba);

//        usuari.setText(prefs.getString("usuario", String.valueOf(usuari)));
//        mail.setText(prefs.getString("email", String.valueOf(mail)));
//        contrasenya.setText(prefs.getString("contrasenya", String.valueOf(contrasenya)));
    }


    public void OnclickLogin(View view) {
        prefs=getSharedPreferences("datos", Context.MODE_PRIVATE);
        //SharedPreferences prefs = this.getSharedPreferences("com.example.miaplicacion", Context.MODE_PRIVATE);
        //usuari.setText(prefe.getString("usuario",""));
        SharedPreferences.Editor editor = prefs.edit();
        editor.clear();
        editor.commit();
        editor.putString("usuario", usuari.getText().toString());
        editor.putString("email", mail.getText().toString());
        editor.putString("contrasenya", contrasenya.getText().toString());
        editor.commit();
        //finish();

        String a = prefs.getString("usuario", null);
        String b = prefs.getString("email", null);
        String c = prefs.getString("contrasenya", null);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        new Handler().postDelayed(new Runnable(){
            public void run(){
                // Cuando pasen los 3 segundos, pasamos a la actividad principal de la aplicación
                Intent intent = new Intent(AutenticacioActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            };
        }, DURACION_SPLASH);

    }
}