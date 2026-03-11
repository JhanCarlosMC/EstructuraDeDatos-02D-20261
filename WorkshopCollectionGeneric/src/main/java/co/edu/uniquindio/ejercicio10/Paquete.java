package co.edu.uniquindio.ejercicio10;

/**
 * Clase que representa un paquete con identificador, dirección y prioridad.
 * Implementa Comparable para orden natural por identificador.
 */
public class Paquete implements Comparable<Paquete> {
    private String identificador;
    private String direccion;
    private int prioridad; // Mayor número = mayor prioridad

    public Paquete(String identificador, String direccion, int prioridad) {
        this.identificador = identificador;
        this.direccion = direccion;
        this.prioridad = prioridad;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    /**
     * Orden natural por identificador (alfabético).
     */
    @Override
    public int compareTo(Paquete otro) {
        return this.identificador.compareTo(otro.identificador);
    }

    @Override
    public String toString() {
        return "Paquete{" +
                "ID='" + identificador + '\'' +
                ", dir='" + direccion + '\'' +
                ", prio=" + prioridad +
                '}';
    }
}
