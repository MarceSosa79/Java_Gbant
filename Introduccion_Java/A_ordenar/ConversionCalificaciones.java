package A_ordenar;
import java.util.Scanner;

public class ConversionCalificaciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int calificacion;
        do {
            System.out.println("Por favor, ingresa una calificacion numerica del 1 al 5: ");
            calificacion = sc.nextInt();

            String resultado;

            switch (calificacion) {
                case 1:
                    resultado = "Muy deficiente";
                    break;
                case 2:
                    resultado = "Deficiente";
                    break;
                case 3:
                    resultado = "Suficiente";
                    break;
                case 4:
                    resultado = "Notable";
                    break;
                case 5:
                    resultado = "Sobresaliente";
                    break;
                default:
                    resultado = "Calificacion invalida, Por favor ingresa un numero entre 1 y 5";
            }

            System.out.println("Resultado: " + resultado + "!");

        } while (calificacion != 0);
        System.out.println("Saludos!");
        sc.close();
    }
}
