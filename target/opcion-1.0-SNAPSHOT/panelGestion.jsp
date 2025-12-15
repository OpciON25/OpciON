<%@ page language="java" 
         contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Panel de gestión</title>
    <!-- CSS para la pantalla de gestión-->
    <style>
        /*Estilos generales */
        body {
            margin:0;
            font-family: Arial, sans-serif;
            background: url("img/ocion.jpg") no-repeat center center fixed;
            background-size: cover;
        }
        
        /*BARRA SUPERIOR*/
        .topbar {
            background: rgba (255,255,255,0.9);
            padding: 15px 30px;
            display: flex;
            align-content: center;
            justify-content: space-between;
        }

        .logo {
            font-size: 22px;
            font-weight: bold;
        }

        .menu a {
            margin-left: 20px;
            text-decoration: none;
            color: #333;
            font-weight: bold;
        }
        /*CONTENEDOR PRINCIPAL*/
        .container {
            max-width: 1000px;
            margin: 60px auto;
            display: grid;
            grid-template-columns: repeat(3, 1fr);
            gap: 25px;
        }
        
        /*TARJETAS*/
        .card {
            background: rgba(255,255,255, 0.9);
            padding: 25px;
            border-radius: 12px;
            text-align: center;
            box-shadow: 0 4px 10px rgba(0,0,0,0.2);
            cursor: pointer;
            transition: transform 0.2s;
        }
        .card:hover {
            transform: scale(1.05);
        }

        .card h3 {
            margin-bottom: 10px;
        }

         .card p {
            font-size: 14px;
            color: #555;
        }
      
    </style>

</head>
<body>
    <div class="topbar">
        <div class="logo">OciON</div>
        
        <div class="menu">
            <a href="#">Estadísticas</a>"
            <a href="#">Contacto</a>"
            <a href="#">Cerrar sesión</a>"
        </div>
    </div>
    <! Cuadricula 3x3>
    <div class="container">

      <div class="card">
        <h3>Crear evento</h3>
        <p>Evento personalizado.</p>
      </div>
      
      <div class="card">
        <h3>Oferta de verano</h3>
        <p>Promociones</p>
      </div>
      
      <div class="card">
        <h3>Vuelta al cole</h3>
        <p>Ofertas</p>
      </div>

      <div class="card">
        <h3>Evento comida rápida</h3>
        <p>Desde 400€ / 5 días</p>
      </div>

      <div class="card">
        <h3>Evento cine</h3>
        <p>Desde 400€ / 5 días</p>
      </div>

      <div class="card">
        <h3>Evento concierto</h3>
        <p>Desde 400€ / 5 días</p>
      </div>

    </div>
</div>
</body>
</html>