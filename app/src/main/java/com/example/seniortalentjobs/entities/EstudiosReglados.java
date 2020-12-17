
package com.example.seniortalentjobs.entities;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class EstudiosReglados {

    @SerializedName("id_estreglados")
    @Expose
    private int idEstreglados;
    @SerializedName("id_cand")
    @Expose
    private long idCand;
    @SerializedName("nivel")
    @Expose
    private String nivel;
    @SerializedName("t\u00edtulo")
    @Expose
    private String tTulo;
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
    public EstudiosReglados() {
    }

    /**
     * 
     * @param idCand
     * @param tTulo
     * @param fchaFin
     * @param centro
     * @param fchaInicio
     * @param nivel
     * @param idEstreglados
     */
    public EstudiosReglados(int idEstreglados, long idCand, String nivel, String tTulo, String fchaInicio, String fchaFin, String centro) {
        super();
        this.idEstreglados = idEstreglados;
        this.idCand = idCand;
        this.nivel = nivel;
        this.tTulo = tTulo;
        this.fchaInicio = fchaInicio;
        this.fchaFin = fchaFin;
        this.centro = centro;
    }

    public int getIdEstreglados() {
        return idEstreglados;
    }

    public void setIdEstreglados(int idEstreglados) {
        this.idEstreglados = idEstreglados;
    }

    public long getIdCand() {
        return idCand;
    }

    public void setIdCand(long idCand) {
        this.idCand = idCand;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public String getTTulo() {
        return tTulo;
    }

    public void setTTulo(String tTulo) {
        this.tTulo = tTulo;
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
