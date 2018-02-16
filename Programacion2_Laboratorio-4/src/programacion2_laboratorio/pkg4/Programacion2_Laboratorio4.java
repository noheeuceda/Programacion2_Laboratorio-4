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
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class Programacion2_Laboratorio4 {

    /**
     * @param args the command line arguments
     */
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) { //throws Excepcion { 
      ArrayList<Object> lista = new ArrayList();
        char opcion = 's';
        int respuesta,opcion2;
        String nombre, grupoSanguineo, sexo, email, username, password, fecha, areaDesignada, planeta, cPelo;
        int  cantidadCafe, cantidadComida, iq, lugar;
        double altura, peso;
        Date fechaNacimiento;
        DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
        Scanner sc = new Scanner(System.in);

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
                    altura = sc.nextDouble();
                    System.out.println("Ingrese peso");
                    peso = sc.nextDouble();
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
                                case 1:
                                    String gasolina,
                                     paispartida,
                                     paisllegada;
                                    System.out.println("Ingrese un medio de transporte: ");
                                    double indicadortanque = sc.nextInt();
                                    System.out.println("Ingrese la distancia: ");
                                    double distancia = sc.nextInt();
                                    System.out.println("Ingrese la altitud: ");
                                    double altitud = sc.nextInt();
                                    System.out.println("");
                                    System.out.println("Ingrese el tipo de Transporte que desea agregar: \n 1. Aereo Normal \n 2. Espacial");
                                    opcion2 = sc.nextInt();
                                    switch (opcion2) {
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
                                    break;
                                case 2:
                                    break;
                                case 3:
                                    System.out.println("Menu: \n 1. Mono Baboon \n 2. Gorilla Montaña");
                                    respuesta = sc.nextInt();
                                    switch (respuesta) {
                                        case 1:
                                            System.out.println("1. Agregar \n 2.Eliminar \n 3.Modifica");
                                            respuesta = sc.nextInt();

                                            switch (respuesta) {

                                                case 1:
                                                    System.out.println("Ingrese nombre");
                                                    nombre = sc.next();
                                                    System.out.println("Ingrese Grupo Sanguineo");
                                                    grupoSanguineo = sc.next();
                                                    System.out.println("Ingrese sexo");
                                                    sexo = sc.next();
                                                    System.out.println("Ingrese Altura");
                                                    altura = sc.nextDouble();
                                                    System.out.println("Ingrese peso");
                                                    peso = sc.nextDouble();
                                                    System.out.println("Ingrese Area designada");
                                                    areaDesignada = sc.next();
                                                    System.out.println("Ingrese Cantidad Comida");
                                                    cantidadComida = sc.nextInt();
                                                    System.out.println("Ingrese Planeta designado");
                                                    planeta = sc.next();
                                                    System.out.println("Ingrese Color Pelo");
                                                    cPelo = sc.next();
                                                    System.out.println("Ingrese lugar de nacimiento ");
                                                    fecha = sc.next();
                                                    MonoBaboon mb = new MonoBaboon(cPelo, areaDesignada, cantidadComida, planeta, fecha, nombre, grupoSanguineo, sexo, altura, peso);
                                                    lista.add(mb);
                                                    break;
                                                case 2:
                                                    int cont = 0;
                                                    for (Object mn : lista) {
                                                        if (mn instanceof MonoBaboon) {
                                                            cont++;
                                                            System.out.println(cont + ". " + mn);
                                                        }
                                                    }
                                                    System.out.println("Ingrese nombre de primate a eliminar");
                                                    nombre = sc.next();
                                                    lugar = 0;
                                                    for (Object mn : lista) {
                                                        if (((MonoBaboon) mn).getNombre().equals(nombre)) {
                                                            lugar = lista.indexOf(mn);

                                                        }
                                                    }
                                                    lista.remove(lugar);
                                                    break;
                                                case 3:
                                                    System.out.println("Ingrese nombre de primate a modificar");
                                                    nombre = sc.next();
                                                    for (Object mn : lista) {
                                                        if (((MonoBaboon) mn).getNombre().equals(nombre)) {
                                                            lugar = lista.indexOf(mn);
                                                            System.out.println("Ingrese Nombre");
                                                            grupoSanguineo = sc.next();
                                                            ((MonoBaboon) mn).setNombre(nombre);
                                                            System.out.println("Ingrese Grupo Sanguineo");
                                                            grupoSanguineo = sc.next();
                                                            ((MonoBaboon) mn).setGruposanguineo(grupoSanguineo);
                                                            System.out.println("Ingrese sexo");
                                                            sexo = sc.next();
                                                            ((MonoBaboon) mn).setSexo(sexo);
                                                            System.out.println("Ingrese Altura");
                                                            altura = sc.nextDouble();
                                                            ((MonoBaboon) mn).setAltura(altura);
                                                            System.out.println("Ingrese peso");
                                                            peso = sc.nextDouble();
                                                            ((MonoBaboon) mn).setPeso(peso);
                                                            System.out.println("Ingrese Area designada");
                                                            areaDesignada = sc.next();
                                                            ((MonoBaboon) mn).setAreaAsignada(areaDesignada);
                                                            System.out.println("Ingrese Cantidad Comida");
                                                            cantidadComida = sc.nextInt();
                                                            ((MonoBaboon) mn).setCantidadcomida(cantidadComida);
                                                            System.out.println("Ingrese Planeta designado");
                                                            planeta = sc.next();
                                                            ((MonoBaboon) mn).setPlaneta(planeta);
                                                            System.out.println("Ingrese Color Pelo");
                                                            cPelo = sc.next();
                                                            ((MonoBaboon) mn).setColorpelo(cPelo);
                                                            System.out.println("Ingrese lugar de nacimiento ");
                                                            fecha = sc.next();
                                                            ((MonoBaboon) mn).setLugarnacimiento(fecha);
                                                        }
                                                    }

                                                    break;

                                                default:
                                                    System.out.println("Opcion Incorrecta");
                                            }
                                        case 2:
                                            System.out.println("1. Agregar \n 2.Eliminar \n 3.Modifica");
                                            respuesta = sc.nextInt();

                                            switch (respuesta) {

                                                case 1:
                                                    System.out.println("Ingrese nombre");
                                                    nombre = sc.next();
                                                    System.out.println("Ingrese Grupo Sanguineo");
                                                    grupoSanguineo = sc.next();
                                                    System.out.println("Ingrese sexo");
                                                    sexo = sc.next();
                                                    System.out.println("Ingrese Altura");
                                                    altura = sc.nextInt();
                                                    System.out.println("Ingrese peso");
                                                    peso = sc.nextInt();
                                                    System.out.println("Ingrese Area designada");
                                                    areaDesignada = sc.next();
                                                    System.out.println("Ingrese Cantidad Comida");
                                                    cantidadComida = sc.nextInt();
                                                    System.out.println("Ingrese Planeta designado");
                                                    planeta = sc.next();
                                                    System.out.println("Ingrese IQ");
                                                    iq = sc.nextInt();
                                                    System.out.println("Ingrese lugar de nacimiento ");
                                                    fecha = sc.next();
                                                    GorillaMontaña gm = new GorillaMontaña(iq, areaDesignada, cantidadComida, planeta, fecha, nombre, grupoSanguineo, sexo, altura, peso);
                                                    lista.add(gm);
                                                    break;
                                                case 2:
                                                    int cont = 0;
                                                    for (Object mn : lista) {
                                                        if (mn instanceof GorillaMontaña) {
                                                            cont++;
                                                            System.out.println(cont + ". " + mn);
                                                        }
                                                    }
                                                    System.out.println("Ingrese nombre de primate a eliminar");
                                                    nombre = sc.next();
                                                    lugar = 0;
                                                    for (Object mn : lista) {
                                                        if (((GorillaMontaña) mn).getNombre().equals(nombre)) {
                                                            lugar = lista.indexOf(mn);

                                                        }
                                                    }
                                                    lista.remove(lugar);
                                                    break;
                                                case 3:
                                                    System.out.println("Ingrese nombre de primate a modificar");
                                                    nombre = sc.next();
                                                    for (Object mn : lista) {
                                                        if (((GorillaMontaña) mn).getNombre().equals(nombre)) {
                                                            lugar = lista.indexOf(mn);
                                                            System.out.println("Ingrese Nombre");
                                                            grupoSanguineo = sc.next();
                                                            ((GorillaMontaña) mn).setNombre(nombre);
                                                            System.out.println("Ingrese Grupo Sanguineo");
                                                            grupoSanguineo = sc.next();
                                                            ((GorillaMontaña) mn).setGruposanguineo(grupoSanguineo);
                                                            System.out.println("Ingrese sexo");
                                                            sexo = sc.next();
                                                            ((GorillaMontaña) mn).setSexo(sexo);
                                                            System.out.println("Ingrese Altura");
                                                            altura = sc.nextInt();
                                                            ((GorillaMontaña) mn).setAltura(altura);
                                                            System.out.println("Ingrese peso");
                                                            peso = sc.nextInt();
                                                            ((GorillaMontaña) mn).setPeso(peso);
                                                            System.out.println("Ingrese Area designada");
                                                            areaDesignada = sc.next();
                                                            ((GorillaMontaña) mn).setAreaAsignada(areaDesignada);
                                                            System.out.println("Ingrese Cantidad Comida");
                                                            cantidadComida = sc.nextInt();
                                                            ((GorillaMontaña) mn).setCantidadcomida(cantidadComida);
                                                            System.out.println("Ingrese Planeta designado");
                                                            planeta = sc.next();
                                                            ((GorillaMontaña) mn).setPlaneta(planeta);
                                                            System.out.println("Ingrese Color Pelo");
                                                            iq = sc.nextInt();
                                                            ((GorillaMontaña) mn).setIQ(iq);
                                                            System.out.println("Ingrese lugar de nacimiento ");
                                                            fecha = sc.next();
                                                            ((GorillaMontaña) mn).setLugarnacimiento(fecha);
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    System.out.println("Opcion Invalida");
                                            }
                                            break;
                                        case 4:

                                            break;
                                    }
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
