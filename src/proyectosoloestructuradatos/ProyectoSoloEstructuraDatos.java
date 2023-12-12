package proyectosoloestructuradatos;

import Controlador.Lista;
import Modelo.Cliente;

public class ProyectoSoloEstructuraDatos {

    public static void main(String[] args) {
        
        
        Lista<Cliente> nlista = new Lista();
        Cliente persona = new Cliente("Gabriel", "Gutierrez", 117900078, "gabriel@gmail.com", "87890330");
        nlista.agregar(persona);
        
        nlista.imprimirLista();
    }
    
}
