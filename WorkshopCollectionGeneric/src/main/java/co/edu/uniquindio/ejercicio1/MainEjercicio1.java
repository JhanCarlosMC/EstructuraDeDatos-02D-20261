package co.edu.uniquindio.ejercicio1;

import java.time.LocalDate;

/**
 * Clase principal para probar el sistema de gestión de tareas.
 */
public class MainEjercicio1 {

    public static void main(String[] args) {
        ListaDeTareas<String, Integer, LocalDate> listaDeTareas = new ListaDeTareas<>();

        // Agregar tareas
        listaDeTareas.agregarTarea(new Tarea<>("Completar proyecto de estructuras", 3, LocalDate.of(2026, 3, 12)));
        listaDeTareas.agregarTarea(new Tarea<>("Estudiar para el examen", 5, LocalDate.of(2026, 3, 15)));
        listaDeTareas.agregarTarea(new Tarea<>("Revisar documentación", 1, LocalDate.of(2026, 3, 10)));
        listaDeTareas.agregarTarea(new Tarea<>("Preparar presentación", 4, LocalDate.of(2026, 3, 18)));

        System.out.println("Tareas agregadas: " + listaDeTareas.tamaño());

        // Mostrar en orden de prioridad
        System.out.println("\n=== Tareas en orden de prioridad ===");
        listaDeTareas.mostrarTodasLasTareas();

        // Mostrar ordenadas por fecha
        System.out.println("\n=== Tareas ordenadas por fecha ===");
        listaDeTareas.mostrarTareasOrdenadasPorFecha();

        // Obtener tareas por prioridad
        System.out.println("\n=== Tareas con prioridad 3 ===");
        var tareasPrioridad3 = listaDeTareas.obtenerTareasPorPrioridad(3);
        tareasPrioridad3.forEach(System.out::println);
    }
}
