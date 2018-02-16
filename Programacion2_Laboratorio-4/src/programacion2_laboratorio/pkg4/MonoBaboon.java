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
public class MonoBaboon extends Primates {
    
    private String colorpelo;

    public MonoBaboon() {
    }

    public MonoBaboon(String colorpelo, String AreaAsignada, int cantidadcomida, String planeta, String lugarnacimiento, String nombre, String gruposanguineo, String sexo, int altura, int peso) {
        super(AreaAsignada, cantidadcomida, planeta, lugarnacimiento, nombre, gruposanguineo, sexo, altura, peso);
        this.colorpelo = colorpelo;
    }

    public String getColorpelo() {
        return colorpelo;
    }

    public void setColorpelo(String colorpelo) {
        this.colorpelo = colorpelo;
    }

    @Override
    public String toString() {
        return "MonoBaboon{" + "colorpelo=" + colorpelo + '}';
    }
    
    
}
