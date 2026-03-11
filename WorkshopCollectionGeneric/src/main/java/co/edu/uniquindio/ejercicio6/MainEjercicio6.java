package co.edu.uniquindio.ejercicio6;

import java.util.Arrays;
import java.util.List;

/**
 * Clase principal para probar el método maximo genérico.
 */
public class MainEjercicio6 {

    public static void main(String[] args) {
        // Prueba con Integer
        List<Integer> numeros = Arrays.asList(5, 2, 9, 1, 7, 3);
        System.out.println("Lista: " + numeros);
        System.out.println("Máximo: " + MaximoUtil.maximo(numeros));

        // Prueba con String
        List<String> nombres = Arrays.asList("Ana", "Carlos", "Beatriz", "David");
        System.out.println("\nLista: " + nombres);
        System.out.println("Máximo alfabético: " + MaximoUtil.maximo(nombres));

        // Prueba con Double
        List<Double> decimales = Arrays.asList(3.14, 2.71, 1.41, 1.73);
        System.out.println("\nLista: " + decimales);
        System.out.println("Máximo: " + MaximoUtil.maximo(decimales));
    }
}
