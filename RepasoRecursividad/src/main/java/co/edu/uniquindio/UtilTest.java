package co.edu.uniquindio;

import java.util.*;

public class UtilTest {
    public static void main(String[] args) {
//        int[] arrNumero = llenarArray();
//        System.out.println(Arrays.toString(arrNumero));
//
//        Arrays.sort(arrNumero);
//        System.out.println(Arrays.toString(arrNumero));
//
//        System.out.println(Arrays.binarySearch(arrNumero, 2));

        List<Integer> numeros = new LinkedList<>();
        numeros.add(3);
        numeros.add(5);
        numeros.add(1);

        mostrarLista(numeros);
        Collections.sort(numeros);
        mostrarLista(numeros);

        Collections.reverse(numeros);
        mostrarLista(numeros);

        Collections.shuffle(numeros);
        mostrarLista(numeros);
    }

    public static void mostrarLista(List<Integer> numeros) {
        for(Integer numero : numeros){
            System.out.print(numero + " ");
        }
        System.out.println();
    }

    public static int[] llenarArray() {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random()*100);
        }
        return arr;
    }

    public static void mostrarArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
