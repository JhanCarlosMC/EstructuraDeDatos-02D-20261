package co.edu.uniquindio.ejercicio6;

import java.util.List;

/**
 * Utilidad genérica para encontrar el máximo elemento de una lista.
 */
public class MaximoUtil {

    /**
     * Encuentra y retorna el objeto máximo de una lista de elementos comparables.
     *
     * @param <T> Tipo que implementa Comparable
     * @param lista Lista de elementos a comparar
     * @return El elemento máximo de la lista
     * @throws IllegalArgumentException si la lista está vacía o es null
     *
     * NOTA: T extends Comparable<T> significa que T debe ser un tipo
     * que implementa la interfaz Comparable consigo mismo.
     * Esto permite usar el método compareTo() para comparar elementos.
     */
    public static <T extends Comparable<T>> T maximo(List<T> lista) {
        if (lista == null || lista.isEmpty()) {
            throw new IllegalArgumentException("La lista no puede estar vacía");
        }

        T maximo = lista.getFirst();

        for (int i = 1; i < lista.size(); i++) {
            T elemento = lista.get(i);
            // compareTo retorna negativo si this < other, 0 si igual,
            // positivo si this > other
            if (elemento.compareTo(maximo) > 0) {
                maximo = elemento;
            }
        }

        return maximo;
    }

}
