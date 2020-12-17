
package com.example.seniortalentjobs.entities;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Candidats {

    @SerializedName("idcand")
    @Expose
    private int idcand;
    @SerializedName("presentacion")
    @Expose
    private String presentacion;
    @SerializedName("nombre")
    @Expose
    private String nombre;
    @SerializedName("apellido1")
    @Expose
    private String apellido1;
    @SerializedName("apellidos2")
    @Expose
    private String apellidos2;
    @SerializedName("fchaNac")
    @Expose
    private String fchaNac;
    @SerializedName("sexo")
    @Expose
    private String sexo;
    @SerializedName("localidad")
    @Expose
    private String localidad;
    @SerializedName("codPostal")
    @Expose
    private long codPostal;
    @SerializedName("provincia")
    @Expose
    private String provincia;
    @SerializedName("vehiculo")
    @Expose
    private String vehiculo;
    @SerializedName("nacionalidad")
    @Expose
    private String nacionalidad;
    @SerializedName("permiso")
    @Expose
    private String permiso;
    @SerializedName("autonomo")
    @Expose
    private String autonomo;
    @SerializedName("comptPers")
    @Expose
    private String comptPers;
    @SerializedName("comptsoc")
    @Expose
    private String comptsoc;
    @SerializedName("comptdig")
    @Expose
    private String comptdig;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("situacionLaboral")
    @Expose
    private String situacionLaboral;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Candidats() {
    }

    /**
     * 
     * @param situacionLaboral
     * @param apellidos2
     * @param apellido1
     * @param presentacion
     * @param fchaNac
     * @param vehiculo
     * @param comptsoc
     * @param provincia
     * @param nombre
     * @param nacionalidad
     * @param idcand
     * @param comptdig
     * @param permiso
     * @param localidad
     * @param sexo
     * @param comptPers
     * @param codPostal
     * @param email
     * @param autonomo
     */
    public Candidats(int idcand, String presentacion, String nombre, String apellido1, String apellidos2, String fchaNac, String sexo, String localidad, long codPostal, String provincia, String vehiculo, String nacionalidad, String permiso, String autonomo, String comptPers, String comptsoc, String comptdig, String email, String situacionLaboral) {
        super();
        this.idcand = idcand;
        this.presentacion = presentacion;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellidos2 = apellidos2;
        this.fchaNac = fchaNac;
        this.sexo = sexo;
        this.localidad = localidad;
        this.codPostal = codPostal;
        this.provincia = provincia;
        this.vehiculo = vehiculo;
        this.nacionalidad = nacionalidad;
        this.permiso = permiso;
        this.autonomo = autonomo;
        this.comptPers = comptPers;
        this.comptsoc = comptsoc;
        this.comptdig = comptdig;
        this.email = email;
        this.situacionLaboral = situacionLaboral;
    }

    public int getIdcand() {
        return idcand;
    }

    public void setIdcand(int idcand) {
        this.idcand = idcand;
    }

    public String getPresentacion() {
        return presentacion;
    }

    public void setPresentacion(String presentacion) {
        this.presentacion = presentacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellidos2() {
        return apellidos2;
    }

    public void setApellidos2(String apellidos2) {
        this.apellidos2 = apellidos2;
    }

    public String getFchaNac() {
        return fchaNac;
    }

    public void setFchaNac(String fchaNac) {
        this.fchaNac = fchaNac;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public long getCodPostal() {
        return codPostal;
    }

    public void setCodPostal(long codPostal) {
        this.codPostal = codPostal;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(String vehiculo) {
        this.vehiculo = vehiculo;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getPermiso() {
        return permiso;
    }

    public void setPermiso(String permiso) {
        this.permiso = permiso;
    }

    public String getAutonomo() {
        return autonomo;
    }

    public void setAutonomo(String autonomo) {
        this.autonomo = autonomo;
    }

    public String getComptPers() {
        return comptPers;
    }

    public void setComptPers(String comptPers) {
        this.comptPers = comptPers;
    }

    public String getComptsoc() {
        return comptsoc;
    }

    public void setComptsoc(String comptsoc) {
        this.comptsoc = comptsoc;
    }

    public String getComptdig() {
        return comptdig;
    }

    public void setComptdig(String comptdig) {
        this.comptdig = comptdig;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSituacionLaboral() {
        return situacionLaboral;
    }

    public void setSituacionLaboral(String situacionLaboral) {
        this.situacionLaboral = situacionLaboral;
    }

}
