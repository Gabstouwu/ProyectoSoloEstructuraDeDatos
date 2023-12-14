/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

/**
 *
 * @author Gabriel
 */
public class DatosReserva {

    private String placa;
    private String cliente;
    private String empleado;

    public DatosReserva() {

    }

    
    public DatosReserva(String placa, String cliente, String empleado) {
        this.placa = placa;
        this.cliente = cliente;
        this.empleado = empleado;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getEmpleado() {
        return empleado;
    }

    public void setEmpleado(String empleado) {
        this.empleado = empleado;
    }

    public static DatosReserva crearDesdeStrings(String placa, String cliente, String empleado) {
        DatosReserva datosReserva = new DatosReserva();
        datosReserva.setPlaca(placa);
        datosReserva.setCliente(cliente);
        datosReserva.setEmpleado(empleado);
        return datosReserva;
    }

    @Override
    public String toString() {
        return "DatosReserva{" + "placa=" + placa + ", cliente=" + cliente + ", empleado=" + empleado + '}';
    }

}
