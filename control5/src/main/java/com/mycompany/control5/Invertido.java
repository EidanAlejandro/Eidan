/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.control5;

/**
 *
 * @author eidan
 */
public class Invertido {

    public static int Invertido(int numero, int num) {
        int resultado;
        if (numero == 0) {
            resultado = num;
        }else{
        int ultimo = numero %10;
        numero = numero/10;
        num = (num*10) + ultimo;
        resultado = Invertido(numero, num);
        }
        return resultado;
    }
}