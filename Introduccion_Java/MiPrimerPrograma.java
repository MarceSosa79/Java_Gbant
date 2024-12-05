package Introduccion_Java;

public class MiPrimerPrograma {
    @SuppressWarnings("unused")
    public static void main(String[] args) throws Exception {
        //Asignacion de variables
        /*int miEntero;
        miEntero = 2;
        int edad = 28;*/
        //System.out.println("Mi edad es: " + edad);
        //Solo Print line
        /*System.out.println("Hola Mundo...");
        System.out.println("Bienvenido a tu curso de Java");
        System.out.println("Mi nombre es Marcelo");
        System.out.println("Mi edad es 45");*/
        //Booleano
        boolean miBool = true;
        //Char
        char miChar = 'a';
        //String
        String miString = "Vamos al ";
        //Int
        int miInt = 10;
        //Float
        float miFloat = 1.75f;
        //Long
        long miLong = 123456789; 
        System.out.println(miString + miFloat + " " + miLong);
        //Declarar y mostrar variables
        int edad = 45;
        String nombre = "Marcelo";
        System.out.println("Mi nombre es " + nombre + ", y tengo " + edad + " años.");
        //Ultima parte
        String mensajeBienvenida = "Bienvenido a Java ";
        double temperaturaActual = 19;
        boolean datoLogico = true;
        System.out.println("Hola, " + mensajeBienvenida +", la temperatura actual es de " + temperaturaActual +" grados. Esta afirmacion es verdadera " + datoLogico);
    }
}
