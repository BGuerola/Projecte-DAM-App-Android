package com.example.seniortalentjobs.interfaces;

import com.example.seniortalentjobs.entities.Alerta;
import com.example.seniortalentjobs.entities.Autenticats;
import com.example.seniortalentjobs.entities.Candidats;
import com.example.seniortalentjobs.entities.EstudiosNoReglados;
import com.example.seniortalentjobs.entities.EstudiosReglados;
import com.example.seniortalentjobs.entities.Experiencia;
import com.example.seniortalentjobs.entities.Idiomas;
import com.example.seniortalentjobs.entities.Missatges;
import com.example.seniortalentjobs.entities.OfertaTreball;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.DELETE;
import retrofit2.http.Field;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface RetrofitService {


        @GET("/alerta/{id}")
        Call<Alerta>getAlerta(@Path("id") int idalerta);

        @POST("/alerta")
        Call<Alerta>doAlerta(@Field ("denominacio") String denominacio,
                            @Field("localitat") String localitat);

        @PUT("/alerta/{id}")
        Call<Alerta>updateAlerta(@Path("id") int idalerta,
                                @Field ("denominacio") String denominacio,
                                @Field("localitat") String localitat);

        @DELETE("/alerta/{id}")
        Call<Alerta>deleteAlerta(@Path("id") int idalerta);

        @GET("/autenticats/{email}")
        Call<Autenticats>getAutenticat(@Path("email") String email);

        @GET("/candidato/{id}")
        Call<Candidats>getCandidat(@Path("id") int idcand);

        @GET("/candidato/{email}")
        Call<Candidats>getCandidatpelNom(@Path("email") String email);

        @GET("/estudiosnoreglados/{id}")
        Call<EstudiosNoReglados>getEstNoReglados(@Path("id") int idEstnoreglados);

        @GET("/estudiosreglados/{id}")
        Call<EstudiosReglados>getEstReglados(@Path("id") int idEstreglados);

        @GET("/experiencia/{id}")
        Call<Experiencia>getExperiencia(@Path("email") int idexp);

        @GET("/idiomas/{id}")
        Call<Idiomas>getIdiomas(@Path("id") int idIdiomas);

        @GET("/mensajes/{id}")
        Call<Missatges>getMissatges(@Path("id") int idcand);

        @GET("/mensajes/{id}")
        Call<Missatges>getMissatgePelIdcands(@Path("id") int idcand);

        @GET("/ofertatreball")
        Call<List<OfertaTreball>>getAllOfertesTreball();

        @GET("/ofertatreball/{id}")
        Call<OfertaTreball>getOfertaTreball(@Path("id") int id);

    /*
    Falta fer els get de inscritos

    GET     http://127.0.0.1:8080/alerta                NO
    GET     http://127.0.0.1:8080/alerta/?id=1          SI
    POST    http://127.0.0.1:8080/alerta                SI
    PUT     http://127.0.0.1:8080/alerta/?id=           SI
    DELETE  http://127.0.0.1:8080/alerta/?id=           SI
    GET     http://localhost:8080/autenticats           NO
    GET     http://localhost:8080/autenticats/?id=1     SI
    GET     http://localhost:8080/candidato             fer query busqueda individual
    GET     http://localhost:8080/candidato/?id=1       SI
    GET     http://127.0.0.1:8080/estudiosnoreglados        NO
    GET     http://127.0.0.1:8080/estudiosnoreglados?id     SI
    GET     http://127.0.0.1:8080/estudiosreglados          NO
    GET     http://127.0.0.1:8080/estudiosreglados?id       SI
    GET     http://127.0.0.1:8080/experiencia               NO
    GET     http://127.0.0.1:8080/experiencia/?id           SI
    GET     http://127.0.0.1:8080/idiomas                   NO
    GET     http://127.0.0.1:8080/idiomas?id                SI
    GET     http://127.0.0.1:8080/inscritos                 NO
    GET     http://127.0.0.1:8080/inscritos/?id             fer query búsqueda individual
    POST    http://127.0.0.1:8080/inscritos                 SI
    GET     http://127.0.0.1:8080/mensajes                  fer query busqueda individual
    GET     http://127.0.0.1:8080/mensajes/?id              SI
    GET     http://127.0.0.1:8080/ofertatrabajo             SI
    GET     http://127.0.0.1:8080/ofertatrabajo/?id         SI
    */
}
