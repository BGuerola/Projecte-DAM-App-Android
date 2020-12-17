
package com.example.seniortalentjobs.entities;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Idiomas {

    @SerializedName("id_cand")
    @Expose
    private int idCand;
    @SerializedName("id_idiomas")
    @Expose
    private int idIdiomas;
    @SerializedName("id_ofertatreball")
    @Expose
    private long idOfertatreball;
    @SerializedName("nivel")
    @Expose
    private String nivel;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Idiomas() {
    }

    /**
     * 
     * @param idCand
     * @param idIdiomas
     * @param nivel
     * @param idOfertatreball
     */
    public Idiomas(int idCand, int idIdiomas, long idOfertatreball, String nivel) {
        super();
        this.idCand = idCand;
        this.idIdiomas = idIdiomas;
        this.idOfertatreball = idOfertatreball;
        this.nivel = nivel;
    }

    public int getIdCand() {
        return idCand;
    }

    public void setIdCand(int idCand) {
        this.idCand = idCand;
    }

    public long getIdIdiomas() {
        return idIdiomas;
    }

    public void setIdIdiomas(int idIdiomas) {
        this.idIdiomas = idIdiomas;
    }

    public long getIdOfertatreball() {
        return idOfertatreball;
    }

    public void setIdOfertatreball(long idOfertatreball) {
        this.idOfertatreball = idOfertatreball;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

}
