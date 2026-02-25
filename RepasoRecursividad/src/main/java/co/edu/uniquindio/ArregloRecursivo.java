package co.edu.uniquindio;

public class ArregloRecursivo {
    public static void main(String[] args) {
        int[] numeros = {1,2,3,4,5,6,7,8,9};

        recorrerArreglo(numeros,0);
    }

    //Recorrer un arreglo de forma recursiva.
    public static void recorrerArreglo(int[] arrNumeros, int index){
        //Caso Base
        if(index == arrNumeros.length) return;

        //Caso recursivo
        recorrerArreglo(arrNumeros, index+1);
        System.out.print(arrNumeros[index]);
    }

    public static void recorrerArregloDivideVenceras(int[] arrNumeros, int indexInicio,int indexFin){

    }
}
