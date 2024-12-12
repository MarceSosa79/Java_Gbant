import java.util.Scanner;

public class Semana {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Ingrese el número del día de la semana: ");
int day = input.nextInt();
String diaSemana = switch (day) {
        case 1 -> "Lunes";
        case 2 -> "Martes";
        case 3 -> "Miércoles";
        case 4 -> "Jueves";
        case 5 -> "Viernes";
        case 6 -> "Sábado";
        case 7 -> "Domingo";
        default -> "No válido";
};
input.close();
System.out.println(diaSemana);
}
}