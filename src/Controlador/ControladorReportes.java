package Controlador;

import Modelo.Cliente;
import Modelo.Nodo;
import Modelo.Vehiculo;
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
