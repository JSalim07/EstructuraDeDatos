/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thirdpartial;

/**
 *
 * @author justin
 */
// Clase que implementa una Lista Doblemente Enlazada
public class ListaDoblementeEnlazada {

    // Nodo de la lista
    private static class Nodo {
        int dato;
        Nodo anterior;
        Nodo siguiente;

        Nodo(int dato) {
            this.dato = dato;
        }
    }

    private Nodo cabeza; // Inicio de la lista
    private Nodo cola;   // Fin de la lista

    // Constructor
    public ListaDoblementeEnlazada() {
        cabeza = null;
        cola = null;
    }

    // Agrega al final
    public void agregarAlFinal(int dato) {
        Nodo nuevo = new Nodo(dato);

        if (cabeza == null) {
            cabeza = cola = nuevo;
        } else {
            cola.siguiente = nuevo;
            nuevo.anterior = cola;
            cola = nuevo;
        }
    }

    // Agrega al inicio
    public void agregarAlInicio(int dato) {
        Nodo nuevo = new Nodo(dato);

        if (cabeza == null) {
            cabeza = cola = nuevo;
        } else {
            nuevo.siguiente = cabeza;
            cabeza.anterior = nuevo;
            cabeza = nuevo;
        }
    }

    // Elimina el primer nodo con el valor indicado
    public void eliminar(int dato) {
        Nodo actual = cabeza;

        while (actual != null) {
            if (actual.dato == dato) {
                if (actual.anterior != null) {
                    actual.anterior.siguiente = actual.siguiente;
                } else {
                    cabeza = actual.siguiente;
                }

                if (actual.siguiente != null) {
                    actual.siguiente.anterior = actual.anterior;
                } else {
                    cola = actual.anterior;
                }

                System.out.println("Nodo " + dato + " eliminado.");
                return;
            }
            actual = actual.siguiente;
        }

        System.out.println("Nodo " + dato + " no encontrado.");
    }

    // Muestra la lista de inicio a fin
    public void mostrarAdelante() {
        System.out.print("Inicio → Fin: ");
        Nodo actual = cabeza;
        while (actual != null) {
            System.out.print(actual.dato + " ");
            actual = actual.siguiente;
        }
        System.out.println();
    }

    // Muestra la lista de fin a inicio
    public void mostrarAtras() {
        System.out.print("Fin → Inicio: ");
        Nodo actual = cola;
        while (actual != null) {
            System.out.print(actual.dato + " ");
            actual = actual.anterior;
        }
        System.out.println();
    }
}
