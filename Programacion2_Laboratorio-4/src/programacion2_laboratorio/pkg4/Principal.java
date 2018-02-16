/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacion2_laboratorio.pkg4;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author euced
 */
public class Principal {

    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);
        ArrayList<Object> lista = new ArrayList();
        char opcion = 's';
        int respuesta;
        String nombre, grupoSanguineo, sexo, email, username, password, fecha;
        int altura, peso, cantidadCafe;
        Date fechaNacimiento;

        while (opcion == 's') {
            System.out.println("Menú: \n 1.Crear Ingeniero \n 2. LogIn");
            respuesta = sc.nextInt();
            switch (respuesta) {
                case 1:
                    System.out.println("Ingrese Nombre");
                    nombre = sc.next();
                    
                    System.out.println("Ingrese Grupo Sanguineo");
                    grupoSanguineo = sc.next();
                    System.out.println("Ingrese sexo");
                    sexo = sc.next();
                    System.out.println("Ingrese Altura");
                    altura = sc.nextInt();
                    System.out.println("Ingrese peso");
                    peso = sc.nextInt();
                    System.out.println("Ingrese email");
                    email = sc.next();
                    System.out.println("Ingrese username");
                    username = sc.next();
                    System.out.println("Ingrese password");
                    password = sc.next();
                    System.out.println("Ingrese cantidad de cafe");
                    cantidadCafe = sc.nextInt();
                    System.out.println("Ingrese fecha de nacimiento separado por slash '/'(Año, mes, dia)");
                    fecha = sc.next();
                    DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
                    fechaNacimiento = df.parse(fecha);
                    Ingeniero inge = new Ingeniero(email, username, password, cantidadCafe, fechaNacimiento, nombre, grupoSanguineo, sexo, altura, peso);
                    lista.add(inge);
                    break;
                case 2:
                    System.out.println("Ingrese correo o usuario");
                    email = sc.next();
                    System.out.println("Ingrese contraseña");
                    password = sc.next();
                    int flag = 1;
                    for (Object user : lista) {
                        if ((((Ingeniero) user).getCorreoelectronico().equals(email) || ((Ingeniero) user).getUsuario().equals(email))
                                && (((Ingeniero) user).getContra().equals(password))) {
                            System.out.println("Menú \n 1. Opciones Transporte \n 2. Ingenieros \n 3. Primates \n 4. Viajes");
                            respuesta = sc.nextInt();
                            switch (respuesta) {

                            }
                        }
                    }

                    break;
                default:
                    System.out.println("Opcion Invalida");
                    break;
            }
            System.out.println("Desea regresar al menu? (s/n)");
            opcion = sc.next().charAt(0);
        }
    }

}
