/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author rodrigo valdes
 */
public class MyExceptions {
     public static class RutaIncorrecta extends Exception {

        /**
         * Se lanza cuando la ruta introducida no es correcta
         * @param string mensaje a mostrar al usuario
         */
        public RutaIncorrecta(String string) {
            super(string);
        }
    }

    public static class CarpetaVacia extends Exception {

        /**
         * Se lanza cuando la ruta introducida corresponde a un directorio vacío
         * @param string @param string mensaje a mostrar al usuario
         */
        public CarpetaVacia(String string) {
            super(string);
        }
    }

    public static class NoEsDirectorio extends Exception {

        /**
         * Se lanza cuando la ruta introducida no corresponde a un directorio
         * @param string @param string mensaje a mostrar al usuario
         */
        public NoEsDirectorio(String string) {
            super(string);
        }
    }

    public static class DirectorioYaExiste extends Exception {

        /**
         * Se lanza cuando la ruta introducida corresponde a un directorio que ya existe
         * @param string @param string mensaje a mostrar al usuario
         */
        public DirectorioYaExiste(String string) {
            super(string);
        }

    }
}
