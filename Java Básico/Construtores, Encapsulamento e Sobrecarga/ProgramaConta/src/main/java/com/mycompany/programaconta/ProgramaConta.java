/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programaconta;

/**
 *
 * @author Marina
 */
public class ProgramaConta {

    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente();
        
        conta.dinheiroDepositado(1500);
        conta.mostrarSaldo();
        conta.sacarDinheiro(200);
        conta.mostrarSaldo();
        conta.depositarDinheiro(500);
        conta.mostrarSaldo();
        conta.verificarChequeEspecial();
    }
}
