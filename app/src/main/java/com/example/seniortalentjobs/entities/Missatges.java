package com.example.seniortalentjobs.entities;

public class Missatges {
    String nomempresa, data_missatge, missatge;
    Integer id_missatge, id_empresa, id_candidat;

    public Missatges(String nomempresa, String data_missatge, String missatge, Integer id_missatge, Integer id_empresa, Integer id_candidat) {
        this.nomempresa = nomempresa;
        this.data_missatge = data_missatge;
        this.missatge = missatge;
        this.id_missatge = id_missatge;
        this.id_empresa = id_empresa;
        this.id_candidat = id_candidat;
    }

    public Missatges(String nomempresa, String data_missatge) {
    }

    public String getNomempresa() {
        return nomempresa;
    }

    public void setNomempresa(String nomempresa) {
        this.nomempresa = nomempresa;
    }

    public String getData_missatge() {
        return data_missatge;
    }

    public void setData_missatge(String data_missatge) {
        this.data_missatge = data_missatge;
    }

    public String getMissatge() {
        return missatge;
    }

    public void setMissatge(String missatge) {
        this.missatge = missatge;
    }

    public Integer getId_missatge() {
        return id_missatge;
    }

    public void setId_missatge(Integer id_missatge) {
        this.id_missatge = id_missatge;
    }

    public Integer getId_empresa() {
        return id_empresa;
    }

    public void setId_empresa(Integer id_empresa) {
        this.id_empresa = id_empresa;
    }

    public Integer getId_candidat() {
        return id_candidat;
    }

    public void setId_candidat(Integer id_candidat) {
        this.id_candidat = id_candidat;
    }
}
