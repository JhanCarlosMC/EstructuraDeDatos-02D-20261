package co.edu.uniquindio.ejercicio10;

/**
 * Clase principal para probar el GestorPaquetes.
 */
public class MainEjercicio10 {

    public static void main(String[] args) {
        GestorPaquetes<Paquete> gestor = new GestorPaquetes<>();

        // Agregar paquetes
        gestor.agregarPaquete(new Paquete("PKG001", "Calle 123 #45-67", 3));
        gestor.agregarPaquete(new Paquete("PKG002", "Avenida 8 #12-34", 5));
        gestor.agregarPaquete(new Paquete("PKG003", "Carrera 15 #20-30", 1));
        gestor.agregarPaquete(new Paquete("PKG004", "Calle 50 #10-20", 4));

        // Mostrar en orden de prioridad
        System.out.println("\n=== Paquetes en orden de prioridad ===");
        gestor.mostrarPaquetes();

        // Ver siguiente paquete
        System.out.println("\n=== Siguiente paquete a entregar ===");
        Paquete siguiente = gestor.obtenerSiguientePaquete();
        System.out.println("Prioridad más alta: " + siguiente);

        // Eliminar paquete de mayor prioridad
        System.out.println("\n=== Eliminando paquete de mayor prioridad ===");
        Paquete eliminado = gestor.eliminarPaquete();
        System.out.println("Paquete eliminado: " + eliminado);

        // Procesar todos los paquetes
        System.out.println("\n=== Procesando todos los paquetes ===");
        gestor.procesarTodosLosPaquetes();
        System.out.println("¿Está vacío? " + gestor.estaVacio());
    }
}
