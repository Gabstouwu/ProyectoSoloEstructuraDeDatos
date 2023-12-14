package Controlador;

import Modelo.Cliente;
import Modelo.Vehiculo;
import Modelo.Vendedor;
import Vista.BuscarClienteView;
import Vista.BuscarVehiculoView;
import Vista.CreacionClienteView;
import Vista.CreacionEmpleadoView;
import Vista.CreacionVehiculoView;
import Vista.CreacionReservaView;
import Vista.CreacionVentasView;
import Vista.DatosReserva;
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

    public static String buscarVehiculoView() {
        BuscarVehiculoView buscar = new BuscarVehiculoView();
        JOptionPane.showMessageDialog(null, buscar);
        String ventaAnulada = buscar.crearObjetoBuscarVehiculo();
        System.out.println(ventaAnulada);
        return ventaAnulada;
    }

    public static Cliente crearClienteView() {
        CreacionClienteView ventanaNuevoCliente = new CreacionClienteView(); // nuevo jframe
        JOptionPane.showMessageDialog(null, ventanaNuevoCliente);
        Cliente clienteNuevo = ventanaNuevoCliente.crearObjetoCliente();
        System.out.println(clienteNuevo.toString());
        return clienteNuevo;
    }

    public static String buscarClienteView() {
        BuscarClienteView buscar = new BuscarClienteView();
        JOptionPane.showMessageDialog(null, buscar);
        String cliente = buscar.crearObjetoBuscarCliente();
        System.out.println(cliente);
        return cliente;
    }

    public static DatosReserva crearReservaView() {
        CreacionReservaView ventanaNuevaReserva = new CreacionReservaView(); // nuevo jframe
        JOptionPane.showMessageDialog(null, ventanaNuevaReserva);
        DatosReserva clienteNuevo = ventanaNuevaReserva.crearObjetoVenta();
        System.out.println(clienteNuevo.toString());
        return clienteNuevo;
    }

    public static String cancelarReservaView() {
        BuscarClienteView buscar = new BuscarClienteView();
        JOptionPane.showMessageDialog(null, buscar);
        String cliente = buscar.crearObjetoBuscarCliente();
        System.out.println(cliente);
        return cliente;
    }

    public static DatosReserva crearVentaView() {
        CreacionVentasView ventanaNuevaVenta = new CreacionVentasView(); // nuevo jframe
        JOptionPane.showMessageDialog(null, ventanaNuevaVenta);
        DatosReserva ventaNuevo = ventanaNuevaVenta.crearObjetoVenta();
        System.out.println(ventaNuevo.toString());
        return ventaNuevo;
    }

    public static String cancelarVentaView() {
        BuscarClienteView buscarV = new BuscarClienteView();
        JOptionPane.showMessageDialog(null, buscarV);
        String cancelar = buscarV.crearObjetoBuscarCliente();
        System.out.println(cancelar);
        return cancelar;
    }
}
