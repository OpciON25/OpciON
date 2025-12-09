<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
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
        if (request.getParameter("error") != null){
    %>
            <p styele="color: red;">Acceso denegado. Comprueba el email o la contraseña</p>        
    <%
        }
    %>
</body>
</html>