package co.edu.uniquindio.ejercicio1;

import java.time.LocalDate;
import java.util.Date;

/**
 * Clase genérica que representa una tarea.
 *
 * @param <T> Tipo de la descripción (String o subtipo de CharSequence)
 * @param <P> Tipo de la prioridad (Number y Comparable, típicamente Integer)
 * @param <S> Tipo de la fecha de vencimiento (Date, LocalDate o cualquier Comparable)
 */
public class Tarea<T extends CharSequence,
        P extends Number & Comparable<P>,
        S extends LocalDate>
        implements Comparable<Tarea<T, P, S>> {

    private T descripcion;
    private P prioridad;
    private S fechaVencimiento;

    public Tarea(T descripcion, P prioridad, S fechaVencimiento) {
        this.descripcion = descripcion;
        this.prioridad = prioridad;
        this.fechaVencimiento = fechaVencimiento;
    }

    public T getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(T descripcion) {
        this.descripcion = descripcion;
    }

    public P getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(P prioridad) {
        this.prioridad = prioridad;
    }

    public S getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(S fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    /**
     * Orden natural por prioridad (mayor prioridad = mayor número).
     * Permite que PriorityQueue ordene las tareas automáticamente.
     */
    @Override
    public int compareTo(Tarea<T, P, S> otra) {
        // Orden descendente: mayor prioridad primero
        return otra.prioridad.compareTo(this.prioridad);
    }

    @Override
    public String toString() {
        return "Tarea{" +
                "descripcion=" + descripcion +
                ", prioridad=" + prioridad +
                ", fechaVencimiento=" + fechaVencimiento +
                '}';
    }
}
