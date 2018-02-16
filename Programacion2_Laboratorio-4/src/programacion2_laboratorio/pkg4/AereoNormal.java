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
public class AereoNormal extends MedioTransporte {

    protected String tipogasolina;
    protected String paispartida;
    protected String paisllegada;

    public AereoNormal() {
    }

    public AereoNormal(String tipogasolina, String paispartida, String paisllegada, double indicadortanque, double distancia, double altitud) {
        super(indicadortanque, distancia, altitud);
        this.tipogasolina = tipogasolina;
        this.paispartida = paispartida;
        this.paisllegada = paisllegada;
    }

    public String getTipogasolina() {
        return tipogasolina;
    }

    public void setTipogasolina(String tipogasolina) {
        this.tipogasolina = tipogasolina;
    }

    public String getPaispartida() {
        return paispartida;
    }

    public void setPaispartida(String paispartida) {
        this.paispartida = paispartida;
    }

    public String getPaisllegada() {
        return paisllegada;
    }

    public void setPaisllegada(String paisllegada) {
        this.paisllegada = paisllegada;
    }

    @Override
    public String toString() {
        return "AereoNormal{" + "tipogasolina=" + tipogasolina + ", paispartida=" + paispartida + ", paisllegada=" + paisllegada + '}';
    }

}
