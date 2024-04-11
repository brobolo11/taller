package org.example;

import java.util.Scanner;

public class Taller {

    public static void repararVehiculo(Vehiculo vehiculo) {
        Scanner scanner = new Scanner(System.in);

        if (vehiculo instanceof Coche coche) {
            System.out.println("Reparando coche...");
            System.out.println("Qué pieza deseas reparar:" + "1. " + coche.pieza1 + ", " + "2. " + coche.pieza2 + ", " + "3. " + coche.pieza3 + ", " + "4. " + coche.pieza4 + "o " + "5. " + coche.pieza5);
            int piezaSeleccionada = scanner.nextInt();
            switch (piezaSeleccionada) {
                case 1:
                    System.out.println("Reparando pieza 1: " + coche.pieza1);
                    break;
                case 2:
                    System.out.println("Reparando pieza 2: " + coche.pieza2);
                    break;
                case 3:
                    System.out.println("Reparando pieza 3: " + coche.pieza3);
                    break;
                case 4:
                    System.out.println("Reparando pieza 4: " + coche.pieza4);
                    break;
                case 5:
                    System.out.println("Reparando pieza 5: " + coche.pieza5);
                    break;
                default:
                    System.out.println("Pieza inválida.");
            }
        } else if (vehiculo instanceof Moto moto) {
            System.out.println("Reparando moto...");
            System.out.println("Qué pieza deseas reparar:" + "1. " + moto.pieza1 + ", " + "2. " + moto.pieza2 + ", " + "3. " + moto.pieza3 + ", " + "4. " + moto.pieza4 + "o " + "5. " + moto.pieza5);
            int piezaSeleccionada = scanner.nextInt();
            switch (piezaSeleccionada) {
                case 1:
                    System.out.println("Reparando pieza 1: " + moto.pieza1);
                    break;
                case 2:
                    System.out.println("Reparando pieza 2: " + moto.pieza2);
                    break;
                case 3:
                    System.out.println("Reparando pieza 3: " + moto.pieza3);
                    break;
                case 4:
                    System.out.println("Reparando pieza 4: " + moto.pieza4);
                    break;
                case 5:
                    System.out.println("Reparando pieza 5: " + moto.pieza5);
                    break;
                default:
                    System.out.println("Pieza inválida.");
            }
        }
        else if (vehiculo instanceof Camion camion) {
            System.out.println("Reparando camion...");
            System.out.println("Qué pieza deseas reparar:" + "1. " + camion.pieza1 + ", " + "2. " + camion.pieza2 + ", " + "3. " + camion.pieza3 + ", " + "4. " + camion.pieza4 + "o " + "5. " + camion.pieza5);
            int piezaSeleccionada = scanner.nextInt();
            switch (piezaSeleccionada) {
                case 1:
                    System.out.println("Reparando pieza 1: " + camion.pieza1);
                    break;
                case 2:
                    System.out.println("Reparando pieza 2: " + camion.pieza2);
                    break;
                case 3:
                    System.out.println("Reparando pieza 3: " + camion.pieza3);
                    break;
                case 4:
                    System.out.println("Reparando pieza 4: " + camion.pieza4);
                    break;
                case 5:
                    System.out.println("Reparando pieza 5: " + camion.pieza5);
                    break;
                default:
                    System.out.println("Pieza inválida.");
            }
        }
        else if (vehiculo instanceof Grua grua) {
            System.out.println("Reparando grua...");
            System.out.println("Qué pieza deseas reparar:" + "1. " + grua.pieza1 + ", " + "2. " + grua.pieza2 + ", " + "3. " + grua.pieza3 + ", " + "4. " + grua.pieza4 + "o " + "5. " + grua.pieza5);
            int piezaSeleccionada = scanner.nextInt();
            switch (piezaSeleccionada) {
                case 1:
                    System.out.println("Reparando pieza 1: " + grua.pieza1);
                    break;
                case 2:
                    System.out.println("Reparando pieza 2: " + grua.pieza2);
                    break;
                case 3:
                    System.out.println("Reparando pieza 3: " + grua.pieza3);
                    break;
                case 4:
                    System.out.println("Reparando pieza 4: " + grua.pieza4);
                    break;
                case 5:
                    System.out.println("Reparando pieza 5: " + grua.pieza5);
                    break;
                default:
                    System.out.println("Pieza inválida.");
            }
        }
        else if (vehiculo instanceof Tractor tractor) {
            System.out.println("Reparando tractor...");
            System.out.println("Qué pieza deseas reparar:" + "1. " + tractor.pieza1 + ", " + "2. " + tractor.pieza2 + ", " + "3. " + tractor.pieza3 + ", " + "4. " + tractor.pieza4 + "o " + "5. " + tractor.pieza5);
            int piezaSeleccionada = scanner.nextInt();
            switch (piezaSeleccionada) {
                case 1:
                    System.out.println("Reparando pieza 1: " + tractor.pieza1);
                    break;
                case 2:
                    System.out.println("Reparando pieza 2: " + tractor.pieza2);
                    break;
                case 3:
                    System.out.println("Reparando pieza 3: " + tractor.pieza3);
                    break;
                case 4:
                    System.out.println("Reparando pieza 4: " + tractor.pieza4);
                    break;
                case 5:
                    System.out.println("Reparando pieza 5: " + tractor.pieza5);
                    break;
                default:
                    System.out.println("Pieza inválida.");
            }
        }
    }
}
