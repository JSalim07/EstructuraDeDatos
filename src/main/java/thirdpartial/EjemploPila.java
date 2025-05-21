/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thirdpartial;

/**
 *
 * @author justin
 */


import java.util.Stack;

public class EjemploPila {

    Stack<String> pila;

    public EjemploPila() {
        this.pila = new Stack<>();
    }

    public void agregar(String cliente) {
        pila.push(cliente);
        System.out.println("Agregado: " + cliente);
    }

    public void cima() {
        if (!pila.isEmpty()) {
            System.out.println("En la cima: " + pila.peek());
        } else {
            System.out.println("La pila está vacía");
        }
    }

    public void eliminar() {
        if (!pila.isEmpty()) {
            System.out.println("Eliminado: " + pila.pop());
        } else {
            System.out.println("No hay elementos para eliminar");
        }
    }

    public void estadoFinal() {
        if (!pila.isEmpty()) {
            System.out.println("Cima actual: " + pila.peek());
        } else {
            System.out.println("La pila está vacía");
        }
    }
}

