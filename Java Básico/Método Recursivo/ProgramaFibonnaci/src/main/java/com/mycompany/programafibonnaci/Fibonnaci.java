/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programafibonnaci;

/**
 *
 * @author Marina
 */
public class Fibonnaci {
    private int[] seqFibonnaci;
    
    public static int FibonnaciRecursivo (int x) {
        if (x <=  2) {
            return 1;
        }
        
        int Fibonnaci = FibonnaciRecursivo(x-1) + FibonnaciRecursivo(x-2);
        int[] seqFibonnaci = new int[Fibonnaci];
        
        return Fibonnaci;        
    }
}
