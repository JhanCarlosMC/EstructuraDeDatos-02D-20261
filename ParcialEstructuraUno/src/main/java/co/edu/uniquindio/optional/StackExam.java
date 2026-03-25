package co.edu.uniquindio.optional;

import java.util.LinkedList;

public class StackExam {

    // Extrae los elementos entre start y end contando desde el fondo
    public static LinkedList<Integer> extractSegment(LinkedList<Integer> s, int start, int end) {
        LinkedList<Integer> extracted = new LinkedList<>();
        LinkedList<Integer> remaining = new LinkedList<>();

        if (s == null || start < 0 || end < start || end >= s.size()) {
            throw new IllegalArgumentException("Rango inválido");
        }

        int size = s.size();
        int indexFromTop = 0;

        while (!s.isEmpty()) {
            int element = s.pop(); // saca del tope
            int posFromBottom = size - 1 - indexFromTop;

            if (posFromBottom >= start && posFromBottom <= end) {
                extracted.push(element);
            } else {
                remaining.push(element);
            }

            indexFromTop++;
        }

        // reconstruir la pila original usando push
        for (int i = remaining.size() - 1; i >= 0; i--) {
            s.push(remaining.get(i));
        }

        // construir la pila extraída usando push
        LinkedList<Integer> result = new LinkedList<>();
        for (int i = extracted.size() - 1; i >= 0; i--) {
            result.push(extracted.get(i));
        }

        return result;
    }

    public static void main(String[] args) {
        LinkedList<Integer> stack = new LinkedList<>();

        stack.push(2);
        stack.push(8);
        stack.push(5);
        stack.push(10);
        stack.push(7);
        stack.push(3);

        System.out.println("Tope actual con peek: " + stack.peek());
        System.out.println("Pila interna (tope a fondo): " + stack);

        LinkedList<Integer> extractedSegment = extractSegment(stack, 2, 4);

        System.out.println("Segmento extraído (tope a fondo): " + extractedSegment);
        System.out.println("Pila original después de extraer (tope a fondo): " + stack);
    }
}