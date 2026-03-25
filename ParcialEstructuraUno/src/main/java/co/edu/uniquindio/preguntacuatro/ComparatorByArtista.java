package co.edu.uniquindio.preguntacuatro;

import java.util.Comparator;

public class ComparatorByArtista implements Comparator<Cancion> {
    @Override
    public int compare(Cancion a, Cancion b) {
        return a.getArtista().compareTo(b.getArtista());
    }
}
