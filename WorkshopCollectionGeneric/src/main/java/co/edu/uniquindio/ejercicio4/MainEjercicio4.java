package co.edu.uniquindio.ejercicio4;

/**
 * Clase principal para probar el Repositorio genérico.
 */
public class MainEjercicio4 {

    public static void main(String[] args) {
        // Crear repositorio usando la interfaz
        Repositorio<String> repositorio = new Repositorio<>();

        // Agregar elementos
        repositorio.agregar("Primero");
        repositorio.agregar("Segundo");
        repositorio.agregar("Tercero");
        repositorio.agregar("Cuarto");
        repositorio.agregar("Quinto");

        // Recorrer con for-each (Iterable)
        System.out.println("=== Recorrido con for-each ===");
        for (String elemento : repositorio) {
            System.out.println(elemento);
        }

        // Obtener elemento por índice
        System.out.println("\nElemento en índice 2: " + repositorio.obtener(2));

        // Recorrer con iterador reverso personalizado
        System.out.println("\n=== Recorrido con iterador reverso ===");
        Repositorio<String> repo = repositorio;
        var iteradorReverso = repo.reverseIterator();
        while (iteradorReverso.hasNext()) {
            System.out.println(iteradorReverso.next());
        }
    }
}
