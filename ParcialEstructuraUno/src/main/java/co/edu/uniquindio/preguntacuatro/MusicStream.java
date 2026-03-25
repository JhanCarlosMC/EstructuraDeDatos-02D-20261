package co.edu.uniquindio.preguntacuatro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MusicStream {

    public static void imprimirReporte(String encabezado, List<Cancion> lista) {
        System.out.println("\n=== " + encabezado + " ===");
        for (Cancion c : lista) {
            System.out.println(c);
        }
    }

    public static void main(String[] args) {

        List<Cancion> canciones = new ArrayList<>();
        canciones.add(new Cancion("Bohemian Rhapsody", "Queen", 354, 2_500_000));
        canciones.add(new Cancion("Blinding Lights", "The Weeknd", 200, 3_800_000));
        canciones.add(new Cancion("Hotel California", "Eagles", 391, 980_000));
        canciones.add(new Cancion("Shape of You", "Ed Sheeran", 234, 4_200_000));
        canciones.add(new Cancion("As It Was", "Harry Styles", 167, 3_100_000));

        // Orden natural: título A→Z (Comparable)
        Collections.sort(canciones);
        imprimirReporte("POR TÍTULO A→Z", canciones);

        // Por reproducciones: mayor a menor
        Collections.sort(canciones, new ComparatorByReproducciones());
        imprimirReporte("POR REPRODUCCIONES (mayor → menor)", canciones);

        // Por duración: menor a mayor
        Collections.sort(canciones, new ComparatorByDuracion());
        imprimirReporte("POR DURACIÓN (menor → mayor)", canciones);

        // Por artista: A→Z
        Collections.sort(canciones, new ComparatorByArtista());
        imprimirReporte("POR ARTISTA A→Z", canciones);

    }
}
