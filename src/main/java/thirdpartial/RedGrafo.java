/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thirdpartial;

/**
 *
 * @author justin
 */
import java.util.*;

public class RedGrafo {
    private Map<Integer, List<Integer>> grafo = new HashMap<>();

    public void agregarVertice(int v) {
        grafo.putIfAbsent(v, new ArrayList<>());
    }

    public void agregarArista(int a, int b) {
        grafo.get(a).add(b);
        grafo.get(b).add(a);
    }

    public void mostrar() {
        // Recorre cada entrada del mapa: clave = vértice, valor = lista de adyacentes
        for (Map.Entry<Integer, List<Integer>> v : grafo.entrySet()) {
            System.out.println(v.getKey() + " conectado con " + v.getValue());
        }
    }
}
