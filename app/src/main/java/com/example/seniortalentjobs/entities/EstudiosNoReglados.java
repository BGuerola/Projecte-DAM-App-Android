
package com.example.seniortalentjobs.entities;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class EstudiosNoReglados {

    @SerializedName("id_estnoreglados")
    @Expose
    private int idEstnoreglados;
    @SerializedName("id_cand")
    @Expose
    private long idCand;
    @SerializedName("curso")
    @Expose
    private String curso;
    @SerializedName("fchaInicio")
    @Expose
    private String fchaInicio;
    @SerializedName("fchaFin")
    @Expose
    private String fchaFin;
    @SerializedName("centro")
    @Expose
    private String centro;

    /**
     * No args constructor for use in serialization
     * 
     */
    public EstudiosNoReglados() {
    }

    /**
     * 
     * @param idEstnoreglados
     * @param idCand
     * @param curso
     * @param fchaFin
     * @param centro
     * @param fchaInicio
     */
    public EstudiosNoReglados(int idEstnoreglados, long idCand, String curso, String fchaInicio, String fchaFin, String centro) {
        super();
        this.idEstnoreglados = idEstnoreglados;
        this.idCand = idCand;
        this.curso = curso;
        this.fchaInicio = fchaInicio;
        this.fchaFin = fchaFin;
        this.centro = centro;
    }

    public int getIdEstnoreglados() {
        return idEstnoreglados;
    }

    public void setIdEstnoreglados(int idEstnoreglados) {
        this.idEstnoreglados = idEstnoreglados;
    }

    public long getIdCand() {
        return idCand;
    }

    public void setIdCand(long idCand) {
        this.idCand = idCand;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
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

    public String getCentro() {
        return centro;
    }

    public void setCentro(String centro) {
        this.centro = centro;
    }

}
