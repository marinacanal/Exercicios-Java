/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programacondicaocomp;

import java.util.Scanner;

/**
 *
 * @author Marina
 */
public class ProgramaCondicaoComp {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o seu ano de nascimento: ");
        int nasc = ler.nextInt();
        
        int idade = 2023 - nasc;
        
        if (idade < 16) {
            System.out.println("Você não vota");
        } else if (idade > 70 || idade >= 16 && idade < 18) {
            System.out.println("Você não é obrigado a votar, mas pode");
        } else {
            System.out.println("Você é obrigado a votar");
        }
    }
}
