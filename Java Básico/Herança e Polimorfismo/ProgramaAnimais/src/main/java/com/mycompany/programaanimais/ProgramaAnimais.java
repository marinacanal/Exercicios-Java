/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programaanimais;

/**
 *
 * @author Marina
 */
public class ProgramaAnimais {

    public static void main(String[] args) {
        Peixe peixe = new Peixe();
        Mamifero mamifero = new Mamifero();
        
        peixe.setNome("Lambari");
        peixe.setComprimento("20 cm");
        peixe.setNumeroPatas(0);
        peixe.setCor("Prata");
        peixe.setHabitat("Mar");
        peixe.setVelocidade("Baixa");
        peixe.setCaracteristicas("Corpo prateado e nadadeiras coloridas");
        
        mamifero.setNome("Muriqui-do-Sul");
        mamifero.setComprimento("160 cm");
        mamifero.setNumeroPatas(4);
        mamifero.setCor("Bege");
        mamifero.setHabitat("Mata Atlântica");
        mamifero.setVelocidade("Variável");
        mamifero.setAlimento("Folhas");
        
        System.out.println("Zoo: ");
        System.out.println("-----------------");
        System.out.println("Animal: " + peixe.getNome());
        System.out.println("Comprimento: " + peixe.getComprimento());
        System.out.println("Patas: " + peixe.getNumeroPatas());
        System.out.println("Cor: " + peixe.getCor());
        System.out.println("Hábitat: " + peixe.getHabitat());
        System.out.println("Características: " + peixe.getCaracteristicas());
        System.out.println("-----------------");
        
        System.out.println("Animal: " + mamifero.getNome());
        System.out.println("Comprimento: " + mamifero.getComprimento());
        System.out.println("Patas: " + mamifero.getNumeroPatas());
        System.out.println("Cor: " + mamifero.getCor());
        System.out.println("Hábitat: " + mamifero.getHabitat());
        System.out.println("Alimento: " + mamifero.getAlimento());
    }
}
