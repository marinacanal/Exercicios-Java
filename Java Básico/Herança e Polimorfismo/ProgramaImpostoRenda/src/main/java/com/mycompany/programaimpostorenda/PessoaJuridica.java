/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programaimpostorenda;

/**
 *
 * @author Marina
 */
public class PessoaJuridica extends Contribuinte{
    
    public PessoaJuridica(){
        super();
    }
    
    public void mostrarImposto(){
        double imposto = 0;
        imposto = rendaBruta * 0.1;
        System.out.println("O imposto sobre a sua renda, como PJ, é de: " + imposto);
    }
}
