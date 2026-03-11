package co.edu.uniquindio.ejercicio10;

import java.util.Comparator;

/**
 * Comparator que ordena paquetes por prioridad descendente.
 * Prioridad mayor (número más alto) primero.
 */
public class ComparadorPrioridadDescendente implements Comparator<Paquete> {

    @Override
    public int compare(Paquete p1, Paquete p2) {
        // Orden descendente: mayor prioridad primero
        return Integer.compare(p2.getPrioridad(), p1.getPrioridad());
    }
}
