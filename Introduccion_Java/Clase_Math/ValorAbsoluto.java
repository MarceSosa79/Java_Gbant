/*Calculando el valor absoluto
Escribe un programa que  pida al usuario un número entero y muestra en pantalla su 
valor absoluto utilizando el método abs() de la clase Math.
*/
package Clase_Math;

import java.util.Scanner;

public class ValorAbsoluto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       

        System.out.println("Ingresa el numero entero: ");
        int numero = sc.nextInt();

        int valorAbsoluto = Math.abs(numero);

        System.out.println("El valor absoluto es: " + valorAbsoluto);

        sc.close();
    }
}
