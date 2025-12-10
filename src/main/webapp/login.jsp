<%@ page language="java" 
         contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Iniciar sesión</title>
</head>
<body>
    <h2>Iniciar sesión</h2>
    <form action="LoginServlet" method="post">
        <label for="email">Correo electrónico:</label>
        <input type="text" id="email" name="email" required>
        <br>
        <label for="password">Contraseña:</label>
        <input type="password" id="password" name="password" required>
        <br>
        <input type="submit" value="Iniciar sesión">

    </form>

    <%
        if (request.getParameter("error") != null){ %>
            <p style="color: red;">Acceso denegado. Comprueba el email o la contraseña</p>        
    <% } %>
</body>
</html>