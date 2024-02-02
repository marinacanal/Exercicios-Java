/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programamedia;

import java.util.Scanner;

/**
 *
 * @author Marina
 */
public class ProgramaMedia {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite a sua primeira nota: ");
        float n1 = ler.nextFloat();
        System.out.print("Digite a sua segunda nota: ");
        float n2 = ler.nextFloat();
        float m = (n1+n2)/2;
        System.out.println("Sua média foi: " + m);
        if (m>=6) {
            System.out.println("Parabéns, você é pica");   
        } 
        
    }
}
