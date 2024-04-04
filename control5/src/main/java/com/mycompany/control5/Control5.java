/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.control5;
import java.util.Scanner;
/**
 *
 * @author eidan
 */
public class Control5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero entero: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Ingrese un numero entero valido: ");
            scanner.next();                 
        }
        int numero = scanner.nextInt();
        int numinvertido = Invertido.Invertido(numero, 0);
        System.out.println("El numero invertido es "+ numinvertido);
        
    }
}
