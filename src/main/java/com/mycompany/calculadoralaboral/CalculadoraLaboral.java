/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadoralaboral;

import java.util.Scanner;

/**
 *
 * @author progr
 */
public class CalculadoraLaboral {

    public static void main(String[] args) {
        System.out.println("Ingrese el numero de horas trabajadas"); 
        Scanner entrada = new Scanner(System.in);
        int hora = 2500;    
        int horasTrabajadas = entrada.nextInt();
        int totalHoras= horasTrabajadas* hora;
        System.out.println("Usted Trabajo "+ horasTrabajadas +" horas en la semana");
        System.out.println("El total por sus horas trabajadas en la semana es: "+totalHoras);
        
        
    }
}
