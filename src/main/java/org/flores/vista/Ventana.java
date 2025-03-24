package org.flores.vista;

import org.flores.model.figura.Cuadrado;
import org.flores.model.figura.Equilatero;
import org.flores.model.figura.Figura;
import org.flores.model.figura2.Escaleno;
import org.flores.model.figura2.Isosceles;
import org.flores.model.figura3.Circulo;
import org.flores.model.figura3.Pentagono;
import org.flores.model.figura3.Rectangulo;
import org.flores.model.figura3.Rombo;
import org.flores.util.ReadUtil;
import org.gerdoc.historial.Historiales;

import javax.swing.*;

public class Ventana extends JFrame implements Ejecutable
{
    private Historiales historiales;
    private static Ventana ventana;
    private JLabel jLabel, Instrucciones, lBase, lAltura, lLado, lLado1, lLado2, lLado3, lRadio, lApotema, lDiagMayor, lDiagMenor;
    private JTextField  tBase, tAltura, tLado, tLado1, tLado2, tLado3, tRadio, tApotema, tDiagMayor, tDiagMenor;
    private JButton BEquilatero, BIsosceles, BEscaleno, BCirculo, BCuadrado, BRectangulo, BPentagono, BRombo;

    private Ventana()
    {
        super( "VENTANA DE FIGURAS" );
        init();
    }

    private void init()
    {
        Instrucciones = new JLabel("INGRESA LOS DATOS CORRESPONDIENTES DE LA FIGURA QUE DESEAS CALCULAR");
        Instrucciones.setBounds(10, 10, 800, 20);

        jLabel = new JLabel("BIENVENIDOS");
        jLabel.setBounds(20, 40, 150, 20);

        lBase = new JLabel("BASE:");
        lBase.setBounds(20, 80, 100, 20);
        tBase = new JTextField();
        tBase.setBounds(140, 80, 100, 20);

        lAltura = new JLabel("ALTURA:");
        lAltura.setBounds(20, 110, 100, 20);
        tAltura = new JTextField();
        tAltura.setBounds(140, 110, 100, 20);

        lLado = new JLabel("LADO:");
        lLado.setBounds(20, 140, 100, 20);
        tLado = new JTextField();
        tLado.setBounds(140, 140, 100, 20);

        lLado1 = new JLabel("LADO 1:");
        lLado1.setBounds(20, 170, 100, 20);
        tLado1 = new JTextField();
        tLado1.setBounds(140, 170, 100, 20);

        lLado2 = new JLabel("LADO 2:");
        lLado2.setBounds(20, 200, 100, 20);
        tLado2 = new JTextField();
        tLado2.setBounds(140, 200, 100, 20);

        lLado3 = new JLabel("LADO 3:");
        lLado3.setBounds(20, 230, 100, 20);
        tLado3 = new JTextField();
        tLado3.setBounds(140, 230, 100, 20);

        lRadio = new JLabel("RADIO:");
        lRadio.setBounds(20, 260, 100, 20);
        tRadio = new JTextField();
        tRadio.setBounds(140, 260, 100, 20);

        lApotema = new JLabel("APOTEMA:");
        lApotema.setBounds(20, 290, 100, 20);
        tApotema = new JTextField();
        tApotema.setBounds(140, 290, 100, 20);

        lDiagMayor = new JLabel("DIAGONAL MAYOR:");
        lDiagMayor.setBounds(20, 320, 150, 20);
        tDiagMayor = new JTextField();
        tDiagMayor.setBounds(140, 320, 100, 20);

        lDiagMenor = new JLabel("DIAGONAL MENOR:");
        lDiagMenor.setBounds(20, 350, 150, 20);
        tDiagMenor = new JTextField();
        tDiagMenor.setBounds(140, 350, 100, 20);

        BEquilatero = new JButton("EQUILÁTERO");
        BEquilatero.setBounds(270, 80, 150, 30);
        BEquilatero.addActionListener(p->{
            Figura figura = new Equilatero();
            ((Equilatero)figura).setBase(ReadUtil.string2Integer(tBase.getText()));
            ((Equilatero)figura).setAltura(ReadUtil.string2Integer(tAltura.getText()));
            ((Equilatero)figura).setLado(ReadUtil.string2Integer(tLado1.getText()));
            System.out.println("Area: " + figura.area( ) );
            System.out.println("Perimetro: " + figura.perimetro( ) );
            System.out.println("---------------------------------------------");
        });

        BIsosceles = new JButton("ISÓSCELES");
        BIsosceles.setBounds(270, 120, 150, 30);
        BIsosceles.addActionListener(p->{
            Figura figura = new Isosceles();
            ((Isosceles)figura).setBase(ReadUtil.string2Integer(tBase.getText()));
            ((Isosceles)figura).setAltura(ReadUtil.string2Integer(tAltura.getText()));
            ((Isosceles)figura).setLado(ReadUtil.string2Integer(tLado1.getText()));
            ((Isosceles)figura).setLado2(ReadUtil.string2Integer(tLado2.getText()));
            System.out.println("Area: " + figura.area( ) );
            System.out.println("Perimetro: " + figura.perimetro( ) );
            System.out.println("---------------------------------------------");
        });

        BEscaleno = new JButton("ESCALENO");
        BEscaleno.setBounds(270, 160, 150, 30);
        BEscaleno.addActionListener(p->{
            Figura figura = new Escaleno();
            ((Escaleno)figura).setBase(ReadUtil.string2Integer(tBase.getText()));
            ((Escaleno)figura).setAltura(ReadUtil.string2Integer(tAltura.getText()));
            ((Escaleno)figura).setLado(ReadUtil.string2Integer(tLado1.getText()));
            ((Escaleno)figura).setLado2(ReadUtil.string2Integer(tLado2.getText()));
            ((Escaleno)figura).setLado3(ReadUtil.string2Integer(tLado3.getText()));
            System.out.println("Area: " + figura.area( ) );
            System.out.println("Perimetro: " + figura.perimetro( ) );
            System.out.println("---------------------------------------------");
        });

        BCirculo = new JButton("CÍRCULO");
        BCirculo.setBounds(270, 200, 150, 30);
        BCirculo.addActionListener(p->{
            Figura figura = new Circulo();
            ((Circulo)figura).setRadio(ReadUtil.string2Integer(tRadio.getText()));
            System.out.println("Area: " + figura.area( ) );
            System.out.println("Perimetro: " + figura.perimetro( ) );
            System.out.println("---------------------------------------------");
        });

        BCuadrado = new JButton("CUADRADO");
        BCuadrado.setBounds(270, 240, 150, 30);
        BCuadrado.addActionListener( p -> {
            Figura figura = new Cuadrado( );
            ((Cuadrado)figura).setLado( ReadUtil.string2Integer(tLado.getText() ) );
            System.out.println("Area: " + figura.area( ) );
            System.out.println("Perimetro: " + figura.perimetro( ) );
            System.out.println("---------------------------------------------");
        } );

        BRectangulo = new JButton("RECTÁNGULO");
        BRectangulo.setBounds(270, 280, 150, 30);
        BRectangulo.addActionListener( p -> {
            Figura figura = new Rectangulo( );
            ((Rectangulo)figura).setBase( ReadUtil.string2Integer(tBase.getText() ) );
            ((Rectangulo)figura).setAltura( ReadUtil.string2Integer(tAltura.getText() ) );
            System.out.println("Area: " + figura.area( ) );
            System.out.println("Perimetro: " + figura.perimetro( ) );
            System.out.println("---------------------------------------------");
        } );

        BPentagono = new JButton("PENTÁGONO");
        BPentagono.setBounds(270, 320, 150, 30);
        BPentagono.addActionListener( p -> {
            Figura figura = new Pentagono();
            ((Pentagono)figura).setLado( ReadUtil.string2Integer(tLado.getText() ) );
            ((Pentagono)figura).setApotema( ReadUtil.string2Integer(tApotema.getText() ) );
            System.out.println("Area: " + figura.area( ) );
            System.out.println("Perimetro: " + figura.perimetro( ) );
            System.out.println("---------------------------------------------");
        } );

        BRombo = new JButton("ROMBO");
        BRombo.setBounds(270, 360, 150, 30);
        BRombo.addActionListener( p -> {
            Figura figura = new Rombo();
            ((Rombo)figura).setLado( ReadUtil.string2Integer(tLado.getText() ) );
            ((Rombo)figura).setDiagMayor( ReadUtil.string2Integer(tDiagMayor.getText() ) );
            ((Rombo)figura).setDiagMenor( ReadUtil.string2Integer(tDiagMenor.getText() ) );
            System.out.println("Area: " + figura.area( ) );
            System.out.println("Perimetro: " + figura.perimetro( ) );
            System.out.println("---------------------------------------------");
        } );

        getContentPane().add(Instrucciones);
        getContentPane().add(jLabel);
        getContentPane().add(lBase);
        getContentPane().add(tBase);
        getContentPane().add(lAltura);
        getContentPane().add(tAltura);
        getContentPane().add(lLado);
        getContentPane().add(tLado);
        getContentPane().add(lLado1);
        getContentPane().add(tLado1);
        getContentPane().add(lLado2);
        getContentPane().add(tLado2);
        getContentPane().add(lLado3);
        getContentPane().add(tLado3);
        getContentPane().add(lRadio);
        getContentPane().add(tRadio);
        getContentPane().add(lApotema);
        getContentPane().add(tApotema);
        getContentPane().add(lDiagMayor);
        getContentPane().add(tDiagMayor);
        getContentPane().add(lDiagMenor);
        getContentPane().add(tDiagMenor);
        getContentPane().add(BEquilatero);
        getContentPane().add(BIsosceles);
        getContentPane().add(BEscaleno);
        getContentPane().add(BCirculo);
        getContentPane().add(BCuadrado);
        getContentPane().add(BRectangulo);
        getContentPane().add(BPentagono);
        getContentPane().add(BRombo);
        getContentPane().setLayout(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    public static Ventana getInstance()
    {
        if(ventana == null)
        {
            ventana = new Ventana();
        }
        return ventana;
    }

    @Override
    public void run()
    {
        setBounds( 100 , 100, 1000, 600 );
        setVisible( true );
    }

    @Override
    public void addHistoriales(Historiales historiales) {
        this.historiales=historiales;
    }
}