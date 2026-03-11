package co.edu.uniquindio.ejercicio7;

import java.util.Arrays;
import java.util.List;

/**
 * Clase principal para probar la interfaz genérica Comparador.
 */
public class MainEjercicio7 {

    public static void main(String[] args) {
        // Comparar números
        ComparadorNumeros<Integer> compEnteros = new ComparadorNumeros<>();
        System.out.println("Comparar 5 y 10: " + compEnteros.comparar(5, 10));
        System.out.println("Comparar 10 y 5: " + compEnteros.comparar(10, 5));

        // Comparar cadenas alfabéticamente
        ComparadorCadenas compAlfabetico = new ComparadorCadenas(false);
        System.out.println("\nComparar 'Ana' y 'Carlos': " + compAlfabetico.comparar("Ana", "Carlos"));

    }
}
