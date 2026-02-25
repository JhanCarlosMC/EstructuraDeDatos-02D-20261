package co.edu.uniquindio;

import java.util.Comparator;

public class PersonaComparator implements Comparator<Persona> {

    @Override
    public int compare(Persona p1, Persona p2) {
        return Integer.compare(p1.getEdad(), p2.getEdad());
//        return p1.getEdad() - p2.getEdad();
    }
}
