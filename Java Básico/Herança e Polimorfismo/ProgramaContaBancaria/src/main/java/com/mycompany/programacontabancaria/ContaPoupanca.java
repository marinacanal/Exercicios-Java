/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programacontabancaria;

/**
 *
 * @author Marina
 */
public class ContaPoupanca extends ContaBancaria {
    private double diaRendimento;
    
    public ContaPoupanca(){
        super();
    }
    
    public ContaPoupanca(String nomeCliente, int numConta, double saldoConta, double diaRendimento){
        super(nomeCliente, numConta, saldoConta);
        this.diaRendimento = diaRendimento;
    }

    public double getDiaRendimento() {
        return diaRendimento;
    }

    public void setDiaRendimento(double diaRendimento) {
        this.diaRendimento = diaRendimento;
    }
    
    public double calcularNovoSaldo() {
    double novoSaldo = 0;
        novoSaldo += novoSaldo + (diaRendimento/100);
        return novoSaldo;
    }
}
