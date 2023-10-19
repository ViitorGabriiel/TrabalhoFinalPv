package Trabalho.Controller;

import Trabalho.View.TelaPrincipal;
import javax.swing.JFrame;

public class Principal {

    public static void main(String args[]) {
        TelaPrincipal tp = new TelaPrincipal();
        tp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tp.setVisible(true);
    }
    
}
