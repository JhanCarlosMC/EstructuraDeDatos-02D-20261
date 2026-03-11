package co.edu.uniquindio.ejercicio5;

import java.util.Stack;

/**
 * Utilidad para manipular stacks con el método spliceStack.
 */
public class SpliceStackUtil {

    /**
     * Elimina una secuencia de elementos del stack desde la posición i hasta la posición j
     * (sin incluir j), donde la posición 0 es el fondo del stack.
     * Los elementos eliminados se retornan en un nuevo stack manteniendo el orden.
     *
     * @param s Stack original de enteros
     * @param i Posición inicial (desde el fondo, 0-indexed)
     * @param j Posición final (desde el fondo, sin incluir)
     * @return Nuevo stack con los elementos eliminados (orden preservado)
     *
     * EJEMPLO:
     * Stack original (fondo -> tope): [1, 2, 3, 4, 5]
     * spliceStack(s, 1, 3) retorna: [2, 3]
     * Stack resultante: [1, 4, 5]
     *
     * Posiciones:     0  1  2  3  4
     * Elementos:      1  2  3  4  5
     */
    public static Stack<Integer> spliceStack(Stack<Integer> s, int i, int j) {
        // Validar parámetros
        if (i < 0 || j > s.size() || i >= j) {
            throw new IllegalArgumentException(
                "Parámetros inválidos. i=" + i + ", j=" + j + ", tamaño=" + s.size()
            );
        }

        // Stack temporal para invertir el orden
        Stack<Integer> temp = new Stack<>();
        Stack<Integer> resultado = new Stack<>();

        // Paso 1: Pasar elementos del tope hasta llegar a la posición j
        // El tope del stack es el último elemento (posición size-1 desde el fondo)
        int elementosMover = s.size() - j;
        for (int k = 0; k < elementosMover; k++) {
            temp.push(s.pop());
        }

        // Paso 2: Extraer los elementos desde j-1 hasta i (inclusive)
        // Estos son los que irán al resultado
        int elementosExtraer = j - i;
        for (int k = 0; k < elementosExtraer; k++) {
            resultado.push(s.pop());
        }

        // Paso 3: Restaurar los elementos del temporal al stack original
        while (!temp.isEmpty()) {
            s.push(temp.pop());
        }

        // Paso 4: Invertir el resultado para mantener el orden original
        Stack<Integer> resultadoOrdenado = new Stack<>();
        while (!resultado.isEmpty()) {
            resultadoOrdenado.push(resultado.pop());
        }

        return resultadoOrdenado;
    }

    /**
     * Método auxiliar para imprimir un stack de fondo a tope.
     */
    public static void imprimirStack(Stack<Integer> s) {
        if (s.isEmpty()) {
            System.out.println("[Stack vacío]");
            return;
        }

        // Convertir a array para imprimir en orden de fondo a tope
        Object[] elementos = s.toArray();
        System.out.print("[Fondo] ");
        for (int i = 0; i < elementos.length; i++) {
            System.out.print(elementos[i]);
            if (i < elementos.length - 1) {
                System.out.print(" <- ");
            }
        }
        System.out.println(" [Tope]");
    }
}
