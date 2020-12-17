package com.example.seniortalentjobs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import com.example.seniortalentjobs.entities.Autenticats;
import com.example.seniortalentjobs.interfaces.RetrofitService;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import com.example.seniortalentjobs.utilidades.Commons;

import static androidx.constraintlayout.widget.Constraints.TAG;

public class AutenticacioActivity extends AppCompatActivity {

    EditText mail, contrasenya;
    Autenticats usuari=new Autenticats();

    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("http://10.0.2.2:8080")
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    RetrofitService service = retrofit.create(RetrofitService.class);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_autenticacio);

        mail = findViewById(R.id.loginmail);
        contrasenya = findViewById(R.id.loginpassword);
    }

    public void GuardarCredencials(View view) {
        SharedPreferences prefs = getSharedPreferences("datos", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();
        editor.clear();
        editor.commit();
        editor.putString("email", mail.getText().toString());
        editor.putString("contrasenya", contrasenya.getText().toString());
        editor.commit();
        //finish();
    }

    public void CargarCredencials(View view) {
        SharedPreferences prefs = getSharedPreferences("datos", Context.MODE_PRIVATE);
        String b = prefs.getString("email", "No existe información");
        String c = prefs.getString("contrasenya", "No existe información");
        mail.setText(b);
        contrasenya.setText(c);
    }

    public void Login(View view) {

            SharedPreferences prefs = getSharedPreferences("datos", Context.MODE_PRIVATE);
            String b = prefs.getString("email", "No existe información");

            try {
            getLogin(b);
            if (!usuari.getEmail().isEmpty()){

/*            ((usuari.getEmail() == mail.getText().toString()) &&
                    (usuari.getContrasenya() == contrasenya.getText().toString())) */

                Toast.makeText(this, "Bienvenido "+usuari.getUsuari(), Toast.LENGTH_SHORT).show();
                Commons.socusuari=true;
            } else {
                Toast.makeText(this, "No te has autenticado. Solamente podrás ver las ofertas", Toast.LENGTH_SHORT).show();
            }
        } catch (Exception e) {
            Toast.makeText(this, "No se ha podido realizar la conexión", Toast.LENGTH_SHORT).show();
        } finally {
            esperarylanzar();
        }
    }

    public void getLogin(String b){
        Call<Autenticats> getAutenticat = service.getAutenticat(b);
        getAutenticat.enqueue(new Callback<Autenticats>() {
            @Override
            public void onResponse(Call<Autenticats> call, Response<Autenticats> response) {
                if (!response.isSuccessful())
                    System.out.println("No hay valores");

                else {
                    System.out.println(response);
                    Autenticats usuari = new Autenticats(response.body().getEmail(),
                            response.body().getTipo(),
                            response.body().getUsuari(),
                            response.body().getContrasenya());
                    Commons.nomUsuari=response.body().getUsuari();
                }
            }
            @Override
            public void onFailure(Call<Autenticats> call, Throwable t) {
                System.out.println("Error de conexión");

                Log.e(TAG, "Error: " + t.getMessage());
            }
        });
    }

    private void esperarylanzar() {
            new Handler().postDelayed(new Runnable() {
                public void run() {
                    // Cuando pasen los 2 segundos, pasamos a la actividad principal de la aplicación
                    Intent intent = new Intent(AutenticacioActivity.this, MainActivity.class);
                    startActivity(intent);
                    finish();
                }
            }, 1500);
        }
}