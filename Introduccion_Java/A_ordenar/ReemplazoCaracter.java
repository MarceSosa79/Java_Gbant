package A_ordenar;
import java.util.Scanner;

public class ReemplazoCaracter {
    public static void main(String[] args) {
        try (Scanner miScanner = new Scanner(System.in)) {
            System.out.println("Ingresa una frase: ");
            String frase = miScanner.nextLine();
            System.out.println("Ingresa caracter 1: ");
            char caracter1 = miScanner.next().charAt(0);
            System.out.println("Ingresa caracter 2: ");
            char caracter2 = miScanner.next().charAt(0);

            String resultado = frase.replace(caracter1, caracter2);

            System.out.println(resultado);

        } catch (Exception e) {
            System.out.println("Ocurrió un error " + e.getMessage());
        }
    }
}
