package A_ordenar;
import java.util.Scanner;

public class ParImpar {
 public static void main(String[] args) {

    Scanner parimpar = new Scanner(System.in);

    System.out.println("Por favor, ingresa un número entero: ");
    int numero = parimpar.nextInt();

    String resultado = (numero % 2 == 0) ? "Par" : "Impar"; 
    System.out.println("El número " + numero + " es " + resultado + ".");

    parimpar.close();
 }
}
