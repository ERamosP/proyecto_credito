package DataBase;

import java.io.*;
import java.util.Scanner;

public class Lectura_Ficheros {

    public static ObjectInputStream ois;
    public static FileInputStream fis;



  /*  public static void leer() throws FileNotFoundException {


        File pdf= new File("db.txt");
        Scanner sc=new Scanner(pdf);


                while (sc.hasNextLine())
                    System.out.println(sc.nextLine());

        }
       /* try{

            fis=new FileInputStream("db.txt");
            ois = new ObjectInputStream(fis);

            Object aux = ois.readObject();
            while (aux != null) {
                if (aux instanceof Cliente)
                    System.out.println(aux);
            }

        } catch (
                IOException ex) {
            System.out.println("Error general");
        } catch (ClassNotFoundException e) {
            System.out.println("Clase no encontrada");
        }finally{
            try {
                ois.close();
            }catch (IOException ex){
                System.out.println("Error al cerrar el fichero");
            }
        }*/


}
