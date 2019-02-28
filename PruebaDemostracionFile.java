/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebademostracionfile;
import java.util.Scanner;
/**
 *
 * @author GomTor
 */
public class PruebaDemostracionFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        DemostracionFile aplicacion = new DemostracionFile();
        
        System.out.print("Escriba aqui el nombre del archivo o directorios: ");
        aplicacion.analizarRuta( entrada.nextLine() );
        
    }//fin de main
}//fien de la clase PruebaDemuestracionFile
