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
public class Helicoptero extends AereoNormal {

    private int helices;
    private int patas;

    public Helicoptero() {
    }

    public Helicoptero(int helices, int patas, String tipogasolina, String paispartida, String paisllegada, double indicadortanque, double distancia, double altitud) {
        super(tipogasolina, paispartida, paisllegada, indicadortanque, distancia, altitud);
        this.helices = helices;
        this.patas = patas;
    }

    public int getHelices() {
        return helices;
    }

    public void setHelices(int helices) {
        this.helices = helices;
    }

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }

    @Override
    public String toString() {
        return "Helicoptero{" + "helices=" + helices + ", patas=" + patas + '}';
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
