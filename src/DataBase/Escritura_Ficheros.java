package DataBase;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Escritura_Ficheros {

    public static ObjectOutputStream oos;
    public static FileOutputStream fos;

    public static void escribir(){

        try {
            fos=new FileOutputStream("db.txt");
            oos=new ObjectOutputStream(fos);



        }catch (IOException ex){
            System.out.println("Error general");
        }finally {
            try {
                fos.close();
            }catch (IOException ex){
                System.out.println("error al cerrar el fichero");
            }
        }
    }

}
