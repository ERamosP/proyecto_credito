package DataBase;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

/**
 * Creamos la clase escritura de fichero para poder escribir un fichero diferente para cada tipo de cliente,
 * teniendo en cuenta lo que el ejercicio nos pedia.
 * Usamos la clase ObjectOutputStream para porder hacer la escritura de ficheros de clases a la que previamente hay
 * que declararle un FileOutputStream para indicarle la ruta que ha de seguir para poder escribir en el archivo indicado,
 * si no existira, como es el caso, crea un nuevo fichero con el nombre dado en el constructor y con el formato indicado, en este caso
 * .dat ya que son datos
 */
public class Escritura_Ficheros {
    /**
     *  Declaramos fuera de los metodos las clases por si las vamos a reutilizar. En este caso, trabajaremos varias veces
     *   con ellas.
     */
    public static ObjectOutputStream oos;
    public static FileOutputStream fos;

    /**
     * Iniciamos las clases dentro de los metodos en un try-catch, ya que es obligatorio debido a los errores
     * que pueden generar dichos ficheros. Al iniciarlas el obligatorio cerrar el flujo que generan, de ahi que utilicemos la
     * el metodo.close para cerrarlos
     * A traves de un bucle for,
     * @param listaClientes
     */
    public static void añadirClientesFichero(List<Cliente> listaClientes){

        try {
            fos=new FileOutputStream("ficheroCliente.dat");
            oos=new ObjectOutputStream(fos);

            for (int i = 0; i <listaClientes.size() ; i++) {
                oos.writeObject(listaClientes.get(i));
            }

            fos.close();
            oos.close();

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

    /**
     * creamos el archivo de los clientes que tienen saldo cero
     * @param listaClientes como parametros le pasamos el array de la lista de clientes sin direccion
     */
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

    /**
     * Creamos el fichero para los clientes a credito que son aquellos cuyo monto es positivo
     * @param listaClientes le pasamos como parametro el array de la lista clientes sin direccion
     */
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

    /**
     * Creamos el fichero de los clientes con monto negativo
     * @param listaClientes le pasamos por parametros el array de la lista de clientes sin direccion
     */
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

    /**
     * Creamos el fichero de los clientes que son Vip
     * @param listaClientes le pasamos como parametro la lista de clientes que tienen direccion
     */
    public static void añadirClienteVip(List<CLientesConDireccion> listaClientes){

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

    /**
     * Creamos el fichero de los clientes que son robinson
     * @param listaClientes le pasamos por paramentros los clientes que tienen direccion
     */
    public static void añadirClienteRobinson(List<CLientesConDireccion> listaClientes){

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
