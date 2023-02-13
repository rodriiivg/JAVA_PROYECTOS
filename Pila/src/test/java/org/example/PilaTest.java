package org.example;

import junit.framework.TestCase;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.testng.annotations.Test;

import java.util.Optional;

public class PilaTest  extends TestCase {
    protected Pila p;
    @Override
    @BeforeEach
    @Tag("La inicio vacía")
    protected void setUp() {
        try {
            super.setUp();
            p = new Pila();
            p.push(5);
            p.push(8);
        } catch (Exception e) {
        }
    }
    @Test
    public void testPushNoAnade1() {
Pila p = new Pila();
        p.push(1);
        assertTrue(p.cuantos()==2);//metodo cuantos creado sin nada
    }

    @Test
    public void testPushNoAnade2() {
 Pila p = new Pila();
        p.push(30);
        assertTrue(p.cuantos()==2);
    }
    /*
     * Añade elemento a una pila con 2 elementos previos
     */
    @Test
    public void testPushAnade() {
        p.push(10);
        assertTrue(p.cuantos()==3);

    }
    /*
    * No añade elemento (menor que 2) a una lista con 0 elementos
    previos
    */
    @Test
    public void testPushNoAnadeVacio1() {
        Pila p = new Pila();
        p.push(1);
        assertTrue(p.isEmpty());
        assertEquals(Optional.of(1), p.top());
    }
    /*
    * No añade elemento (mayor que 20) a una lista con 0 elementos
    previos
    */
    @Test
    public void testPushNoAnadeVacio2() {
        Pila p = new Pila();
        p.push(30);
        assertTrue(p.isEmpty());
    }
    /*
     * Añade elemento a una lista con 0 elementos previos
     */
    @Test
    public void testPushAnadeVacio() {
        Pila p = new Pila();
        p.push(10);
        assertTrue(p.cuantos()==1);
    }
    /*
     * Ocurre una excepción cuando no entra null como parámetro
     */
    @Test
    public void testPushNull () {
        try {
            p.push(null);
            fail();
        } catch (Exception e) {
            assertTrue(true);
        }
    }
    /*
     * Extrae último elemento de la pila no vacía
     */
    @Test

    public void testPop() {
        Integer esperado = 8;
        Integer tmp = p.pop();
// assertEquals(tmp, esperado);
        assertTrue(tmp.equals(esperado) && p.cuantos() == 1);
    }
    /*
    * Extrae último elemento de la pila vacía, es decir, devuelve
    null
    */
    @Test
    public void testPopVacio() {
        Pila p = new Pila();
        Integer esperado = null;
        Integer tmp = p.pop();
// assertEquals(tmp, esperado);
// System.out.println(tmp);
        assertTrue(tmp==esperado && p.isEmpty());
    }

    //int[] getValues() {
      //  int[] array = new int[20];
        //for (int i = 1; i < 20; i++) {
          //  array[i] = i;
            //return array;
        //}
    //}
    /*
     * La pila no está vacía
     */



    //@ParameterizedTest
    //@ValueSource (ints = {1,2,3,4})
   // @MethodSource("getValues")
   // @CsvSource(pilo.csv) si son muchos num crear excel



    @Test
    @DisplayName("")

    public void testIsEmpty() {
        assertTrue(!p.isEmpty());
    }
    /*
     * La pila está vacía
     */
    @Test
    public void testIsEmptyVacio() {
        Pila p = new Pila();
        assertTrue(p.isEmpty());
    }
    /*
     * Muestra (sin extraer) último elemento de la pila no vacía
     */
    @Test
    public void testTop() {
        Integer esperado = 8;
        int tamanoEsperado = 2;
// assertEquals(p.top(),esperado);
        assertTrue(p.top().equals(esperado) && p.cuantos() ==
                tamanoEsperado);
    }

    @Test
    public void testTopVacio() {
        Pila p = new Pila();
        Integer esperado = null;
        int tamanoEsperado = 0;
        assertTrue(p.top()==esperado && p.cuantos() ==
                tamanoEsperado);
    }
}

