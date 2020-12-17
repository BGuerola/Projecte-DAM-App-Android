package com.example.seniortalentjobs.utilidades;

public class Commons {

    private static final String TAG = "Funciona: ";
    public static boolean socusuari=false;
    public static String nomUsuari="SENIOR TALENT JOBS";
    public static String getFitxer = "ofertesTreball.txt";

    public static final String TABLA_MENSAJES="Mensajes";
    public static final String CAMPO_IDMENS="idMensaje";
    public static final String CAMPO_IDEMP="idEmpresa";
    public static final String CAMPO_IDCAND="idCandidato";
    public static final String CAMPO_DATAMISS="FechaMensaje";
    public static final String CAMPO_MENSAJE="Mensaje";

    public static final String CREAR_TABLA_USUARIO = "CREATE TABLE " +TABLA_MENSAJES+" ("
            +CAMPO_IDMENS+" TEXT,"
            +CAMPO_IDEMP+" TEXT,"
            +CAMPO_IDCAND+" TEXT,"
            +CAMPO_DATAMISS+" TEXT,"
            +CAMPO_MENSAJE+" TEXT)";
}