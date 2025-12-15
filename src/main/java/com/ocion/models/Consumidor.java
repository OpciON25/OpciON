package com.ocion.models;

import java.time.LocalDate;

/*import java.lang.*;
import java.time.*;
import java.io.*;*/

public class Consumidor extends Usuario{

    
    private String nombre;
    private LocalDate fechaAlta;
    private String calle;
    private String numeroCasa;
    private String ciudad;
    private String provincia;
    private int CP;
    private int telefono;
    private Suscripcion suscripcion;

    public Consumidor(String calle, String ciudad, LocalDate fechaAlta, int id, String nombre,
         String numeroCasa, String provincia, int CP, Suscripcion suscripcion, int telefono,
          String email, String password) {
        super(id, email, password, "consumidor");
        this.calle = calle;
        this.ciudad = ciudad;
        this.fechaAlta = fechaAlta;
        this.nombre = nombre;
        this.numeroCasa = numeroCasa;
        this.provincia = provincia;
        this.CP = CP;
        this.suscripcion = suscripcion;
        this.telefono = telefono;
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public String getNumeroCasa() {
        return numeroCasa;
    }

    public void setNumeroCasa(String numeroCasa) {
        this.numeroCasa = numeroCasa;
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

    public int getCP() {
        return CP;
    }

    public void setCP(int CP) {
        this.CP = CP;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public Suscripcion getSuscripcion() {
        return suscripcion;
    }

    public void setSuscripcion(Suscripcion suscripcion) {
        this.suscripcion = suscripcion;
    }



    @Override
    public String toString() {
        return "Consumidor [nombre=" + nombre + ", fechaAlta=" + fechaAlta + ", calle=" + calle + ", numeroCasa="
                + numeroCasa + ", ciudad=" + ciudad + ", provincia=" + provincia + ", CP=" + CP + ", telefono="
                + telefono + ", suscripcion=" + suscripcion + ", getId()=" + getId() + ", getEmail()=" + getEmail()
                + ", getPassword()=" + getPassword() + ", toString()=" + super.toString() + ", getNombre()="
                + getNombre() + ", getFechaAlta()=" + getFechaAlta() + ", getCalle()=" + getCalle()
                + ", getNumeroCasa()=" + getNumeroCasa() + ", getCiudad()=" + getCiudad() + ", getProvincia()="
                + getProvincia() + ", getCP()=" + getCP() + ", getTelefono()=" + getTelefono() + ", getSuscripcion()="
                + getSuscripcion() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
    }

}