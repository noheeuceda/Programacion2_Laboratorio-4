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
public class Espacial extends MedioTransporte {

    protected String tipocombustible;
    protected String planetapartida;
    protected String planetallegada;

    public Espacial() {
    }

    public Espacial(String tipocombustible, String planetapartida, String planetallegada, double indicadortanque, double distancia, double altitud) {
        super(indicadortanque, distancia, altitud);
        this.tipocombustible = tipocombustible;
        this.planetapartida = planetapartida;
        this.planetallegada = planetallegada;
    }

    public String getTipocombustible() {
        return tipocombustible;
    }

    public void setTipocombustible(String tipocombustible) {
        this.tipocombustible = tipocombustible;
    }

    public String getPlanetapartida() {
        return planetapartida;
    }

    public void setPlanetapartida(String planetapartida) {
        this.planetapartida = planetapartida;
    }

    public String getPlanetallegada() {
        return planetallegada;
    }

    public void setPlanetallegada(String planetallegada) {
        this.planetallegada = planetallegada;
    }

    @Override
    public String toString() {
        return "Espacial{" + "tipocombustible=" + tipocombustible + ", planetapartida=" + planetapartida + ", planetallegada=" + planetallegada + '}';
    }

    @Override
    public double restarcombustible() {
        return indicadortanque;
    }

}
