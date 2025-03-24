package org.flores.vista;

import org.flores.model.figura.Figura;

public class Menu
{
    public static void principal()
    {
        System.out.println( "BIENVENIDO");
        System.out.println("---------------------------------------------");
        System.out.println("Ingrese la figura que desea calcular:");
        System.out.println(" (1) Triángulo Equilátero");
        System.out.println(" (2) Triángulo Isósceles");
        System.out.println(" (3) Triángulo Escaleno");
        System.out.println(" (4) Círculo");
        System.out.println(" (5) Cuadrado");
        System.out.println(" (6) Rectángulo");
        System.out.println(" (7) Pentágono");
        System.out.println(" (8) Rombo");
        System.out.println(" (9) Salir");
        System.out.println("---------------------------------------------");
    }

    public static void opcionInvalida()
    {
        System.out.println( "Opción invalida");
    }

    public static void print(Figura figura)
    {
        System.out.println( "El area es:" + figura.area());
        System.out.println( "El perimetro es:" + figura.perimetro());
    }

    public static void principal2( )
    {
        System.out.println( "BIENVENIDO");
        System.out.println("---------------------------------------------");
        System.out.println( "Selecciona una opción");
        System.out.println( "1.- Consola");
        System.out.println( "2.- Ventana");
        System.out.println( "3.- Salir");
        System.out.println("---------------------------------------------");
    }

    public static void menuLado()
    {
        System.out.println( "Dame el valor de un lado");
    }
    public static void menuBase()
    {
        System.out.println( "Dame el valor de la base");
    }
    public static void menuAltura()
    {
        System.out.println( "Dame el valor de la altura");
    }
    public static void menuLado1()
    {
        System.out.println( "Dame el valor del lado 1");
    }
    public static void menuLado2()
    {
        System.out.println( "Dame el valor del lado 2");
    }
    public static void menuLado3()
    {
        System.out.println( "Dame el valor del lado 3");
    }
    public static void menuRadio(){
        System.out.println(" Dame el valor del radio");
    }
    public static void menuApotema(){
        System.out.println("Dame el valor del apotema");
    }
    public static void menuDiagMayor(){
        System.out.println("Dame el valor de la diagonal mayor");
    }
    public static void menuDiagMenor(){
        System.out.println("Dame el valor de la diagonal menor");
    }
}
