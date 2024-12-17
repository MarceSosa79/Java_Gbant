package A_ordenar;
import java.util.Scanner;

public class Divisible {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int num = scanner.nextInt();
        if (num % 5 == 0 && num % 3 == 0) {
            System.out.println("El " + num + " es divisible por 5 y 3");
        } else if (num % 3 == 0) {
            System.out.println("El " + num + " es divisible por 3");
        } else if (num % 5 == 0) {
            System.out.println("El " + num + " es divisible por 5");
        }
        else {
            System.out.println("El " + num + " no es divisible por 5 ni 3");
        }
        scanner.close();
    }
}
