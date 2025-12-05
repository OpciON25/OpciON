package com.ocion.models;

//import java.time.LocalDate;

/*import java.lang.*;
import java.time.*;
import java.io.*;*/

public class Cupon {
    private int id;
    private Double descuento;
    private Double cantidadFija;
    
    
    public Cupon(int id, double descuento, double cantidadFija) {
        this.id = id;
        this.descuento = descuento;
        this.cantidadFija = cantidadFija;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Double getDescuento() {
        return descuento;
    }

    public void setDescuento(Double descuento) {
        this.descuento = descuento;
    }

    public double getCantidadFija() {
        return cantidadFija;
    }

    public void setCantidadFija(double cantidadFija) {
        this.cantidadFija = cantidadFija;
    }

    @Override
    public String toString() {
        return "Cupon [id=" + id + ",descuento=" + descuento + ",cantidadFija=" + cantidadFija +"]";
    }

    public double aplicarDescuento(double precio){
        double precioFinal = precio;

        if (this.descuento != null){
            precioFinal = precioFinal - (precio*(this.descuento/100));
        } 

        if(this.cantidadFija != null){
            precioFinal = precioFinal - this.cantidadFija;
        }

        return Math.max(precioFinal,0);



    }



}
