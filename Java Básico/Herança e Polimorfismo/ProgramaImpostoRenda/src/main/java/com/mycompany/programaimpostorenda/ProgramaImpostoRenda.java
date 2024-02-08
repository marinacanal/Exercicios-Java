/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programaimpostorenda;

/**
 *
 * @author Marina
 */
public class ProgramaImpostoRenda {

    public static void main(String[] args) {
        PessoaJuridica pessoaJuridica = new PessoaJuridica();
        PessoaFisica pessoaFisica = new PessoaFisica();
        
        pessoaJuridica.setNome("Niumar");
        pessoaJuridica.setRendaBruta(6599300);
        pessoaJuridica.mostrarImposto();
        
        pessoaFisica.setNome("Gil");
        pessoaFisica.setRendaBruta(3400);
        pessoaFisica.mostrarImposto();
    }
}
