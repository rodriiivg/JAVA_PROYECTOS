/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.MyExceptions;
import Modelo.OperacionesFicheros;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rodrigo valdes
 */
public class DAO_ByteFiles {
    // ATRIBUTOS
    private File ficheroDeBytes;
    // Para leer el archivo
    private FileInputStream fis;
    // Para grabar el archivo
    private FileOutputStream fos;

    // MÉTODOS
    // Getters + Setters
    public File getFicheroDeBytes() {
        return ficheroDeBytes;
    }

    public void setFicheroDeBytes(File ficheroDatosPrimitivos) {
        this.ficheroDeBytes = ficheroDatosPrimitivos;
    }

    /* CONSTRUCTORES:
    1.- Metiendo el OBJETO File ya creado.
    2.- Metiendo el NOMBRE del fichero para crear el objeto file.
    (Para leer debe existir el archivo, para grabar no obligatoriamente).
     */
    public DAO_ByteFiles(File ficheroDatosPrimitivos) {
        this.ficheroDeBytes = ficheroDatosPrimitivos;
    }

    public DAO_ByteFiles(String nombreFichero) {
        this.ficheroDeBytes = new File(nombreFichero);
    }

    // PARA LEER
    public void abrirLeer() throws FileNotFoundException {
        fis = new FileInputStream(ficheroDeBytes);
    }

    public void cerrarLeer() throws IOException {
        fis.close();
    }

    // Método para leer un byte, devuelve un int que será su valor en ascii
    public int leerUnRegistro() throws IOException {
        int enteroASCII = fis.read();
        return enteroASCII;
    }

    // PARA GRABAR 
    // Añadiendo al final de un fichero existente
    public void abrirGrabarAnhadir() throws FileNotFoundException {
        fos = new FileOutputStream(ficheroDeBytes, true);
    }

    // Sobreescribiendo un fichero existente
    public void abrirGrabarSobreescribir() throws FileNotFoundException {
        fos = new FileOutputStream(ficheroDeBytes);
    }

    public void cerrarGrabar() throws IOException {
        fos.close();
    }

    // Método para grabar un byte
    public void grabarUnRegistro(int enteroASCII) throws IOException {
        fos.write(enteroASCII);
    }

   

    public Map<String, Integer> densidadLetras() throws MyExceptions.RutaIncorrecta {
         if (!ficheroDeBytes.exists()) {
            throw new MyExceptions.RutaIncorrecta("La ruta no existe.");
        }
        if (OperacionesFicheros.getExtension(ficheroDeBytes)==null||!OperacionesFicheros.getExtension(ficheroDeBytes).equalsIgnoreCase("txt")) {
        throw new MyExceptions.RutaIncorrecta("La ruta no coreesponde a un fichero de texto.");
        }
        Map<String, Integer> mapDensidadLetras = new HashMap<>();
        try {
            // Abrimos flujo
            abrirLeer();
            // Leemos hasta que nos devuelva un (-1)->Fin de fichero
            // y lo registramos en el map: si no existe lo registrsamos con valor 1, si existe sumamos 1
            int asciiLeido = 0;
            do {
                asciiLeido = leerUnRegistro();
                String caracter = String.valueOf((char) asciiLeido);
                // Integer repeticiones=mapDensidadLetras.get(caracter);
                if (mapDensidadLetras.containsKey(caracter)) {
                    int valorActual = mapDensidadLetras.get(caracter);
                    mapDensidadLetras.put(caracter, valorActual + 1);
                } else {
                    mapDensidadLetras.put(caracter, 1);
                }
                // mapDensidadLetras.put(caracter, (repeticiones==null)?1:repeticiones+1);
            } while (asciiLeido != -1);
            // Cerramos flujo
            cerrarLeer();
        } catch (FileNotFoundException ex) {
            System.out.println("Fichero no encontrado.");
            Logger.getLogger(DAO_ByteFiles.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            System.out.println("Error al leer/grabar fichero.");
            Logger.getLogger(DAO_ByteFiles.class.getName()).log(Level.SEVERE, null, ex);
        }

        return mapDensidadLetras;
    }


}
