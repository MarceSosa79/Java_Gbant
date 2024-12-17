package Clase_Math;

import java.util.Scanner;

public class CalculoPotencia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int base, exponente;

        System.out.print("Ingresa la base (entero): ");
        base = scanner.nextInt();

        System.out.print("Ingresa el exponente (entero): ");
        exponente = scanner.nextInt();

        switch (base) {
            case 0:
                System.out.println("Error: La base no puede ser 0.");
                break;
            default:
                switch (exponente) {
                    case 0:
                        System.out.println("Error: El exponente no puede ser 0.");
                        break;
                    default:
                        
                        double resultado = Math.pow(base, exponente);
                        System.out.println("El resultado de " + base + " elevado a la " + exponente + " es: " + resultado);
                }
        }
        scanner.close();
    }
}
