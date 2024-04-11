package org.example;
import java.util.Scanner;

public class Moto extends Vehiculo{
    //Atributos
    public String pieza1;
    public String pieza2;
    public String pieza3;
    public String pieza4;
    public String pieza5;

    //Constructor
    public Moto(String matricula, String color, String marca, String pieza1, String pieza2, String pieza3, String pieza4, String pieza5) {
        super(matricula, color, marca);
        this.pieza1 = pieza1;
        this.pieza2 = pieza2;
        this.pieza3 = pieza3;
        this.pieza4 = pieza4;
        this.pieza5 = pieza5;
    }
    public static Moto crearMoto() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca la matrícula de la moto:");
        String matricula = scanner.nextLine();
        System.out.println("Introduzca el color de la moto:");
        String color = scanner.nextLine();
        System.out.println("Introduzca la marca de la moto:");
        String marca = scanner.nextLine();
        return new Moto(matricula, color, marca, "Acelerador", "Motor", "Luces", "Frenos", "Ruedas");
    }
}
