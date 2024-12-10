package Introduccion_Java;

import java.util.Scanner;

public class Edades {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la edad: ");
        int edad = scanner.nextInt();
        scanner.close();

        if (edad < 18) {
            System.out.println("Eres menor de edad");
        } else if (edad < 65) {
            System.out.println("Eres adulto");
        } else {
            System.out.println("Eres un adulto mayor");
        }
    }
}
