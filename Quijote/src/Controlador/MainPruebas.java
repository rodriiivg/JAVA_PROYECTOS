/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import FileFilters.*;
import Modelo.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.IOException;

/**
 *
 * @author rodrigo valdes
 */
public class MainPruebas {
       public static void main(String[] args) throws IOException {
      // BUSCAR EL QUIJOTE
        /*List<File> listaQuijote = OperacionesFicheros.buscarFicheroRecursivo("quijote2", "C:/");
        Vista.Vista.mostrarListaDeFicheros(listaQuijote);
        File fileQuijote=listaQuijote.get(0);
        
        int numLineasQuijote = OperacionesReader.contarLineas(fileQuijote);
        System.out.println("El Quijote tiene "+numLineasQuijote+" líneas.");
        
        int numOcurrenciasPalabraQuijote=OperacionesReader.contarOcurrenciasDeUnaPalabra(fileQuijote, "Quijote");
        System.out.println("La palabra \"Quijote\" aparece "+numOcurrenciasPalabraQuijote+" veces.");
        
        System.out.println(OperacionesReader.contarLetras(el_quijote));
        
        System.out.println(OperacionesReader.invertirLetras("Hola"));
        OperacionesReader.invertirLetrasDeLineas(el_quijote);*/
        //OperacionesFicheros.limpiarSignosPuntuacion(new File("C:/el_quijote.txt"));
     //Map<String, Integer> repPalabras = Vista.repeticionPalabras("C:/el_quijote.txt");
                         //  System.out.println(repPalabras);

       }
       
    
}
