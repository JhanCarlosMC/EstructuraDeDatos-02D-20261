package co.edu.uniquindio.ejercicio7;

/**
 * Interfaz genérica para comparar dos objetos del mismo tipo.
 * Similar a java.util.Comparator pero más simple para propósitos educativos.
 *
 * @param <T> El tipo de objetos a comparar
 */
public interface IComparador<T> {

    /**
     * Compara dos objetos del tipo T.
     *
     * @param obj1 Primer objeto a comparar
     * @param obj2 Segundo objeto a comparar
     * @return
     *   - negativo si obj1 < obj2
     *   - cero si obj1 == obj2
     *   - positivo si obj1 > obj2
     */
    int comparar(T obj1, T obj2);
}
