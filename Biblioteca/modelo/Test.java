package modelo;

import javax.swing.JOptionPane;

public class Test 
{
    public static void main(String[] args)
    {
        
        String nombreLibro = JOptionPane.showInputDialog("Digite el nombre del libro: ");
        String nombreAutor = JOptionPane.showInputDialog("Digite el nombre del autor: ");
        int añoEdicion =Integer.parseInt(JOptionPane.showInputDialog("Digite el año de salida del libro: "));
        String coleccion = JOptionPane.showInputDialog("El libro: " + nombreLibro + " pertenece a una colección");
        String lujo = JOptionPane.showInputDialog("El libro: " + nombreLibro + " es edicion de lujo: ");
        
        if(coleccion.equals("si"))
        {
            String nombreColeccion = JOptionPane.showInputDialog("Digite el nombre de la colección: ");
            int numeroColeccion = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero que ocupa en la collecion: "));
            Caracteristicas miCaracteristicas = new Caracteristicas(nombreLibro,nombreAutor,añoEdicion,lujo,coleccion,nombreColeccion,numeroColeccion);
            miCaracteristicas.organizarInformacion1();
            JOptionPane.showMessageDialog(null,("La informacion del libro es\n" + miCaracteristicas.mostrarInformación()));
        }
        if(coleccion.equals("no"))
        {
            Caracteristicas miCaracteristicas = new Caracteristicas(nombreLibro, nombreAutor, añoEdicion, lujo, coleccion);
            miCaracteristicas.organizarInformacion2();
            JOptionPane.showMessageDialog(null,("La informacion del libro es\n" + miCaracteristicas.mostrarInformación()));
        }
    }
}
