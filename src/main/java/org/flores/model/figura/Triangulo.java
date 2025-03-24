package org.flores.model.figura;

import org.flores.util.ReadUtil;
import org.flores.vista.Menu;

public abstract class Triangulo extends Figura
{
    protected double base;
    protected double altura;

    public void setBase(double base)
    {
        this.base = base;
    }
    public void setAltura(double altura)
    {
        this.altura = altura;
    }

    public Triangulo() {}

    public Triangulo(double base, double altura)
    {
        this.base = base;
        this.altura = altura;
    }

    public double area()
    {
        return (base*altura)/2;
    }

    public abstract double perimetro();

    @Override
    public void leerDatos()
    {
        Menu.menuBase();
        base = ReadUtil.getInstance().leerDouble();
        Menu.menuAltura();
        altura = ReadUtil.getInstance().leerDouble();
    }
}