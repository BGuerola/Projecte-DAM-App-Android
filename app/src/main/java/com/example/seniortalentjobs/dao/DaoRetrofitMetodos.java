package com.example.seniortalentjobs.dao;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;
import com.example.seniortalentjobs.entities.Autenticats;
import com.example.seniortalentjobs.entities.Candidats;
import com.example.seniortalentjobs.entities.EstudiosNoReglados;
import com.example.seniortalentjobs.entities.EstudiosReglados;
import com.example.seniortalentjobs.entities.Experiencia;
import com.example.seniortalentjobs.entities.Idiomas;
import com.example.seniortalentjobs.entities.Missatges;
import com.example.seniortalentjobs.entities.OfertaTreball;
import com.example.seniortalentjobs.interfaces.RetrofitService;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import static androidx.constraintlayout.widget.Constraints.TAG;

public class DaoRetrofitMetodos {
    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("http://127.0.0.1:8080/")
            .addConverterFactory(GsonConverterFactory.create())
            .build();


    RetrofitService service = retrofit.create(RetrofitService.class);

    public void getAlerta(){}
    public void doAlerta(){}
    public void updateAlerta(){}
    public void deleteAlerta(){}


    /*public void getAutenticat(String email){
        Call<Autenticats> getAutenticat = service.getAutenticat(email);
        getAutenticat.enqueue(new Callback<Autenticats>() {
            @Override
            public void onResponse(Call<Autenticats> call, Response<Autenticats> response) {
                if (!response.isSuccessful())
                    System.out.println("No hay valores");
                else {
                    System.out.println(response);
                }
            }
            @Override
            public void onFailure(Call<Autenticats> call, Throwable t) {
                System.out.println("Error de conexión");

                Log.e(TAG, "Error: " + t.getMessage());
            }
        });
    }*/

    public void getAllOfertesTreball(){//s'han de posar variables per a fer CRUDS amb valors
        //tots els Strings se substituixen per objectes
        Call<List<OfertaTreball>> getLogin = service.getAllOfertesTreball();
        getLogin.enqueue(new Callback<List<OfertaTreball>>() {
            @Override
            public void onResponse(Call<List<OfertaTreball>> call, Response<List<OfertaTreball>> response) {
                if (!response.isSuccessful()) {
                    System.out.println("No hay valores");
                } else { //ací retorna l'objecte que se passara als xml
                    System.out.println(response);
                }
            }

            @Override
            public void onFailure(Call<List<OfertaTreball>> call, Throwable t) {
                //Toast.makeText(ctx, "Error de conexión", Toast.LENGTH_LONG).show();
                Log.e(TAG, "Error: " + t.getMessage());
            }
        });
    }

/*
    public void doInscripcio(final Context ctx){//s'han de posar variables per a fer CRUDS amb valors
        //tots els Strings se substituixen per objectes
        Call<> getLogin = service.doInscripcio();
        getLogin.enqueue(new Callback<String>() {
            @Override
            public void onResponse(Call<String> call, Response<String> response) {
                if (!response.isSuccessful()) {
                    Toast.makeText(ctx, "No hay valores", Toast.LENGTH_LONG).show();
                } else { //ací retorna l'objecte que se passara als xml
                    System.out.println(response);
                }
            }

            @Override
            public void onFailure(Call<String> call, Throwable t) {
                Toast.makeText(ctx, "Error de conexión", Toast.LENGTH_LONG).show();
                Log.e(TAG, "Error: " + t.getMessage());
            }
        });

    }
*/

    public void getEstNoReglados(final Context ctx, int idEstnoreglados){//s'han de posar variables per a fer CRUDS amb valors
        //tots els Strings se substituixen per objectes

        Call<EstudiosNoReglados> getEstNoReglados = service.getEstNoReglados(idEstnoreglados);
        getEstNoReglados.enqueue(new Callback<EstudiosNoReglados>() {
            @Override
            public void onResponse(Call<EstudiosNoReglados> call, Response<EstudiosNoReglados> response) {
                if (!response.isSuccessful()) {
                    Toast.makeText(ctx, "No hay valores", Toast.LENGTH_LONG).show();
                } else { //ací retorna l'objecte que se passara als xml
                    System.out.println(response);
                }
            }

            @Override
            public void onFailure(Call<EstudiosNoReglados> call, Throwable t) {
                Toast.makeText(ctx, "Error de conexión", Toast.LENGTH_LONG).show();
                Log.e(TAG, "Error: " + t.getMessage());
            }
        });
    }

    public void getEstReglados(final Context ctx, int idEstreglados ){//s'han de posar variables per a fer CRUDS amb valors
        //tots els Strings se substituixen per objectes
        Call<EstudiosReglados> getEstReglados = service.getEstReglados(idEstreglados);
        getEstReglados.enqueue(new Callback<EstudiosReglados>() {
            @Override
            public void onResponse(Call<EstudiosReglados> call, Response<EstudiosReglados> response) {
                if (!response.isSuccessful()) {
                    Toast.makeText(ctx, "No hay valores", Toast.LENGTH_LONG).show();
                } else { //ací retorna l'objecte que se passara als xml
                    System.out.println(response);
                }
            }

            @Override
            public void onFailure(Call<EstudiosReglados> call, Throwable t) {
                Toast.makeText(ctx, "Error de conexión", Toast.LENGTH_LONG).show();
                Log.e(TAG, "Error: " + t.getMessage());
            }
        });
    }

    public void getExperiencia(final Context ctx, int idexp){//s'han de posar variables per a fer CRUDS amb valors
        //tots els Strings se substituixen per objectes
        Call<Experiencia> getExperiencia = service.getExperiencia(idexp);
        getExperiencia.enqueue(new Callback<Experiencia>() {
            @Override
            public void onResponse(Call<Experiencia> call, Response<Experiencia> response) {
                if (!response.isSuccessful()) {
                    Toast.makeText(ctx, "No hay valores", Toast.LENGTH_LONG).show();
                } else { //ací retorna l'objecte que se passara als xml
                    System.out.println(response);
                }
            }

            @Override
            public void onFailure(Call<Experiencia> call, Throwable t) {
                Toast.makeText(ctx, "Error de conexión", Toast.LENGTH_LONG).show();
                Log.e(TAG, "Error: " + t.getMessage());
            }
        });

    }


    public void getCandidat(){}

    public void getCandidatpelNom(final Context ctx, int idcand){//s'han de posar variables per a fer CRUDS amb valors
        //tots els Strings se substituixen per objectes
        Call<Candidats> getCandidatpelNom = service.getCandidat(idcand);
        getCandidatpelNom.enqueue(new Callback<Candidats>() {
            @Override
            public void onResponse(Call<Candidats> call, Response<Candidats> response) {
                if (!response.isSuccessful()) {
                    Toast.makeText(ctx, "No hay valores", Toast.LENGTH_LONG).show();
                } else { //ací retorna l'objecte que se passara als xml
                    System.out.println(response);
                }
            }

            @Override
            public void onFailure(Call<Candidats> call, Throwable t) {
                Toast.makeText(ctx, "Error de conexión", Toast.LENGTH_LONG).show();
                Log.e(TAG, "Error: " + t.getMessage());
            }
        });

    }

    public void  getIdiomas(final Context ctx, int idIdiomas){//s'han de posar variables per a fer CRUDS amb valors
        //tots els Strings se substituixen per objectes
        Call<Idiomas>  getIdiomas = service.getIdiomas(idIdiomas);
        getIdiomas.enqueue(new Callback<Idiomas>() {
            @Override
            public void onResponse(Call<Idiomas> call, Response<Idiomas> response) {
                if (!response.isSuccessful()) {
                    Toast.makeText(ctx, "No hay valores", Toast.LENGTH_LONG).show();
                } else { //ací retorna l'objecte que se passara als xml
                    System.out.println(response);
                }
            }

            @Override
            public void onFailure(Call<Idiomas> call, Throwable t) {
                Toast.makeText(ctx, "Error de conexión", Toast.LENGTH_LONG).show();
                Log.e(TAG, "Error: " + t.getMessage());
            }
        });

    }

    public void getMissatges(){}

    public void getMissatgePelIdcands(final Context ctx, int idcand){//s'han de posar variables per a fer CRUDS amb valors
        //tots els Strings se substituixen per objectes
        Call<Missatges> getLogin = service.getMissatgePelIdcands(idcand);
        getLogin.enqueue(new Callback<Missatges>() {
            @Override
            public void onResponse(Call<Missatges> call, Response<Missatges> response) {
                if (!response.isSuccessful()) {
                    Toast.makeText(ctx, "No hay valores", Toast.LENGTH_LONG).show();
                } else { //ací retorna l'objecte que se passara als xml
                    System.out.println(response);
                }
            }

            @Override
            public void onFailure(Call<Missatges> call, Throwable t) {
                Toast.makeText(ctx, "Error de conexión", Toast.LENGTH_LONG).show();
                Log.e(TAG, "Error: " + t.getMessage());
            }
        });

    }

}







