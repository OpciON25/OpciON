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
                reponse.sendRedirect("panelGestion.jsp");
            }else{
                response.sendRedirect("ofertas.jsp");
            }
        }  
    }
}