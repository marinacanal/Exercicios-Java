/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programavetor;

/**
 *
 * @author Marina
 */
public class ProgramaVetor {

    public static void main(String[] args) {
        int n[] = {1,2,3,4,5,6,7};
        System.out.println("Total de casas de n: " + n.length);
        for(int c=0; c<=5; c++) {
            System.out.println("Na posição " + c + " temos o valor: " + n[c]);
        }
        
        TelaVetor tl = new TelaVetor();
        tl.setVisible(true);
    }
}
