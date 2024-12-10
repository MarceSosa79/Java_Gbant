package Introduccion_Java;

import java.util.Objects;
import java.util.Scanner;

public class VerificacionContrasena {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Porfavor ingresa la contraseña: ");
        String pass = scanner.nextLine();
        final String password = "German1972!";
        if (!Objects.equals(pass, password)) {
            System.out.println("La contraseña es incorrecta, intentalo de nuevo. ");

        } else {
            System.out.println("Bienvenido German!");
        }
    }
}
