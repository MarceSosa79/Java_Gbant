package Introduccion_Java;

import java.util.Scanner;

public class MiPrimerPrograma {
    @SuppressWarnings("unused")
    public static void main(String[] args) throws Exception {
        logic();
        // Asignacion de variables
        /*
         * int miEntero;
         * miEntero = 2;
         * int edad = 28;
         */
        // System.out.println("Mi edad es: " + edad);
        // Solo Print line
        /*
         * System.out.println("Hola Mundo...");
         * System.out.println("Bienvenido a tu curso de Java");
         * System.out.println("Mi nombre es Marcelo");
         * System.out.println("Mi edad es 45");
         */
        // Booleano
        /*
         * boolean miBool = true;
         * //Char
         * char miChar = 'a';
         * //String
         * String miString = "Vamos al ";
         * //Int
         * int miInt = 10;
         * //Float
         * float miFloat = 1.75f;
         * //Long
         * long miLong = 123456789;
         * System.out.println(miString + miFloat + " " + miLong);
         * //Declarar y mostrar variables
         * int edad = 45;
         * String nombre = "Marcelo";
         * System.out.println("Mi nombre es " + nombre + ", y tengo " + edad +
         * " años.");
         * //Ultima parte
         * String mensajeBienvenida = "Bienvenido a Java ";
         * double temperaturaActual = 19;
         * boolean datoLogico = true;
         * System.out.println("Hola, " + mensajeBienvenida
         * +", la temperatura actual es de " + temperaturaActual
         * +" grados. Esta afirmacion es verdadera " + datoLogico);
         */

        /*
         * //CLase 2
         * Scanner pepe = new Scanner(System.in);
         * System.out.print("Por favor ingrese una edad: ");
         * int edad = pepe.nextInt();
         * pepe.nextLine();
         * System.out.print("Por favor ingrese un nombre completo: ");
         * String nombre = pepe.nextLine();
         * System.out.println(nombre + " tiene " + edad + " años.");
         */
        // Declare 2 variables y asignales un valor a cada una de ellas.

        @SuppressWarnings("resource")
        Scanner variables = new Scanner(System.in);
        System.out.println("Ingrese la primera variable: ");
        int num1 = variables.nextInt();
        System.out.println("Ingrese la segunda variable: ");
        int num2 = variables.nextInt();

        int suma = num1 + num2;
        int resta = num1 - num2;
        double division = num1 / num2;
        int multiplicar = num1 * num2;
        int modulo = num1 % num2;

        System.out.println("La suma de las 2 variables es = a: " + suma);
        System.out.println("La resta de las 2 variables es = a: " + resta);
        System.out.println("La division de las 2 variables es = a: " + division);
        System.out.println("La multiplicacion de las 2 variables es = a: " + multiplicar);
        System.out.println("El modulo de las 2 variables es: " + modulo);
    }

    // 1. Pide al usuario que ingrese dos números, y:
    // A. Compara si el primer número ingresado es mayor al segundo número
    // ingresado.
    public static void logic() {
        Scanner nuevo = new Scanner(System.in);
        System.out.println("Dame un numero entero");
        int num1 = nuevo.nextInt();
        System.out.println("Dame un segundo numero entero");
        int num2 = nuevo.nextInt();

        System.out.println("El numero " + num1 + " es mayor a " + num2 + " = " + (num1 > num2));
        System.out.println("El numero " + num1 + " es distinto a " + num2 + " = " + (num1 != num2));
        System.out.println("El numero " + num1 + " es divisible entre 2 = " + (num1 % 2 == 0));

    }
}
