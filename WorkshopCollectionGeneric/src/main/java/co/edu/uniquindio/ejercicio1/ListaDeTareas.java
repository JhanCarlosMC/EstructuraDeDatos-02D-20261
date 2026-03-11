package co.edu.uniquindio.ejercicio1;

import java.time.LocalDate;
import java.util.*;

/**
 * Clase genérica que gestiona una lista de tareas usando PriorityQueue.
 * Las tareas se ordenan automáticamente por prioridad (orden natural definido por Comparable).
 *
 * @param <T> Tipo de la descripción (CharSequence, típicamente String)
 * @param <P> Tipo de la prioridad (Number y Comparable, típicamente Integer)
 * @param <S> Tipo de la fecha de vencimiento (Comparable: Date, LocalDate, etc.)
 */
public class ListaDeTareas<T extends CharSequence,
        P extends Number & Comparable<P>,
        S extends LocalDate> {

    private PriorityQueue<Tarea<T, P, S>> tareas;

    public ListaDeTareas() {
        // PriorityQueue usa el orden natural definido en Comparable (compareTo)
        this.tareas = new PriorityQueue<>();
    }

    /**
     * Agrega una tarea a la cola de prioridad.
     * La tarea se inserta manteniendo el orden por prioridad automáticamente.
     */
    public void agregarTarea(Tarea<T, P, S> tarea) {
        tareas.offer(tarea);
    }

    /**
     * Obtiene y elimina la tarea de mayor prioridad.
     * @return La tarea con mayor prioridad, o null si está vacía
     */
    public Tarea<T, P, S> obtenerTareaMasPrioritaria() {
        return tareas.poll();
    }

    /**
     * Observa la tarea de mayor prioridad sin eliminarla.
     * @return La tarea con mayor prioridad, o null si está vacía
     */
    public Tarea<T, P, S> verSiguienteTarea() {
        return tareas.peek();
    }

    /**
     * Obtiene todas las tareas con una prioridad específica.
     * @param prioridad Prioridad a filtrar
     * @return Lista de tareas con la prioridad dada
     */
    public List<Tarea<T, P, S>> obtenerTareasPorPrioridad(P prioridad) {
        List<Tarea<T, P, S>> tareasFiltradas = new ArrayList<>();

        // Usamos iterador para recorrer (no modifica la cola)
        for (Tarea<T, P, S> tarea : tareas) {
            if (tarea.getPrioridad().compareTo(prioridad) == 0) {
                tareasFiltradas.add(tarea);
            }
        }

        return tareasFiltradas;
    }

    /**
     * Muestra todas las tareas ordenadas por fecha de vencimiento.
     * Crea una copia para no modificar el PriorityQueue original.
     */
    public void mostrarTareasOrdenadasPorFecha() {
        // Extraer todas las tareas a una lista temporal
        List<Tarea<T, P, S>> tareasTemp = new ArrayList<>(tareas);

        // Ordenar por fecha de vencimiento
        tareasTemp.sort((t1,
                         t2) -> t1.getFechaVencimiento().compareTo(
                                 t2.getFechaVencimiento()));

        System.out.println("=== Tareas Ordenadas por Fecha de Vencimiento ===");
        for (Tarea<T, P, S> tarea : tareasTemp) {
            System.out.println(tarea);
        }
    }

    /**
     * Muestra todas las tareas en orden de prioridad (de mayor a menor).
     */
    public void mostrarTodasLasTareas() {
        System.out.println("=== Tareas en Orden de Prioridad ===");

        // Crear una copia para no vaciar el PriorityQueue original
        PriorityQueue<Tarea<T, P, S>> copia = new PriorityQueue<>(tareas);

        int posicion = 1;
        while (!copia.isEmpty()) {
            System.out.println(posicion++ + ". " + copia.poll());
        }
    }

    /**
     * Retorna el número de tareas en la lista.
     */
    public int tamaño() {
        return tareas.size();
    }

    /**
     * Verifica si no hay tareas.
     */
    public boolean estaVacia() {
        return tareas.isEmpty();
    }

    /**
     * Elimina todas las tareas.
     */
    public void limpiar() {
        tareas.clear();
    }
}
