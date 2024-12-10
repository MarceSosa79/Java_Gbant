package Introduccion_Java;

import java.util.Scanner;

public class clase4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Hola, por favor ingresa un número :");
        double num = scan.nextDouble();

        scan.close();

        if (num < 0) {
            System.out.println("Su número es negativo.");
        }
        else if (num == 0) {
            System.out.println("Su número es cero.");
        }
        else {
            System.out.println("Su número es positivo.");
        }
    }
}