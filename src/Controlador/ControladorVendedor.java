package Controlador;

import Modelo.Cliente;
import Modelo.Nodo;
import Modelo.Vendedor;
import java.util.Comparator;
import proyectosoloestructuradatos.Principal;

public class ControladorVendedor {

    public static void CrearEmpleado(Vendedor nuevoEmpleado) {
        // Verificar si el cliente ya existe antes de agregarlo
        if (BuscarEmpleado(nuevoEmpleado) == null) {
            // El cliente no existe, entonces lo agregamos
            Principal.listaEmpleados.agregar(nuevoEmpleado);
            System.out.println("Se agrego exitosamente.");
        } else {
            System.out.println("El empleado ya existe, no se puede agregar.");
        }
    }

    public static Vendedor BuscarEmpleado(Vendedor empleadoABuscar) {

        Nodo<Vendedor> nodoEncontrado = Principal.listaEmpleados.buscarEnLista(empleadoABuscar, Comparator.comparing(Vendedor::getIdentificacion));
        //a.imprimirLista();
        if (nodoEncontrado != null) {
            System.out.println("Empleado encontrado: " + nodoEncontrado.getDato());
            return nodoEncontrado.getDato();
        } else {
            System.out.println("Empleado no encontrado.");
        }
        return null;
    }

    public static void EditarEmpleado(Vendedor empleadoAEditar) {

        // Solicitar al usuario que ingrese nuevos valores para cada atributo
        System.out.print("Nuevo nombre: ");
        String nuevoNombre = "Maria";
        empleadoAEditar.setNombre(nuevoNombre);

        System.out.print("Nuevo apellido: ");
        String nuevoApellido = "Fernandez";
        empleadoAEditar.setApellido(nuevoApellido);

        System.out.print("Nueva identificacion: ");
        String nuevaIdentificacion = "123456";
        empleadoAEditar.setIdentificacion(nuevaIdentificacion);

        System.out.print("Nuevo correo electronico: ");
        String nuevoCorreo = "maria@outlook";
        empleadoAEditar.setCorreoE(nuevoCorreo);

        System.out.print("Nuevo numero de telefono: ");
        String nuevoTelefono = "87890993";
        empleadoAEditar.setTelefono(nuevoTelefono);

        System.out.print("Nueva contrasena de telefono: ");
        String nuevaPassword = "aaa";
        empleadoAEditar.setPassword(nuevaPassword);

        System.out.println("Cliente editado correctamente.");
    }

    public static Vendedor buscarEmpleadoPorCedula(String cedula) {
        Lista<Vendedor> listaEmpleados = Principal.listaEmpleados;

        for (int i = 0; i < listaEmpleados.tamaño(); i++) {
            Nodo<Vendedor> nodoEmpleado = listaEmpleados.obtenerNodoEnPosicion(i);
            Vendedor empleadoEncontrado = nodoEmpleado.getDato();

            if (empleadoEncontrado.getIdentificacion().equals(cedula)) {

                System.out.println(empleadoEncontrado);
                return empleadoEncontrado; // Se encontró el vehículo
            }
        }
        return null; // No se encontró el vehículo
    }

    public static void ListarEmpleados() {

        Principal.listaEmpleados.imprimirLista();

    }

}
