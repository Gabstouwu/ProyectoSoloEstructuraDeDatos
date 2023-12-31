package Modelo;

public class Vehiculo {

    //Se definen las constantes para evitar usar un valor tipo string o boolean
    public static final int DISPONIBLE = 1;
    public static final int RESERVADO = 2;
    public static final int VENDIDO = 3;

    private String placaVehiculo;
    private String color;
    private String year;
    private String cilindraje;
    private String marca;
    private String modelo;
    private String kilometraje;
    private String tipo;
    private String caracteristicas;
    private int disponibilidad;
    private Cliente cliente;
    private Vendedor vendedor;

    public String getPlacaVehiculo() {
        return placaVehiculo;
    }

    public void setPlacaVehiculo(String placaVehiculo) {
        this.placaVehiculo = placaVehiculo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(String cilindraje) {
        this.cilindraje = cilindraje;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(String kilometraje) {
        this.kilometraje = kilometraje;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public int getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(int disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public Vehiculo(String placaVehiculo, String color, String year, String cilindraje, String marca, String modelo, String kilometraje, String tipo, String caracteristicas) {
        this.placaVehiculo = placaVehiculo;
        this.color = color;
        this.year = year;
        this.cilindraje = cilindraje;
        this.marca = marca;
        this.modelo = modelo;
        this.kilometraje = kilometraje;
        this.tipo = tipo;
        this.caracteristicas = caracteristicas;
        this.disponibilidad = Vehiculo.DISPONIBLE;
        this.cliente = null;
        this.vendedor = null;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "placaVehiculo=" + placaVehiculo + ", color=" + color + ", year=" + year + ", cilindraje=" + cilindraje + ", marca=" + marca + ", modelo=" + modelo + ", kilometraje=" + kilometraje + ", tipo=" + tipo + ", caracteristicas=" + caracteristicas + ", disponibilidad=" + disponibilidad + ", cliente=" + cliente + ", vendedor=" + vendedor + '}';
    }

}
