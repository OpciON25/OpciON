package com.ocion.models;

import java.time.LocalDate;

/*import java.lang.*;
import java.time.*;
import java.io.*; */

public class Empresa extends Usuario{
    private String nombreEmpresa;
    private String CIF;
    private LocalDate fechaAlta;
    private String calle;
    private String ciudad;
    private String provincia;
    private int telefono;
    private Oferta[] ofertasActivas;

    public Empresa(String CIF, String calle, String ciudad, LocalDate fechaAlta,
         String nombreEmpresa, Oferta[] ofertasActivas, String provincia, int telefono,
          int id, String email, String password) {
        super(id, email, password); //atributos de la clase madre
        this.CIF = CIF;
        this.calle = calle;
        this.ciudad = ciudad;
        this.fechaAlta = fechaAlta;
        this.nombreEmpresa = nombreEmpresa;
        this.ofertasActivas = ofertasActivas;
        this.provincia = provincia;
        this.telefono = telefono;
    }

    

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getCIF() {
        return CIF;
    }

    public void setCIF(String CIF) {
        this.CIF = CIF;
    }

    public LocalDate getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(LocalDate fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public Oferta[] getOfertasActivas() {
        return ofertasActivas;
    }

    public void setOfertasActivas(Oferta[] ofertasActivas) {
        this.ofertasActivas = ofertasActivas;
    }

    



   
}