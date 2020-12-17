
package com.example.seniortalentjobs.entities;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Autenticats {

    @SerializedName("usuari")
    @Expose
    private String usuari;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("contrasenya")
    @Expose
    private String contrasenya;
    @SerializedName("tipo")
    @Expose
    private String tipo;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Autenticats() {
    }

    /**
     * 
     * @param tipo
     * @param usuari
     * @param contrasenya
     * @param email
     */
    public Autenticats(String email, String tipo, String usuari, String contrasenya) {
        super();
        this.usuari = usuari;
        this.email = email;
        this.contrasenya = contrasenya;
        this.tipo = tipo;
    }

    public String getUsuari() {
        return usuari;
    }

    public void setUsuari(String usuari) {
        this.usuari = usuari;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContrasenya() {
        return contrasenya;
    }

    public void setContrasenya(String contrasenya) {
        this.contrasenya = contrasenya;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}
