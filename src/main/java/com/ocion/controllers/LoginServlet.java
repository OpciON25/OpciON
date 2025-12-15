package com.ocion.controllers;

import com.ocion.models.Usuario;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;
import jakarta.servlet.annotation.WebServlet;
import com.ocion.dao.RepositorioUsuarios;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Obtenemos los parámetros del formulario
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        //validar temporalmente hasta tener bbdd
        Usuario usuario = RepositorioUsuarios.validar(email, password);

        if (usuario != null) {
            // Iniciar la sesión
            HttpSession session = request.getSession();
            session.setAttribute("usuario", usuario);

            // Redirigir a la pantalla principal
            if(usuario.getTipo().equals("interno")){
                response.sendRedirect("panelGestion.jsp");
            }else{
                response.sendRedirect("ofertas.jsp");
            }
        }else{
            response.sendRedirect("login.jsp?error=1");
        }  
    }
}