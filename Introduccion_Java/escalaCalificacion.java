package Introduccion_Java;

import java.util.Scanner;

public class escalaCalificacion {
    public static void main(String[] args) {
        Scanner calificacion = new Scanner(System.in);

        System.out.println("Por favor, ingrese un número entre 0 y 100: ");
        int puntaje = calificacion.nextInt();

        calificacion.close();

        if (puntaje < 0 || puntaje > 100) {
            System.out.println("Calificacion invalida.");
        } else if (puntaje >= 90){
            System.out.println("A");
        } else if (puntaje >= 80){
            System.out.println("B");
        } else if (puntaje >= 70){
            System.out.println("C");
        } else if (puntaje >= 60){
            System.out.println("D");
        }else {
            System.out.println("F");
        }
    }
}
