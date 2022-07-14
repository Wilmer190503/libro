package modelo;

import javax.swing.JOptionPane;

public class Caracteristicas extends Libro
{
    private String nombreColeccion;
    private int numeroColeccion;

    public Caracteristicas(String nombreLibro, String nombreAutor, int añoEdicion, String lujo, String coleccion,String nombreColeccion, int numeroColeccion) 
    {
        super(nombreLibro, nombreAutor, añoEdicion, lujo, coleccion);
        this.nombreColeccion = nombreColeccion;
        this.numeroColeccion = numeroColeccion;
    }

    public Caracteristicas(String nomLibro, String nomAutor, int añoEdicion, String lujo, String coleccion) 
    {
        super(nomLibro, nomAutor, añoEdicion, lujo, coleccion);
    }
    
    public void organizarInformacion1()
    {
        informacion = "NOMBRE DEL LIBRO: " + nombreLibro + "\nAUTOR: " + nombreAutor + "\nAÑO: " + añoEdicion + "\nLa edicion " + lujo + " es de lujo" + " \nColección: "+ nombreColeccion + " # " + numeroColeccion;
    }
    
    public void organizarInformacion2()
    {
        informacion = "NOMBRE DEL LIBRO: " + nombreLibro + "\nAUTOR: " +nombreAutor + "\nAÑO: " + añoEdicion + "\nLa edicion " + lujo + " es de lujo" + "\nEl libro no pertenece a ninguna colección";
    }
    
    
    
    
}
