package co.edu.uniquindio.ejercicio2;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase genérica que almacena una lista de pares clave-valor.
 */
public class PairList<K, V> {
    private List<Pair<K, V>> pares;

    public PairList() {
        this.pares = new ArrayList<>();
    }

    /**
     * Agrega un par clave-valor a la lista.
     */
    public void agregar(K clave, V valor) {
        pares.add(new Pair<>(clave, valor));
    }

    /**
     * Agrega un objeto Pair existente a la lista.
     */
    public void agregar(Pair<K, V> par) {
        pares.add(par);
    }

    /**
     * Elimina el par con la clave especificada.
     * @return true si se eliminó el par, false si no se encontró.
     */
    public boolean eliminar(K clave) {
        return pares.removeIf(par -> par.getClave().equals(clave));
    }

    /**
     * Obtiene el valor asociado a una clave.
     * @return el valor o null si no existe la clave.
     */
    public V obtener(K clave) {
        for (Pair<K, V> par : pares) {
            if (par.getClave().equals(clave)) {
                return par.getValor();
            }
        }
        return null;
    }

    /**
     * Obtiene todos los pares almacenados.
     */
    public List<Pair<K, V>> obtenerTodos() {
        return new ArrayList<>(pares);
    }

    /**
     * Muestra todos los pares.
     */
    public void mostrarPares() {
        System.out.println("=== Pares almacenados ===");
        for (Pair<K, V> par : pares) {
            System.out.println(par);
        }
    }

    public int tamaño() {
        return pares.size();
    }
}
