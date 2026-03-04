package co.edu.uniquindio;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Persona newPersona = new Persona("Jhan", 25);
        System.out.println(newPersona.getValue("Jhan"));
        System.out.println(newPersona.getValue(2));
        System.out.println(newPersona.getValue(newPersona));

//        LinkedList<Persona> listaPersonas = new LinkedList<>();
//
//        listaPersonas.add(new Persona("Santiago", 20));
//        listaPersonas.add(new Persona("Jose", 18));
//        listaPersonas.add(new Persona("Camilo", 21));
//        listaPersonas.add(new Persona("Oscar", 19));
//
//        for (Persona persona : listaPersonas) {
//            System.out.println(persona);
//        }
//
//        Collections.sort(listaPersonas);
//        System.out.println("---------------------------------");
//
//        for (Persona persona : listaPersonas) {
//            System.out.println(persona);
//        }
//
//        Collections.sort(listaPersonas, new PersonaComparator());
//        System.out.println("---------------------------------");
//
//        for (Persona persona : listaPersonas) {
//            System.out.println(persona);
//        }
//
//        listaPersonas.sort(
//                (p1, p2) ->
//                        p1.getNombre().compareTo(p2.getNombre()));
//        Collections.sort(listaPersonas, Comparator.comparing(Persona::getNombre));
//        listaPersonas.sort(Comparator.comparing(Persona::getNombre));


    }
}