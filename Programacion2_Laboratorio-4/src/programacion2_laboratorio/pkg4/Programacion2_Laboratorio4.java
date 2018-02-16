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

    public static void main(String[] args) { //throws Excepcion { 
        ArrayList<Object> lista = new ArrayList();
        int opcion2 = 0;

//        GorillaMontaña gm = new GorillaMontaña();
//        boolean f = true;
//        while (f) {
//            try {
//                System.out.println("Ingrese un numero");
//                int num = sc.nextInt();
//                gm.setIQ(num);
//                f = false;
//            } catch (Excepcion e) {
//                System.out.println("No se aceptan");
//                f = true;
//            }
//        }
        String gasolina, paispartida, paisllegada;
        System.out.println("Ingrese un medio de transporte: ");
        double indicadortanque = sc.nextInt();
        System.out.println("Ingrese la distancia: ");
        double distancia = sc.nextInt();
        System.out.println("Ingrese la altitud: ");
        double altitud = sc.nextInt();
        System.out.println("");
        System.out.println("Ingrese el tipo de Transporte que desea agregar: \n 1. Aereo Normal \n 2. Espacial");
        int opcion = sc.nextInt();
        switch (opcion) {
            case 1: //Case Aereo Normal
                System.out.println("Ingrese un tipo de Gasolina: ");
                gasolina = sc.next();
                System.out.println("Ingrese un pais de partida: ");
                paispartida = sc.next();
                System.out.println("Ingrese un pais de llegada: ");
                paisllegada = sc.next();
                System.out.println("Ingrese el tipo de Aereo Normal que desea agregar: \n 1. Helicoptero \n 2. Avion: ");
                opcion2 = sc.nextInt();
                switch (opcion2) {
                    case 1:
                        System.out.println("Ingrese un numero de helices: ");
                        int helices = sc.nextInt();
                        System.out.println("Ingrese un numero de patas: ");
                        int patas = sc.nextInt();
                        lista.add(new Helicoptero(helices, patas, gasolina, paispartida, paisllegada, indicadortanque, distancia, altitud));
                        break;
                    case 2:
                        System.out.println("Ingrese un numero de pasajeros: ");
                        int pasajeros = sc.nextInt();
                        System.out.println("Tiene piloto automatico funcional? si / no");
                        String piloto = sc.next();
                        boolean pilotoautomatico = true;
                        if (piloto.equalsIgnoreCase("si")) {
                            pilotoautomatico = true;
                        } else if (piloto.equalsIgnoreCase("no")) {
                            pilotoautomatico = false;
                        }
                        lista.add(new AvionComercial(pasajeros, pilotoautomatico, gasolina, paispartida, paisllegada, indicadortanque, distancia, altitud));
                        break;
                }

                //Fin case Aereo Normal
                break;

            case 2:
                System.out.println("Ingrese un tipo de Gasolina: ");
                gasolina = sc.next();
                System.out.println("Ingrese un planeta de partida: ");
                String planetapartida = sc.next();
                System.out.println("Ingrese un planeta de llegada: ");
                String planetallegada = sc.next();
                System.out.println("Ingrese el tipo de Espacial que desea agregar: \n 1. NaveEspacial \n 2. Cohete ");
                opcion2 = sc.nextInt();
                switch (opcion2) {
                    case 1:
                        System.out.println("Ingrese el numero de propulsores deseados: ");
                        int propulsores = sc.nextInt();
                        lista.add(new NaveEspacial(propulsores, gasolina, planetapartida, planetallegada, indicadortanque, distancia, altitud));
                        break;
                    case 2:
                        System.out.println("Ingrese el numero de separadores deseados: ");
                        int separadores = sc.nextInt();
                        lista.add(new Cohete(separadores, gasolina, planetapartida, planetallegada, indicadortanque, distancia, altitud));
                        break;
                }
                break;
        }
    }
}
