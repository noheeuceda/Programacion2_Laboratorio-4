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

    public static void main(String[] args) throws ParseException, Excepcion {
        ArrayList<Object> lista = new ArrayList();
        char opcion = 's';
        int respuesta;
        String nombre, grupoSanguineo, sexo, email, username, password, fecha, areaDesignada, planeta, cPelo;
        int altura, peso, cantidadCafe, cantidadComida, iq, lugar;
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
                                                    altura = sc.nextInt();
                                                    System.out.println("Ingrese peso");
                                                    peso = sc.nextInt();
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
                                                            altura = sc.nextInt();
                                                            ((MonoBaboon) mn).setAltura(altura);
                                                            System.out.println("Ingrese peso");
                                                            peso = sc.nextInt();
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
