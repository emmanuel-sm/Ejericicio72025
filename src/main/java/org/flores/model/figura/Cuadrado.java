package org.flores.model.figura;

import org.flores.util.ReadUtil;
import org.flores.vista.Menu;

public class Cuadrado extends Figura {

    private double lado;

    public void setLado(double lado) {
        this.lado = lado;
    }

    public Cuadrado() {}

    @Override
    public double area()
    {
        return lado*lado;
    }

    @Override
    public double perimetro()
    {
        return 4*lado;
    }

    @Override
    public void leerDatos()
    {
        Menu.menuLado();
        lado = ReadUtil.getInstance().leerDouble();
    }
}