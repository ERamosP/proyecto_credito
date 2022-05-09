package DataBase;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
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
 * creamos las variables con los nombres que tenemos en la clase Cliente, para que a cada iteracion de la clase
 * Scanner introduzca el valor de cada campo en la variable correspondiente. En el while lo que hacemos
 * es que mientras que la linea sea distinta de null, la lea y si, es un entero hasta el espacio lo almacene en la variable creada
 * para cada caso. En el ArrayList introducimos los valores de cada iteracion,
 */
        List<Cliente> listaClientes = new ArrayList<>();
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

                listaClientes.add(new Cliente(numeroCliente, nombre, apellido1, apellido2, saldo, ingresosMedios, gastosMedios, direccion, codPostal));
                linea = br.readLine();
            }


        } catch (
                IOException ex) {
            System.out.println("Error general");
        } finally {
            try {
                br.close();
            } catch (IOException ex) {
                System.out.println("Error al cerrar el fichero");
            }
        }

        return listaClientes;
    }

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
            System.out.println("error");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }


}
