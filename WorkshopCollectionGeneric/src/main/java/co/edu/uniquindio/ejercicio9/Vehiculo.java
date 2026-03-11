package co.edu.uniquindio.ejercicio9;

/**
 * Clase base abstracta para todos los vehículos.
 * Define el método común alquilar() que todas las subclases deben implementar.
 */
public abstract class Vehiculo {
    protected String marca;
    protected String modelo;

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    /**
     * Método abstracto que cada tipo de vehículo debe implementar.
     */
    public abstract void alquilar();

    @Override
    public String toString() {
        return marca + " " + modelo;
    }
}
