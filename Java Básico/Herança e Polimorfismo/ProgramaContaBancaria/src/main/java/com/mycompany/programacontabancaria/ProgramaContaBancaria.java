/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programacontabancaria;

/**
 *
 * @author Marina
 */
public class ProgramaContaBancaria {

    public static void main(String[] args) {
        ContaPoupanca contaPoupanca = new ContaPoupanca();
        ContaEspecial contaEspecial = new ContaEspecial();
        
        contaPoupanca.setNomeCliente("Cleumar");
        contaPoupanca.setNumConta(2345678);
        contaPoupanca.setSaldoConta(2000.50);
        contaPoupanca.setDiaRendimento(2.5);
        
        contaEspecial.setNomeCliente("Fulano");
        contaEspecial.setNumConta(123456);
        contaEspecial.setSaldoConta(250);
        contaEspecial.setLimiteConta(1000);
        
        contaPoupanca.sacarDinheiro(1790);
        contaPoupanca.depositarDinheiro(280);
        contaPoupanca.calcularNovoSaldo();
        contaPoupanca.showConta();
        contaEspecial.showConta();
    }
}
