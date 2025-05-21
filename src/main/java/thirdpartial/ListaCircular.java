/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thirdpartial;

/**
 *
 * @author justin
 */

public class ListaCircular {

    // Clase interna que representa un nodo de la lista
    static class Nodo {
        int dato;           // Valor que almacena el nodo
        Nodo siguiente;     // Referencia al siguiente nodo

        Nodo(int dato) {
            this.dato = dato;
            this.siguiente = null;
        }
    }

    private Nodo cabeza = null; // Primer nodo de la lista
    private Nodo cola = null;   // Último nodo de la lista

    // Método para agregar un nodo al final de la lista
    public void agregar(int dato) {
        Nodo nuevoNodo = new Nodo(dato); // Crear un nuevo nodo con el valor dado

        if (cabeza == null) {
            // Si la lista está vacía, el nuevo nodo es cabeza y cola
            cabeza = nuevoNodo;
            cola = nuevoNodo;
            cola.siguiente = cabeza; // Se apunta a sí misma para ser circular
        } else {
            // Si ya hay nodos, se enlaza el nuevo nodo al final
            cola.siguiente = nuevoNodo; // La cola apunta al nuevo nodo
            nuevoNodo.siguiente = cabeza; // El nuevo nodo apunta a la cabeza
            cola = nuevoNodo; // Actualizamos la cola al nuevo nodo
        }
    }

    // Método para mostrar los elementos de la lista circular
    public void mostrar() {
        if (cabeza == null) {
            System.out.println("La lista está vacía.");
            return;
        }

        Nodo actual = cabeza;

        // Recorremos la lista hasta volver al inicio
        do {
            System.out.print(actual.dato + " -> ");
            actual = actual.siguiente;
        } while (actual != cabeza);

        System.out.println("(regresa al inicio)");
    }
}
