package DataBase;

import java.io.*;
import java.util.Scanner;

public class Main_Proyecto {

    public static void main(String[] args) throws FileNotFoundException {

      //  Menu_Y_Otros.mostrarMenuPpal();

        File pdf= new File("bd.txt");
        Scanner sc=new Scanner(pdf);


        while (sc.hasNextLine())
            System.out.println(sc.nextLine());
    }
}
