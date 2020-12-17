
package com.example.seniortalentjobs.entities;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class OfertaTreball {

    @SerializedName("idOfertaTreb")
    @Expose
    private long idOfertaTreb;
    @SerializedName("publicada")
    @Expose
    private String publicada;
    @SerializedName("nomPuesto")
    @Expose
    private String nomPuesto;
    @SerializedName("experiencia")
    @Expose
    private String experiencia;
    @SerializedName("requisitos")
    @Expose
    private String requisitos;
    @SerializedName("estudios")
    @Expose
    private String estudios;
    @SerializedName("residencia")
    @Expose
    private String residencia;
    @SerializedName("conocimientos")
    @Expose
    private String conocimientos;
    @SerializedName("funciones")
    @Expose
    private String funciones;
    @SerializedName("paxacargo")
    @Expose
    private long paxacargo;
    @SerializedName("nvacantes")
    @Expose
    private long nvacantes;
    @SerializedName("durCont")
    @Expose
    private String durCont;
    @SerializedName("horario")
    @Expose
    private String horario;
    @SerializedName("sector")
    @Expose
    private String sector;
    @SerializedName("categoria")
    @Expose
    private String categoria;
    @SerializedName("nivel")
    @Expose
    private String nivel;
    @SerializedName("tiposal")
    @Expose
    private String tiposal;
    @SerializedName("maxSal")
    @Expose
    private long maxSal;
    @SerializedName("minSal")
    @Expose
    private long minSal;
    @SerializedName("benefSoc")
    @Expose
    private String benefSoc;
    @SerializedName("cif")
    @Expose
    private String cif;

    /**
     * No args constructor for use in serialization
     * 
     */
    public OfertaTreball() {
    }

    /**
     * 
     * @param cif
     * @param nvacantes
     * @param horario
     * @param residencia
     * @param categoria
     * @param benefSoc
     * @param idOfertaTreb
     * @param publicada
     * @param estudios
     * @param nomPuesto
     * @param durCont
     * @param requisitos
     * @param funciones
     * @param tiposal
     * @param maxSal
     * @param experiencia
     * @param paxacargo
     * @param minSal
     * @param conocimientos
     * @param sector
     * @param nivel
     */
    public OfertaTreball(long idOfertaTreb, String publicada, String nomPuesto, String experiencia, String requisitos, String estudios, String residencia, String conocimientos, String funciones, long paxacargo, long nvacantes, String durCont, String horario, String sector, String categoria, String nivel, String tiposal, long maxSal, long minSal, String benefSoc, String cif) {
        super();
        this.idOfertaTreb = idOfertaTreb;
        this.publicada = publicada;
        this.nomPuesto = nomPuesto;
        this.experiencia = experiencia;
        this.requisitos = requisitos;
        this.estudios = estudios;
        this.residencia = residencia;
        this.conocimientos = conocimientos;
        this.funciones = funciones;
        this.paxacargo = paxacargo;
        this.nvacantes = nvacantes;
        this.durCont = durCont;
        this.horario = horario;
        this.sector = sector;
        this.categoria = categoria;
        this.nivel = nivel;
        this.tiposal = tiposal;
        this.maxSal = maxSal;
        this.minSal = minSal;
        this.benefSoc = benefSoc;
        this.cif = cif;
    }

    public long getIdOfertaTreb() {
        return idOfertaTreb;
    }

    public void setIdOfertaTreb(long idOfertaTreb) {
        this.idOfertaTreb = idOfertaTreb;
    }

    public String getPublicada() {
        return publicada;
    }

    public void setPublicada(String publicada) {
        this.publicada = publicada;
    }

    public String getNomPuesto() {
        return nomPuesto;
    }

    public void setNomPuesto(String nomPuesto) {
        this.nomPuesto = nomPuesto;
    }

    public String getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }

    public String getRequisitos() {
        return requisitos;
    }

    public void setRequisitos(String requisitos) {
        this.requisitos = requisitos;
    }

    public String getEstudios() {
        return estudios;
    }

    public void setEstudios(String estudios) {
        this.estudios = estudios;
    }

    public String getResidencia() {
        return residencia;
    }

    public void setResidencia(String residencia) {
        this.residencia = residencia;
    }

    public String getConocimientos() {
        return conocimientos;
    }

    public void setConocimientos(String conocimientos) {
        this.conocimientos = conocimientos;
    }

    public String getFunciones() {
        return funciones;
    }

    public void setFunciones(String funciones) {
        this.funciones = funciones;
    }

    public long getPaxacargo() {
        return paxacargo;
    }

    public void setPaxacargo(long paxacargo) {
        this.paxacargo = paxacargo;
    }

    public long getNvacantes() {
        return nvacantes;
    }

    public void setNvacantes(long nvacantes) {
        this.nvacantes = nvacantes;
    }

    public String getDurCont() {
        return durCont;
    }

    public void setDurCont(String durCont) {
        this.durCont = durCont;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public String getTiposal() {
        return tiposal;
    }

    public void setTiposal(String tiposal) {
        this.tiposal = tiposal;
    }

    public long getMaxSal() {
        return maxSal;
    }

    public void setMaxSal(long maxSal) {
        this.maxSal = maxSal;
    }

    public long getMinSal() {
        return minSal;
    }

    public void setMinSal(long minSal) {
        this.minSal = minSal;
    }

    public String getBenefSoc() {
        return benefSoc;
    }

    public void setBenefSoc(String benefSoc) {
        this.benefSoc = benefSoc;
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

}
