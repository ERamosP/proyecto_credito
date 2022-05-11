package DataBase;

/**
 * Clase cliente con direccion para los clientes robinson o vips, extiende de la clase padre cliente e implementa dos
 * atributos nuevos como son la direccion y el codigo postal
 */
public class CLientesConDireccion extends Cliente{

    private String direccion;
    private int codPostal;

    public CLientesConDireccion(int numeroCliente, String nombre, String apellido1, String getApellido2, int saldo, int ingresosMedios,
                                int gastosMedios, String direccion, int codPostal) {
        super(numeroCliente, nombre, apellido1, getApellido2, saldo, ingresosMedios, gastosMedios);
        this.direccion = direccion;
        this.codPostal = codPostal;
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
        return  super.toString() + "direccion= " + direccion +
                ", codPostal= " + codPostal;
    }

}
