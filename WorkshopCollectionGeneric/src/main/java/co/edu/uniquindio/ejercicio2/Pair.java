package co.edu.uniquindio.ejercicio2;

/**
 * Clase que representa un par clave-valor genérico.
 */
public class Pair<K, V> {
    private K clave;
    private V valor;

    public Pair(K clave, V valor) {
        this.clave = clave;
        this.valor = valor;
    }

    public K getClave() {
        return clave;
    }

    public void setClave(K clave) {
        this.clave = clave;
    }

    public V getValor() {
        return valor;
    }

    public void setValor(V valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Pair{" + clave + "=" + valor + "}";
    }
}
