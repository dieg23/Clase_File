/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebademostracionfile;
// Fig. 14.4: DemostracionFile.java
// Demostración de la clase File.
import java.io.File;
public class DemostracionFile
{
    // muestra información acerca del archivo especificado por el usuarion
    public void analizarRuta( String ruta )
    {
        // crea un objeto File con base en la entrada del usuario
        File nombre = new File( ruta );
        if ( nombre.exists() ) // si existe el nombre, muestra información sobre él
        {
            // muestra información del archivo (o directorio)
            System.out.printf(
                    "%s%s\n%s\n%s\n%s\n%s%s\n%s%s\n%s%s\n%s%s\n%s%s",
                    nombre.getName(), " existe",
                    ( nombre.isFile() ? "es un archivo" : "no es un archivo" ),
                    ( nombre.isDirectory() ? "es un directorio" :
                            "no es un directorio" ),
                    ( nombre.isAbsolute() ? "es ruta absoluta" :
                            "no es ruta absoluta" ), "Ultima modificacion: ",
                    nombre.lastModified(), "Tamanio: ", nombre.length(),
                    "Ruta: ", nombre.getPath(), "Ruta absoluta: ",
                    nombre.getAbsolutePath(), "Padre: ", nombre.getParent() );
            
            if ( nombre.isDirectory() ) // muestra el listado del directorio
            {
                String directorio[] = nombre.list();
                System.out.println( "\n\nContenido del directorio:\n" );
                for ( String nombreDirectorio : directorio )
                    System.out.printf( "%s\n", nombreDirectorio );
            } // fin de else
        } // fin de if exterior
        else // no es archivo o directorio, muestra mensaje de error
        {
            System.out.printf( "%s %s", ruta, "no existe." );
        } // fin de else
    } // fin del método analizarRuta
} // fin de la clase DemostracionFile
