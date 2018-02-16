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
public class Primates extends SeresVivos {

    protected String AreaAsignada;
    protected int cantidadcomida;
    protected String planeta;
    protected String lugarnacimiento;

    public Primates() {
    }

    public Primates(String AreaAsignada, int cantidadcomida, String planeta, String lugarnacimiento, String nombre, String gruposanguineo, String sexo, double altura, double peso) {
        super(nombre, gruposanguineo, sexo, altura, peso);
        this.AreaAsignada = AreaAsignada;
        this.cantidadcomida = cantidadcomida;
        this.planeta = planeta;
        this.lugarnacimiento = lugarnacimiento;
    }

    public String getAreaAsignada() {
        return AreaAsignada;
    }

    public void setAreaAsignada(String AreaAsignada) {
        this.AreaAsignada = AreaAsignada;
    }

    public int getCantidadcomida() {
        return cantidadcomida;
    }

    public void setCantidadcomida(int cantidadcomida) {
        this.cantidadcomida = cantidadcomida;
    }

    public String getPlaneta() {
        return planeta;
    }

    public void setPlaneta(String planeta) {
        this.planeta = planeta;
    }

    public String getLugarnacimiento() {
        return lugarnacimiento;
    }

    public void setLugarnacimiento(String lugarnacimiento) {
        this.lugarnacimiento = lugarnacimiento;
    }

    @Override
    public String toString() {
        return "Primates{" + "AreaAsignada=" + AreaAsignada + ", cantidadcomida=" + cantidadcomida + ", planeta=" + planeta + ", lugarnacimiento=" + lugarnacimiento + '}';
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
