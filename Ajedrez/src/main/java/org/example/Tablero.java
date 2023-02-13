package org.example;

import javax.swing.*;
import java.awt.*;

public class Tablero {
    private JFrame ventana;
    private JPanel [][] paneles;
    //contructor inicializador
    public Tablero() {  ventana = new JFrame("Tablero de ajedrez");
        paneles = new JPanel[8][8];
        for (int i = 0; i < paneles.length; i++) {
            for (int j = 0; j < paneles.length; j++) {
                paneles[i][j] = new JPanel();
            }
        }
        this.atributos();
        this.armado();
        this.Lanzar_Tablero();
}  //atributos de los componentes
 public void atributos(){  ventana.setResizable(true);
        ventana.setLayout(new GridLayout(8,8));
        ventana.setSize(400, 400); }
    public void armado(){
        for (int i = 0; i < paneles.length; i++) {
            for (int j = 0; j < paneles.length; j++) {
                ventana.add(paneles[i][j]);
                if ((i+j+1)%2==0) {
                    paneles[i][j].setBackground(Color.BLACK);
                }
                else
                    paneles[i][j].setBackground(Color.WHITE);
            }
        }
    }
    //Lanzar tablero
     public void Lanzar_Tablero(){
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
    }
}
