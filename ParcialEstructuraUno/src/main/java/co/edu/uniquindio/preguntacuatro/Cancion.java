package co.edu.uniquindio.preguntacuatro;

public class Cancion implements Comparable<Cancion> {

    private String titulo;
    private String artista;
    private int duracionSegundos;
    private int reproducciones;

    public Cancion(String titulo, String artista, int duracionSegundos, int reproducciones) {
        this.titulo = titulo;
        this.artista = artista;
        this.duracionSegundos = duracionSegundos;
        this.reproducciones = reproducciones;
    }
    @Override
    public int compareTo(Cancion otra) {
        return this.titulo.compareTo(otra.titulo);
    }

    public String getTitulo() {
        return titulo;
    }

    public String getArtista() {
        return artista;
    }

    public int getDuracionSegundos() {
        return duracionSegundos;
    }

    public int getReproducciones() {
        return reproducciones;
    }

    // Orden natural: título A→Z

    @Override
    public String toString() {
        return String.format("%-30s | %-15s | %3ds | %,d reproducciones",
                titulo, artista, duracionSegundos, reproducciones);
    }
}


