package co.edu.uniquindio.preguntacuatro;

import java.util.Comparator;

public class ComparatorByDuracion implements Comparator<Cancion> {
    @Override
    public int compare(Cancion a, Cancion b) {
        return Integer.compare(a.getDuracionSegundos(), b.getDuracionSegundos());
    }
}
