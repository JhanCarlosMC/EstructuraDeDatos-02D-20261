package co.edu.uniquindio.preguntauno;

import java.util.Iterator;
import java.util.Map;

public class BibliotecaDigital {
    public static <K, V> V buscarRecursivo(Iterator<Map.Entry<K, V>> it, K clave) {
        // Caso base: no quedan más entradas → clave no existe
        if (!it.hasNext()) {
            return null;
        }
        // Avanzar UNA sola entrada en esta llamada
        Map.Entry<K, V> entrada = it.next();
        // Comparar la clave actual con la buscada
        if (entrada.getKey().equals(clave)) {
            return entrada.getValue();  // Encontrado
        }
        // Caso recursivo: seguir buscando en el resto del iterador
        return buscarRecursivo(it, clave);
    }

    /**
     * Método auxiliar que encapsula la creación del Iterator.
     */
    public static <K, V> V buscar(Map<K, V> mapa, K clave) {
        Iterator<Map.Entry<K, V>> it = mapa.entrySet().iterator();
        return buscarRecursivo(it, clave);
    }

}
