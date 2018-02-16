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
public class NaveEspacial extends Espacial {

    private int propulsores;

    public NaveEspacial() {
    }

    public NaveEspacial(int propulsores, String tipocombustible, String planetapartida, String planetallegada, double indicadortanque, double distancia, double altitud) {
        super(tipocombustible, planetapartida, planetallegada, indicadortanque, distancia, altitud);
        this.propulsores = propulsores;
    }

    public int getPropulsores() {
        return propulsores;
    }

    public void setPropulsores(int propulsores) {
        this.propulsores = propulsores;
    }

    @Override
    public String toString() {
        return "NaveEspacial{" + "propulsores=" + propulsores + '}';
    }

}
