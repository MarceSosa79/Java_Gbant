import java.util.InputMismatchException;
import java.util.Scanner;

public class excepciones3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try {
            System.out.println("Ingresa 1 numero");
            int numero1 = input.nextInt();
            System.out.println("Ingresa otro numero");
            int numero2 = input.nextInt();

            int operacion = numero1 - numero2;

            System.out.println("El resultado de la resta es: " + operacion);
        } catch (InputMismatchException e) {
            System.out.println("Error: El valor ingresado no es un numero entero");
        }
        input.close();
    }
}