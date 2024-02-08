/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programaidade;

import java.util.Scanner;

/**
 *
 * @author Marina
 */
public class ProgramaIdade {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Digite o ano do seu nascimento: ");
        int nasc = ler.nextInt();
        int idade = 2023 - nasc;
        System.out.println("A sua idade esse ano será de: " + idade + " anos");
        if(idade>=18) {
            System.out.println("Você é maior de idade");
        } else {
            System.out.println("Você é menor de idade");
        }
    }
}