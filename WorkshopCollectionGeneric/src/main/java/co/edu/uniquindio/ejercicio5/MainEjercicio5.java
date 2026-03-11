package co.edu.uniquindio.ejercicio5;

import java.util.Stack;

/**
 * Clase principal para probar spliceStack.
 */
public class MainEjercicio5 {

    public static void main(String[] args) {
        // Prueba: Extraer posiciones 1 y 2 de [1,2,3,4,5]
        Stack<Integer> s = new Stack<>();
        s.push(1); s.push(2); s.push(3); s.push(4); s.push(5);

        System.out.println("Stack original [1,2,3,4,5]:");
        SpliceStackUtil.imprimirStack(s);

        Stack<Integer> resultado = SpliceStackUtil.spliceStack(s, 1, 3);
        System.out.println("\nspliceStack(s, 1, 3) - Extrae posiciones 1 y 2:");
        System.out.print("Elementos extraídos: ");
        SpliceStackUtil.imprimirStack(resultado);
        System.out.print("Stack resultante: ");
        SpliceStackUtil.imprimirStack(s);
    }
}
