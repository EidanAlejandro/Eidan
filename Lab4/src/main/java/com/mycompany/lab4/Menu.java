/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab4;
import java.util.Scanner;
/**
 *
 * @author eidan
 */
public class Menu {
    public void Menu() {
        Scanner scanner = new Scanner(System.in);
        
        int op, a, b;
        do {
            System.out.println("\nMenu operaciones matematicas");
            System.out.println("Ingrese 1 para suma");
            System.out.println("Ingrese 2 para resta");
            System.out.println("Ingrese 3 multiplicacion");
            System.out.println("Ingrese 4 division");
            System.out.println("Ingrese 5 para indicar si la palabra es palindrome");
            System.out.println("Ingrese 0 para finalizar el programa");
            op = scanner.nextInt();

            switch (op) {
                case 1: {
                    System.out.println("Ingresa dos valores para sumarlos");
                    a = scanner.nextInt();
                    b = scanner.nextInt();
                    System.out.println("la suma de los numeros es " + Operaciones.Suma(a, b));                
                    break;
                }
                case 2: {
                    System.out.println("Ingresa dos valores para restarlos");
                    a = scanner.nextInt();
                    b = scanner.nextInt();
                    System.out.println("la resta de los numeros es " + Operaciones.Resta(a, b));                    
                    break;
                }
                case 3: {
                    System.out.println("Ingresa dos valores para multiplicarlos");
                    a = scanner.nextInt();
                    b = scanner.nextInt();
                    System.out.println("la multiplicacion de los numeros es " + Operaciones.Multiplicacion(a, b)); 
                    break;
                }
                case 4: {
                    do{
                        System.out.println("Ingresa dos valores para dividirlos");
                        a = scanner.nextInt();
                        b = scanner.nextInt();

                        if (a <= 0 || b <= 0){
                            System.out.println("los numeros deben ser enteros positivos (n>0) ");
                        }
                    }while ( a <= 0 || b <= 0);
                    
                    System.out.println("la division de los numeros es " + Operaciones.Division(a, b)); 
                    break;
                }
                case 5: {
                    scanner.nextLine();
                    System.out.println("Ingrese una palabra");
                    String palabra = scanner.nextLine();
                    if (Operaciones.Palindromo(palabra))
                        System.out.println(palabra + " es un palindromo.");
                    else
                        System.out.println(palabra + " no es un palindromo.");
                    break;
                } 
                case 0: {
                    System.out.println("Hasta luego");            
                    break;
                }
                default:{
                    System.out.println("opcion invalida, por favor ingresar opcion valida.");
                }
            }
        } while (op != 0);
        scanner.close();
    }
    
}

