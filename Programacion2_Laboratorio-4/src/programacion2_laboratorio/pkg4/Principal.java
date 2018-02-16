/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacion2_laboratorio.pkg4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author euced
 */
public class Principal {
    
    public static void main(String[] args) {
        ArrayList<Object> lista = new ArrayList();
        char opcion='s';
        String respuesta;
        Scanner sc = new Scanner(System.in);
        
        while(opcion =='s'){
            System.out.println("Menú: \n 1.Agregar Ingeniero \n 2. Eliminar Ingeniero \n 3. Modificar Ingeniero \n"
                    + " 4. Hacer un Viaje");
            respuesta = sc.next();
            
        }        
    }
    
}
