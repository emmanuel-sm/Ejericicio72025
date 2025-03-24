package org.sanchez.vista;

import org.sanchez.muciño.emmanuel.figura.Figura;

public class Menu {
    public static void principal() {
        System.out.println("welcome");
        System.out.println("Selecciona una opción");
        System.out.println("1.- Cuadrado");
        System.out.println("2.- Equilatero");
        System.out.println("3.- Isoceles");
        System.out.println("4.- Escaleno");
        System.out.println("5.- Rectangulo");
        System.out.println("6.- Rombo");
        System.out.println("7. Circulo");
        System.out.println("8. Elipse");
        System.out.println("9. Salir");
    }

    public static void opcionInvalida() {
        System.out.println("Opción invalida");
    }

    public static void print(Figura figura) {
        System.out.println("El perimetro es:" + figura.perimetro());
        System.out.println("El area es:" + figura.area());
    }

    public static void principal2() {
        System.out.println("welcome");
        System.out.println("Selecciona una opción");
        System.out.println("1.- Consola");
        System.out.println("2.- Ventana");
        System.out.println("3.- Salir");
    }

    public static void menuCuadrado() {
        System.out.println("Dame un lado");
    }

    public static void menuBase() {
        System.out.println("Dame una base");
    }

    public static void menuAltura() {
        System.out.println("Dame una altura");
    }

    public static void menuLado1() {
        System.out.println("Dame un lado 1");
    }

    public static void menuLado2() {
        System.out.println("Dame un lado 2");
    }

    public static void menuLado3() {
        System.out.println("Dame un lado 3");
    }

    public static void menuDiagonalMayor(){
        System.out.println("Dame el tamaño del Diagonal mayor");
    }

    public static void menuDiagonalMenor(){
        System.out.println("Dame el tamaño del Diagonal menor");
    }

    public static void menuRadio(){
        System.out.println("Dame el radio del circulo");
    }

    public static void menuRadioMayor(){
        System.out.println("Dame el radio mayor de la elipse");
    }

    public static void menuRadioMenor(){
        System.out.println("Dame el radio menor de la elipse");
    }


}
