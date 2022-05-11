package DataBase;

import java.util.List;
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
            List<Cliente> listaClientes=null;
            List<CLientesConDireccion> listaClientesDireccion=null;
            opcion=leerDatos();

            if (opcion !="5"){

                listaClientes=Lectura_Ficheros.obtenerClientes();
                listaClientesDireccion =Lectura_Ficheros.obtenerClientesDireccion();
            }
            switch (opcion){

                case "1": {  Escritura_Ficheros.añadirClientesFichero(listaClientes);
                    Lectura_Ficheros.obtenerClientes("ficheroClienteCero.dat");}
                break;
                case "2":{ Escritura_Ficheros.añadirClientesFichero(listaClientes);
                    Lectura_Ficheros.obtenerClientes("ficheroClienteCredito.dat");}
                    break;
                case "3":{ Escritura_Ficheros.añadirClientesFichero(listaClientes);
                    Lectura_Ficheros.obtenerClientes("ficheroClienteDebito.dat");}
                    break;
                case "4":{ Escritura_Ficheros.añadirClientesFicheroDireccion(listaClientesDireccion);
                    Lectura_Ficheros.obtenerClientesDireccion();
                }
                    break;
                case "5": salirMenuPpal=true;
                    break;
                default:
                    System.out.println("Opcion incorrecta");


            }
        }while (!salirMenuPpal);
    }
}
