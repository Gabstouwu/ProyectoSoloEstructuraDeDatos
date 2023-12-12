package Modelo;

public class Cliente {

    String nombre;
    String apellido;
    int identificacion;
    String correoE;
    String Telefono;
    int cantidadComprada = 0;
    int cantidadReservada = 0;

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

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public String getCorreoE() {
        return correoE;
    }

    public void setCorreoE(String correoE) {
        this.correoE = correoE;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public int getCantidadComprada() {
        return cantidadComprada;
    }

    public void setCantidadComprada(int cantidadComprada) {
        this.cantidadComprada = cantidadComprada;
    }

    public int getCantidadReservada() {
        return cantidadReservada;
    }

    public void setCantidadReservada(int cantidadReservada) {
        this.cantidadReservada = cantidadReservada;
    }
 
    
    public Cliente(String nombre, String apellido, int identificacion, String correoE, String Telefono, int cantidadComprada, int cantidadReservada) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.identificacion = identificacion;
        this.correoE = correoE;
        this.Telefono = Telefono;
        this.cantidadComprada = 0;
        this.cantidadReservada = 0;       
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", apellido=" + apellido + ", identificacion=" + identificacion + ", correoE=" + correoE + ", Telefono=" + Telefono + ", cantidadComprada=" + cantidadComprada + ", cantidadReservada=" + cantidadReservada + '}';
    }
    
    

}
