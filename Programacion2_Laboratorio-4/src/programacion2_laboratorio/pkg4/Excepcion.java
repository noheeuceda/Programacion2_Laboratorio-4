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
public class Excepcion extends Exception {

    private String mensaje;

    public Excepcion(String mensaje) {
        super(mensaje);
        this.mensaje = mensaje;
    }

}
