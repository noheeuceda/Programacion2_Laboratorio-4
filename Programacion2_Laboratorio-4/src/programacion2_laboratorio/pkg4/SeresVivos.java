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
public class SeresVivos {

    protected String nombre;
    protected String gruposanguineo;
    protected String sexo;
    protected double altura;
    protected double peso;

    public SeresVivos() {
    }

    public SeresVivos(String nombre, String gruposanguineo, String sexo, double altura, double peso) {
        this.nombre = nombre;
        this.gruposanguineo = gruposanguineo;
        this.sexo = sexo;
        this.altura = altura;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGruposanguineo() {
        return gruposanguineo;
    }

    public void setGruposanguineo(String gruposanguineo) {
        this.gruposanguineo = gruposanguineo;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "SeresVivos{" + "nombre=" + nombre + ", gruposanguineo=" + gruposanguineo + ", sexo=" + sexo + ", altura=" + altura + ", peso=" + peso + '}';
    }
    
    public void restarComida(){};

    public void reestableComida() {};

   

}
