package com.ocion.models;

import java.time.LocalDate;

/*import java.lang.*;
import java.time.*;
import java.io.*;*/

public class Cupon {
    private int id;
    private String codigo;
    private float descuento;
    private LocalDate duracionActivo;
    
    public Cupon(int id, String codigo, float descuento, LocalDate duracionActivo) {
        this.id = id;
        this.codigo = codigo;
        this.descuento = descuento;
        this.duracionActivo = duracionActivo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public float getDescuento() {
        return descuento;
    }

    public void setDescuento(float descuento) {
        this.descuento = descuento;
    }

    public LocalDate getDuracionActivo() {
        return duracionActivo;
    }

    public void setDuracionActivo(LocalDate duracionActivo) {
        this.duracionActivo = duracionActivo;
    }

    @Override
    public String toString() {
        return "Cupon [id=" + id + ", codigo=" + codigo + ", descuento=" + descuento + ", duracionActivo="
                + duracionActivo + "]";
    }

    

}
