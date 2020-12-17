package com.example.seniortalentjobs.entities;

import java.io.Serializable;

public class OfertaProvisional implements Serializable {

    String nom;
    String empresa;
    String ubicacio;
    int salari;

    public OfertaProvisional() {
    }

    public OfertaProvisional(String nom, String empresa, String ubicacio, int salari) {
        this.nom = nom;
        this.empresa = empresa;
        this.ubicacio = ubicacio;
        this.salari = salari;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getUbicacio() {
        return ubicacio;
    }

    public void setUbicacio(String ubicacio) {
        this.ubicacio = ubicacio;
    }

    public int getSalari() {
        return salari;
    }

    public void setSalari(int salari) {
        this.salari = salari;
    }
}
