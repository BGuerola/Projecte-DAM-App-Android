package com.example.seniortalentjobs.entities;

public class Usuari {
    public String usuari, contrasenya, email;

    public Usuari(String usuari, String contrasenya, String email) {
        this.usuari = usuari;
        this.contrasenya = contrasenya;
        this.email = email;
    }

    public String getUsuari() {
        return usuari;
    }

    public void setUsuari(String usuari) {
        this.usuari = usuari;
    }

    public String getContrasenya() {
        return contrasenya;
    }

    public void setContrasenya(String contrasenya) {
        this.contrasenya = contrasenya;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
