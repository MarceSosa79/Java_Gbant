package Clase_Math;

import java.util.Scanner;

public class AnalisisRaizPrimos {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Paso 1: Solicitar el número límite
        System.out.print("Ingresa un número entre 1 y 30 como límite: ");
        int numeroLimite = scanner.nextInt();

        // Validar que el número límite esté entre 1 y 30
        if (numeroLimite < 1 || numeroLimite > 30) {
            System.out.println("Error: El número debe estar entre 1 y 30.");
            return; // Terminar el programa si la entrada no es válida
        }

        // Paso 2: Generar un número aleatorio entre 1 y numeroLimite
        int numeroAleatorio = (int) (Math.random() * numeroLimite) + 1;

        // Paso 3: Calcular la raíz cuadrada del número aleatorio
        double raizCuadrada = Math.sqrt(numeroAleatorio);

        // Paso 4: Verificar si el número es primo
        boolean esPrimo = esNumeroPrimo(numeroAleatorio);

        // Paso 5: Mostrar resultados en pantalla
        System.out.println("Número aleatorio generado: " + numeroAleatorio);
        System.out.printf("Raíz cuadrada del número: %.2f\n", raizCuadrada);
        if (esPrimo) {
            System.out.println("El número generado es un número primo.");
        } else {
            System.out.println("El número generado NO es un número primo.");
        }

        scanner.close(); // Cerrar el Scanner
    }

    // Método para verificar si un número es primo
    public static boolean esNumeroPrimo(int numero) {
        if (numero <= 1) {
            return false; // Los números menores o iguales a 1 no son primos
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) { // Divisores desde 2 hasta la raíz cuadrada del número
            if (numero % i == 0) {
                return false; // Si se encuentra un divisor, el número no es primo
            }
        }
        return true; // Si no se encuentra ningún divisor, el número es primo
    }
}
