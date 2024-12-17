package Clase_Math;

import java.util.Scanner;

public class CalculoPotencia1 {

    public static void main(String[] args) {
        Scanner superScanner = new Scanner(System.in);

        System.out.println("Ingrese la base: ");
        int base = superScanner.nextInt();

        System.out.println("Ingrese el exponente: ");
        int exponente = superScanner.nextInt();

        System.out.println(
                (base == 0 && exponente == 0)
                        ? "Cariño, no compliques las cosas"
                        : "Bebe, el resultado es " + Math.pow(base, exponente));
        superScanner.close();
    }
}
