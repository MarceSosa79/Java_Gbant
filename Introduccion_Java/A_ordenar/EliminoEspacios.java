package A_ordenar;
import java.util.Scanner;

public class EliminoEspacios {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Ingresa una frase con espacios al principio y al final: ");
            String frase = sc.nextLine();
            System.out.println(frase.length());
            String fraseSinEspacio = frase.trim();
            System.out.println("Frase resultante: " + fraseSinEspacio);
            System.out.println(fraseSinEspacio.length());
        } catch (Exception e) {
            System.out.println("Ocurrio un error");
        }
        sc.close();
    }
}
