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
public class GorillaMontaña extends Primates {

    private int IQ;

    public GorillaMontaña() {
    }

    public GorillaMontaña(int IQ, String AreaAsignada, int cantidadcomida, String planeta, String lugarnacimiento, String nombre, String gruposanguineo, String sexo, double altura, double peso) {
        super(AreaAsignada, cantidadcomida, planeta, lugarnacimiento, nombre, gruposanguineo, sexo, altura, peso);
        this.IQ = IQ;
    }

    public int getIQ() {
        return IQ;
    }

    public void setIQ(int IQ) throws Excepcion {

        if (IQ < 130 || IQ > 139) {
            throw new Excepcion("Ingrese un IQ entre 130 y 139");
        }
        this.IQ = IQ;

    }

    @Override
    public String toString() {
        return "GorillaMonta\u00f1a{" + "IQ=" + IQ + '}';
    }
    @Override
    public void restarComida(){
        this.cantidadcomida =0;
    };

    @Override
    public void reestableComida() {
    this.cantidadcomida=100;
    };
}
