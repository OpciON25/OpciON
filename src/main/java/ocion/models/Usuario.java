public class Usuario {
    private int id;
    private String email;
    private String password;
    private String nombre;
    private DateTime fechaAlta;
    private String direccion;
    private String ciudad;
    private String provincia;
    private String telefono;
    private Suscripcion suscripcion;

    public Usuario(int id, String email, String password, String nombre, DateTime fechaAlta, String direccion,
            String ciudad, String provincia, String telefono, Suscripcion suscripcion) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.nombre = nombre;
        this.fechaAlta = fechaAlta;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.provincia = provincia;
        this.telefono = telefono;
        this.suscripcion = suscripcion;
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public DateTime getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(DateTime fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Suscripcion getSuscripcion() {
        return suscripcion;
    }

    public void setSuscripcion(Suscripcion suscripcion) {
        this.suscripcion = suscripcion;
    }

    @Override
    public String toString() {
        return "Usuario [id=" + id + ", email=" + email + ", password=" + password + ", nombre=" + nombre
                + ", fechaAlta=" + fechaAlta + ", direccion=" + direccion + ", ciudad=" + ciudad + ", provincia="
                + provincia + ", telefono=" + telefono + ", suscripcion=" + suscripcion + "]";
    }

    


}
