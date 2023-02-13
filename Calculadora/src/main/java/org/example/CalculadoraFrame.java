package org.example;

import javax.swing.*;

public class CalculadoraFrame extends JFrame {

    public CalculadoraFrame() {
        add(new CalculadoraPanel());
        pack();
    }
}
