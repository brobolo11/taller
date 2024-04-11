package org.example;

import java.util.Scanner;

import static org.example.Taller.repararVehiculo;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("¿Qué vehículo entra? (coche, moto, camión, tractor, grúa, salir)");
            String tipoVehiculo = scanner.nextLine().toLowerCase();

            if (tipoVehiculo.equals("salir")) {
                System.out.println("Saliendo del taller.");
                break;
            }

            Vehiculo vehiculo = null;

            switch (tipoVehiculo) {
                case "coche":
                    vehiculo = Coche.crearCoche();
                    break;
                case "moto":
                    vehiculo = Moto.crearMoto();
                    break;
                case "camion":
                    vehiculo = Camion.crearCamion();
                    break;
                case "tractor":
                    vehiculo = Tractor.crearTractor();
                    break;
                case "grua":
                    vehiculo = Grua.crearGrua();
                    break;
                default:
                    System.out.println("Tipo de vehículo no válido.");
                    continue;
            }

            if (vehiculo != null) {
                repararVehiculo(vehiculo);
            }

            System.out.println("¿Desea seguir (s/n)?");
            String seguir = scanner.nextLine().toLowerCase();
            if (!seguir.equals("s")) {
                System.out.println("Saliendo del taller.");
                break;
            }
        }

        scanner.close();
    }
}