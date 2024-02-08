/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programacalculadora;

import java.util.Scanner;

/**
 *
 * @author Marina
 */
public class ProgramaCalculadora {

    public static void main(String[] args) {
        System.out.println(Calculadora.somarNum(1, 2));
        System.out.println(Calculadora.subtrairNum(3, 3));
        System.out.println(Calculadora.multiplicarNum(3, 2));
        System.out.println(Calculadora.dividirNum(4, 2));
        System.out.println(Calculadora.elevarNum(3, 2));
        System.out.println(Calculadora.fatoriarNum(5)); 
        System.out.println(Calculadora.FibonnaciRecursivo(6));
        System.out.println(Calculadora.somarRecursivo(23));
    }
}
