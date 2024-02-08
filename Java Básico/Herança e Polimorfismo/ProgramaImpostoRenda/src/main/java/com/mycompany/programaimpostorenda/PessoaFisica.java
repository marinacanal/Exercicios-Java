/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programaimpostorenda;

/**
 *
 * @author Marina
 */
public class PessoaFisica extends Contribuinte{
    
    public PessoaFisica(){
        super();
    }
    
    public void mostrarImposto(){
        double imposto = 0;
        if(rendaBruta >= 0 && rendaBruta <= 1400){
            imposto = 0;
        }else if(rendaBruta >= 1400.01 && rendaBruta <= 2100){
            imposto = rendaBruta * 0.1;
        }else if(rendaBruta >= 2100.01 && rendaBruta <= 2800){
            imposto = rendaBruta * 0.15;
        }else if(rendaBruta >= 2800.01 && rendaBruta <= 3600){
            imposto = rendaBruta * 0.25;
        }else if(rendaBruta >= 3600.01){
            imposto = rendaBruta * 0.3;
        }
        System.out.println("O imposto sobre a sua renda, como PF, é de: " + imposto);
    }
}
