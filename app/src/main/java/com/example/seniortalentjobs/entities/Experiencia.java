
package com.example.seniortalentjobs.entities;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Experiencia {

    @SerializedName("idexp")
    @Expose
    private int idexp;
    @SerializedName("nomEmp")
    @Expose
    private String nomEmp;
    @SerializedName("nomPuesto")
    @Expose
    private String nomPuesto;
    @SerializedName("funciones")
    @Expose
    private String funciones;
    @SerializedName("salario")
    @Expose
    private String salario;
    @SerializedName("fchaInicio")
    @Expose
    private String fchaInicio;
    @SerializedName("fchaFin")
    @Expose
    private String fchaFin;
    @SerializedName("paxacargo")
    @Expose
    private String paxacargo;
    @SerializedName("id_cand")
    @Expose
    private long idCand;
    @SerializedName("cif")
    @Expose
    private String cif;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Experiencia() {
    }

    /**
     * 
     * @param cif
     * @param idCand
     * @param idexp
     * @param funciones
     * @param salario
     * @param fchaFin
     * @param paxacargo
     * @param fchaInicio
     * @param nomEmp
     * @param nomPuesto
     */
    public Experiencia(int idexp, String nomEmp, String nomPuesto, String funciones, String salario, String fchaInicio, String fchaFin, String paxacargo, long idCand, String cif) {
        super();
        this.idexp = idexp;
        this.nomEmp = nomEmp;
        this.nomPuesto = nomPuesto;
        this.funciones = funciones;
        this.salario = salario;
        this.fchaInicio = fchaInicio;
        this.fchaFin = fchaFin;
        this.paxacargo = paxacargo;
        this.idCand = idCand;
        this.cif = cif;
    }

    public int getIdexp() {
        return idexp;
    }

    public void setIdexp(int idexp) {
        this.idexp = idexp;
    }

    public String getNomEmp() {
        return nomEmp;
    }

    public void setNomEmp(String nomEmp) {
        this.nomEmp = nomEmp;
    }

    public String getNomPuesto() {
        return nomPuesto;
    }

    public void setNomPuesto(String nomPuesto) {
        this.nomPuesto = nomPuesto;
    }

    public String getFunciones() {
        return funciones;
    }

    public void setFunciones(String funciones) {
        this.funciones = funciones;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public String getFchaInicio() {
        return fchaInicio;
    }

    public void setFchaInicio(String fchaInicio) {
        this.fchaInicio = fchaInicio;
    }

    public String getFchaFin() {
        return fchaFin;
    }

    public void setFchaFin(String fchaFin) {
        this.fchaFin = fchaFin;
    }

    public String getPaxacargo() {
        return paxacargo;
    }

    public void setPaxacargo(String paxacargo) {
        this.paxacargo = paxacargo;
    }

    public long getIdCand() {
        return idCand;
    }

    public void setIdCand(long idCand) {
        this.idCand = idCand;
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

}
