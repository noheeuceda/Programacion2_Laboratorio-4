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
import java.util.*;

public class Programacion2_Laboratorio4 {

    /**
     * @param args the command line arguments
     */
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Excepcion {

        GorillaMontaña gm = new GorillaMontaña();
        boolean f = true;
        while (f) {
            try {
                System.out.println("Ingrese un numero");
                int num = sc.nextInt();
                gm.setIQ(num);
                f = false;
            } catch (Excepcion e) {
                System.out.println("No se aceptan");
                f = true;
            }
        }
    }
    
    
}
