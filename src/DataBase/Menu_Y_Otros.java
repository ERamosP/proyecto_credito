package DataBase;

import java.util.Scanner;

public class Menu_Y_Otros {

    public static void pintarMenuPpal(){

        System.out.println("""
                
                ---------------    Bienvenido a nuestra Base de Datos de Clientes    ---------------
                ------------------------------------------------------------------------------------
                ---------------          Indique que opcion desea realizar           ---------------
                1.- Conocer los clientes con saldo a cero
                2.- Conocer los clientes a credito
                3.- Conocer los clientes a debito
                4.- Mandar correo a cliente
                5.- Salir
                ------------------------------------------------------------------------------------""");

    }

    public static void pintarMenuSecundario(){

        System.out.println("""
                ***************     Correspondencia a Clientes     ***************
                
                1.- Mandar correspondecia a clientes superVips
                2.- Mandar correspondencia a clientes Robinson
                0.- Salir
                
                ******************************************************************""");

    }

    public static String leerDatos(){

        Scanner sc=new Scanner(System.in);

        return sc.nextLine();
    }

    public static void mostrarMenuPpal(){

        boolean salirMenuPpal = false;
        boolean salirMenuSecundario;
        String opcion;

        do {
            salirMenuSecundario=false;
            pintarMenuPpal();

            opcion=leerDatos();
            switch (opcion){
                case "1": {  Escritura_Ficheros.añadirClientesFichero(Lectura_Ficheros.obtenerClientes());
                    Lectura_Ficheros.obtenerClientes("ficheroClienteCero.dat");}
                break;
                case "2": Lectura_Ficheros.obtenerClientes("ficheroClienteCredito.dat");
                    break;
                case "3": Lectura_Ficheros.obtenerClientes("ficheroClienteDebito.dat");
                    break;
                case "4": do {
                    pintarMenuSecundario();
                    String opcionMenuSec=leerDatos();
                    switch (opcionMenuSec){
                        case "1":
                            System.out.println("En construccion");
                            break;
                        case "2":
                            System.out.println("En construccion");
                            break;
                        case "0":
                           salirMenuSecundario=true;
                            break;
                        default:
                            System.out.println("Opcion Incorrecta");
                    }
                }while (!salirMenuSecundario);
                    break;
                case "5": salirMenuPpal=true;
                    break;
                default:
                    System.out.println("Opcion incorrecta");


            }
        }while (!salirMenuPpal);
    }
}
