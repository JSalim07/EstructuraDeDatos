/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.justin.estructuradedatos;
import java.util.Scanner;


public class EstructuraDeDatos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Examen parcial: ");
        double examen = scanner.nextDouble();
        
        System.out.print("Tareas: ");
        double tareas = scanner.nextDouble();
        
        GradeCalculationPartial calculadora = new GradeCalculationPartial();
        double calificacionFinal = calculadora.calcularCalificacionFinal(examen, tareas);
        
        System.out.printf("Calificación final: %.1f\n", calificacionFinal);
        
        scanner.close();
    }
}

/*
 * Nombre: Justin Salim Contreras Guaderrama
 * Matrícula: 13634
 * Fecha: 11/02/24
 */


//public class EstructuraDeDatos {
    //public static void main(String[] args) {
        //MultidimensionalArray array = new MultidimensionalArray(); // Instanciamos la clase
       // array.printBidimensionalArray(); // Llamamos al método
    //public static void main(String[] args) { 
        // Create an object of the StudentGrades class
        //StudentGrades student = new StudentGrades();
        
        // Calculate the partial grade
        //int partialGrade = student.calculatePartialGrade(85, 90);
        //System.out.println("Partial grade: " + partialGrade);
        
        // Calculate the final semester grade
        //int finalGrade = student.calculateFinalGrade(80, 75, 90, 85);
        //System.out.println("Final semester grade: " + finalGrade);
        
        // Check attendance status
        //String attendanceStatus = student.checkFailureByAbsences(64, 7);
        //System.out.println(attendanceStatus);
  