package Introduccion_Java;
import java.util.Scanner;

public class VerificacionEdad {
    public static void main(String[] args) {
        // Declarar el año actual como constante
        final int ANIOACTUAL = 2024;

        // Crear un objeto Scanner para entrada de datos
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario su año de nacimiento
        System.out.print("Por favor, ingresa tu año de nacimiento: ");
        int anioNacimiento = scanner.nextInt();

        // Calcular la edad
        int calculoEdad = ANIOACTUAL - anioNacimiento;

        // Determinar el mensaje directamente usando operador ternario
        String mensaje = calculoEdad >= 18
                ? "Tienes " + calculoEdad + " años. Eres mayor de edad."
                : "Tienes " + calculoEdad + " años. Eres menor de edad.";

        // Mostrar el mensaje
        System.out.println(mensaje);

        scanner.close();
    }
}
