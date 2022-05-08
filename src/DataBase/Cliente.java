package DataBase;

import java.io.Serializable;

public class Cliente implements Serializable {

    private int numeroCliente;
    private String nombre;
    private String apellido1;
    private String getApellido2;
    private int saldo;
    private int ingresosMedios;
    private int gastosMedios;
    private String direccion;
    private int codPostal;

    public Cliente(int numeroCliente, String nombre, String apellido1, String getApellido2, int saldo, int ingresosMedios, int gastosMedios, String direccion, int codPostal) {
        this.numeroCliente = numeroCliente;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.getApellido2 = getApellido2;
        this.saldo = saldo;
        this.ingresosMedios = ingresosMedios;
        this.gastosMedios = gastosMedios;
        this.direccion = direccion;
        this.codPostal = codPostal;
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

    public String getGetApellido2() {
        return getApellido2;
    }

    public void setGetApellido2(String getApellido2) {
        this.getApellido2 = getApellido2;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCodPostal() {
        return codPostal;
    }

    public void setCodPostal(int codPostal) {
        this.codPostal = codPostal;
    }

    @Override
    public String toString() {
        return  "numeroCliente= " + numeroCliente +
                ", nombre= " + nombre +
                ", apellido1= " + apellido1 +
                ", getApellido2= " + getApellido2 +
                ", saldo= " + saldo +
                ", ingresosMedios= " + ingresosMedios +
                ", gastosMedios= " + gastosMedios +
                ", direccion= " + direccion +
                ", codPostal= " + codPostal;
    }


 /*   @Override
    public int compareTo(Object o) {
        int salida=-1;
        if (o instanceof Cliente){
            Cliente cliente=(Cliente) o;
           salida=this.numeroCliente.compareTo(CLiente )
        }
        return salida;
    }*/




}
