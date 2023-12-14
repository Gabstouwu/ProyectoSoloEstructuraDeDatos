package Controlador;

import Modelo.Cliente;
import Modelo.Vehiculo;
import Modelo.Vendedor;
import Vista.DatosReserva;

public class ControladorVentas {

    public static void reservarVehiculo(DatosReserva datosReserva) {

        String placa = datosReserva.getPlaca();
        String cedulaCliente = datosReserva.getCliente();
        String cedulaVendedor = datosReserva.getEmpleado();

        Vehiculo vehiculoAReservar = ControladorVehiculo.buscarVehiculoPorPlaca(placa);
        Cliente confirmacionCliente = ControladorCliente.buscarClientePorCedula(cedulaCliente);
        Vendedor confirmacionVendedor = ControladorVendedor.buscarEmpleadoPorCedula(cedulaVendedor);

        if (vehiculoAReservar.getDisponibilidad() == Vehiculo.DISPONIBLE) {

            vehiculoAReservar.setCliente(confirmacionCliente);
            vehiculoAReservar.setVendedor(confirmacionVendedor);
            vehiculoAReservar.setDisponibilidad(Vehiculo.RESERVADO);
            confirmacionCliente.incrementarReservasCliente();
            confirmacionVendedor.incrementarReservasVendedor();

            System.out.println("Vehiculo reservado con exito.");
        } else {
            System.out.println("El vehiculo no está disponible para reservar.");
        }
    }

    public static void venderVehiculo(DatosReserva datosReserva) {

        String placa = datosReserva.getPlaca();
        String cedulaCliente = datosReserva.getCliente();
        String cedulaVendedor = datosReserva.getEmpleado();

        Vehiculo vehiculoAComprar = ControladorVehiculo.buscarVehiculoPorPlaca(placa);
        Cliente confirmacionCliente = ControladorCliente.buscarClientePorCedula(cedulaCliente);
        Vendedor confirmacionVendedor = ControladorVendedor.buscarEmpleadoPorCedula(cedulaVendedor);

        if (vehiculoAComprar.getDisponibilidad() == Vehiculo.DISPONIBLE) { //&& confirmacionCliente == confirmacionCliente) {
            vehiculoAComprar.setDisponibilidad(Vehiculo.VENDIDO);
            vehiculoAComprar.setVendedor(confirmacionVendedor);
            vehiculoAComprar.setCliente(confirmacionCliente);

            System.out.println("Vehiculo vendido con exito.");
            confirmacionCliente.incrementarComprasCliente();
            confirmacionVendedor.incrementarVentasVendedor();
        } else {
            System.out.println("No se puede vender el vehiculo. Verifica que este reservado por el cliente indicado.");
        }
    }

    public static void cancelarReserva(String placa) {

        Vehiculo vehiculoACancelar = ControladorVehiculo.buscarVehiculoPorPlaca(placa);

        if (vehiculoACancelar.getDisponibilidad() == Vehiculo.RESERVADO) {
            vehiculoACancelar.setCliente(null);
            vehiculoACancelar.setVendedor(null);
            vehiculoACancelar.setDisponibilidad(Vehiculo.DISPONIBLE);
            System.out.println("Reserva cancelada con exito. El vehiculo ahora está disponible.");
        } else {
            System.out.println("No se puede cancelar la reserva. El vehiculo no esta reservado.");
        }
    }

    public static void cancelarVenta(String placa) {

        Vehiculo vehiculoACancelar = ControladorVehiculo.buscarVehiculoPorPlaca(placa);

        if (vehiculoACancelar.getDisponibilidad() == Vehiculo.RESERVADO || vehiculoACancelar.getDisponibilidad() == Vehiculo.VENDIDO) {
            vehiculoACancelar.setCliente(null);
            vehiculoACancelar.setVendedor(null);
            vehiculoACancelar.setDisponibilidad(Vehiculo.DISPONIBLE);
            System.out.println("Venta cancelada con éxito. El vehículo ahora esta disponible.");
        } else {
            System.out.println("No se puede cancelar la reserva. El vehiculo no esta reservado.");
        }
    }

    private void verificarModificacionDespuesDeVenta(Vehiculo vereficar) {
        if (vereficar.getDisponibilidad() == Vehiculo.VENDIDO) {
            throw new UnsupportedOperationException("No se puede modificar un vehículo después de la venta.");
        }
    }

}
