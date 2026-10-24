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
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * registrar los datos de n productos para luego reportartar el precio venta
         * considerar los siguientes datos
         * Datos del producto:
         * nombre
         * stock
         * precio compra
         * procentaje de ganacia
         * precio venta
         */
        
        Scanner teclado = new Scanner(System.in);
        int n_productos=0;
        
        System.out.println("Cuantos productos registrara?");
        n_productos = teclado.nextInt();
        teclado.nextLine();
        
        //creando el primer arreglo
        String[] nombre = new String[n_productos];
        double[] stock = new double[n_productos];
        double[] p_compra = new double[n_productos];
        double[] p_venta = new double[n_productos];
        
        System.out.println("Registro de productos:");
        
        // Capturando datos
        for (int i = 0; i < n_productos; i++) {
            System.out.println("Producto "+( i + 1)+": ");
            System.out.print("Nombre: ");
            nombre[i] = teclado.nextLine();
            
            System.out.println("Stock: ");
            stock[i] = teclado.nextDouble();
            
            //Registrar el precio de compra y calcular el precio de venta
            System.out.println("Precio compra: ");
            p_compra[i] = teclado.nextDouble();
            
            //para el precio de venta aplicar el 30% al precio de compra
            p_venta[i] = (p_compra[i] * 0.3) + p_compra[i];
            
            System.out.println("");
            teclado.nextLine();
        }
        
        System.out.println("*******************");
        System.out.println("Reporte de datos registrados: ");
        System.out.println("");
        //Reportar datos
        for (int i = 0; i < n_productos; i++) {
            System.out.println("Producto "+ (i+1) +":");
            System.out.println("Nombre: "+nombre[i]);
            System.out.println("Stock: "+stock[i]);
            System.out.println("Precio compra: S/. "+p_compra[i]);
            System.out.println("Precio venta: S/. "+p_venta[i]);
            System.out.println("");
        }
        
        
        
    }
    
}
