package DataBase;

import java.io.*;
import java.util.List;
import java.util.Scanner;

public class Main_Proyecto {

    public static void main(String[] args) throws FileNotFoundException {

        Escritura_Ficheros.añadirSaldoCero(Lectura_Ficheros.obtenerClientes());
        Menu_Y_Otros.mostrarMenuPpal();
     //   System.out.println(Lectura_Ficheros.obtenerClientes());


        Escritura_Ficheros.añadirSaldoCredito(Lectura_Ficheros.obtenerClientes());
        Escritura_Ficheros.añadirSaldoDebito(Lectura_Ficheros.obtenerClientes());
        Escritura_Ficheros.añadirClienteVip(Lectura_Ficheros.obtenerClientes());
        Escritura_Ficheros.añadirClienteRobinson(Lectura_Ficheros.obtenerClientes());
  //      Lectura_Ficheros.obtenerClientes("ficheroClienteCero.dat");
   //  Lectura_Ficheros.obtenerClientes("ficheroClienteCredito.dat");
     // Lectura_Ficheros.obtenerClientes("ficheroClienteDebito.dat");
  //      Lectura_Ficheros.obtenerClientes("ficheroClienteVip.dat");
   //     Lectura_Ficheros.obtenerClientes("ficheroClienteRobinson.dat");
    }
}
