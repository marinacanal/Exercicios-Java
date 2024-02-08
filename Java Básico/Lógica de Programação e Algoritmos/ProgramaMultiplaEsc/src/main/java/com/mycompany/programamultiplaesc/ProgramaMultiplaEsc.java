/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programamultiplaesc;

import java.util.Scanner;

/**
 *
 * @author Marina
 */
public class ProgramaMultiplaEsc {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Quantas pernas você tem?");
        int pernas = ler.nextInt();
        String tipo;
        
        switch(pernas) {
            case 1:
                tipo = "saci";
                break;
            case 2: 
                tipo = "bípede";
                break;
            case 4: 
                tipo = "quadrúpede";
                break;
            case 6,8: 
                tipo = "aranha";
                break;
            default:
                tipo = "ET";
        }
        
        System.out.println("Você é um(a) " + tipo); 
    }
}
