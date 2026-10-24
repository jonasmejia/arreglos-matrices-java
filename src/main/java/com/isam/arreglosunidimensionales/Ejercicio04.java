/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.isam.arreglosunidimensionales;

import java.util.Scanner;

/**
 *
 * @author jonas
 */
public class Ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Ejercicio 5 Buscar un número Solicita cinco números y luego un número
         * para buscar. Muestra todas sus posiciones. Si no existe, informa
         * Número no encontrado. boolean encontrado = false; Prueba: arreglo 4,
         * 8, 4, 10, 4; buscar 4. Posiciones: 0, 2 y 4. Reto: cuenta las
         * coincidencias.
         */
        Scanner teclado = new Scanner(System.in);

        int[] numeros = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("ingresar numero " + (i + 1) + ": ");
            numeros[i] = teclado.nextInt();
        }
        teclado.nextLine();

        System.out.println(" numero a buscar: ");
        int buscar = teclado.nextInt();

        int concidencia = 0;
        String posiciones = "";
        for (int i = 0; i < 5; i++) {
            if (numeros[i] == buscar) {
                posiciones += i + "\n";
                concidencia++;
            }
        }

        if (concidencia == 0) {
            System.out.println("No se encontraron las coincidencias");
        } else {
            System.out.println("Posiciones encontradas: \n" + posiciones);
            System.out.println("Se encontro " + concidencia + " veces.");
        }

    }

}
