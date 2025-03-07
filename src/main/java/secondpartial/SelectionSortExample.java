/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package secondpartial;

/**
 *
 * @author justin
 */
public class SelectionSortExample {
    public static int selectionSort(int arr[]) {
        int n = arr.length;
        int comparisons = 0; // Contador de comparaciones

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                comparisons++; // Cuenta solo comparaciones
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Intercambio de elementos
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        return comparisons; // Retorna el total de comparaciones
    }
}


// 1. El algoritmo de selección tiene una complejidad de O(n^2) en el peor caso y el mejor caso, 
//    ya que siempre realiza comparaciones de manera fija (n-1 en la primera iteración, n-2 en la siguiente, etc.).

// 2. La complejidad de tiempo es O(n^2) porque el algoritmo pasa por cada par de elementos del arreglo y realiza comparaciones en cada iteración.

// 3. La complejidad espacial es O(1), ya que solo utiliza una cantidad constante de espacio adicional, 
//    independientemente del tamaño del arreglo.

