/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thirdpartial;

/**
 *
 * @author justin
 */
public class ArbolBinario {
    static class Nodo {
        int valor;
        Nodo izq, der;
        Nodo(int v) { valor = v; }
    }

    Nodo raiz;

    void insertar(int v) {
        raiz = insertar(raiz, v);
    }

    Nodo insertar(Nodo n, int v) {
        if (n == null) return new Nodo(v);
        if (v < n.valor) n.izq = insertar(n.izq, v);
        else if (v > n.valor) n.der = insertar(n.der, v);
        return n;
    }

    boolean buscar(int v) {
        Nodo n = raiz;
        while (n != null) {
            System.out.println("Visitando: " + n.valor);
            if (v == n.valor) {
                System.out.println("Encontrado: " + v);
                return true;
            }
            n = (v < n.valor) ? n.izq : n.der;
        }
        System.out.println("No encontrado.");
        return false;
    }

    void inOrden() {
        inOrden(raiz);
        System.out.println();
    }

    void inOrden(Nodo n) {
        if (n == null) return;
        inOrden(n.izq);
        System.out.print(n.valor + " ");
        inOrden(n.der);
    }
}
