package co.edu.uniquindio.ejercicio9;

/**
 * Clase Auto que extiende de Vehículo.
 */
public class Auto extends Vehiculo {
    private int numeroPuertas;

    public Auto(String marca, String modelo, int numeroPuertas) {
        super(marca, modelo);
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public void alquilar() {
        System.out.println("✓ Auto alquilado: " + this + " (" + numeroPuertas + " puertas)");
        System.out.println("  - Incluye aire acondicionado");
        System.out.println("  - Seguro básico incluido");
    }

    public void conducir() {
        System.out.println("  Conduciendo el auto " + marca + " " + modelo);
    }

    @Override
    public String toString() {
        return "Auto " + super.toString();
    }
}
