/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacion2_laboratorio.pkg4;

/**
 *
 * @author Jamil
 */
public class Cohete extends Espacial {

    private int separadores;

    public Cohete(int separadores, String tipocombustible, String planetapartida, String planetallegada, double indicadortanque, double distancia, double altitud) {
        super(tipocombustible, planetapartida, planetallegada, indicadortanque, distancia, altitud);
        this.separadores = separadores;
    }

    public Cohete() {
    }

    public int getSeparadores() {
        return separadores;
    }

    public void setSeparadores(int separadores) {
        this.separadores = separadores;
    }

    @Override
    public String toString() {
        return "Cohete{" + "separadores=" + separadores + '}';
    }

    @Override
    public double restarcombustible() {
        this.indicadortanque = 0;
        return indicadortanque - 100.00;
    }

    @Override
    public double reestablecercombustible() {
        this.indicadortanque = 100.00;
        return indicadortanque = 100.00;
    }
}
