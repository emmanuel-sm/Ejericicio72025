package org.sanchez.muciño.emmanuel.figura;
import org.sanchez.util.ReadUtil;
import org.sanchez.vista.Menu;

public class Rectangulo extends Figura{

    private double base;
    private double altura;
    public Rectangulo(){

    }
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double area() {
        return base*altura;
    }

    @Override
    public double perimetro() {
        return (2*base)+ (2*altura);
    }

    @Override
    public void leerDatos() {
        Menu.menuBase();
        base = ReadUtil.getInstance().leerInt();
        Menu.menuAltura();
        altura = ReadUtil.getInstance().leerInt();

    }

    public double getBase() {
        return base;
    }
    public void setBase(double base) {
        this.base = base;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
}
