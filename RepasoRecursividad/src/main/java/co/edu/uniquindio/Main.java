package co.edu.uniquindio;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        //JOptionPane.showMessageDialog(null,recursividadFactorial(5));
//        JOptionPane.showMessageDialog(null,numeroTriangular(6, 1));
        JOptionPane.showMessageDialog
                (null,numeroTriangularJhan(21, 1));
    }

    //Metodo recursivo para calcular el factorial de un numero
    public static int recursividadFactorial(int numero) {
        //Caso Base
        if(numero == 0){
            return 1;
        }

        //Caso Recursivo
        return numero*recursividadFactorial(numero-1);
    }

    public static boolean numeroTriangular(int numero, int suma){
        if (suma > numero){
        // Caso base
            return false;
    } else if (suma == numero){
            return true;
        }
        return numeroTriangular(numero,suma+suma+1);
    }

    public static boolean numeroTriangularJhan(int numero, int cont){
        int triangular = (cont*(cont+1))/2;
        if(numero == triangular) return true; //Caso Base 1
        if(triangular > numero) return false; //Caso Base 2
        return numeroTriangularJhan(numero,cont+1); //Caso Recursivo
    }
}