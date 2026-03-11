package co.edu.uniquindio.ejercicio8;

import java.util.Stack;
import co.edu.uniquindio.ejercicio2.Pair;

/**
 * Utilidad para dividir un stack en dos sub-stacks.
 */
public class SplitStackUtil {


    public static Pair<Stack<Integer>, Stack<Integer>> splitStack(Stack<Integer> s, int i) {
        Stack<Integer> bottomPart = new Stack<>();
        Stack<Integer> topPart = new Stack<>();
        Stack<Integer> temp = new Stack<>();

        // 1. Movemos todo a una pila temporal para invertir el orden.
        // Ahora el fondo de 's' estará en el tope de 'temp'.
        while (!s.isEmpty()) {
            temp.push(s.pop());
        }

        int currentPos = 0;

        // 2. Distribuimos los elementos desde el "fondo" original.
        while (!temp.isEmpty()) {
            Integer element = temp.pop();

            if (currentPos < i) {
                bottomPart.push(element);
            } else {
                topPart.push(element);
            }
            currentPos++;
        }

        return new Pair<>(bottomPart, topPart);
    }

    /**
     * Imprime un stack de fondo a tope.
     */
    public static void imprimirStack(Stack<Integer> s) {
        if (s.isEmpty()) {
            System.out.println("[vacío]");
            return;
        }

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
