package com.ocion.models;

/*import java.lang.*;
import java.time.*;
import java.io.*;*/

public class Usuario {
    private int id;
    private String email;
    private String password;
    private String tipo; // Interno, Consumidor, Empresa
    

    public Usuario(int id, String email, String password, String tipo) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTipo (){
        return tipo;
    }

    public void setTipo (String tipo){
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Usuario{");
        sb.append("id=").append(id);
        sb.append(", email=").append(email);
        sb.append(", password=").append(password);
        sb.append('}');
        return sb.toString();
    }
    
}
