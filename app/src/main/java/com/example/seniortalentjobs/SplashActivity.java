package com.example.seniortalentjobs;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.preference.PreferenceManager;
import android.util.Log;

import java.io.File;

public class SplashActivity extends Activity {

    // Duración en milisegundos que se mostrará el splash
    private final int DURACION_SPLASH = 3000; // 3 segundos
    //SharedPreferences prefs=getSharedPreferences("datos", Context.MODE_PRIVATE);

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Tenemos una plantilla llamada splash.xml donde mostraremos la información que queramos (logotipo, etc.)
        setContentView(R.layout.splash_layout);


                Intent intentAutent = new Intent(SplashActivity.this, AutenticacioActivity.class);
                Intent intentMainAc = new Intent(SplashActivity.this, MainActivity.class);

                if (preferenceFileExist("datos") == false){
                    startActivity(intentMainAc);
                } else {
                    SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
                    String a = prefs.getString("usuario", null);
                    String b = prefs.getString("email", null);
                    String c = prefs.getString("contrasenya", null);

                    if ((a != null) && (b != null) && (c != null)) {
                        startActivity(intentMainAc);
                    } else {
                        startActivity(intentAutent);
                            }
                }

                finish();

        new Handler().postDelayed(new Runnable(){
            public void run(){
                // Cuando pasen los 3 segundos, pasamos a la actividad principal de la aplicación

            };
        }, DURACION_SPLASH);
    }

    public boolean preferenceFileExist(String fileName) {
        File f = new File(getApplicationContext().getApplicationInfo().dataDir + "/shared_prefs/"
                + fileName + ".xml");
        return f.exists();
    }
}