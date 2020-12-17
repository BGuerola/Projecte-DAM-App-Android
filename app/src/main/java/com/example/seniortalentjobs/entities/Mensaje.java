
package com.example.seniortalentjobs.entities;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Mensaje {

    @SerializedName("idmissat")
    @Expose
    private int idmissat;
    @SerializedName("idcand")
    @Expose
    private long idcand;
    @SerializedName("dataMstg")
    @Expose
    private String dataMstg;
    @SerializedName("misstg")
    @Expose
    private String misstg;
    @SerializedName("cif")
    @Expose
    private String cif;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Mensaje() {
    }

    /**
     * 
     * @param cif
     * @param idmissat
     * @param misstg
     * @param idcand
     * @param dataMstg
     */
    public Mensaje(int idmissat, long idcand, String dataMstg, String misstg, String cif) {
        super();
        this.idmissat = idmissat;
        this.idcand = idcand;
        this.dataMstg = dataMstg;
        this.misstg = misstg;
        this.cif = cif;
    }

    public long getIdmissat() {
        return idmissat;
    }

    public void setIdmissat(int idmissat) {
        this.idmissat = idmissat;
    }

    public long getIdcand() {
        return idcand;
    }

    public void setIdcand(long idcand) {
        this.idcand = idcand;
    }

    public String getDataMstg() {
        return dataMstg;
    }

    public void setDataMstg(String dataMstg) {
        this.dataMstg = dataMstg;
    }

    public String getMisstg() {
        return misstg;
    }

    public void setMisstg(String misstg) {
        this.misstg = misstg;
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

}
