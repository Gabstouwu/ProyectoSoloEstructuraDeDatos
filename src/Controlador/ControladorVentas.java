package Controlador;

import Modelo.Cliente;
import Modelo.Vehiculo;
import static Modelo.Vehiculo.DISPONIBLE;
import static Modelo.Vehiculo.RESERVADO;
import static Modelo.Vehiculo.VENDIDO;
import Modelo.Vendedor;

public class ControladorVentas {

    public void reservarVehiculo(Vehiculo vehiculoAReservar, Cliente cliente, Vendedor vendedor) {
        if (vehiculoAReservar.getDisponibilidad() == Vehiculo.DISPONIBLE) {
            vehiculoAReservar.setCliente(cliente);
            vehiculoAReservar.setVendedor(vendedor);
            vehiculoAReservar.setDisponibilidad(Vehiculo.RESERVADO);
            System.out.println("Vehículo reservado con éxito.");
        } else {
            System.out.println("El vehículo no está disponible para reservar.");
        }
    }
//        if (vehiculoAComprar.getDisponibilidad() == RESERVADO && clienteCompro.equals(clienteCompro)) {

    public void venderVehiculo(Vehiculo vehiculoAComprar, Cliente clienteCompro, Vendedor vendedorCompra) {

        Cliente confirmacionCliente = ControladorCliente.BuscarCliente(clienteCompro);

        if (vehiculoAComprar.getDisponibilidad() == RESERVADO && clienteCompro == confirmacionCliente) {
            vehiculoAComprar.setDisponibilidad(Vehiculo.VENDIDO);
            System.out.println("Vehículo vendido con éxito.");
        } else {
            System.out.println("No se puede vender el vehículo. Verifica que esté reservado por el cliente indicado.");
        }
    }

    public void cancelarReserva(Vehiculo vehiculoCancelar) {
        if (vehiculoCancelar.getDisponibilidad() == RESERVADO) {
            vehiculoCancelar.setCliente(null);
            vehiculoCancelar.setVendedor(null);
            vehiculoCancelar.setDisponibilidad(DISPONIBLE);
            System.out.println("Reserva cancelada con éxito. El vehículo ahora está disponible.");
        } else {
            System.out.println("No se puede cancelar la reserva. El vehículo no está reservado.");
        }
    }

    private void verificarModificacionDespuesDeVenta(Vehiculo vereficar) {
        if (vereficar.getDisponibilidad() == VENDIDO) {
            throw new UnsupportedOperationException("No se puede modificar un vehículo después de la venta.");
        }
    }

}
