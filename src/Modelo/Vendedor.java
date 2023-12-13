package Modelo;

public class Vendedor {

    String nombre;
    String apellido;
    String identificacion;
    String correoE;
    String telefono;
    String password;
    int cantidadVendida = 0;
    int cantidadReservada = 0;

    public void incrementarReservasVendedor() {
        this.cantidadReservada++;
    }

    public void incrementarVentasVendedor() {
        this.cantidadVendida++;
    }

    public void disminuirReservasVendedor() {
        if (this.cantidadReservada > 0) {
            this.cantidadReservada--;
        }
    }

    public void disminuirVentasVendedor() {
        if (this.cantidadVendida > 0) {
            this.cantidadVendida--;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getCorreoE() {
        return correoE;
    }

    public void setCorreoE(String correoE) {
        this.correoE = correoE;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getCantidadVendida() {
        return cantidadVendida;
    }

    public void setCantidadVendida(int cantidadVendida) {
        this.cantidadVendida = cantidadVendida;
    }

    public int getCantidadReservada() {
        return cantidadReservada;
    }

    public void setCantidadReservada(int cantidadReservada) {
        this.cantidadReservada = cantidadReservada;
    }

    public Vendedor(String nombre, String apellido, String identificacion, String correoE, String telefono, String password) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.identificacion = identificacion;
        this.correoE = correoE;
        this.telefono = telefono;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Vendedor{" + "nombre=" + nombre + ", apellido=" + apellido + ", identificacion=" + identificacion + ", correoE=" + correoE + ", telefono=" + telefono + ", cantidadVendida=" + cantidadVendida + ", cantidadReservada=" + cantidadReservada + '}';
    }

}
