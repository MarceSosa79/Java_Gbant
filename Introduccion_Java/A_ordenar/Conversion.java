package A_ordenar;
import java.util.Scanner;

public class Conversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor ingresa una cadena de texto: ");
        String texto = sc.nextLine();

        System.out.println("Elige una opcion:");
        System.out.println("1. Convertir a MAYUSCULAS.");
        System.out.println("2. Convertir en minusculas");
        
        try {
        int opcion = sc.nextInt();
            
            switch (opcion) {
            case 1:
                System.out.println("Texto en MAYUSCULAS: " + texto.toUpperCase());
                break;
            case 2:
                System.out.println("Texto en minusculas: " + texto.toLowerCase());
                break;
            default:
                System.out.println("Opcion no valida, usted ha ingresado: " + opcion);
                break;

        }
    }   catch (Exception  e) {
        System.out.println("Solo se permiten numeros." + e.getMessage());
    }
        sc.close();
    }
}
