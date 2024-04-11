package org.example;
import java.util.Scanner;

public class Coche extends Vehiculo {
    //Atributos
    public String pieza1;
    public String pieza2;
    public String pieza3;
    public String pieza4;
    public String pieza5;

    //Constructor
    public Coche(String matricula, String color, String marca, String pieza1, String pieza2, String pieza3, String pieza4, String pieza5) {
        super(matricula, color, marca);
        this.pieza1 = pieza1;
        this.pieza2 = pieza2;
        this.pieza3 = pieza3;
        this.pieza4 = pieza4;
        this.pieza5 = pieza5;
    }
    public static Coche crearCoche() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca la matrícula del coche:");
        String matricula = scanner.nextLine();
        System.out.println("Introduzca el color del coche:");
        String color = scanner.nextLine();
        System.out.println("Introduzca la marca del coche:");
        String marca = scanner.nextLine();
        return new Coche(matricula, color, marca, "Motor", "Volante", "Tubo de escape", "Ruedas", "Pedales");
    }
}
