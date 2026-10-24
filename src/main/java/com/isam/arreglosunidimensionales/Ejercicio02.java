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
public class Ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Ejercicio 2 Suma y promedio Solicita seis notas válidas entre 0 y 20.
         * Después del registro, recorre el arreglo, calcula suma y promedio y
         * muestra las notas superiores al promedio.
         */
        Scanner teclado = new Scanner(System.in);

        int[] notas = new int[6];

        System.out.println("Ingrese 6 notas para obtener el promedio");

        //Estructura repetitiva for
        //capturando datos
        for (int i = 0; i < 6; i++) {

            //Validar la nota: 
            do {
                System.out.print("Nota " + (i + 1) + ": ");
                notas[i] = teclado.nextInt();

                //Estructura condicional simple
                if (notas[i] < 0 || notas[i] > 20) {
                    System.out.println("Nota invalida!, ingresar la nota entre 0-20");
                }
            } while (notas[i] < 0 || notas[i] > 20);
            
            teclado.nextLine();
            
        }

        //Estructura repetitiva for
        //recorriendo datos
        /**
         * Después del registro, recorre el arreglo, calcula suma y promedio y
         * muestra las notas superiores al promedio.
         */
        int suma_notas = 0, promedio;
        for (int i = 0; i < 6; i++) {

            //System.out.println(notas[i]);
            //sumar notas
            //81
            suma_notas += notas[i];
        }

        promedio = suma_notas / 6;

        System.out.println("Suma de notas: " + suma_notas);
        System.out.println("Promedio: " + promedio);

        System.out.println("Notas mayores al promedio: ");
        for (int i = 0; i < 6; i++) {
            if (notas[i] > promedio) {
                System.out.println(notas[i]);
            }
        }

        System.out.println("Notas menores al promedio: ");
        for (int i = 0; i < 6; i++) {
            if (notas[i] < promedio) {
                System.out.println(notas[i]);
            }
        }

//        String mayores="", menores="";
//        for (int i = 0; i < 6; i++) {
//            if(notas[i] > promedio){
//                mayores += notas[i]+"\n";
//            }else{
//                menores += notas[i]+"\n";
//            }
//        }
//        
//        System.out.println("Notas mayores al promedio: ");
//        System.out.println(mayores);
//        System.out.println("Notas menores al promedio: ");
//        System.out.println(menores);
    }

}
