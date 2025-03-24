package org.sanchez.muciño.emmanuel.figura;
import org.sanchez.util.ReadUtil;
import org.sanchez.vista.Menu;

public class Rombo extends Figura{
    private double lado;
    private double DiagonalMayor;
    private double DiagonalMenor;

    public Rombo (){

    }
    public Rombo(double lado, double diagonalMayor, double diagonalMenor) {
        this.lado = lado;
        DiagonalMayor = diagonalMayor;
        DiagonalMenor = diagonalMenor;
    }

    @Override
    public double area() {
        return (DiagonalMayor * DiagonalMenor) / 2;
    }

    @Override
    public double perimetro() {
        return 4*lado;
    }
    @Override
    public void leerDatos() {
        Menu.menuLado1();
        lado = ReadUtil.getInstance().leerInt();
        Menu.menuDiagonalMayor();
        DiagonalMayor = ReadUtil.getInstance().leerInt();
        Menu.menuDiagonalMenor();
        DiagonalMenor= ReadUtil.getInstance().leerInt();
    }
    public double getLado() {
        return lado;
    }
    public void setLado(double lado) {
        this.lado = lado;
    }
    public double getDiagonalMayor() {
        return DiagonalMayor;
    }
    public void setDiagonalMayor(double diagonalMayor) {
        DiagonalMayor = diagonalMayor;
    }
    public double getDiagonalMenor() {
        return DiagonalMenor;
    }
    public void setDiagonalMenor(double diagonalMenor) {
        DiagonalMenor = diagonalMenor;
    }
}
