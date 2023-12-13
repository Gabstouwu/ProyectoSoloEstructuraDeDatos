package Controlador;

import Modelo.Nodo;
import java.util.Comparator;

public class Lista<T> {

    private Nodo<T> cabeza;
    private int size;

    public Lista() {
        this.cabeza = null;
        this.size = 0;
    }

    public boolean estaVacia() {
        return cabeza == null;
    }

    public int tamaño() {
        return size;
    }

    public void agregar(T dato) {
        Nodo<T> nuevoNodo = new Nodo<>(dato);
        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else {
            Nodo<T> actual = cabeza;
            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nuevoNodo);
        }
        size++;
    }

    public void imprimirLista() {
        Nodo<T> actual = cabeza;
        while (actual != null) {
            System.out.print(actual + " \n");
            actual = actual.getSiguiente();
        }
        System.out.println();
    }

    public Nodo<T> getCabeza() {
        return cabeza;
    }

    public Nodo<T> buscarEnLista(T datoBuscar, Comparator<T> comparador) { ///Nota: Se usa el :: para comparar los datos
        Nodo<T> actual = cabeza;                                           ///EJ: (clienteBuscar, Comparator.comparing(Cliente::getCedula)

        while (actual != null) {
            if (comparador.compare(actual.getDato(), datoBuscar) == 0) {
                //System.out.println("Elemento encontrado: " + actual);
                return actual;
            }
            //System.out.println("Elemento no encontrado.");
            actual = actual.getSiguiente();
        }
        return null;
    }

    public Nodo<T> obtenerNodoEnPosicion(int posicion) {
        if (posicion < 0 || posicion >= size) {
            throw new IllegalArgumentException("Posición inválida");
        }
        Nodo<T> actual = cabeza;
        int contador = 0;

        while (actual != null && contador < posicion) {
            actual = actual.getSiguiente();
            contador++;
        }
        return actual;
    }

    @Override
    public String toString() {
        String result = "";
        Nodo<T> actual = cabeza;
        while (actual != null) {
            result += actual + " ";
            actual = actual.getSiguiente();
        }
        return result;
    }
}
