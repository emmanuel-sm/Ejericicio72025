package org.sanchez.muciño.emmanuel.figura;

import org.sanchez.vista.SolicitaDatos;

import java.io.*;
import java.util.*;

/**
 *
 */
public abstract class Figura extends org.gerdoc.model.figura.Figura implements SolicitaDatos {

    /**
     * Default constructor
     */


    public Figura() {
    }

    /**
     * @return
     */
    public abstract double area();

    /**
     * @return
     */
    public abstract double perimetro();
}