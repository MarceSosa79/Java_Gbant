package Introduccion_Java;

import java.util.Scanner;

public class MiPrimerPrograma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Crear un único Scanner para todo el programa
        logic(scanner); // Método de comparación de números
        mostrarVariables(); // Método para declarar y mostrar variables
        operacionesMatematicas(scanner); // Operaciones matemáticas con entrada del usuario
        scanner.close(); // Cerrar el Scanner al final del programa
    }

    public static void logic(Scanner scanner) {
        System.out.println("Dame un número entero:");
        int num1 = scanner.nextInt();
        System.out.println("Dame un segundo número entero:");
        int num2 = scanner.nextInt();

        System.out.println("El número " + num1 + " es mayor que " + num2 + ": " + (num1 > num2));
        System.out.println("El número " + num1 + " es distinto de " + num2 + ": " + (num1 != num2));
        System.out.println("El número " + num1 + " es divisible entre 2: " + (num1 % 2 == 0));
    }

    @SuppressWarnings("unused")
    public static void mostrarVariables() {
        // Asignación de variables
        int miEntero = 2;
        int edad = 28;
        boolean miBool = true;
        char miChar = 'a';
        String miString = "Vamos al ";
        int miInt = 10;
        float miFloat = 1.75f;
        long miLong = 123456789;

        System.out.println("Mi edad es: " + edad);
        System.out.println("Hola Mundo...");
        System.out.println("Bienvenido a tu curso de Java");
        System.out.println("Mi nombre es Marcelo");
        System.out.println("Mi edad es 45");
        System.out.println(miString + miFloat + " " + miLong);

        String nombre = "Marcelo";
        System.out.println("Mi nombre es " + nombre + ", y tengo " + edad + " años.");

        String mensajeBienvenida = "Bienvenido a Java ";
        double temperaturaActual = 19;
        System.out.println("Hola, " + mensajeBienvenida
                + ", la temperatura actual es de " + temperaturaActual
                + " grados. Esta afirmación es verdadera " + miBool);
    }

    public static void operacionesMatematicas(Scanner scanner) {
        System.out.println("Ingrese la primera variable:");
        int num1 = scanner.nextInt();
        System.out.println("Ingrese la segunda variable:");
        int num2 = scanner.nextInt();

        int suma = num1 + num2;
        int resta = num1 - num2;
        double division = (num2 != 0) ? (double) num1 / num2 : Double.NaN; // Evita dividir por cero
        int multiplicar = num1 * num2;
        int modulo = (num2 != 0) ? num1 % num2 : 0;

        System.out.println("La suma de las 2 variables es: " + suma);
        System.out.println("La resta de las 2 variables es: " + resta);
        System.out.println("La división de las 2 variables es: " + division);
        System.out.println("La multiplicación de las 2 variables es: " + multiplicar);
        System.out.println("El módulo de las 2 variables es: " + modulo);
    }
}
