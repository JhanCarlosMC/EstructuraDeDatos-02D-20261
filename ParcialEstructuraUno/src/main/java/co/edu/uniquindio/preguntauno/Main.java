package co.edu.uniquindio.preguntauno;

import java.util.HashMap;
import java.util.Map;

import static co.edu.uniquindio.preguntauno.BibliotecaDigital.buscar;

public class Main {
    public static void main(String[] args) {
        Map<String, String> catalogo = new HashMap<>();
        catalogo.put("LIB-001", "Cien años de soledad");
        catalogo.put("LIB-002", "El Quijote");
        catalogo.put("LIB-003", "1984");
        catalogo.put("LIB-004", "El principito");
        catalogo.put("LIB-005", "Crimen y castigo");

        String codigoBuscar = "LIB-003";

        String titulo = buscar(catalogo, codigoBuscar);
        if (titulo != null) {
            System.out.println("Código: " + codigoBuscar + " → Título: " + titulo);
        } else {
            System.out.println("Código: " + codigoBuscar + " → No encontrado.");
        }
    }
}