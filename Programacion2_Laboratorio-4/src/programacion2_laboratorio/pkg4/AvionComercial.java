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

    public AvionComercial(int pasajeros, boolean pilotoautomatico) {
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

}
