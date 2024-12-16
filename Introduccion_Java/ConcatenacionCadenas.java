import java.util.Scanner;

public class ConcatenacionCadenas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor ingresa tu nombre: ");
        String nombre = sc.nextLine();
        
        System.out.println("Por favor ingresa tu apellido: ");
        String apellido = sc.nextLine();

        String nombreFull = nombre.concat(" ").concat(apellido);
        System.out.println("Tu nombre completo es: " + nombreFull);

        sc.close();
    }
}
