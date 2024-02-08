/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programaagenda;

/**
 *
 * @author Marina
 */
public class ProgramaAgenda {

    public static void main(String[] args) {
        Contato contato = new Contato();
        Telefone telefone = new Telefone();
        Telefone telefone2 = new Telefone();
        Endereco endereco = new Endereco();
        
        contato.setNome("Joao");
        telefone.setNumero("499999999");
        telefone2.setNumero("498888888");
        endereco.setNomeRua("Kings Landing");
        
        Telefone[] telefones = new Telefone[2];
        telefones[0] = telefone;
        telefones[1] = telefone2;
        
        contato.setTelefones(telefones);
        contato.setEndereco(endereco);
        
        System.out.println(contato.getNome());
        
        if(contato != null && contato.getEndereco() != null){
            System.out.println(contato.getEndereco().getNomeRua());
        }

        if(contato != null && contato.getTelefones() != null) {
            for (Telefone t : contato.getTelefones()) {
                System.out.println(t.getNumero());
            }
        }
    }
}
