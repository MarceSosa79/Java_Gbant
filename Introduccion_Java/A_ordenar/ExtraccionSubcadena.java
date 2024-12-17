package A_ordenar;
import java.util.Scanner;

public class ExtraccionSubcadena {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Frase;
        int inicio, fin;
        System.out.println("ingresa una frase: ");
        Frase = sc.nextLine();
        System.out.println("ingresa el primer numero: ");
        inicio = sc.nextInt();
        System.out.println("ingresa el segundo numero: ");
        fin = sc.nextInt();
        System.out.println("la subcadena es: " + Frase.substring(inicio, fin));
        sc.close();

    }
}