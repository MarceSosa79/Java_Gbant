import java.util.Scanner;

public class Cast {
    public static void main(String[] args) {
        Scanner ingresar = new Scanner(System.in);
        System.out.println("Ingrese un número");
        String numero = ingresar.nextLine();
        int resultado;
        ingresar.close();

        try {
            resultado = Integer.parseInt(numero);
            System.out.println("El resultado es " + resultado);
        } catch (NumberFormatException e) {
            System.out.println("Es imposible convertir al tipo de dato entero \n" + e.getMessage());
        } catch (Exception e) {
            System.out.println("El valor ingresado no es un número valido " + e.getMessage());
        }
    }
}