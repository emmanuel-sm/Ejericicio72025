package org.sanchez.muciño.emmanuel.figura.curvas;

import org.sanchez.muciño.emmanuel.figura.Figura;
import org.sanchez.util.ReadUtil;
import org.sanchez.vista.Menu;

public class Circulo extends Figura {
    private double radio;

    public Circulo(){

    }
    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double area() {
        return Math.PI*(Math.pow(radio,2));
    }

    @Override
    public double perimetro() {
        return 2*Math.PI*radio;
    }

    @Override
    public void leerDatos() {
        Menu.menuRadio();
        radio= ReadUtil.getInstance().leerInt();
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
}
