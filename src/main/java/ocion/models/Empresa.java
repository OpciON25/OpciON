import java.lang.*;
import java.time;
import java.io.*;

public class Empresa extends Usuario{
    private int id;
    private String nombreEmpresa;
    private String CIF;
    private DateTime fechaAlta;
    private String calle;
    private String ciudad;
    private String provincia;
    private int telefono;
    private Oferta[] ofertasActivas;


    public Empresa(int id, String email, String password, int id2, String nombreEmpresa, String cIF, DateTime fechaAlta,
            String calle, String ciudad, String provincia, int telefono, Oferta[] ofertasActivas) {
        
        id = id2;
        this.nombreEmpresa = nombreEmpresa;
        CIF = cIF;
        this.fechaAlta = fechaAlta;
        this.calle = calle;
        this.ciudad = ciudad;
        this.provincia = provincia;
        this.telefono = telefono;
        this.ofertasActivas = ofertasActivas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getCIF() {
        return CIF;
    }

    public void setCIF(String CIF) {
        this.CIF = CIF;
    }

    public DateTime getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(DateTime fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
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

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public Oferta[] getOfertasActivas() {
        return ofertasActivas;
    }

    public void setOfertasActivas(Oferta[] ofertasActivas) {
        this.ofertasActivas = ofertasActivas;
    }

    



   
}