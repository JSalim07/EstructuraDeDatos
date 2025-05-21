/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thirdpartial;



/**
 *
 * @author justin
 */

public class ThirdPartialMain {

    public static void main(String[] args) {
        // Ejecutar prueba de la lista circular
        probarPila();
        probarCola();
        probarListaEnlazadaSimple();
        probarListaCircular();
        probarListaDoblementeEnlazada();
        probarArbolBinario();
        probarGrafo();
        
        // Aquí puedes llamar otras clases o métodos de prueba
        // por ejemplo: probarArbolBinario(); o probarOrdenamiento();
    }

    public static void probarCola() {
    System.out.println("=== Prueba de Cola ===\n");
    
    EjemploCola impresora = new EjemploCola();

        impresora.agregarDocumento("Documento A");
        impresora.agregarDocumento("Documento B");
        impresora.agregarDocumento("Documento C");

        impresora.verDocumentoFrente();     // Consulta el primero sin eliminar
        impresora.imprimirDocumento();      // Imprime el primero
        impresora.imprimirDocumento();      // Imprime el siguiente
        impresora.verDocumentoFrente();     // Consulta el que queda
        
        System.out.println();
    }
    
    public static void probarPila() {
        System.out.println("=== Prueba de Pila ===\n");
        
        EjemploPila pila = new EjemploPila();

        pila.agregar("Cliente A");
        pila.agregar("Cliente B");
        pila.agregar("Cliente C");

        pila.cima();
        pila.eliminar();
        pila.eliminar();
        pila.estadoFinal();
        
        System.out.println();
    }
    
    public static void probarListaEnlazadaSimple(){
        System.out.println("=== Prueba de Lista Simplemente Enlazada ===\n");
        
        SinglyLinkedList list = new SinglyLinkedList();

        list.insert(10);
        list.insert(20);
        list.insert(30);

        System.out.println("List:");
        list.display();

        System.out.println("Is 20 in the list? " + list.search(20));

        list.delete(20);

        System.out.println("After deleting 20:");
        list.display();
    }

    public static void probarListaCircular() {
        System.out.println("=== Prueba de Lista Circular ===\n");

        ListaCircular lista = new ListaCircular();

        lista.agregar(10);
        lista.agregar(20);
        lista.agregar(30);
        lista.agregar(40);

        lista.mostrar();
    }
        

    public static void probarListaDoblementeEnlazada() {
        System.out.println("\n=== Prueba de Lista Doblemente Enlazada ===");
        
        ListaDoblementeEnlazada lista = new ListaDoblementeEnlazada();

        lista.agregarAlInicio(10);
        lista.agregarAlFinal(20);
        lista.agregarAlFinal(30);
        lista.agregarAlFinal(40);

        System.out.println("\nContenido de la lista doblemente enlazada:");
        lista.mostrarAdelante();  // Salida esperada: 10 20 30 40
        lista.mostrarAtras();     // Salida esperada: 40 30 20 10

        lista.eliminar(30);
        System.out.println("Después de eliminar 30:");
        lista.mostrarAdelante();  // Salida esperada: 10 20 40
        
        System.out.println();
    }
    public static void probarArbolBinario() {
        System.out.println("\n=== Prueba de Busqueda en Arbol Binario ===");
        
        ArbolBinario a = new ArbolBinario();
        for (int v : new int[]{8, 3, 10, 1, 6, 14, 4, 7, 13}) a.insertar(v);

        System.out.println("Inorden:");
        a.inOrden();

        System.out.println("\nBuscar 7:");
        a.buscar(7);

        System.out.println("\nBuscar 2:");
        a.buscar(2);
    }
    
    public static void probarGrafo() {
        System.out.println("\n=== Prueba de Red Grafo ===\n");
        
        RedGrafo grafo = new RedGrafo();

        // Agregar vértices
        grafo.agregarVertice(1);
        grafo.agregarVertice(2);
        grafo.agregarVertice(3);
        grafo.agregarVertice(4);

        // Agregar aristas
        grafo.agregarArista(1, 2);
        grafo.agregarArista(2, 3);
        grafo.agregarArista(3, 4);
        grafo.agregarArista(4, 1);

        // Mostrar grafo
        grafo.mostrar();
    }
}

