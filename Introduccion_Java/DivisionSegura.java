import java.util.Scanner;

public class DivisionSegura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int exit;

        do {
            try {
                System.out.println("Ingrese el primer numero: ");
                int numero1 = sc.nextInt();

                System.out.println("Ingrese el segundo numero: ");
                int numero2 = sc.nextInt();

                int resultado = numero1 / numero2;
                System.out.println("El resultado de la division es: " + resultado);

            } catch (ArithmeticException e) {
                System.out.println("Error, no se puede dividir entre cero." + e.getMessage());
            } catch (Exception e) {
                System.out.println("Error, entrada invalida. " + e.getMessage());
            }
            System.out.println("Para salir precione 0, de lo contrario cualquier tecla");
            String input = sc.next();

            try {
                exit = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                exit = 1;
                System.out.println("Siguiente resta...");
            }
        } while (exit != 0);
        sc.close();
        System.out.println("Exit.");
    }
}
