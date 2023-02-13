package org.example;

import java.util.Stack;

public class Pila {
    private Stack<Integer> pila = new Stack<Integer>();
    // Añade el número solo si es mayor que 2 y menor que 20
    public void push (Integer num) {
        if (num > 2 && num < 20)
            pila.push(num);
    }

    public Integer pop() {
        if(isEmpty())
       // if (pila.isEmpty()) vale de las 2 maneras pero la más optima es la primera

// System.out.println("null");
            return null;
        else
            return pila.pop();
    }
    //Devuelve true si la pila está vacía, false caso contrario
    public boolean isEmpty() {
        return pila.isEmpty();
    }


    public Integer top() {
        if (pila.isEmpty())
            //if(isEmpty()) vale de las 2 maneras pero la más optima es la primera
            return null;
        else
            return pila.peek();
    }

    public int cuantos() {
        return 2;
    }

}
