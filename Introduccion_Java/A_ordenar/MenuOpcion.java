package A_ordenar;
import java.util.Scanner;

public class MenuOpcion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("Menu de opciones: ");
            System.out.println("1: Guardar");
            System.out.println("2: Cargar");
            System.out.println("3: Salir");

            System.out.println("Por favor ingrese la opcion deseada: ");
            opcion = sc.nextInt();
            
            switch (opcion) {
                case 1:
                    System.out.println("Seleccionaste la opcion 1 'Guardar..'");                    
                    break;
                case 2:
                    System.out.println("Seleccionaste la opcion 2 'Cargar..'");                    
                    break;
                case 3:
                    System.out.println("Seleccionaste la opcion 3 'Saliendo..'");                    
                    break;
                default:
                    System.out.println("Opcion incorrecta...");
            }  
        }while (opcion != 3);
        sc.close();
    }
}
