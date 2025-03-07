/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package secondpartial;

/**
 *
 * @author justin
 */
public class InsertionSortExample {
    public static int insertionSort(int[] arr) {
        int n = arr.length;
        int comparisons = 0; // Contador de comparaciones
        
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
                comparisons++; // Se cuenta cada comparación
            }
            arr[j + 1] = key;
        }
        return comparisons; // Devuelve el número total de comparaciones
    }
}

// 1. En el peor caso (arreglo en orden inverso), el algoritmo tiene una complejidad de O(n^2), 
//    ya que realiza una comparación y desplazamiento por cada elemento en el arreglo.

// 2. En el mejor caso (cuando el arreglo ya está ordenado), la complejidad es O(n), 
//    porque solo se realizan comparaciones sin desplazamientos, y el algoritmo detecta que el arreglo está ordenado.

// 3. La complejidad del espacio es O(1), ya que solo se usan un número constante de variables adicionales 
//    independientemente del tamaño del arreglo.


