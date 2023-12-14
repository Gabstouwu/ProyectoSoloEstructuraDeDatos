package Controlador;

import Modelo.Cliente;
import Modelo.Nodo;
import Modelo.Vehiculo;
import Modelo.Vendedor;
import java.util.Comparator;
import proyectosoloestructuradatos.Principal;

public class ControladorReportes {

    public static int obtenerCantidadAutosVendidos() {
        int cantidadVendidos = 0;
        Nodo<Vehiculo> actual = Principal.listaVehiculo.getCabeza();

        while (actual != null) {
            Vehiculo vehiculo = actual.getDato();
            if (vehiculo.getDisponibilidad() == Vehiculo.VENDIDO) {
                cantidadVendidos++;
            }
            actual = actual.getSiguiente();
        }
        return cantidadVendidos;
    }

    public static int obtenerCantidadAutosReservados() {
        int cantidadReservados = 0;
        Nodo<Vehiculo> actual = Principal.listaVehiculo.getCabeza();

        while (actual != null) {
            Vehiculo vehiculo = actual.getDato();
            if (vehiculo.getDisponibilidad() == Vehiculo.RESERVADO) {
                cantidadReservados++;
            }
            actual = actual.getSiguiente();
        }
        return cantidadReservados;
    }

    public static int obtenerCantidadAutosDisponibles() {
        int cantidadDisponibles = 0;
        Nodo<Vehiculo> actual = Principal.listaVehiculo.getCabeza();

        while (actual != null) {
            Vehiculo vehiculo = actual.getDato();
            if (vehiculo.getDisponibilidad() == Vehiculo.DISPONIBLE) {
                cantidadDisponibles++;
            }
            actual = actual.getSiguiente();
        }
        return cantidadDisponibles;
    }
    
    public static String obtenerReporteAutos() {
        int cantidadDisponibles = 0;
        int cantidadReservados = 0;
        int cantidadVendidos = 0;

        
        Nodo<Vehiculo> actual = Principal.listaVehiculo.getCabeza();

        while (actual != null) {
            Vehiculo vehiculo = actual.getDato();
            switch (vehiculo.getDisponibilidad()) {
                case Vehiculo.DISPONIBLE:
                    cantidadDisponibles++;
                    break;
                case Vehiculo.RESERVADO:
                    cantidadReservados++;
                    break;
                default:
                    //Vehiculo.VENDIDO
                    cantidadVendidos++;
                    break;
            }
            actual = actual.getSiguiente();
        }
        return "Vehiculos Disponibles" + cantidadDisponibles + "\nVehiculos Reservados" + cantidadReservados + "\nVehiculos Vendidos" + cantidadVendidos + "\n";
    }

    public static int obtenerCantidadClientesRegistrados() {
        return Principal.listaCliente.tamaño();
    }

    public static int obtenerCantidadClientesQueCompraron() {
        int cantidadComprada = 0;
        Nodo<Cliente> actual = Principal.listaCliente.getCabeza();

        while (actual != null) {
            Cliente cliente = actual.getDato();
            if (cliente.getCantidadComprada() != 0) {
                cantidadComprada++;
            }
            actual = actual.getSiguiente();
        }
        return cantidadComprada;
    }

    public static int obtenerCantidadClientesQueReservaron() {
        int cantidadReservada = 0;
        Nodo<Cliente> actual = Principal.listaCliente.getCabeza();

        while (actual != null) {
            Cliente cliente = actual.getDato();
            if (cliente.getCantidadReservada() != 0) {
                cantidadReservada++;
            }
            actual = actual.getSiguiente();
        }
        return cantidadReservada;
    }
    
    public static String reporteClientes(){
        String reporte = "Cantidad de clientes " + Principal.listaCliente.tamaño() +
                "\nCantidad de clientes que compraron " + obtenerCantidadClientesQueCompraron() +
                "\nCantidad de clientes que reservaron " + obtenerCantidadClientesQueReservaron();
        
        return reporte;
    }
    
    public static String reporteVentasVendedor(){
        String reporte = "";
        
        Vendedor empleadoEncontrado;
        Nodo<Vendedor> nodoEmpleado;
        
        for (int i = 0; i < Principal.listaEmpleados.tamaño(); i++) {
            nodoEmpleado = Principal.listaEmpleados.obtenerNodoEnPosicion(i);
            empleadoEncontrado = nodoEmpleado.getDato();
            reporte += empleadoEncontrado.getNombre() + " " + empleadoEncontrado.getApellido() + ": " + empleadoEncontrado.getCantidadVendida() + " vendidos\n";
            
        }
        return reporte;
    }
    
    public static String reporteReservasVendedor(){
        String reporte = "";
        
        Vendedor empleadoEncontrado;
        Nodo<Vendedor> nodoEmpleado;
        
        for (int i = 0; i < Principal.listaEmpleados.tamaño(); i++) {
            nodoEmpleado = Principal.listaEmpleados.obtenerNodoEnPosicion(i);
            empleadoEncontrado = nodoEmpleado.getDato();
            reporte += empleadoEncontrado.getNombre() + " " + empleadoEncontrado.getApellido() + ": " + empleadoEncontrado.getCantidadReservada()+ " reservados\n";
            
        }
        return reporte;
    }

//    public static Lista<Cliente> obtenerTop3ClientesQueMasCompraron() {
//        Nodo<Cliente> topClientes = Principal.listaCliente.getCabeza();
//
//        // Ordenar la lista de clientes según la cantidad comprada en orden descendente
//        topClientes.sort(Comparator.comparingInt(Cliente::getCantidadComprada).reversed());
//
//        // Tomar los primeros 3 clientes
//        int topCount = Math.min(topClientes.ta(), 3);
//        for (int i = 0; i < topCount; i++) {
//            topClientes.add(topClientes.get(i));
//        }
//
//        return topClientes;
//    }

}
