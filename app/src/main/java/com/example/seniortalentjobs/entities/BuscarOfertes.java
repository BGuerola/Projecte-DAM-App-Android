package com.example.seniortalentjobs.entities;

public class BuscarOfertes {
    Integer logoEmpresa;
    String puesto, empresa, fechaPublicacion, ubicacion, estado, salario;

    public Integer getLogoEmpresa() {
        return logoEmpresa;
    }

    public void setLogoEmpresa(Integer logoEmpresa) {
        this.logoEmpresa = logoEmpresa;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(String fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "BuscarOfertesAdapter{" +
                "logoEmpresa=" + logoEmpresa +
                ", puesto='" + puesto + '\'' +
                ", empresa='" + empresa + '\'' +
                ", fechaPublicacion='" + fechaPublicacion + '\'' +
                ", ubicacion='" + ubicacion + '\'' +
                ", estado='" + estado + '\'' +
                ", salario='" + salario + '\'' +
                '}';
    }

    public BuscarOfertes(Integer logoEmpresa, String puesto, String empresa, String fechaPublicacion, String ubicacion, String estado, String salario) {
        this.logoEmpresa = logoEmpresa;
        this.puesto = puesto;
        this.empresa = empresa;
        this.fechaPublicacion = fechaPublicacion;
        this.ubicacion = ubicacion;
        this.estado=estado;
        this.salario = salario;



    }

}
