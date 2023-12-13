package Controlador;

import Modelo.Vehiculo;
import proyectosoloestructuradatos.Principal;

public class ControladorReportes {

    public static int obtenerCantidadAutosVendidos() {
        int cantidadVendidos = 0;
        for (int i = 0; i < Principal.listaVehiculo.tamaño(); i++) {
            Vehiculo vehiculo = Principal.listaVehiculo.get(i);
            if (vehiculo.getDisponibilidad() == Vehiculo.VENDIDO) {
                cantidadVendidos++;
            }
        }
        return cantidadVendidos;
    }

    public static int obtenerCantidadAutosReservados() {
        int cantidadReservados = 0;
        for (int i = 0; i < Principal.listaVehiculo.tamaño(); i++) {
            Vehiculo vehiculo = Principal.listaVehiculo.get(i);
            if (vehiculo.getDisponibilidad() == Vehiculo.RESERVADO) {
                cantidadReservados++;
            }
        }
        return cantidadReservados;
    }

    public static int obtenerCantidadAutosDisponibles() {
        int cantidadDisponibles = 0;
        for (int i = 0; i < Principal.listaVehiculo.tamaño(); i++) {
            Vehiculo vehiculo = Principal.listaVehiculo.get(i);
            if (vehiculo.getDisponibilidad() == Vehiculo.DISPONIBLE) {
                cantidadDisponibles++;
            }
        }
        return cantidadDisponibles;
    }
}