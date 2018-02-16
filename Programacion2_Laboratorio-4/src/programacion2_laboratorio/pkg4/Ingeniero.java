/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacion2_laboratorio.pkg4;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Jamil
 */
public class Ingeniero extends SeresVivos {

    private String correoelectronico;
    private String usuario;
    private ArrayList idiomas = new ArrayList();
    private String contra;
    private int cafe;
    private Date fecha;

    public Ingeniero() {
    }

    public Ingeniero(String correoelectronico, String usuario, String contra, int cafe, Date fecha, String nombre, String gruposanguineo, String sexo, double altura, double peso) {
        super(nombre, gruposanguineo, sexo, altura, peso);
        this.correoelectronico = correoelectronico;
        this.usuario = usuario;
        this.contra = contra;
        this.cafe = cafe;
        this.fecha = fecha;
    }

    public String getCorreoelectronico() {
        return correoelectronico;
    }

    public void setCorreoelectronico(String correoelectronico) {
        this.correoelectronico = correoelectronico;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public ArrayList getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(ArrayList idiomas) {
        this.idiomas = idiomas;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public int getCafe() {
        return cafe;
    }

    public void setCafe(int cafe) {
        this.cafe = cafe;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Ingeniero{" + "correoelectronico=" + correoelectronico + ", usuario=" + usuario + ", idiomas=" + idiomas + ", contra=" + contra + ", cafe=" + cafe + ", fecha=" + fecha + '}';
    }

    
    
    
}
