package Modelo;

public class InfoTienda {

    String nombre = "AzzaaCar";
    String telefono = "8888-8888";
    String direccion = "Cartago, Cartago, Occidental";

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    @Override
    public String toString() {
        return "Configuracion{" + "nombre=" + nombre + ", telefono=" + telefono + ", direccion=" + direccion + '}';
    }

}
