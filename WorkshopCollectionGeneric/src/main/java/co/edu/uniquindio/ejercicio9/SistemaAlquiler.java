package co.edu.uniquindio.ejercicio9;

import java.util.ArrayList;
import java.util.List;

/**
 * Sistema de alquiler de vehículos usando generics y wildcards.
 * Usa List<? extends Vehiculo> para aceptar cualquier subtipo de Vehiculo.
 */
public class SistemaAlquiler {

    /**
     * Alquila todos los vehículos de una lista.
     * Usa <? extends Vehiculo> (covarianza) para aceptar List<Auto>, List<Moto>,
     * List<Camion>, o List<Vehiculo>.
     *
     * ? extends Vehiculo significa:
     * - "Cualquier tipo que sea Vehiculo o un subtipo de Vehiculo"
     * - Puedes LEER elementos como Vehiculo
     * - No puedes AGREGAR elementos (excepto null)
     */
    public static void alquilarVehiculos(List<? extends Vehiculo> vehiculos) {
        if (vehiculos == null || vehiculos.isEmpty()) {
            System.out.println("No hay vehículos para alquilar.");
            return;
        }

        System.out.println("=== PROCESANDO ALQUILER DE " + vehiculos.size() + " VEHÍCULO(S) ===\n");

        // Podemos iterar y leer elementos como Vehiculo
        for (Vehiculo vehiculo : vehiculos) {
            vehiculo.alquilar();
            System.out.println();
        }

        System.out.println("=== ALQUILER COMPLETADO ===\n");
    }

}
