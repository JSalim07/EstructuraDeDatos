/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package secondpartial;

/**
 *
 * @author justin
 */
public class BubbleSortExample {
    public static int bubbleSort(int arr[]) {
        int n = arr.length;
        int comparisons = 0; // Contador de comparaciones
        
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                comparisons++; // Contar comparaciones
                if (arr[j] > arr[j + 1]) {
                    
                    // Intercambio
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return comparisons;
    }
}

// 1. El peor caso para Bubble Sort es O(n^2), cuando el arreglo está en orden inverso y necesita
//    hacer el mayor número de intercambios posibles en cada iteración.

// 2. En el mejor caso (cuando el arreglo ya está ordenado), la complejidad es O(n) debido a la optimización 
//    con la bandera 'swapped', que permite detener el algoritmo antes de tiempo si no se hacen intercambios.

// 3. La complejidad espacial es O(1), ya que Bubble Sort solo necesita una cantidad constante de espacio adicional.


