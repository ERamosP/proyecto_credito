package DataBase;

import java.io.Serializable;

public class Cliente implements Serializable, Comparable{

    private int numeroCliente;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private int saldo;
    private int ingresosMedios;
    private int gastosMedios;


    public Cliente(int numeroCliente, String nombre, String apellido1, String getApellido2, int saldo, int ingresosMedios,
                   int gastosMedios) {
        this.numeroCliente = numeroCliente;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = getApellido2;
        this.saldo = saldo;
        this.ingresosMedios = ingresosMedios;
        this.gastosMedios = gastosMedios;
    }

    public Cliente(){

    }

    public int getNumeroCliente() {
        return numeroCliente;
    }

    public void setNumeroCliente(int numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getIngresosMedios() {
        return ingresosMedios;
    }

    public void setIngresosMedios(int ingresosMedios) {
        this.ingresosMedios = ingresosMedios;
    }

    public int getGastosMedios() {
        return gastosMedios;
    }

    public void setGastosMedios(int gastosMedios) {
        this.gastosMedios = gastosMedios;
    }



    @Override
    public String toString() {
        return  "numeroCliente= " + numeroCliente +
                ", nombre= " + nombre +
                ", apellido1= " + apellido1 +
                ", getApellido2= " + apellido2 +
                ", saldo= " + saldo +
                ", ingresosMedios= " + ingresosMedios +
                ", gastosMedios= " + gastosMedios ;
    }

    /**
     * Para hacer un compreTo con un int es uno menos otro, si es un String es con compareTo
     * @param o the object to be compared.
     * @return
     */
    @Override
    public int compareTo(Object o) {
        int salida=-1;
        if (o instanceof Cliente){
            Cliente cliente=(Cliente) o;
           salida=this.numeroCliente-(cliente.numeroCliente);
        }
        return salida;
    }
}
