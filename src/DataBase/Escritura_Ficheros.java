package DataBase;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

public class Escritura_Ficheros {

    public static ObjectOutputStream oos;
    public static FileOutputStream fos;

    public static void añadirClientesFichero(List<Cliente> listaClientes){

        try {
            fos=new FileOutputStream("ficheroCliente.dat");
            oos=new ObjectOutputStream(fos);

            for (int i = 0; i <listaClientes.size() ; i++) {
                oos.writeObject(listaClientes.get(i));
            }



        }catch (IOException ex){
            System.out.println("Error");
        }

    }
    public static void añadirClientesFicheroDireccion(List<CLientesConDireccion> listaClientes){

        try {
            fos=new FileOutputStream("ficheroCliente.dat");
            oos=new ObjectOutputStream(fos);

            for (int i = 0; i <listaClientes.size() ; i++) {
                oos.writeObject(listaClientes.get(i));
            }



        }catch (IOException ex){
            System.out.println("Error");
        }

    }

    public static void añadirSaldoCero(List<Cliente> listaClientes){

        try {
            fos=new FileOutputStream("ficheroClienteCero.dat");
            oos=new ObjectOutputStream(fos);

            for (int i = 0; i <listaClientes.size() ; i++) {
                if (listaClientes.get(i).getGastosMedios()-listaClientes.get(i).getIngresosMedios()==0)
                oos.writeObject(listaClientes.get(i));
            }
        }catch (IOException ex){
            System.out.println("Error");
        }finally {
            try {
             oos.close();
            } catch (IOException ex) {
                System.out.println("Error en el cierre del fichero de cliente 0 ");
            }
        }

    }
    public static void añadirSaldoCredito(List<Cliente> listaClientes){

        try {
            fos=new FileOutputStream("ficheroClienteCredito.dat");
            oos=new ObjectOutputStream(fos);

            for (int i = 0; i <listaClientes.size() ; i++) {
                if (listaClientes.get(i).getSaldo()>0)
                    oos.writeObject(listaClientes.get(i));
            }
        }catch (IOException ex){
            System.out.println("Error");
        }finally {
            try {
                oos.close();
            } catch (IOException ex) {
                System.out.println("Error en el cierre del fichero de cliente Credito ");
            }
        }

    }
    public static void añadirSaldoDebito(List<Cliente> listaClientes){

        try {
            fos=new FileOutputStream("ficheroClienteDebito.dat");
            oos=new ObjectOutputStream(fos);

            for (int i = 0; i <listaClientes.size() ; i++) {
                if (listaClientes.get(i).getSaldo()<0)
                    oos.writeObject(listaClientes.get(i));
            }
        }catch (IOException ex){
            System.out.println("Error");
        }finally {
            try {
                oos.close();
            } catch (IOException ex) {
                System.out.println("Error en el cierre del fichero de cliente Debito ");
            }
        }

    }
    public static void añadirClienteVip(List<Cliente> listaClientes){

        try {
            fos=new FileOutputStream("ficheroClienteVip.dat");
            oos=new ObjectOutputStream(fos);

            for (int i = 0; i <listaClientes.size() ; i++) {
                if (listaClientes.get(i).getSaldo()>0 && listaClientes.get(i).getIngresosMedios()>3000)
                    oos.writeObject(listaClientes.get(i));
            }
        }catch (IOException ex){
            System.out.println("Error");
        }finally {
            try {
                oos.close();
            } catch (IOException ex) {
                System.out.println("Error en el cierre del fichero de cliente Vips ");
            }
        }

    }
    public static void añadirClienteRobinson(List<Cliente> listaClientes){

        try {
            fos=new FileOutputStream("ficheroClienteRobinson.dat");
            oos=new ObjectOutputStream(fos);

            for (int i = 0; i <listaClientes.size() ; i++) {
                if (listaClientes.get(i).getSaldo()<0 && listaClientes.get(i).getGastosMedios()>3000)
                    oos.writeObject(listaClientes.get(i));
            }
        }catch (IOException ex){
            System.out.println("Error");
        }finally {
            try {
                oos.close();
            } catch (IOException ex) {
                System.out.println("Error en el cierre del fichero de cliente Robinson ");
            }
        }

    }

}
