/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab4;

/**
 *
 * @author eidan
 */
public class Operaciones {
        
    public static int Suma(int a, int b){
        return a + b;
    }
    public static int Resta(int a, int b){
        return a - b;
    }
    public static int Multiplicacion(int a, int b){
        return a * b;
    }
    public static double Division(int a, int b){
        return (double) a / b;       
    }
    public static boolean Palindromo(String palabra) {
        if (palabra.length() == 0 || palabra.length() == 1)
            return true;
        if (palabra.charAt(0) == palabra.charAt(palabra.length() - 1))
            return Palindromo(palabra.substring(1, palabra.length() - 1));
        else
            return false;
    }
}