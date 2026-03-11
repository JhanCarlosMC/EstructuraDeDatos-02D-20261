package co.edu.uniquindio.ejercicio2;

/**
 * Clase principal para probar PairList.
 */
public class MainEjercicio2 {

    public static void main(String[] args) {
        // Ejemplo con String e Integer
        PairList<String, Integer> edades = new PairList<>();
        edades.agregar("Juan", 25);
        edades.agregar("María", 30);
        edades.agregar("Carlos", 28);

        System.out.println("=== PairList<String, Integer> ===");
        edades.mostrarPares();

        System.out.println("\nObtener edad de Juan: " + edades.obtener("Juan"));
        System.out.println("Eliminar a María: " + edades.eliminar("María"));
        edades.mostrarPares();

        // Ejemplo con Integer y String
        System.out.println("\n=== PairList<Integer, String> ===");
        PairList<Integer, String> productos = new PairList<>();
        productos.agregar(1, "Laptop");
        productos.agregar(2, "Mouse");
        productos.agregar(3, "Teclado");
        productos.mostrarPares();
    }
}
