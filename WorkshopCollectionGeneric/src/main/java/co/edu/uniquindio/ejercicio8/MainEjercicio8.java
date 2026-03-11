package co.edu.uniquindio.ejercicio8;

import java.util.Stack;

/**
 * Clase principal para probar splitStack.
 */
public class MainEjercicio8 {

    public static void main(String[] args) {
        // Dividir [1,2,3,4,5] en posición 2
        Stack<Integer> s = new Stack<>();
        s.push(1); s.push(2); s.push(3); s.push(4); s.push(5);

        System.out.println("Stack original [1,2,3,4,5]:");
        SplitStackUtil.imprimirStack(s);

        var resultado = SplitStackUtil.splitStack(s, 2);
        System.out.println("\nsplitStack(s, 2):");
        System.out.print("Primera parte [0-1]: ");
        SplitStackUtil.imprimirStack(resultado.getClave());
        System.out.print("Segunda parte [2-4]: ");
        SplitStackUtil.imprimirStack(resultado.getValor());
    }
}
