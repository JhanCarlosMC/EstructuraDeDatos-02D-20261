package co.edu.uniquindio.ejercicio9;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase principal para probar el sistema de alquiler de vehículos.
 */
public class MainEjercicio9 {

    public static void main(String[] args) {
        // Lista mixta de vehículos
        List<Vehiculo> flotaMixta = new ArrayList<>();
        flotaMixta.add(new Auto("Toyota", "Corolla", 4));
        flotaMixta.add(new Moto("Honda", "CBR", 600));
        flotaMixta.add(new Camion("Volvo", "FH", 15.5));
        flotaMixta.add(new Auto("Ford", "Mustang", 2));

        System.out.println("=== Alquiler de vehículos ===");
        SistemaAlquiler.alquilarVehiculos(flotaMixta);

        // Lista solo de Autos
        List<Auto> soloAutos = new ArrayList<>();
        soloAutos.add(new Auto("Chevrolet", "Spark", 4));
        soloAutos.add(new Auto("Renault", "Clio", 5));

        System.out.println("\n=== Alquiler de solo autos ===");
        SistemaAlquiler.alquilarVehiculos(soloAutos);
    }
}
