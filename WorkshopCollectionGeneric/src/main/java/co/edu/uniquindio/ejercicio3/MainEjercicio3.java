package co.edu.uniquindio.ejercicio3;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Análisis del comportamiento de LinkedHashSet.
 *
 * PREGUNTA: ¿Qué imprime este código?
 *
 * RESPUESTA: [Chicago, Boston, Alabama]
 *
 * EXPLICACIÓN:
 * - LinkedHashSet NO permite duplicados
 * - Mantiene el orden de inserción
 * - El segundo "Chicago" no se agrega
 */
public class MainEjercicio3 {

    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>();
        set.add("Chicago");
        set.add("Boston");
        set.add("Alabama");
        set.add("Chicago"); // Duplicado - no se agrega

        System.out.println("Resultado: " + set);
    }
}
