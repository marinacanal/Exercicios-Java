/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programacalculadora;

/**
 *
 * @author Marina
 */
public class Calculadora {
    
    public static int somarNum (int num1, int num2) {
        return num1 + num2;
    }
    
    public static int subtrairNum (int num1, int num2) {
        return num1 - num2;
    }
    
    public static int multiplicarNum (int num1, int num2) {
        return num1 * num2;
    }
    
    public static int dividirNum (int num1, int num2) {
        return num1/num2;
    }
    
    public static int elevarNum (int num1, int num2) {
        int elevar = 1;
        for (int i = 0; i<num2; i++) {
            elevar *= num1;
        }
        return elevar;
    }
    
    public static int fatoriarNum (int num1) {
        int fatorial = 1;
        for (int i = num1; i>1; i--) {
            fatorial = fatorial * i;
        }
        return fatorial;
    }
    
    public static int FibonnaciRecursivo (int x) {
        if (x <=  2) {
            return 1;
        }
        return FibonnaciRecursivo(x-1) + FibonnaciRecursivo(x-2);        
    }

    public static int somarRecursivo (int num) {
        if (num <= 0) {
            return 0;
        }
        return num + somarRecursivo(num - 1);
    }
}