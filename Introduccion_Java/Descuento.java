import java.util.Scanner;

public class Descuento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el precio del producto: ");
        double precio = scanner.nextDouble();
        scanner.close();

        if (precio >= 100) {
            System.out.println("El producto tiene descuento! te sale en: " + precio*0.9);
        } else {
            System.out.println("Tu compra sale en: " + precio);
        }
    }
}
