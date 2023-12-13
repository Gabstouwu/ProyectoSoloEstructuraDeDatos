package Controlador;

import Modelo.Nodo;
import Modelo.Vehiculo;
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

}
