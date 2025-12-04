package com.ocion.models;

import java.time.LocalDate;

/*import java.lang.*;
import java.time.*;
import java.io.*;*/

public class Oferta {
    private int id;
    private String nombre;
    private String descripcion;
    private float precio;
    private LocalDate duracionActivo;
    private int cupoOferta;
    private Cupon cupon;
    private Suscripcion suscripcion;
    private Categoria categoria;
    
    public Oferta(int id, String nombre, String descripcion, float precio, int cupoOferta, Cupon cupon, 
        LocalDate duracionActivo, Suscripcion suscripcion, Categoria categoria) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.cupoOferta = cupoOferta;
        this.cupon = cupon;
        this.duracionActivo = duracionActivo;
        this.suscripcion = suscripcion;
        this.categoria = categoria;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public float getPrecio() {
        return precio;
    }
    public void setPrecio(float precio) {
        this.precio = precio;
    }
    public int getCupoOferta() {
        return cupoOferta;
    }
    public void setCupoOferta(int cupoOferta) {
        this.cupoOferta = cupoOferta;
    }
    public Cupon getCupon() {
        return cupon;
    }
    public void setCupon(Cupon cupon) {
        this.cupon = cupon;
    }

    public LocalDate getDuracionActivo() {
        return duracionActivo;
    }

    public void setDuracionActivo(LocalDate duracionActivo) {
        this.duracionActivo = duracionActivo;
    }

    public Suscripcion getSuscripcion() {
        return suscripcion;
    }

    public void setSuscripcion(Suscripcion suscripcion) {
        this.suscripcion = suscripcion;
    }
    
    public Categoria getCategoria() {
        return categoria;
    }
    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Oferta [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", precio=" + precio
                + ", cupoOferta=" + cupoOferta + ", cupon=" + cupon + ",duracionActivo=" + duracionActivo +
                 ",suscripcion=" + suscripcion + ",catgeoria=" + categoria +"]";
    }
   

    
}
