package com.ocion.models;
//import java.lang.*;
import java.time.LocalDate;
//import java.io.*;

public class Suscripcion {
    private int id;
    private String tipo;
    private double precio;
    private LocalDate duracion;
    
    public Suscripcion(int id, String tipo, double precio, LocalDate duracion) {
        this.id = id;
        this.tipo = tipo;
        this.precio = precio;
        this.duracion = duracion;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public LocalDate getDuracion() {
        return duracion;
    }
    public void setDuracion(LocalDate duracion) {
        this.duracion = duracion;
    }
    @Override
    public String toString() {
        return "Suscripcion [id=" + id + ", tipo=" + tipo + ", precio=" + precio + ", duracion=" + duracion + "]";
    }
    
    
}