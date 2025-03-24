package org.flores.model.figura2;

import org.flores.util.ReadUtil;
import org.flores.vista.Menu;

public class Escaleno extends Isosceles
{
    private double lado3;

    public Escaleno() {}

    public void setLado3(double lado3)
    {
        this.lado3 = lado3;
    }

    @Override
    public double perimetro()
    {
        return lado1+lado2+lado3;
    }

    @Override
    public void leerDatos()
    {
        super.leerDatos();
        Menu.menuLado3( );
        lado3 = ReadUtil.getInstance().leerDouble();
    }
}

