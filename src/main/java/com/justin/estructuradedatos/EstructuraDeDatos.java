/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.justin.estructuradedatos;

/**
 *
 * @author justin
 */
public class EstructuraDeDatos {
    public static void main(String[] args) {
        // Mensaje de inicio
        System.out.println("Clase Principal");

        
        
        
        
        
        
        // Crear una instancia de UserData
        UserData user = new UserData();

        // Llamar al método fullName y mostrar el resultado
        String nombreCompleto = user.fullName("Justin", "Salim");
        System.out.println(nombreCompleto);
    }
}

