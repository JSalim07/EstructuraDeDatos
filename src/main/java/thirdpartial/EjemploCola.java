/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thirdpartial;

/**
 *
 * @author justin
 */
import java.util.LinkedList;
import java.util.Queue;

public class EjemploCola {
    
    Queue<String> colaImpresion;

    public EjemploCola() {
        colaImpresion = new LinkedList<>();
    }

    public void agregarDocumento(String documento) {
        colaImpresion.add(documento);
        System.out.println("Documento agregado: " + documento);
    }

    public void verDocumentoFrente() {
        String frente = colaImpresion.peek();
        if (frente != null) {
            System.out.println("Documento al frente de la cola: " + frente);
        } else {
            System.out.println("La cola está vacía.");
        }
    }

    public void imprimirDocumento() {
        String impreso = colaImpresion.poll();
        if (impreso != null) {
            System.out.println("Imprimiendo: " + impreso);
        } else {
            System.out.println("No hay documentos para imprimir.");
        }
    }
}
