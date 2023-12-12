package Controlador;

import Modelo.Nodo;

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
            System.out.print(actual + " ");
            actual = actual.getSiguiente();
        }
        System.out.println();
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
