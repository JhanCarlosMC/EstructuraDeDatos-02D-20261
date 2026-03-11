package co.edu.uniquindio.ejercicio4;

import java.util.Iterator;

/**
 * Interfaz genérica que define el contrato para un repositorio de elementos.
 * Extiende Iterable para permitir el recorrido con for-each.
 *
 * @param <T> El tipo de elementos almacenados en el repositorio
 */
public interface IRepositorio<T> extends Iterable<T> {

    void agregar(T elemento);
    T obtener(int indice);
    Iterator<T> iterator();
}
