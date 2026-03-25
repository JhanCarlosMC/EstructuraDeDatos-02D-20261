package co.edu.uniquindio.preguntacuatro;

import java.util.Comparator;

public class ComparatorByReproducciones implements Comparator<Cancion> {
    @Override
    public int compare(Cancion a, Cancion b) {
        return Integer.compare(b.getReproducciones(), a.getReproducciones());
    }
}
