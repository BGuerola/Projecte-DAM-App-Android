package com.example.seniortalentjobs.utilidades;

import kotlin.text.StringsKt;

public class Utilidades {

    //Constants taula missatges
    public static final String TABLA_MENSAJES="Mensajes";
    public static final String CAMPO_IDMENS="id_Empresa";
    public static final String CAMPO_IDEMP="id_Empresa";
    public static final String CAMPO_NOMEMPRESA="Nombre Empresa";
    public static final String CAMPO_IDCAND="id_Candididato";
    public static final String CAMPO_DATAMISS="Fecha Mensaje";
    public static final String CAMPO_MENSAJE="Mensaje";

    public static final String CREAR_TABLA_USUARIO = "CREATE TABLE " +TABLA_MENSAJES+" ("
            +CAMPO_IDMENS+" INTEGER, "
            +CAMPO_IDEMP+" INTEGER, "
            +CAMPO_NOMEMPRESA+" TEXT, "
            +CAMPO_IDCAND+" INTEGER)"
            +CAMPO_DATAMISS+" TEXT)"
            +CAMPO_MENSAJE+" TEXT)";

    //Constants taula missatges
}
