package org.sanchez.muciño.emmanuel.figura.curvas;

import org.sanchez.muciño.emmanuel.figura.Figura;
import org.sanchez.util.ReadUtil;
import org.sanchez.vista.Menu;

public class Elipse extends Figura {
    private double RadioMayor;
    private double RadioMenor;

    public Elipse(){

    }

    public Elipse(double RadioMenor, double RadioMayor) {
        this.RadioMenor = RadioMenor;
        this.RadioMayor = RadioMayor;
    }

    @Override
    public double area() {
        return Math.PI * RadioMayor * RadioMenor;
    }
    @Override
    public double perimetro() {
        return 2 * Math.PI * (Math.sqrt((Math.pow(RadioMayor, 2) + Math.pow(RadioMenor, 2)) / 2));
    }
    @Override
    public void leerDatos() {
        Menu.menuRadioMayor();
        RadioMayor = ReadUtil.getInstance().leerInt();
        Menu.menuRadioMenor();
        RadioMenor = ReadUtil.getInstance().leerInt();
    }
    public double getRadioMayor() {
        return RadioMayor;
    }
    public void setRadioMayor(double radioMayor) {
        RadioMayor = radioMayor;
    }
    public double getRadioMenor() {
        return RadioMenor;
    }
    public void setRadioMenor(double radioMenor) {
        RadioMenor = radioMenor;
    }
}
