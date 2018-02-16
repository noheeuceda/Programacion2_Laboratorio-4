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
public class Cohete {

    private int separadores;

    public Cohete(int separadores) {
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

}
