package com.example.seniortalentjobs.entities;

public class Usuari {
    public String usuari, email, contrasenya;

    public Usuari(String usuari, String email, String contrasenya) {
        this.usuari = usuari;
        this.email = email;
        this.contrasenya = contrasenya;
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
