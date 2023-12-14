package proyectosoloestructuradatos;

import Controlador.ControladorCliente;
import Controlador.ControladorVehiculo;
import Controlador.ControladorVendedor;
import Controlador.ControladorVentas;
import Controlador.Lista;
import Modelo.Cliente;
import Modelo.Vehiculo;
import Modelo.Vendedor;
import Vista.LogInPane;
import javax.swing.SwingUtilities;

public class Principal {
    

    
    public static Lista<Cliente> listaCliente = new Lista();
    public static Lista<Vehiculo> listaVehiculo = new Lista();
    public static Lista<Vendedor> listaEmpleados = new Lista();

    public static void main(String[] args) {
        
        
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new LogInPane();
            }
        });
        
        
        // Se leen los usuarios desde el archivo cuando el programa inicia
        ControladorVendedor.readVendedoresFromTextFile();

        ///Datos soldados
        Cliente persona = new Cliente("Gabriel", "Gutierrez", "1179000078", "gabriel@gmail.com", "87890330");
        Cliente persona2 = new Cliente("Luiz", "Ramirez", "88888888", "LuizR@gmail.com", "92890215");
        Cliente persona3 = new Cliente("a", "b", "001", "c", "d");
        Vendedor empleado1 = new Vendedor("Carmen", "Morazan", "789456123", "Carmen@Stallantis.com", "8789613", "sadaf2");
        Vehiculo vehiculo1 = new Vehiculo("JSJ420", "Rojo", "2018", "2500", "Toyota", "Ranger", "150000", "Rally", "cuatro puertas");
        Vehiculo vehiculo2 = new Vehiculo("123456", "Azul", "2020", "40000", "BMW", "Sport", "8000000", "City", "3 puertas");
        Vehiculo vehiculo3 = new Vehiculo("555", "Negro", "2000", "805000", "W", "S", "800", "City", "3 puertas");

        //Se crean las listas
        //---------------------------------------Clientes---------------------------------------
        ControladorVendedor.CrearEmpleado(empleado1);
        ControladorVendedor.buscarEmpleadoPorCedula("789456123");
        ControladorVendedor.ListarEmpleados();
        
//        //Se utilizan los metodo
//        System.out.println("-------Creacion clientes----------");
//        ControladorCliente.CrearCliente(persona);
//        ControladorCliente.CrearCliente(persona);
//        ControladorCliente.CrearCliente(persona2);
//
//        System.out.println("-------Buscar clientes----------");
//        ControladorCliente.BuscarCliente(persona3);
//        ControladorCliente.BuscarCliente(persona);
//        System.out.println("------------------------------------");
//
//        listaCliente.imprimirLista();
//
//        System.out.println("-------Edicion----------");
//        ControladorCliente.EditarCliente(persona2);
//        System.out.println("-------Empresion Lista Actualizada con el metodo del controlador clientes----------");
//        ControladorCliente.ListarClientes();
//
//        //---------------------------------------Vehiculos---------------------------------------
//        System.out.println("-------Creacion vehiculos----------");
//        ControladorVehiculo.CrearVehiculo(vehiculo1);
//        ControladorVehiculo.CrearVehiculo(vehiculo2);
//        ControladorVehiculo.CrearVehiculo(vehiculo3);
//
//        System.out.println("------------------------------------");
//
//        ControladorVehiculo.ListarVehiculos();
//
//        System.out.println("-------Buscar Vehiculos----------");
////        ControladorVehiculo.buscarVehiculoPorPlaca("123456");
//
//        System.out.println("-------Edicion----------");
//        //ControladorVehiculo.EditarVehiculo("123456");
//
//        System.out.println("-------Empresion Lista Actualizada con el metodo del controlador clientes----------");
//        ControladorVehiculo.ListarVehiculos();
//
//        System.out.println("-------Debug----------");
//        ControladorVehiculo.buscarVehiculoPorPlaca("MMM200");
//
//        System.out.println("-------Reserva----------");
//        ControladorVentas.reservarVehiculo("MMM200", "1179000078", "789456123");
//
//        System.out.println("-----------------Lista Vehiculos-------------------");
//        ControladorVehiculo.ListarVehiculos();
//
//        System.out.println("-------Venta----------");
//        ControladorVentas.venderVehiculo("555", "1179000078", "789456123");
//
//        System.out.println("-------------------CancelarVenta-----------------");
//        ControladorVentas.cancelarVenta("555");
//
//        System.out.println("-------------------Comprobar Edicion con if-----------------");
//        //ControladorVehiculo.EditarVehiculo("123456");
//
//        System.out.println("-------------------CancelarReserva-----------------");
//        ControladorVentas.cancelarReserva("555");
//
//        System.out.println("-------Empresion Lista empleados----------");
//        ControladorVendedor.ListarEmpleados();

    }

}
