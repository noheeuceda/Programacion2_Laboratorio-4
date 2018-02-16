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
public class AvionComercial extends AereoNormal {

    private int pasajeros;
    boolean pilotoautomatico;

    public AvionComercial() {
    }

    public AvionComercial(int pasajeros, boolean pilotoautomatico, String tipogasolina, String paispartida, String paisllegada, double indicadortanque, double distancia, double altitud) {
        super(tipogasolina, paispartida, paisllegada, indicadortanque, distancia, altitud);
        this.pasajeros = pasajeros;
        this.pilotoautomatico = pilotoautomatico;
    }


    public int getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }

    public boolean isPilotoautomatico() {
        return pilotoautomatico;
    }

    public void setPilotoautomatico(boolean pilotoautomatico) {
        this.pilotoautomatico = pilotoautomatico;
    }

    @Override
    public String toString() {
        return "AvionComercial{" + "pasajeros=" + pasajeros + ", pilotoautomatico=" + pilotoautomatico + '}';
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
