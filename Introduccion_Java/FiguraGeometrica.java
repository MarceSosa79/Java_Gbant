import java.util.Scanner;

public class FiguraGeometrica {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Mostrar menú de figuras geométricas
        System.out.println("Selecciona una figura geométrica:");
        System.out.println("1: Círculo");
        System.out.println("2: Cuadrado");
        System.out.println("3: Triángulo");

        // Solicitar la selección del usuario
        System.out.print("Ingresa el número de la figura que deseas calcular (1-3): ");
        int opcion = scanner.nextInt();

        // Calcular el área según la figura seleccionada
        switch (opcion) {
            case 1: // Círculo
                System.out.print("Ingresa el radio del círculo: ");
                double radio = scanner.nextDouble();
                double areaCirculo = Math.PI * Math.pow(radio, 2);
                System.out.println("El área del círculo es: " + areaCirculo);
                break;

            case 2: // Cuadrado
                System.out.print("Ingresa el lado del cuadrado: ");
                double lado = scanner.nextDouble();
                double areaCuadrado = Math.pow(lado, 2);
                System.out.println("El área del cuadrado es: " + areaCuadrado);
                break;

            case 3: // Triángulo
                System.out.print("Ingresa la base del triángulo: ");
                double base = scanner.nextDouble();
                System.out.print("Ingresa la altura del triángulo: ");
                double altura = scanner.nextDouble();
                double areaTriangulo = (base * altura) / 2;
                System.out.println("El área del triángulo es: " + areaTriangulo);
                break;

            default: // Opción inválida
                System.out.println("Opción inválida. Por favor ingresa un número entre 1 y 3.");
        }

        // Cerrar el Scanner
        scanner.close();
    }
}

