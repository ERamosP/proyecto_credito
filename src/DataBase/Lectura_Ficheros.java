package DataBase;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lectura_Ficheros {

    public static FileReader fichero;
    public static BufferedReader br = null;
    public static Scanner sc = null;
    public static String linea = "";
    public static ObjectInputStream ois;
    public static FileInputStream fis;

    public static Object aux;

    public static List<Cliente> obtenerClientes() {
/**
 * Creamos las variables con los nombres que tenemos en la clase Cliente, para que a cada iteracion de la clase
 * Scanner introduzca el valor de cada campo en la variable correspondiente. En el while lo que hacemos
 * es que mientras que la linea sea distinta de null itere y continue introduciendo datos
 * Todo metido en la clausula Try-catch para controlar los posibles errores que causan los ficheros
 */
        List<Cliente> listaClientes = new ArrayList<>();

        int numeroCliente = 0;
        String nombre = "";
        String apellido1 = "";
        String apellido2 = "";
        int saldo = 0;
        int ingresosMedios = 0;
        int gastosMedios = 0;

        try {

            fichero = new FileReader("db.txt");
            br = new BufferedReader(fichero);
            linea = br.readLine();

            while (linea != null) {

                sc=new Scanner(linea);

                if (sc.hasNextInt()) {
                    numeroCliente = sc.nextInt();
                }
                if (sc.hasNext()) {
                    nombre = sc.next();
                }
                if (sc.hasNext()) {
                    apellido1 = sc.next();
                }
                if (sc.hasNext()) {
                    apellido2 = sc.next();
                }
                if (sc.hasNextInt()) {
                    saldo = sc.nextInt();
                }
                if (sc.hasNextInt()) {
                    ingresosMedios = sc.nextInt();
                }
                if (sc.hasNextInt()) {
                    gastosMedios = sc.nextInt();
                }

                listaClientes.add(new Cliente(numeroCliente, nombre, apellido1, apellido2, saldo, ingresosMedios, gastosMedios));
                linea = br.readLine();
            }


        } catch (
                IOException ex) {
            System.out.println("Error general");
        } finally {
            try {
                fichero.close();
                br.close();
            } catch (IOException ex) {
                System.out.println("Error al cerrar el fichero");
            }
        }

        return listaClientes;
    }
    public static List<CLientesConDireccion> obtenerClientesDireccion() {
/**
 * Al igual que el metodo anterior introducimos los datos en la clase Cliente con Direccion,
 * Todo metido en la clausula Try-catch para controlar los posibles errores que causan los ficheros
 */

        List<CLientesConDireccion> listaClientesDireccion=new ArrayList<>();
        int numeroCliente = 0;
        String nombre = "";
        String apellido1 = "";
        String apellido2 = "";
        int saldo = 0;
        int ingresosMedios = 0;
        int gastosMedios = 0;
        String direccion = "";
        int codPostal = 0;

        try {

            fichero = new FileReader("db.txt");
            br = new BufferedReader(fichero);
            linea = br.readLine();

            while (linea != null) {

                sc=new Scanner(linea);

                if (sc.hasNextInt()) {
                    numeroCliente = sc.nextInt();
                }
                if (sc.hasNext()) {
                    nombre = sc.next();
                }
                if (sc.hasNext()) {
                    apellido1 = sc.next();
                }
                if (sc.hasNext()) {
                    apellido2 = sc.next();
                }
                if (sc.hasNextInt()) {
                    saldo = sc.nextInt();
                }
                if (sc.hasNextInt()) {
                    ingresosMedios = sc.nextInt();
                }
                if (sc.hasNextInt()) {
                    gastosMedios = sc.nextInt();
                }
                if (sc.hasNext()) {
                    direccion = sc.next();
                }
                if (sc.hasNextInt()) {
                    codPostal = sc.nextInt();
                }


                listaClientesDireccion.add(new CLientesConDireccion(numeroCliente, nombre, apellido1, apellido2,
                        saldo, ingresosMedios, gastosMedios, direccion,codPostal));
                linea = br.readLine();
            }


        } catch (
                IOException ex) {
            System.out.println("Error general");
        } finally {
            try {
                fichero.close();
                br.close();
            } catch (IOException ex) {
                System.out.println("Error al cerrar el fichero");
            }
        }

        return listaClientesDireccion;
    }

    /**
     * Metodo para crear el fichero dependiendo del argumento introducido por paramentros, en el le indicamos el fichero
     * que queremos que lea
     * @param fichero
     */
    public static void obtenerClientes(String fichero){

        try {
            fis=new FileInputStream(fichero);
            ois=new ObjectInputStream(fis);
            aux=ois.readObject();

            while (aux!=null){
                System.out.println(aux);
                aux=ois.readObject();
            }

        } catch (FileNotFoundException e) {
            System.out.println("fichero no encontrado");
        } catch (IOException e) {
            System.out.println("Fin de fichero");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }



}
