package A_ordenar;
import java.util.Scanner;

public class Ejercicio4BuscarLetra {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingresa una palabra: ");
        String palabra = input.nextLine();
        System.out.print("Ingresa una letra: ");
        char letra = input.next().charAt(0);

        int presente = palabra.indexOf(letra);

        String Respuesta = (presente != -1) ? "La letra " + letra + " está presente en la palabra " + palabra + "."
                : palabra;

        System.out.println(Respuesta);

        input.close();
    }

}