package Controlador;

import Modelo.Cliente;
import Modelo.Nodo;
import java.util.Comparator;
import proyectosoloestructuradatos.Principal;

public class ControladorCliente {

    public static void CrearCliente(Cliente nuevoCliente) {
        // Verificar si el cliente ya existe antes de agregarlo
        if (BuscarCliente(nuevoCliente) == null) {
            // El cliente no existe, entonces lo agregamos
            Principal.listaCliente.agregar(nuevoCliente);
            System.out.println("Se agrego exitosamente.");
        } else {
            System.out.println("El cliente ya existe, no se puede agregar.");
        }
    }

    public static Cliente BuscarCliente(Cliente clienteABuscar) {

        Nodo<Cliente> nodoEncontrado = Principal.listaCliente.buscarEnLista(clienteABuscar, Comparator.comparing(Cliente::getIdentificacion));
        //a.imprimirLista();
        if (nodoEncontrado != null) {
            System.out.println("Cliente encontrado: " + nodoEncontrado.getDato());
            return nodoEncontrado.getDato();
        } else {
            System.out.println("Cliente no encontrado.");
        }
        return null;
    }

    public static void EditarCliente(Cliente clienteAEditar) {

        // Solicitar al usuario que ingrese nuevos valores para cada atributo
        System.out.print("Nuevo nombre: ");
        String nuevoNombre = "Maria";
        clienteAEditar.setNombre(nuevoNombre);

        System.out.print("Nuevo apellido: ");
        String nuevoApellido = "Fernandez";
        clienteAEditar.setApellido(nuevoApellido);

        System.out.print("Nueva identificacion: ");
        int nuevaIdentificacion = 123;
        clienteAEditar.setIdentificacion(nuevaIdentificacion);

        System.out.print("Nuevo correo electronico: ");
        String nuevoCorreo = "maria@outlook";
        clienteAEditar.setCorreoE(nuevoCorreo);

        System.out.print("Nuevo numero de telefono: ");
        String nuevoTelefono = "87890993";
        clienteAEditar.setTelefono(nuevoTelefono);

        System.out.println("Cliente editado correctamente.");
    }
    
    public static void ListarClientes(){
    
        Principal.listaCliente.imprimirLista();
  
    }
    
}
