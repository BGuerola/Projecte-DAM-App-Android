
package com.example.seniortalentjobs.entities;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Alerta {

    @SerializedName("idalerta")
    @Expose
    private int idalerta;
    @SerializedName("denominacio")
    @Expose
    private String denominacio;
    @SerializedName("localitat")
    @Expose
    private String localitat;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Alerta() {
    }

    /**
     * 
     * @param denominacio
     * @param idalerta
     * @param localitat
     */
    public Alerta(int idalerta, String denominacio, String localitat) {
        super();
        this.idalerta = idalerta;
        this.denominacio = denominacio;
        this.localitat = localitat;
    }

    public long getIdalerta() {
        return idalerta;
    }

    public void setIdalerta(int idalerta) {
        this.idalerta = idalerta;
    }

    public String getDenominacio() {
        return denominacio;
    }

    public void setDenominacio(String denominacio) {
        this.denominacio = denominacio;
    }

    public String getLocalitat() {
        return localitat;
    }

    public void setLocalitat(String localitat) {
        this.localitat = localitat;
    }

}
