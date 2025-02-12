/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.justin.estructuradedatos;

/*
 * Nombre: Justin Salim Contreras Guaderrama
 * Matrícula: 13634
 * Fecha: 11/02/24
 */
public class StudentGrades {
    
    // Método para calcular la calificación del parcial
    public int calculatePartialGrade(int examScore, int homeworkScore) {
        double finalPartialGrade = (examScore * 0.7) + (homeworkScore * 0.3);
        return (int) Math.round(finalPartialGrade); // Redondeamos el resultado
    }

    // Método para calcular la calificación final del semestre
    public int calculateFinalGrade(int firstPartial, int secondPartial, int thirdPartial, int finalExam) {
        double finalGrade = ((firstPartial + secondPartial + thirdPartial) / 3.0) * 0.5 + (finalExam * 0.5);
        return (int) Math.round(finalGrade); // Redondeamos el resultado
    }

    // Método para verificar si el alumno está reprobado por faltas
    public String checkFailureByAbsences(int totalHours, int absences) {
        double absenceLimit = totalHours * 0.10; // 10% del total de horas
        if (absences > absenceLimit) {
            return "Student failed due to absences";
        } else {
            return "Student meets the minimum attendance requirements";
        }
    }
}
