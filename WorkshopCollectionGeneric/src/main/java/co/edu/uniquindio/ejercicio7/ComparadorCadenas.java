package co.edu.uniquindio.ejercicio7;

/**
 * Implementación de Comparador para comparar cadenas de texto.
 * Puede comparar alfabéticamente o por longitud.
 */
public class ComparadorCadenas implements IComparador<String> {

    private final boolean porLongitud;

    /**
     * Crea un comparador de cadenas.
     * @param porLongitud si true, compara por longitud; si false, alfabéticamente
     */
    public ComparadorCadenas(boolean porLongitud) {
        this.porLongitud = porLongitud;
    }

    public ComparadorCadenas() {
        this(false);
    }

    @Override
    public int comparar(String cad1, String cad2) {
        if (porLongitud) {
            return Integer.compare(cad1.length(), cad2.length());
        }
        return cad1.compareTo(cad2);
    }
}
