package Introduccion_Java;

import java.util.Scanner;

public class CalculadoraRectangulo {
    public static void main(String[] args) {
        // Crear un objeto Scanner para entrada de datos
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario la base del rectángulo
        System.out.print("Por favor, ingresa la base del rectángulo: ");
        double baseRectangulo = scanner.nextDouble();

        // Pedir al usuario la altura del rectángulo
        System.out.print("Por favor, ingresa la altura del rectángulo: ");
        double alturaRectangulo = scanner.nextDouble();

        // Verificar validez de los datos y calcular o mostrar error
        String resultado = (baseRectangulo > 0 && alturaRectangulo > 0) 
                           ? "El perímetro del rectángulo es: " + (2 * baseRectangulo + 2 * alturaRectangulo) +
                             "\n El área del rectángulo es: " + (baseRectangulo * alturaRectangulo)
                           : "Los valores de base y altura deben ser mayores que 0.";

        // Mostrar el resultado
        System.out.println(resultado);

        scanner.close();
    }
}
