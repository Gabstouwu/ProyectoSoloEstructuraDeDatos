package Controlador;

import Modelo.Cliente;
import Modelo.Vehiculo;
import Modelo.Vendedor;

public class ControladorVentas {

    public static void reservarVehiculo(String placa, Cliente cliente, Vendedor vendedor) {

        Vehiculo vehiculoAReservar = ControladorVehiculo.buscarVehiculoPorPlaca(placa);

        if (vehiculoAReservar.getDisponibilidad() == Vehiculo.DISPONIBLE) {

            vehiculoAReservar.setCliente(cliente);
            vehiculoAReservar.setVendedor(vendedor);
            vehiculoAReservar.setDisponibilidad(Vehiculo.RESERVADO);
            cliente.incrementarReservasCliente();
            vendedor.incrementarReservasVendedor();

            System.out.println("Vehiculo reservado con exito.");
        } else {
            System.out.println("El vehiculo no está disponible para reservar.");
        }
    }

    public static void venderVehiculo(String placa, String cedulaCliente, String cedulaVendedor) {

        Vehiculo vehiculoAComprar = ControladorVehiculo.buscarVehiculoPorPlaca(placa);
        Cliente confirmacionCliente = ControladorCliente.buscarClientePorCedula(cedulaCliente);
        Vendedor confirmacionVendedor = ControladorVendedor.buscarEmpleadoPorCedula(cedulaVendedor);
        
        if (vehiculoAComprar.getDisponibilidad() == Vehiculo.DISPONIBLE){ //&& confirmacionCliente == confirmacionCliente) {
            vehiculoAComprar.setDisponibilidad(Vehiculo.VENDIDO);
            System.out.println("Vehiculo vendido con exito.");  
            confirmacionCliente.incrementarComprasCliente();
            confirmacionVendedor.incrementarVentasVendedor();
        } else {
            System.out.println("No se puede vender el vehiculo. Verifica que este reservado por el cliente indicado.");
        }
    }

    public void cancelarReserva(Vehiculo vehiculoCancelar) {
        if (vehiculoCancelar.getDisponibilidad() == Vehiculo.RESERVADO) {
            vehiculoCancelar.setCliente(null);
            vehiculoCancelar.setVendedor(null);
            vehiculoCancelar.setDisponibilidad(Vehiculo.DISPONIBLE);
            System.out.println("Reserva cancelada con éxito. El vehículo ahora está disponible.");
        } else {
            System.out.println("No se puede cancelar la reserva. El vehículo no está reservado.");
        }
    }

    private void verificarModificacionDespuesDeVenta(Vehiculo vereficar) {
        if (vereficar.getDisponibilidad() == Vehiculo.VENDIDO) {
            throw new UnsupportedOperationException("No se puede modificar un vehículo después de la venta.");
        }
    }

}
