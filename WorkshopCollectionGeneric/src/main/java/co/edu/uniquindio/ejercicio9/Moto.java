package co.edu.uniquindio.ejercicio9;

/**
 * Clase Moto que extiende de Vehículo.
 */
public class Moto extends Vehiculo {
    private int cilindrada;

    public Moto(String marca, String modelo, int cilindrada) {
        super(marca, modelo);
        this.cilindrada = cilindrada;
    }

    @Override
    public void alquilar() {
        System.out.println("✓ Moto alquilada: " + this + " (" + cilindrada + "cc)");
        System.out.println("  - Casco incluido");
        System.out.println("  - Perfecta para tráfico urbano");
    }

    public void conducir() {
        System.out.println("  Conduciendo la moto " + marca + " " + modelo);
    }

    @Override
    public String toString() {
        return "Moto " + super.toString();
    }
}
