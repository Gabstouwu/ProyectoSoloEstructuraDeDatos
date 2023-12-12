package Controlador;

import Modelo.Nodo;
import Modelo.Vehiculo;
import java.util.Comparator;
import proyectosoloestructuradatos.Principal;

public class ControladorVehiculo {

    public static void CrearVehiculo(Vehiculo nuevoVehiculo) {
        // Verificar si el vehiculo ya existe antes de agregarlo
        if (BuscarVehiculo(nuevoVehiculo) == null) {

            // El vehiculo no existe, entonces lo agregamos
            Principal.listaVehiculo.agregar(nuevoVehiculo);
            System.out.println("Se agrego el vehiculo exitosamente.");
        } else {
            System.out.println("El vehiculo ya existe, no se puede agregar.");
        }
    }

    private static String buscarVehiculoPorPlaca(String placa) {
        Lista<Vehiculo> listaVehiculos = Principal.listaVehiculo; 

        for (int i = 0; i < listaVehiculos.tamaño(); i++) {
            Nodo<Vehiculo> nodoVehiculo = listaVehiculos.obtenerNodoEnPosicion(i);
            Vehiculo vehiculo = nodoVehiculo.getDato();

            if (vehiculo.getPlacaVehiculo().equals(placa)) {
                
                System.out.println(vehiculo.getPlacaVehiculo());
                return vehiculo.getPlacaVehiculo(); // Se encontró el vehículo
            }
        }
        return null; // No se encontró el vehículo
    }

    public static Vehiculo BuscarVehiculo(Vehiculo vehiculoABuscar) {      
        Nodo<Vehiculo> nodoEncontrado = Principal.listaVehiculo.buscarEnLista(vehiculoABuscar, Comparator.comparing(Vehiculo::getPlacaVehiculo));

        if (nodoEncontrado != null) {
            System.out.println("Vehiculo encontrado: " + nodoEncontrado.getDato());
            return nodoEncontrado.getDato();
        } else {
            System.out.println("Vehiculo no encontrado.");
        }
        return null;
    }
    
    
//    public static Vehiculo BuscarVehiculoCompleto(String placa) {
//    String placaEncontrada = buscarVehiculoPorPlaca(placa);
//
//    if (placaEncontrada != null) {
//        Nodo <Vehiculo> vehiculoABuscar = new Vehiculo(placaEncontrada);
//        return BuscarVehiculo(d);
//    } else {
//        System.out.println("Vehiculo no encontrado.");
//        return null;
//    }
//}


    public static void EditarVehiculo(Vehiculo vehiculoAEditar) {

        // Solicitar al usuario que ingrese nuevos valores para cada atributo
        System.out.print("Nueva placa del vehículo: ");
        String nuevaPlaca = "MMM200";
        vehiculoAEditar.setPlacaVehiculo(nuevaPlaca);

        System.out.print("Nuevo color: ");
        String nuevoColor = "Cobre";
        vehiculoAEditar.setColor(nuevoColor);

        System.out.print("Nuevo año: ");
        String nuevoAnio = "2015";
        vehiculoAEditar.setYear(nuevoAnio);

        System.out.print("Nuevo cilindraje: ");
        String nuevoCilindraje = "850000";
        vehiculoAEditar.setCilindraje(nuevoCilindraje);

        System.out.print("Nueva marca: ");
        String nuevaMarca = "Mazda";
        vehiculoAEditar.setMarca(nuevaMarca);

        System.out.print("Nuevo modelo: ");
        String nuevoModelo = "C3";
        vehiculoAEditar.setModelo(nuevoModelo);

        System.out.print("Nuevo kilometraje: ");
        String nuevoKilometraje = "10";
        vehiculoAEditar.setKilometraje(nuevoKilometraje);

        System.out.print("Nuevo tipo: ");
        String nuevoTipo = "Rally";
        vehiculoAEditar.setTipo(nuevoTipo);

        System.out.print("Nuevas características: ");
        String nuevasCaracteristicas = "4 puertas, daño en la puerta";
        vehiculoAEditar.setCaracteristicas(nuevasCaracteristicas);

        System.out.println("Vehículo editado correctamente.");
    }

    public static void ListarVehiculos() {

        Principal.listaVehiculo.imprimirLista();

    }
}
