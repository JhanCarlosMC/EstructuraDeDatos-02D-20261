package co.edu.uniquindio.ejercicio4;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.NoSuchElementException;

/**
 * Clase genérica Repositorio que implementa IRepositorio.
 * Propone una implementación concreta de un repositorio con List<T> interno.
 * @param <T> El tipo de elementos almacenados en el repositorio
 */
public class Repositorio<T> implements IRepositorio<T> {
    private final List<T> elementos;

    public Repositorio() {
        this.elementos = new ArrayList<>();
    }

    /**
     * Agrega un elemento al repositorio.
     */
    public void agregar(T elemento) {
        elementos.add(elemento);
    }

    /**
     * Obtiene el elemento en la posición especificada.
     */
    public T obtener(int indice) {
        if (indice < 0 || indice >= elementos.size()) {
            throw new IndexOutOfBoundsException("Índice fuera de rango: " + indice);
        }
        return elementos.get(indice);
    }

    /**
     * Retorna un iterador para recorrer la lista de adelante hacia atrás.
     */
    @Override
    public Iterator<T> iterator() {
        return new IteradorAdelante();
    }

    /**
     * Retorna un iterador personalizado que recorre la lista de atrás hacia adelante.
     */
    public Iterator<T> reverseIterator() {
        return new IteradorAtras();
    }

    /**
     * Iterador que recorre la lista de adelante hacia atrás.
     */
    private class IteradorAdelante implements Iterator<T> {
        private int posicion = 0;

        @Override
        public boolean hasNext() {
            return posicion < elementos.size();
        }

        @Override
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException("No hay más elementos");
            }
            return elementos.get(posicion++);
        }
    }

    /**
     * Iterador que recorre la lista de atrás hacia adelante (iterador reverso personalizado).
     */
    private class IteradorAtras implements Iterator<T> {
        private int posicion = elementos.size() - 1;

        @Override
        public boolean hasNext() {
            return posicion >= 0;
        }

        @Override
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException("No hay más elementos");
            }
            return elementos.get(posicion--);
        }
    }

    public int tamaño() {
        return elementos.size();
    }
}
