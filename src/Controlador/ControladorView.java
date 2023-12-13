package Controlador;

import Modelo.Vehiculo;
import Modelo.Vendedor;
import Vista.CreacionEmpleadoView;
import Vista.CreacionVehiculoView;
import javax.swing.JOptionPane;

public class ControladorView {
   
    ///------------Empleado
    public static Vendedor crearEmpleadoView() {
        CreacionEmpleadoView ventanaNuevoEmpleado = new CreacionEmpleadoView(); // nuevo jframe
        JOptionPane.showMessageDialog(null, ventanaNuevoEmpleado);
        Vendedor vendedorNuevo = ventanaNuevoEmpleado.crearObjetoEmpleado();
        System.out.println(vendedorNuevo.toString());
        return vendedorNuevo;
    }

    public static Vehiculo crearVehiculo() {
        CreacionVehiculoView ventanaVehiculo = new CreacionVehiculoView(); // nuevo jframe
        JOptionPane.showMessageDialog(null, ventanaVehiculo);
        Vehiculo nuevoVehiculo = ventanaVehiculo.crearObjetoVehiculo();
        return nuevoVehiculo;
    }
//
//    public static int eliminarVentaView() {
//        EliminarVentaView anularVenta = new EliminarVentaView();
//        JOptionPane.showMessageDialog(null, anularVenta);
//        int ventaAnulada = anularVenta.crearObjetoElimina();
//        System.out.println(ventaAnulada);
//        return ventaAnulada;
//    }
//    ///------------Cliente
//
//    public static Cliente crearClienteView() {
//        CreacionClienteView ventanaClientes = new CreacionClienteView(); // nuevo jframe
//        JOptionPane.showMessageDialog(null, ventanaClientes);
//        Cliente nuevoCliente = ventanaClientes.crearObjetoCliente();
//        //System.out.println(nuevoCliente.toString());
//        return nuevoCliente;
//    }
//
//    public static int eliminarCliente() {
//        EliminarClienteView anularCliente = new EliminarClienteView();
//        JOptionPane.showMessageDialog(null, anularCliente);
//        int clientAnulo = anularCliente.crearObjetoElimina();
//        System.out.println(clientAnulo);
//        return clientAnulo;
//    }
//
//    public static Cliente editarCliente() {
//        EdicionClienteView VentanaEdicionCliente = new EdicionClienteView();
//        JOptionPane.showMessageDialog(null, VentanaEdicionCliente);
//        Cliente nuevoEdicionCliente = VentanaEdicionCliente.editarObjetoCliente();
//
//        return nuevoEdicionCliente;
//    }
}
