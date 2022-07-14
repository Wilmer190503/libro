package modelo;

public class Libro 
{
    protected String nombreLibro;
    protected String nombreAutor;
    protected int añoEdicion;
    protected String informacion;
    protected String lujo;

    public Libro(String nombreLibro, String nombreAutor, int añoEdicion, String lujo , String coleccion) 
    {
        this.nombreLibro = nombreLibro;
        this.nombreAutor = nombreAutor;
        this.añoEdicion = añoEdicion;
        this.lujo = lujo;
    }
    
    public String mostrarInformación()
    {
        return this.informacion;
    }
    
  
}