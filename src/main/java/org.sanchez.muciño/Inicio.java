package org.sanchez.muciño;

import org.sanchez.muciño.emmanuel.figura.Cuadrado;
import org.sanchez.muciño.emmanuel.figura.Equilatero;
import org.sanchez.muciño.emmanuel.figura.Figura;
import org.sanchez.util.ReadUtil;
import org.sanchez.vista.Consola;
import org.sanchez.vista.Ejecutable;
import org.sanchez.vista.Menu;
import org.sanchez.vista.Ventana;

/**
 *
 */
public class Inicio {

    /**
     * Default constructor
     */
    public Inicio() {
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        boolean flag = true;
        int opcion = 0;
        Ejecutable ejecutable = null;
        while (flag) {
            ejecutable = null;
            Menu.principal2();
            opcion = ReadUtil.getInstance().leerInt();
            switch (opcion) {
                case 1:
                    ejecutable = Consola.getInstance();
                    break;
                case 2:
                    ejecutable = Ventana.getInstance();
                    break;
                case 3:
                    flag = false;
                    break;
                default:
                    Menu.opcionInvalida();
            }
            if (ejecutable != null) {
                ejecutable.run();
            }
        }


    }

}