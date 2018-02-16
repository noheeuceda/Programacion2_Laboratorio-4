/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacion2_laboratorio.pkg4;

import java.util.ArrayList;

/**
 *
 * @author Jamil
 */
public class MedioTransporte {

    protected double indicadortanque = 100.00;
    protected double distancia;
    protected double altitud;
    protected ArrayList<Primates> primates = new ArrayList();

    public MedioTransporte() {
    }

    public MedioTransporte(double indicadortanque, double distancia, double altitud) {
        this.indicadortanque = indicadortanque;
        this.distancia = distancia;
        this.altitud = altitud;
    }

    public double getIndicadortanque() {
        return indicadortanque;
    }

    public void setIndicadortanque(double indicadortanque) {
        this.indicadortanque = indicadortanque;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public double getAltitud() {
        return altitud;
    }

    public void setAltitud(double altitud) {
        this.altitud = altitud;
    }

    public ArrayList<Primates> getPrimates() {
        return primates;
    }

    public void setPrimates(ArrayList<Primates> primates) {
        this.primates = primates;
    }

    @Override
    public String toString() {
        return "MedioTransporte{" + "indicadortanque=" + indicadortanque + ", distancia=" + distancia + ", altitud=" + altitud + ", primates=" + primates + '}';
    }

    public double restarcombustible() {
        this.indicadortanque = 0;
        return indicadortanque - 100.00;
    }

    public double reestablecercombustible() {
        this.indicadortanque = 100.00;
        return indicadortanque = 100.00;
    }

}
