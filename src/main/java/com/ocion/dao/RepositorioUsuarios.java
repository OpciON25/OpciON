package com.ocion.dao;

import java.util.ArrayList;
import java.util.List;
import com.ocion.models.Usuario;

public class RepositorioUsuarios {

    //simulacion de la base de datos. en memoria
    private static List<Usuario> usuarios = new ArrayList<>();

    //contenido de prueba
    static{
        usuarios.add(new Usuario(1,"admin@admin.es", "1234", "interno"));
        usuarios.add(new Usuario(2,"consumidor@consumidor.es", "1234", "consumidor"));
        usuarios.add(new Usuario(3,"empresa@empresa.es", "1234", "empresa"));
    }

    //varlidar credenciales
    public static Usuario validar (String email, String password){
        for(Usuario u : usuarios){
            if(u.getEmail().equals(email) && u.getPassword().equals(password)){
                return u;
            }
        }
        return null; //usuario no encontrado
    }
}
