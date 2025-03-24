package org.sanchez.vista;

import org.gerdoc.historial.Historiales;
import org.sanchez.model.figura.figura2.Escaleno;
import org.sanchez.model.figura.figura2.Isosceles;
import org.sanchez.muciño.emmanuel.figura.*;
import org.sanchez.muciño.emmanuel.figura.curvas.Circulo;
import org.sanchez.muciño.emmanuel.figura.curvas.Elipse;
import org.sanchez.util.ReadUtil;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana extends JFrame implements Ejecutable {

    private Historiales historiales;
    private static Ventana ventana;
    private JLabel menuLabel, optionLabel, inputLabel, resultLabel;
    private JTextField optionTextField;
    private JTextField[] inputFields;
    private JButton enterButton, calculateButton;
    private String[] figuras = {"1.- Cuadrado", "2.- Equilatero", "3.- Isosceles", "4.- Escaleno", "5.- Rectangulo", "6.- Rombo", "7.- Circulo", "8.- Elipse", "9.- Salir"};

    private Ventana() {
        super("Ventana de figuras");
        init();
    }

    private void init() {
        menuLabel = new JLabel("<html>Menú:<br>1.- Cuadrado<br>2.- Equilatero<br>3.- Isosceles<br>4.- Escaleno<br>5.- Rectangulo<br>6.- Rombo<br>7.- Circulo<br>8.- Elipse<br>9.- Salir</html>");
        menuLabel.setBounds(10, 10, 200, 200);
        optionLabel = new JLabel("Ingrese la opción:");
        optionLabel.setBounds(10, 220, 200, 20);
        optionTextField = new JTextField();
        optionTextField.setBounds(10, 250, 200, 20);
        enterButton = new JButton("Ingresar");
        enterButton.setBounds(10, 280, 100, 20);
        inputLabel = new JLabel();
        inputLabel.setBounds(10, 310, 400, 20);
        resultLabel = new JLabel("Resultado:");
        resultLabel.setBounds(10, 530, 400, 20);

        enterButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int opcion = Integer.parseInt(optionTextField.getText());
                inputLabel.setText("Ingrese los datos:");
                clearInputFields();
                switch (opcion) {
                    case 1:
                        createInputFields(1, new String[]{"Lado"});
                        break;
                    case 2:
                        createInputFields(3, new String[]{"Base","Altura","Lado 1"});
                        break;
                    case 3:
                        createInputFields(4, new String[]{"Base","Altura", "Lado 1", "Lado 2"});
                        break;
                    case 4:
                        createInputFields(5, new String[]{"Base","Altura","Lado 1", "Lado 2", "Lado 3"});
                        break;
                    case 5:
                        createInputFields(2, new String[]{"Base", "Altura"});
                        break;
                    case 6:
                        createInputFields(3, new String[]{"Lado","Diagonal Mayor", "Diagonal Menor"});
                        break;
                    case 7:
                        createInputFields(1, new String[]{"Radio"});
                        break;
                    case 8:
                        createInputFields(2, new String[]{"Radio Mayor", "Radio Menor"});
                        break;
                    case 9:
                        System.exit(0);
                        break;
                    default:
                        inputLabel.setText("Opción no válida");
                        break;
                }
                getContentPane().revalidate();
                getContentPane().repaint();
            }
        });

        calculateButton = new JButton("Calcular");
        calculateButton.setBounds(10, 490, 100, 20);
        calculateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int opcion = Integer.parseInt(optionTextField.getText());
                Figura figura = null;
                switch (opcion) {
                    case 1:
                        figura = new Cuadrado();
                        ((Cuadrado) figura).setLado(ReadUtil.string2Integer(inputFields[0].getText()));
                        resultLabel.setText("Cuadrado - Área: " + figura.area() + ", Perímetro: " + figura.perimetro());
                        break;
                    case 2:
                        figura = new Equilatero();
                        ((Equilatero)figura).setBase(ReadUtil.string2Integer(inputFields[0].getText()));
                        ((Equilatero)figura).setAltura(ReadUtil.string2Integer(inputFields[1].getText()));
                        ((Equilatero) figura).setLado(ReadUtil.string2Integer(inputFields[2].getText()));
                        resultLabel.setText("Equilátero - Área: " + figura.area() + ", Perímetro: " + figura.perimetro());
                        break;
                    case 3:
                        figura = new Isosceles();

                        ((Isosceles) figura).setBase(ReadUtil.string2Integer(inputFields[0].getText()));
                        ((Isosceles)figura).setAltura(ReadUtil.string2Integer(inputFields[1].getText()));
                        ((Isosceles) figura).setLado(ReadUtil.string2Integer(inputFields[2].getText()));
                        ((Isosceles) figura).setLado2(ReadUtil.string2Integer(inputFields[3].getText()));
                        resultLabel.setText("Isósceles - Área: " + figura.area() + ", Perímetro: " + figura.perimetro());
                        break;
                    case 4:
                        figura = new Escaleno();
                        ((Escaleno) figura).setBase(ReadUtil.string2Integer(inputFields[0].getText()));
                        ((Escaleno)figura).setAltura(ReadUtil.string2Integer(inputFields[1].getText()));
                        ((Escaleno) figura).setLado(ReadUtil.string2Integer(inputFields[2].getText()));
                        ((Escaleno) figura).setLado2(ReadUtil.string2Integer(inputFields[3].getText()));
                        ((Escaleno) figura).setLado3(ReadUtil.string2Integer(inputFields[4].getText()));
                        resultLabel.setText("Escaleno - Área: " + figura.area() + ", Perímetro: " + figura.perimetro());
                        break;
                    case 5:
                        figura = new Rectangulo();
                        ((Rectangulo) figura).setBase(ReadUtil.string2Integer(inputFields[0].getText()));
                        ((Rectangulo) figura).setAltura(ReadUtil.string2Integer(inputFields[1].getText()));
                        resultLabel.setText("Rectángulo - Área: " + figura.area() + ", Perímetro: " + figura.perimetro());
                        break;
                    case 6:
                        figura = new Rombo();
                        ((Rombo) figura).setLado(ReadUtil.string2Integer(inputFields[0].getText()));
                        ((Rombo) figura).setDiagonalMayor(ReadUtil.string2Integer(inputFields[1].getText()));
                        ((Rombo) figura).setDiagonalMenor(ReadUtil.string2Integer(inputFields[2].getText()));
                        resultLabel.setText("Rombo - Área: " + figura.area() + ", Perímetro: " + figura.perimetro());
                        break;
                    case 7:
                        figura = new Circulo();
                        ((Circulo) figura).setRadio(ReadUtil.string2Integer(inputFields[0].getText()));
                        resultLabel.setText("Círculo - Área: " + figura.area() + ", Perímetro: " + figura.perimetro());
                        break;
                    case 8:
                        figura = new Elipse();
                        ((Elipse) figura).setRadioMayor(ReadUtil.string2Integer(inputFields[0].getText()));
                        ((Elipse) figura).setRadioMenor(ReadUtil.string2Integer(inputFields[1].getText()));
                        resultLabel.setText("Elipse - Área: " + figura.area() + ", Perímetro: " + figura.perimetro());
                        break;
                    default:
                        resultLabel.setText("Opción no válida");
                        break;
                }
            }
        });

        getContentPane().setLayout(null);
        getContentPane().add(menuLabel);
        getContentPane().add(optionLabel);
        getContentPane().add(optionTextField);
        getContentPane().add(enterButton);
        getContentPane().add(inputLabel);
        getContentPane().add(calculateButton);
        getContentPane().add(resultLabel);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    private void createInputFields(int numFields, String[] labels) {
        inputFields = new JTextField[numFields];
        for (int i = 0; i < numFields; i++) {
            inputFields[i] = new JTextField(labels[i]);
            inputFields[i].setBounds(10, 340 + (i * 30), 200, 20);
            getContentPane().add(inputFields[i]);
        }
    }

    private void clearInputFields() {
        if (inputFields != null) {
            for (JTextField field : inputFields) {
                getContentPane().remove(field);
            }
        }
    }

    public static Ventana getInstance() {
        if (ventana == null) {
            ventana = new Ventana();
        }
        return ventana;
    }

    @Override
    public void run() {
        setBounds(100, 100, 500, 800);
        setVisible(true);
    }

    @Override
    public void addHistoriales(Historiales historiales) {
        this.historiales=historiales;
    }
}