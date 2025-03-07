/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package secondpartial;

/**
 *
 * @author justin
 */// Clase principal

public class SecondPartialMain {
    public static void main(String[] args) {
        
        // INSERTION SORT
        int[] peorCasoInsertion = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1}; // Peor caso: orden inverso
        System.out.println("Peor Caso con InsertionSort:");
        
        // Prueba del algoritmo de Inserción con conteo de comparaciones
        int operacionesPeorInsertion = InsertionSortExample.insertionSort(peorCasoInsertion);
        
        // Imprimir el arreglo ordenado
        for (int num : peorCasoInsertion) {
            System.out.print(num + " ");
        }
        System.out.println("\nOperaciones realizadas con InsertionSort: " + operacionesPeorInsertion);
        
        
        //SELECTION SORT
        int[] peorCasoSelection = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1}; // Peor caso: orden inverso
        System.out.println("\nPeor Caso con SelectionSort:");
        
        // Prueba del algoritmo de Selección con conteo de comparaciones
        int operacionesPeorSelection = SelectionSortExample.selectionSort(peorCasoSelection);
        
        // Imprimir el arreglo ordenado
        for (int num : peorCasoSelection) {
            System.out.print(num + " ");
        }
        System.out.println("\nOperaciones realizadas con SelectionSort: " + operacionesPeorSelection);
        
        
        //BUBBLE SORT
        int[] peorCasoBubble = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1}; // Peor caso: orden inverso
        System.out.println("\nPeor Caso con BubbleSort:");
        
        // Prueba del algoritmo de Selección con conteo de comparaciones
        int operacionesPeorBubble = BubbleSortExample.bubbleSort(peorCasoBubble);
        
        // Imprimir el arreglo ordenado
        for (int num : peorCasoBubble) {
            System.out.print(num + " ");
        }
        System.out.println("\nOperaciones realizadas con BubbleSort: " + operacionesPeorBubble);
    }
}
