package co.edu.uniquindio.ejercicio10;

import java.util.PriorityQueue;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Clase genérica para gestionar paquetes usando PriorityQueue.
 * Solo permite operaciones con iteradores, sin ciclos explícitos.
 *
 * IMPORTANTE: Se usan iteradores de forma recursiva en lugar de ciclos for/while.
 */
public class GestorPaquetes<T extends Paquete> {
    private  PriorityQueue<T> colaPrioridad;
    private ComparadorPrioridadDescendente comparador;

    public GestorPaquetes() {
        this.comparador = new ComparadorPrioridadDescendente();
        this.colaPrioridad = new PriorityQueue<>(comparador);
    }

    /**
     * Agrega un paquete a la cola de prioridad.
     */
    public void agregarPaquete(T paquete) {
        colaPrioridad.add(paquete);
    }

    /**
     * Elimina y retorna el paquete de mayor prioridad.
     */
    public T eliminarPaquete() {
        if (colaPrioridad.isEmpty()) {
            throw new NoSuchElementException("No hay paquetes para eliminar");
        }
        return colaPrioridad.poll();
    }

    /**
     * Obtiene (sin eliminar) el paquete de mayor prioridad.
     */
    public T obtenerSiguientePaquete() {
        if (colaPrioridad.isEmpty()) {
            throw new NoSuchElementException("No hay paquetes disponibles");
        }
        return colaPrioridad.peek();
    }

    /**
     * Retorna un iterador para recorrer los paquetes.
     * NOTA: PriorityQueue no garantiza orden con iterator(), solo con poll().
     */
    public Iterator<T> iterator() {
        return colaPrioridad.iterator();
    }

    /**
     * Muestra todos los paquetes usando SOLO iteradores (sin ciclos).
     * Implementación recursiva.
     */
    public void mostrarPaquetes() {
        System.out.println("=== PAQUETES EN COLA (por orden de prioridad) ===");

        // Para mostrar en orden de prioridad, necesitamos extraer elementos
        // Hacemos una copia temporal para no perder los datos
        PriorityQueue<T> colaTemp = new PriorityQueue<>(comparador);
        copiarColaRecursivo(colaPrioridad, colaTemp);

        mostrarColaRecursivo(colaTemp);

        // Restaurar la cola original
        restaurarColaRecursivo(colaTemp, colaPrioridad);

        System.out.println("Total de paquetes: " + colaPrioridad.size());
        System.out.println();
    }

    /**
     * Muestra los paquetes en orden de prioridad usando iterador.
     */
    private void mostrarColaRecursivo(PriorityQueue<T> cola) {
        if (!cola.isEmpty()) {
            T paquete = cola.poll();
            System.out.println("  [" + paquete.getPrioridad() + "] " +
                    paquete.getIdentificador() + " -> " + paquete.getDireccion());
            mostrarColaRecursivo(cola);
        }
    }

    /**
     * Copia los elementos de una cola a otra recursivamente.
     */
    private void copiarColaRecursivo(PriorityQueue<T> origen, PriorityQueue<T> destino) {
        Iterator<T> it = origen.iterator();
        copiarConIterador(it, destino);
    }

    /**
     * Copia elementos usando iterador de forma recursiva.
     */
    private void copiarConIterador(Iterator<T> it, PriorityQueue<T> destino) {
        if (it.hasNext()) {
            destino.add(it.next());
            copiarConIterador(it, destino);
        }
    }

    /**
     * Restaura los elementos de una cola a otra recursivamente.
     */
    private void restaurarColaRecursivo(PriorityQueue<T> origen, PriorityQueue<T> destino) {
        if (!origen.isEmpty()) {
            destino.add(origen.poll());
            restaurarColaRecursivo(origen, destino);
        }
    }

    /**
     * Procesa todos los paquetes (elimina y muestra) usando solo iteradores.
     */
    public void procesarTodosLosPaquetes() {
        System.out.println("=== PROCESANDO PAQUETES EN ORDEN DE PRIORIDAD ===");
        procesarRecursivo();
        System.out.println("=== TODOS LOS PAQUETES HAN SIDO PROCESADOS ===\n");
    }

    private void procesarRecursivo() {
        if (!colaPrioridad.isEmpty()) {
            T paquete = eliminarPaquete();
            System.out.println("Entregando paquete con prioridad " + paquete.getPrioridad() + ": " +
                    paquete.getIdentificador() + " -> " + paquete.getDireccion());
            procesarRecursivo();
        }
    }

    /**
     * Cuenta paquetes usando solo iteradores (recursivo).
     */
    public int contarPaquetes() {
        return contarRecursivo(colaPrioridad.iterator());
    }

    private int contarRecursivo(Iterator<T> it) {
        if (!it.hasNext()) {
            return 0;
        }
        it.next(); // Consumimos el elemento
        return 1 + contarRecursivo(it);
    }

    public boolean estaVacio() {
        return colaPrioridad.isEmpty();
    }

    public int tamaño() {
        return colaPrioridad.size();
    }
}
