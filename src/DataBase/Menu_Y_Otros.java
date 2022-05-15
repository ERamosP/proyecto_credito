package DataBase;

import java.util.List;
import java.util.Scanner;

public class Menu_Y_Otros {
    /**
     * Pintamos el menu que deseamos que aparezca por consola con el formato que creamos que es el mas indicado
     */
    public static void pintarMenuPpal(){

        System.out.println("""
                
                ---------------    Bienvenido a nuestra Base de Datos de Clientes    ---------------
                ------------------------------------------------------------------------------------
                ---------------          Indique que opcion desea realizar           ---------------
                1.- Conocer los clientes con saldo a cero
                2.- Conocer los clientes a credito
                3.- Conocer los clientes a debito
                4.- Montrar fichero clientes Vips
                5.- Mostrar ficheros clientes Robinson
                6.- Salir
                ------------------------------------------------------------------------------------""");

    }

    /**
     * Metodo para leer los datos devueltos por consola y poder reutilizarlo tantas veces como sea necesario
     * @return devuelve un String para no necesitar utilizar try-catch ya que solo admite los valores introducidos
     * y con el default del switch indica, en el caso de que sea un dato incorrecto, dato no valido
     */

    public static String leerDatos(){

        Scanner sc=new Scanner(System.in);

        return sc.nextLine();


    }

    /**
     * metodo para mostrar el menu principal, ademas de motrarlo, recoge los metodos que hacen que se generen
     * y se lean los archivos deseados. Mientras no se desee salir, el menu funcionara, si se sale antes de elegir
     * una opcion, no se generara el fichero correspondiente.
     */
    public static void mostrarMenuPpal(){

        boolean salirMenuPpal = false;
        String opcion;

        do {

            pintarMenuPpal();
            List<Cliente> listaClientes=null;
            List<CLientesConDireccion> listaClientesDireccion=null;
            opcion=leerDatos();

            if (opcion !="6"){

                listaClientes=Lectura_Ficheros.obtenerClientes();
                listaClientesDireccion =Lectura_Ficheros.obtenerClientesDireccion();
            }
            switch (opcion){

                case "1": {  Escritura_Ficheros.añadirSaldoCero(listaClientes);
                    Lectura_Ficheros.obtenerClientes("ficheroClienteCero.dat");}
                break;
                case "2":{ Escritura_Ficheros.añadirSaldoCredito(listaClientes);
                    Lectura_Ficheros.obtenerClientes("ficheroClienteCredito.dat");}
                    break;
                case "3":{ Escritura_Ficheros.añadirSaldoDebito(listaClientes);
                    Lectura_Ficheros.obtenerClientes("ficheroClienteDebito.dat");}
                    break;
                case "4":{ Escritura_Ficheros.añadirClienteVip(listaClientesDireccion);
                    Lectura_Ficheros.obtenerClientes("ficheroClienteVip.dat");
                }
                    break;
                case "5": {
                    Escritura_Ficheros.añadirClienteRobinson(listaClientesDireccion);
                    Lectura_Ficheros.obtenerClientes("ficheroClienteRobinson.dat");
                }
                case "6": salirMenuPpal=true;
                    break;
                default:
                    System.out.println("Opcion incorrecta");


            }
        }while (!salirMenuPpal);
    }
}
