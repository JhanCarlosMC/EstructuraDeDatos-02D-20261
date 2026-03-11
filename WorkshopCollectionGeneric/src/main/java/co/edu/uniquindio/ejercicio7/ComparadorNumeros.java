package co.edu.uniquindio.ejercicio7;

/**
 * Implementación de Comparador para comparar números.
 */
public class ComparadorNumeros<T extends Number & Comparable<T>> implements IComparador<T> {

    @Override
    public int comparar(T num1, T num2) {
        return num1.compareTo(num2);
    }
}
