package co.edu.uniquindio.ejercicio9;

/**
 * Clase Camión que extiende de Vehículo.
 */
public class Camion extends Vehiculo {
    private double capacidadCarga; // en toneladas

    public Camion(String marca, String modelo, double capacidadCarga) {
        super(marca, modelo);
        this.capacidadCarga = capacidadCarga;
    }

    @Override
    public void alquilar() {
        System.out.println("✓ Camión alquilado: " + this + " (" + capacidadCarga + " toneladas)");
        System.out.println("  - Licencia categoría C requerida");
        System.out.println("  - Ideal para mudanzas o transporte de carga");
    }

    public void cargar() {
        System.out.println("  Cargando el camión " + marca + " " + modelo);
    }

    @Override
    public String toString() {
        return "Camión " + super.toString();
    }
}
