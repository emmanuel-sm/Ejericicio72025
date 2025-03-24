package org.flores.model.figura;

import org.flores.util.ReadUtil;
import org.flores.vista.Menu;

public class Equilatero extends Triangulo
{
    protected double lado1;

    public Equilatero(){}

    public void setLado(double lado1)
    {
        this.lado1 = lado1;
    }

    public double perimetro()
    {
        return lado1*3;
    }

    @Override
    public void leerDatos()
    {
        super.leerDatos();
        Menu.menuLado1( );
        lado1 = ReadUtil.getInstance().leerDouble();
    }
}