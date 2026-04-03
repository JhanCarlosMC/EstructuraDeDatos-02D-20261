package co.edu.uniquindio.listasimplecircular;

public class Main {
    public static void main(String[] args) {
        ListaSimpleCircular<String> lista = new ListaSimpleCircular<>();
        lista.insertarInicio("1");
        lista.insertarInicio("2");
        lista.insertarFinal("3");
        lista.insertarFinal("4");
        lista.insertarFinal("5");

        System.out.println(lista);

        lista.eliminarInicio();
        System.out.println(lista);
        lista.eliminarFinal();
        System.out.println(lista);

    }
}
