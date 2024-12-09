package Introduccion_Java;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner calc = new Scanner(System.in);

    System.out.println("Ingrese el primer número: ");
    double numero1 = calc.nextDouble();

    System.out.println("Ingrese el segundo número: ");
    double numero2 = calc.nextDouble();

    System.out.println("Elegi la operacion que desees: ");
    System.out.println("1. Suma (+)");
    System.out.println("2. Resta (-)");
    System.out.println("3. Multiplicacion (*)");
    System.out.println("4. Division (/)");

    int opcion = calc.nextInt();
    
    double resultado = 0;

    switch (opcion) {
        case 1:
            resultado = numero1 + numero2;
            System.out.println("El resultado de la suma es: " + resultado);
            break;
        case 2:
            resultado = numero1 - numero2;
            System.out.println("El resultado de la resta es: " + resultado);
            break;
        case 3:
            resultado = numero1 * numero2;
            System.out.println("El resultado de la multiplicacion es: " + resultado);
            break;
        case 4:
            if (numero2 != 0) {
            resultado = numero1 / numero2; 
            System.out.println("El resultado de la division es: " + resultado);
            } else {
                System.out.println("El divisor no puede ser igual a 0. ");
            }
            break;
        
        default:
        System.out.println("Ingrese una opcion valida, entre 1 y 4. ");
            break;
    }

    }
    
}
