package Clase_Math;

import java.util.Scanner;

public class RedondeoNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa un numero decimal: ");
        double numeroDecimal = sc.nextDouble();

        long numeroRedondeado = Math.round(numeroDecimal);

        System.out.println("El valor redondeado es: " + numeroRedondeado);

        sc.close();
    }
}
