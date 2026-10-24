/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.isam.arreglosunidimensionales;

/**
 *
 * @author jonas
 */
public class ArreglosUnidimensionales {

    public static void main(String[] args) {
        //Mostrar datos (nombres y notas) usando arreglos unidimensionales
        String[] nombres = {"Fernando", "Karol", "Suu", "Azul", "Alejandro"};
        double[]notas = {16,18,20,14,16};
        
        //Mostrar la nota de fernando
        System.out.println(nombres[0]);
        System.out.println(notas[0]);
        
        //Actualizar el nombre de fernando
        nombres[0] = "Fernando Jose";
        
        System.out.println(nombres[0]);
        
        
    }
}
