package com.ocion.models;

/*import java.lang.*;
import java.time.*;
import java.io.*;*/

public class Oferta {
    private int id;
    private String nombre;
    private String descripcion;
    private float precio;
    private int cupoOferta;
    private Cupon cupon;
    
    public Oferta(int id, String nombre, String descripcion, float precio, int cupoOferta, Cupon cupon) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.cupoOferta = cupoOferta;
        this.cupon = cupon;
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
    @Override
    public String toString() {
        return "Oferta [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", precio=" + precio
                + ", cupoOferta=" + cupoOferta + ", cupon=" + cupon + "]";
    }

    
}
